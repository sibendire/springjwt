package com.securityapp.application.studentrepository;

import com.securityapp.application.Studententity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance ,Long> {

}
