package me.bogeun.hexagonalarchitecture.ports.outgoing;

import me.bogeun.hexagonalarchitecture.domains.BankAccount;

public interface SaveAccountPort {
    void save(BankAccount bankAccount);
}
