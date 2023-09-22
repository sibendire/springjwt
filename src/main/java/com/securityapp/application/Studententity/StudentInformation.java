package com.securityapp.application.Studententity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;



@Entity
@Table(name = "Student")
public class StudentInformation {
    // @OneToMany(mappedBy = "studentInformation")

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")

    @Id
    private Long id;
    private String studentFirstName;
    private String studentMidName;
    private String studentLastName;
    private String studentDateOfBirth;
    private String studentNationalIdentificationNumberNIN;
    private String studentNationalIdentificationCardNumber;
    private String studentGender;
    private String studentClass;
    private String studentHealthRecord;
    private String studentPhoto;
    private String studentPhoneNumber;
    private String studentHomeAddress;
    private String studentSubCounty;
    private String studentDistrict;


    public StudentInformation() {
    }

    public StudentInformation(long id, String studentFirstName,String studentPhoto, String studentMidName, String studentLastName, String studentDateOfBirth, String studentNationalIdentificationNumberNIN, String studentNationalIdentificationCardNumber, String studentGender, String studentClass, String studentHealthRecord, String studentPhoneNumber, String studentHomeAddress, String studentSubCounty, String studentDistrict) {
        this.id = id;
        this.studentFirstName = studentFirstName;
        this.studentMidName = studentMidName;
        this.studentLastName = studentLastName;
        this.studentDateOfBirth = studentDateOfBirth;
        this.studentNationalIdentificationNumberNIN = studentNationalIdentificationNumberNIN;
        this.studentNationalIdentificationCardNumber = studentNationalIdentificationCardNumber;
        this.studentGender = studentGender;
        this.studentClass = studentClass;
        this.studentPhoto = studentPhoto;
        this.studentHealthRecord = studentHealthRecord;
        this.studentPhoneNumber = studentPhoneNumber;
        this.studentHomeAddress = studentHomeAddress;
        this.studentSubCounty = studentSubCounty;
        this.studentDistrict = studentDistrict;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentPhoto() {
        return studentPhoto;
    }

    public void setStudentPhoto(String studentPhoto) {
        this.studentPhoto = studentPhoto;
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

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
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


    @OneToMany(mappedBy = "studentInformation", cascade = CascadeType.ALL)
    private List<Address> addressList;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classroom_id", referencedColumnName = "id")
    private Classroom classroom;

    @Column(name = "totalFees")
    private double totalFees = 0;

    @Column(name = "Balance")
    private double feesBalance;
}
