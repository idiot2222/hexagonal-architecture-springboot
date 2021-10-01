package me.bogeun.hexagonalarchitecture.adapters.persistence;

import me.bogeun.hexagonalarchitecture.domains.BankAccount;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpringDataBankAccountRepository extends MongoRepository<BankAccount, Long> {
}
