package com.securityapp.application.Studententity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

@Entity
@Table(name = "Teachers")

public class Teacher {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private long id;
    private String firstName;
    private String givenName;
    private String lastName;
    private String nationalIdentificationNumberNIN;
    private int nationalIdentificationCardNumber;
    private String email;
    private String dateOfBirth;
    private String phoneNumber;
    private String sex;
    private String maritalStatus;
    private double teacherSalary;
    private Date createdDate;
    private Date updatedDate;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
    private List<Classroom> classroomList;

    public Teacher() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalIdentificationNumberNIN() {
        return nationalIdentificationNumberNIN;
    }

    public void setNationalIdentificationNumberNIN(String nationalIdentificationNumberNIN) {
        this.nationalIdentificationNumberNIN = nationalIdentificationNumberNIN;
    }

    public int getNationalIdentificationCardNumber() {
        return nationalIdentificationCardNumber;
    }

    public void setNationalIdentificationCardNumber(int nationalIdentificationCardNumber) {
        this.nationalIdentificationCardNumber = nationalIdentificationCardNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public double getTeacherSalary() {
        return teacherSalary;
    }

    public void setTeacherSalary(double teacherSalary) {
        this.teacherSalary = teacherSalary;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }


}
