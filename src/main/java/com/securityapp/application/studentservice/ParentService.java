package com.securityapp.application.studentservice;

import com.securityapp.application.Studententity.Parent;

import java.util.List;

public interface ParentService {
    Parent saveParent(Parent parent);

    Parent findParentById(long id);

    List<Parent> getAllParent();


    <ParentPhoto> ParentPhoto getParentPhoto(ParentPhoto parentPhoto);
}
