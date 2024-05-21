package org.sid.ebankingv2.repositories;

import org.sid.ebankingv2.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
