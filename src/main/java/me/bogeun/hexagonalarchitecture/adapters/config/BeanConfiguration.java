package me.bogeun.hexagonalarchitecture.adapters.config;

import lombok.RequiredArgsConstructor;
import me.bogeun.hexagonalarchitecture.HexagonalArchitectureApplication;
import me.bogeun.hexagonalarchitecture.adapters.persistence.BankAccountRepository;
import me.bogeun.hexagonalarchitecture.services.BankAccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = HexagonalArchitectureApplication.class)
public class BeanConfiguration {

    @Bean
    BankAccountService bankAccountService(BankAccountRepository repository) {
        return new BankAccountService(repository, repository);
    }

}
