package com.securityapp.application.studentservice.studentserviceimpl;

import com.securityapp.application.Studententity.StudentInformation;
import com.securityapp.application.studentrepository.StudentInformationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;

@Service
public class StudentServiceImpl {
    @Autowired
    private StudentInformationRepo studentInformationRepo;

    public StudentInformation saveStudent(StudentInformation studentInformation) {
        // Save the student information using the repository
        return studentInformationRepo.save(studentInformation);
    }

    public List<StudentInformation> getAllStudents() {
        // Retrieve all students from the repository and return them as a list
        return studentInformationRepo.findAll();
    }

    public StudentInformation getStudentById(@PathVariable long id) {
        // Attempt to find a student by ID in the repository
        return studentInformationRepo.findById(id).orElse(null);
    }
}
