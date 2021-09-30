package me.bogeun.hexagonalarchitecture.services;

import lombok.RequiredArgsConstructor;
import me.bogeun.hexagonalarchitecture.domains.BankAccount;
import me.bogeun.hexagonalarchitecture.ports.incoming.DepositUseCase;
import me.bogeun.hexagonalarchitecture.ports.incoming.WithDrawUseCase;
import me.bogeun.hexagonalarchitecture.ports.outgoing.LoadAccountPort;
import me.bogeun.hexagonalarchitecture.ports.outgoing.SaveAccountPort;

import java.math.BigDecimal;
import java.util.NoSuchElementException;

@RequiredArgsConstructor
public class BankAccountService implements DepositUseCase, WithDrawUseCase {

    private LoadAccountPort loadAccountPort;
    private SaveAccountPort saveAccountPort;

    @Override
    public void deposit(Long id, BigDecimal amount) {
        BankAccount account = loadAccountPort.load(id)
                .orElseThrow(NoSuchElementException::new);

        account.deposit(amount);

        saveAccountPort.save(account);
    }

    @Override
    public boolean withdraw(Long id, BigDecimal amount) {
        BankAccount account = loadAccountPort.load(id)
                .orElseThrow(NoSuchElementException::new);

        boolean hasWithdrawn = account.withdraw(amount);

        if(hasWithdrawn) {
            saveAccountPort.save(account);
        }

        return hasWithdrawn;
    }
}
