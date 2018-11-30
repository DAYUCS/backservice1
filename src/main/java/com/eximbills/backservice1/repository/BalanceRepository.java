package com.eximbills.backservice1.repository;

import com.eximbills.backservice1.domain.Balance;
import org.springframework.data.repository.CrudRepository;

public interface BalanceRepository extends CrudRepository<Balance, Long> {
}
