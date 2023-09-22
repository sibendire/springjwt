package com.securityapp.application.studentcontroller;

import com.securityapp.application.Studententity.Parent;
import com.securityapp.application.Studententity.StudentInformation;
import com.securityapp.application.studentservice.ParentService;
import com.securityapp.application.studentservice.StudentInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentInformationController {
    @Autowired
    private StudentInformationService studentInformationService;
    @Autowired
    private ParentService parentService;

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

    @PostMapping("/save_parent")
    public ResponseEntity<Parent> saveParent(@RequestBody Parent parent) {
        Parent parent1 = parentService.saveParent(parent);
        return new ResponseEntity<Parent>((MultiValueMap<String, String>) saveParent(parent), HttpStatus.CREATED);
    }

    @GetMapping("/list_parent")
    public ResponseEntity<List<Parent>> getAllParents() {
        List<Parent> parents = parentService.getAllParent();
        return new ResponseEntity<>(parents, HttpStatus.OK);
    }

    @GetMapping("/parent/{id}")
    public ResponseEntity<Parent> getParentById(@PathVariable long id) {
        Parent parent = parentService.findParentById(id);
        if (parent != null) {
            return new ResponseEntity<>(parent, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
