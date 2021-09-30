package me.bogeun.hexagonalarchitecture.ports.incoming;

import java.math.BigDecimal;

public interface DepositUseCase {

    void deposit(Long id, BigDecimal amount);

}
