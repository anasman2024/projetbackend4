package org.sid.ebankingv2.repositories;

import org.sid.ebankingv2.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String > {

}
