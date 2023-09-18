package com.securityapp.application.studentcontroller;

import com.securityapp.application.Studententity.StudentInformation;
import com.securityapp.application.studentservice.StudentInformationService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Entity
public class StudentInformationController {
    @Autowired
    private StudentInformationService studentInformationService;
    @PostMapping("/api/save")
    public String  saveStudent(StudentInformation studentInformation) {
        studentInformationService.saveStudent(studentInformation);
        return"";

    }
    @GetMapping("/list_students")
    public ResponseEntity<StudentInformation> getAllStudents(StudentInformation studentInformation){
        return ResponseEntity.ok(studentInformationService.findAllStudents(studentInformation));
    }
    public ResponseEntity<StudentInformation>  get
}
