package com.securityapp.application.studentrepository;

import com.securityapp.application.Studententity.Communications;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunicationRepository extends JpaRepository<Communications,Long> {
}
