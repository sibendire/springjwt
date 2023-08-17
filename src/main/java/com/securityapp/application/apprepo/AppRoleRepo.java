package com.securityapp.application.apprepo;

import com.securityapp.application.appentity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);

    void deleteByName(String name);
}
