package com.securityapp.application.studentrepository;

import com.securityapp.application.Studententity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepository extends JpaRepository<Parent, Long> {
}
