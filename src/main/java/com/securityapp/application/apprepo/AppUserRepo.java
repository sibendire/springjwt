package com.securityapp.application.apprepo;

import com.securityapp.application.appentity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepo extends JpaRepository<AppUser,Long> {
  AppUser findByUserName(String username);
  AppUser delete(String username);

}
