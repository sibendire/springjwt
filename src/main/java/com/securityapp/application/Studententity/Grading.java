package com.securityapp.application.Studententity;

public class Grading {
    private Long id;
    private String studentFirstName;
    private String studentMidName;
    private String studentLastName;
    private String studentClass;
    private String studentPhoto;
    private String studentGrade;
    private String studentPosition;
    private String recommendations;
    private double feesBalance;

    public Grading(Long id, String studentFirstName, String studentMidName, String studentLastName, String studentClass, String studentPhoto, String studentGrade, String studentPosition, String recommendations) {
        this.id = id;
        this.studentFirstName = studentFirstName;
        this.studentMidName = studentMidName;
        this.studentLastName = studentLastName;
        this.studentClass = studentClass;
        this.studentPhoto = studentPhoto;
        this.studentGrade = studentGrade;
        this.studentPosition = studentPosition;
        this.recommendations = recommendations;
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

    public String getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }

    public String getStudentPosition() {
        return studentPosition;
    }

    public void setStudentPosition(String studentPosition) {
        this.studentPosition = studentPosition;
    }

    public String getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
    }

    public double getFeesBalance() {
        return feesBalance;
    }
}
