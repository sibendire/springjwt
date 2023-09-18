package com.securityapp.application.studentrepository;

import com.securityapp.application.Studententity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeachersRepository extends JpaRepository<Teacher, Long> {
}
