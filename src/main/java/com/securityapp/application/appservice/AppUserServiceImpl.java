package com.securityapp.application.appservice;

import com.securityapp.application.appentity.AppUser;
import com.securityapp.application.appentity.Role;
import com.securityapp.application.apprepo.AppRoleRepo;
import com.securityapp.application.apprepo.AppUserRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class AppUserServiceImpl implements AppUserService{
    private final AppUserRepo appUserRepo;
    private  final AppRoleRepo appRoleRepo;
    @Override
    public AppUser saveAppUser(AppUser appUser) {
        log.info("saving new app user {} to the database",appUser.getName());
        return appUserRepo.save(appUser);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("saving new role {} to the database",role.getName());
        return appRoleRepo.save(role);
    }

    @Override
    public void addRolesToAppUser(String username, String roleName) {
        log.info("adding roles to the app user ",username,roleName);
     AppUser appUser = appUserRepo.findByUserName(username);
     Role role = appRoleRepo.findByName(roleName);
     appUser.getRoles().add(role);
    }

    @Override
    public AppUser getAppUser(String username) {
        log.info("get app user",username);
        return appUserRepo.findByUserName(username);
    }

    @Override
    public List<AppUser> getAppUser() {
        log.info("fetching all app user");
        return appUserRepo.findAll();
    }

    @Override
     public void deleteAppUser(String username) {
        AppUser appUser1 = appUserRepo.delete(username);
    }

    @Override
    public void deleteRolesFromAppUser(String roleName) {
        Role role = appRoleRepo.delete(roleName);

    }
}
