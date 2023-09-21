package com.securityapp.application.studentservice;

import com.securityapp.application.Studententity.Finance;
import com.securityapp.application.Studententity.StudentInformation;

public interface FinanceService {
    StudentInformation savePayment(Finance finance);

    StudentInformation getStudentBalance(StudentInformation studentInformation);

    StudentInformation getAllStudentPaid(StudentInformation studentInformation);

    StudentInformation getAllStudentSponsorship(StudentInformation studentInformation);

    StudentInformation updateStudentPayment(StudentInformation studentInformation);

    StudentInformation getStudentBalanceById(StudentInformation studentInformation);

    StudentInformation getStudentSponsorshipById(StudentInformation studentInformation);

}
