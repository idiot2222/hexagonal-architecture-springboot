package me.bogeun.hexagonalarchitecture.adapters;

import lombok.RequiredArgsConstructor;
import me.bogeun.hexagonalarchitecture.ports.incoming.DepositUseCase;
import me.bogeun.hexagonalarchitecture.ports.incoming.WithDrawUseCase;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;


@RequiredArgsConstructor
@RestController
@RequestMapping("/account")
public class BankAccountController {

    private final DepositUseCase depositUseCase;
    private final WithDrawUseCase withDrawUseCase;

    @PostMapping("/{id}/deposit/{amount}")
    void deposit(@PathVariable Long id, @PathVariable BigDecimal amount) {
        depositUseCase.deposit(id, amount);
    }

    @PostMapping("/{id}/withdraw/{amount}")
    void withdraw(@PathVariable Long id, @PathVariable BigDecimal amount) {
        withDrawUseCase.withdraw(id, amount);
    }
}