package com.chloe.digital_banking_platform.repository;

import com.chloe.digital_banking_platform.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long>{
}