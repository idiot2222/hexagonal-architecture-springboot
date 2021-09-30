package me.bogeun.hexagonalarchitecture.ports.outgoing;

import me.bogeun.hexagonalarchitecture.domains.BankAccount;

import java.util.Optional;

public interface LoadAccountPort {
    Optional<BankAccount> load(Long id);
}
