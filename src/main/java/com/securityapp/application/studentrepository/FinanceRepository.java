package com.securityapp.application.studentrepository;

import com.securityapp.application.Studententity.Finance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinanceRepository extends JpaRepository<Finance,Long> {
}
