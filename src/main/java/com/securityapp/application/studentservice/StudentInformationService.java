package com.securityapp.application.studentservice;

import com.securityapp.application.Studententity.StudentInformation;

import java.util.List;

public interface StudentInformationService {
     StudentInformation saveStudent(StudentInformation studentInformation);

   //  StudentInformation findAllStudents(StudentInformation studentInformation);
     StudentInformation findStudentById(long id);

    List<StudentInformation> getAllStudents();

    StudentInformation getStudentById(long id);
}
