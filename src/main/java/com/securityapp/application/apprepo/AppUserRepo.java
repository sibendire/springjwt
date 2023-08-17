package com.securityapp.application.apprepo;

import com.securityapp.application.appentity.AppUser;
import com.securityapp.application.appentity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppUserRepo extends JpaRepository<AppUser, Long> {
  void deleteByUsername(String username);
  AppUser findByUsername(String username);
  List<AppUser> findByRolesContaining(Role role);
}
