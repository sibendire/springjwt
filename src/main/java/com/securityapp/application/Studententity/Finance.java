package com.securityapp.application.Studententity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Finance {
    @Id
    private Long id;
    private String studentFirstName;
    private String studentMidName;
    private String studentLastName;
    private String studentClass;
    private String studentPhoto;
    private double amountFeesPaid;
    private double feesBalance;
    private String TermPaid;
    private String studentSponsor;

    public Finance(){

    }

    public Finance(Long id, String studentFirstName, String studentMidName, String studentLastName, String studentClass, String studentPhoto, double amountFeesPaid, double feesBalance, String termPaid, String studentSponsor) {
        this.id = id;
        this.studentFirstName = studentFirstName;
        this.studentMidName = studentMidName;
        this.studentLastName = studentLastName;
        this.studentClass = studentClass;
        this.studentPhoto = studentPhoto;
        this.amountFeesPaid = amountFeesPaid;
        this.feesBalance = feesBalance;
        TermPaid = termPaid;
        this.studentSponsor = studentSponsor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getStudentPhoto() {
        return studentPhoto;
    }

    public void setStudentPhoto(String studentPhoto) {
        this.studentPhoto = studentPhoto;
    }

    public double getAmountFeesPaid() {
        return amountFeesPaid;
    }

    public void setAmountFeesPaid(double amountFeesPaid) {
        this.amountFeesPaid = amountFeesPaid;
    }

    public double getFeesBalance() {
        return feesBalance;
    }

    public void setFeesBalance(double feesBalance) {
        this.feesBalance = feesBalance;
    }

    public String getTermPaid() {
        return TermPaid;
    }

    public void setTermPaid(String termPaid) {
        TermPaid = termPaid;
    }

    public String getStudentSponsor() {
        return studentSponsor;
    }

    public void setStudentSponsor(String studentSponsor) {
        this.studentSponsor = studentSponsor;
    }
}
