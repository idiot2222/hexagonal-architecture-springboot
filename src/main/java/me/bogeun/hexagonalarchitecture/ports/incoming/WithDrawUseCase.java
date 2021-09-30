package me.bogeun.hexagonalarchitecture.ports.incoming;

import java.math.BigDecimal;

public interface WithDrawUseCase {

    boolean withdraw(Long id, BigDecimal amount);

}
