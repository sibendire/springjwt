package com.securityapp.application.studentcontroller;

import com.securityapp.application.Studententity.StudentInformation;
import com.securityapp.application.studentservice.StudentInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentInformationController {
    @Autowired
    private StudentInformationService studentInformationService;

    @PostMapping("/save")
    public ResponseEntity<StudentInformation> saveStudent(@RequestBody StudentInformation studentInformation) {
        StudentInformation savedStudent = studentInformationService.saveStudent(studentInformation);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<StudentInformation>> getAllStudents() {
        List<StudentInformation> students = studentInformationService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentInformation> getStudentById(@PathVariable long id) {
        StudentInformation student = studentInformationService.getStudentById(id);
        if (student != null) {
            return new ResponseEntity<>(student, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
