package me.bogeun.hexagonalarchitecture.adapters.persistence;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import me.bogeun.hexagonalarchitecture.domains.BankAccount;
import me.bogeun.hexagonalarchitecture.ports.outgoing.LoadAccountPort;
import me.bogeun.hexagonalarchitecture.ports.outgoing.SaveAccountPort;
import org.springframework.stereotype.Component;

import java.util.Optional;

@AllArgsConstructor
@Component
public class BankAccountRepository implements LoadAccountPort, SaveAccountPort {

    private SpringDataBankAccountRepository repository;

    @Override
    public Optional<BankAccount> load(Long id) {
        return repository.findById(id);
    }

    @Override
    public void save(BankAccount bankAccount) {
        repository.save(bankAccount);
    }

}
