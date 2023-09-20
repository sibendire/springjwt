package com.securityapp.application.studentrepository;

import com.securityapp.application.Studententity.Grading;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradingRepository extends JpaRepository<Grading,Long> {
}
