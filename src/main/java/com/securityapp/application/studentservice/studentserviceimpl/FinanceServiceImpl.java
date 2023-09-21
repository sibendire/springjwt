package com.securityapp.application.studentservice.studentserviceimpl;

import com.securityapp.application.Studententity.Finance;
import com.securityapp.application.Studententity.StudentInformation;
import com.securityapp.application.studentrepository.FinanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class FinanceServiceImpl {

    @Autowired
    private FinanceRepository financeRepository;

    public Finance savePayment(Finance finance) {
        return financeRepository.save(finance);
    }

    public Finance getStudentBalance(Finance finance) {
        return financeRepository.getReferenceById(finance.getId());
    }

    public List<Finance> getAllStudentPaid(Finance finance) {
        return financeRepository.findAll(finance);
    }

    public List<Finance> getAllStudentSponsorship(Finance finance) {
        return financeRepository.findAll();
    }

    public StudentInformation updateStudentPayment(Finance finance) {
        return financeRepository.updatePayment(finance);
    }

    public Finance getStudentBalanceById(@PathVariable long id) {
        return financeRepository.findById(id).get();

    }
    public Finance getStudentSponsorshipById(){
        return financeRepository.findById(getStudentSponsorshipById());
    }
}
