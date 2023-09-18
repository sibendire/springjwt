package com.securityapp.application.Studententity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;



@Entity
@Table(name = "Student")
public class StudentInformation {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    private long id;
    private String studentFirstName;
    private String studentMidName;
    private String studentLastName;
    private String studentDateOfBirth;
    private String studentNationalIdentificationNumberNIN;
    private String studentNationalIdentificationCardNumber;
    private String studentSex;
    private String studentLevelOfEducation;
    private String studentHealthRecord;
    private String studentPhoneNumber;
    private String studentHomeAddress;
    private String studentSubCounty;
    private String studentDistrict;
    private String studentFatherName;
    private String fatherNationalIdentificationNumber;
    private String fatherPhone;
    private String fatherEmail;
    private String fatherAddress;
    private String fatherOccupation;
    private String studentMotherName;
    private String motherNationalIdentificationNumber;
    private String motherEmail;
    private String motherAddress;
    private String motherOccupation;
    private String motherPhone;

    public StudentInformation() {
    }

    public StudentInformation(long id, String studentFirstName, String studentMidName, String studentLastName, String studentDateOfBirth, String studentNationalIdentificationNumberNIN, String studentNationalIdentificationCardNumber, String studentSex, String studentLevelOfEducation, String studentHealthRecord, String studentPhoneNumber, String studentHomeAddress, String studentSubCounty, String studentDistrict, String studentFatherName, String fatherNationalIdentificationNumber, String fatherPhone, String fatherEmail, String fatherAddress, String fatherOccupation, String studentMotherName, String motherNationalIdentificationNumber, String motherEmail, String motherAddress, String motherOccupation, String motherPhone) {
        this.id = id;
        this.studentFirstName = studentFirstName;
        this.studentMidName = studentMidName;
        this.studentLastName = studentLastName;
        this.studentDateOfBirth = studentDateOfBirth;
        this.studentNationalIdentificationNumberNIN = studentNationalIdentificationNumberNIN;
        this.studentNationalIdentificationCardNumber = studentNationalIdentificationCardNumber;
        this.studentSex = studentSex;
        this.studentLevelOfEducation = studentLevelOfEducation;
        this.studentHealthRecord = studentHealthRecord;
        this.studentPhoneNumber = studentPhoneNumber;
        this.studentHomeAddress = studentHomeAddress;
        this.studentSubCounty = studentSubCounty;
        this.studentDistrict = studentDistrict;
        this.studentFatherName = studentFatherName;
        this.fatherNationalIdentificationNumber = fatherNationalIdentificationNumber;
        this.fatherPhone = fatherPhone;
        this.fatherEmail = fatherEmail;
        this.fatherAddress = fatherAddress;
        this.fatherOccupation = fatherOccupation;
        this.studentMotherName = studentMotherName;
        this.motherNationalIdentificationNumber = motherNationalIdentificationNumber;
        this.motherEmail = motherEmail;
        this.motherAddress = motherAddress;
        this.motherOccupation = motherOccupation;
        this.motherPhone = motherPhone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentMidName() {
        return studentMidName;
    }

    public void setStudentMidName(String studentMidName) {
        this.studentMidName = studentMidName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentDateOfBirth() {
        return studentDateOfBirth;
    }

    public void setStudentDateOfBirth(String studentDateOfBirth) {
        this.studentDateOfBirth = studentDateOfBirth;
    }

    public String getStudentNationalIdentificationNumberNIN() {
        return studentNationalIdentificationNumberNIN;
    }

    public void setStudentNationalIdentificationNumberNIN(String studentNationalIdentificationNumberNIN) {
        this.studentNationalIdentificationNumberNIN = studentNationalIdentificationNumberNIN;
    }

    public String getStudentNationalIdentificationCardNumber() {
        return studentNationalIdentificationCardNumber;
    }

    public void setStudentNationalIdentificationCardNumber(String studentNationalIdentificationCardNumber) {
        this.studentNationalIdentificationCardNumber = studentNationalIdentificationCardNumber;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public String getStudentLevelOfEducation() {
        return studentLevelOfEducation;
    }

    public void setStudentLevelOfEducation(String studentLevelOfEducation) {
        this.studentLevelOfEducation = studentLevelOfEducation;
    }

    public String getStudentHealthRecord() {
        return studentHealthRecord;
    }

    public void setStudentHealthRecord(String studentHealthRecord) {
        this.studentHealthRecord = studentHealthRecord;
    }

    public String getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public String getStudentHomeAddress() {
        return studentHomeAddress;
    }

    public void setStudentHomeAddress(String studentHomeAddress) {
        this.studentHomeAddress = studentHomeAddress;
    }

    public String getStudentSubCounty() {
        return studentSubCounty;
    }

    public void setStudentSubCounty(String studentSubCounty) {
        this.studentSubCounty = studentSubCounty;
    }

    public String getStudentDistrict() {
        return studentDistrict;
    }

    public void setStudentDistrict(String studentDistrict) {
        this.studentDistrict = studentDistrict;
    }

    public String getStudentFatherName() {
        return studentFatherName;
    }

    public void setStudentFatherName(String studentFatherName) {
        this.studentFatherName = studentFatherName;
    }

    public String getFatherNationalIdentificationNumber() {
        return fatherNationalIdentificationNumber;
    }

    public void setFatherNationalIdentificationNumber(String fatherNationalIdentificationNumber) {
        this.fatherNationalIdentificationNumber = fatherNationalIdentificationNumber;
    }

    public String getFatherPhone() {
        return fatherPhone;
    }

    public void setFatherPhone(String fatherPhone) {
        this.fatherPhone = fatherPhone;
    }

    public String getFatherEmail() {
        return fatherEmail;
    }

    public void setFatherEmail(String fatherEmail) {
        this.fatherEmail = fatherEmail;
    }

    public String getFatherAddress() {
        return fatherAddress;
    }

    public void setFatherAddress(String fatherAddress) {
        this.fatherAddress = fatherAddress;
    }

    public String getFatherOccupation() {
        return fatherOccupation;
    }

    public void setFatherOccupation(String fatherOccupation) {
        this.fatherOccupation = fatherOccupation;
    }

    public String getStudentMotherName() {
        return studentMotherName;
    }

    public void setStudentMotherName(String studentMotherName) {
        this.studentMotherName = studentMotherName;
    }

    public String getMotherNationalIdentificationNumber() {
        return motherNationalIdentificationNumber;
    }

    public void setMotherNationalIdentificationNumber(String motherNationalIdentificationNumber) {
        this.motherNationalIdentificationNumber = motherNationalIdentificationNumber;
    }

    public String getMotherEmail() {
        return motherEmail;
    }

    public void setMotherEmail(String motherEmail) {
        this.motherEmail = motherEmail;
    }

    public String getMotherAddress() {
        return motherAddress;
    }

    public void setMotherAddress(String motherAddress) {
        this.motherAddress = motherAddress;
    }

    public String getMotherOccupation() {
        return motherOccupation;
    }

    public void setMotherOccupation(String motherOccupation) {
        this.motherOccupation = motherOccupation;
    }

    public String getMotherPhone() {
        return motherPhone;
    }

    public void setMotherPhone(String motherPhone) {
        this.motherPhone = motherPhone;
    }
    @OneToMany (mappedBy = "student",cascade = CascadeType.ALL)
    private List<Address>addressList;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classroom_id",referencedColumnName = "id")
    private Classroom classroom;
}
