package com.securityapp.application.studentservice;

import com.securityapp.application.Studententity.StudentInformation;

public interface StudentInformationService {
     StudentInformation saveStudent(StudentInformation studentInformation);

     StudentInformation findAllStudents(StudentInformation studentInformation);
     StudentInformation findStudentById(long id);
}
