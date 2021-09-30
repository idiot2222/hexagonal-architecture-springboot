package me.bogeun.hexagonalarchitecture.domains;

import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
public class BankAccount {

    private Long id;
    private BigDecimal balance;

    public boolean withdraw(BigDecimal amount) {
        if(balance.compareTo(amount) < 0) {
            return false;
        }

        balance = balance.subtract(amount);
        return true;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

}
