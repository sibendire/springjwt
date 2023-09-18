package com.securityapp.application.studentservice.studentserviceimpl;

import com.securityapp.application.Studententity.StudentInformation;
import com.securityapp.application.studentrepository.StudentInformationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collections;

@Service
public class StudentServiceImpl {
    @Autowired
    private StudentInformationRepo studentInformationRepo;

    public StudentInformation saveStudent(StudentInformation studentInformation) {
        return studentInformationRepo.save(studentInformation);
    }

    public void getAllStudents(@RequestBody Model model, StudentInformation studentInformation) {
        model.addAllAttributes(Collections.singleton("studentInformation"));
        studentInformationRepo.findAll();

    }

    public StudentInformation getStudentById(@PathVariable long id ) {
        try {
            if (studentInformationRepo.existsById(id)){
                return studentInformationRepo.getById(id);

            }

        }catch (ExceptionInInitializerError exception){


        }
        return null;
    }

}
