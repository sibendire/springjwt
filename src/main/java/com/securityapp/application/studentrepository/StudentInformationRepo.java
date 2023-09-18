package com.securityapp.application.studentrepository;

import com.securityapp.application.Studententity.StudentInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentInformationRepo extends JpaRepository<StudentInformation, Long> {


}
