package com.securityapp.application.appservice;

import com.securityapp.application.appentity.AppUser;
import com.securityapp.application.appentity.Role;

import java.util.List;

public interface AppUserService {
    AppUser saveAppUser(AppUser appUser);

    Role saveRole(Role role);

    void addRolesToAppUser(String username, String roleName);

    AppUser getAppUser(String username);

    List<AppUser> getAppUser();

    List<AppUser> getAppUsers();

    void deleteAppUser(String username);

    void deleteRolesFromAppUser(String roleName);

    void addRolesToAppUser(String role);
}
