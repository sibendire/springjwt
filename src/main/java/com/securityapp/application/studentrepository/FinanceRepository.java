package com.securityapp.application.studentrepository;

import com.securityapp.application.Studententity.Finance;
import com.securityapp.application.Studententity.StudentInformation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FinanceRepository extends JpaRepository<Finance,Long> {
    Finance findById(Finance studentSponsorshipById);

    StudentInformation updatePayment(Finance finance);

    List<Finance> findAll(Finance finance);
}
