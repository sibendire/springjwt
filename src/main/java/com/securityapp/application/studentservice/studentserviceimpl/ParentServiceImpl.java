package com.securityapp.application.studentservice.studentserviceimpl;

import com.fasterxml.jackson.databind.JsonNode;
import com.securityapp.application.Studententity.Parent;
import com.securityapp.application.studentrepository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class ParentServiceImpl {
    @Autowired
    private ParentRepository parentRepository;
    private JsonNode parentPhotos;

    public Parent saveParent(Parent parent) {
        // Save the parent information using the repository
        return parentRepository.save(parent);
    }

    public List<Parent> getAllParent() {
        // Retrieve all Parents from the repository and return them as a list
        return parentRepository.findAll();
    }

    public Parent getParentById(@PathVariable long id) {
        // Attempt to find a Parent  by ID in the repository
        return parentRepository.findById(id).get();
    }

    public String getPhotosImagePath() {

        if (parentPhotos.isEmpty() && parentPhotos.canConvertToLong()) {
            return "/img/avatarImg.jpg";
        } else {
            return "/productImages/" + parentPhotos;
        }
    }
}
