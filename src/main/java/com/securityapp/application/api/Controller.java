package com.securityapp.application.api;

import com.securityapp.application.appentity.AppUser;
import com.securityapp.application.appentity.Role;
import com.securityapp.application.appservice.AppUserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class Controller {
    private final AppUserService appUserService;

    @GetMapping("/app")
    public ResponseEntity<List<AppUser>> getAppUsers() {

        return ResponseEntity.ok().body(appUserService.getAppUser());
    }

    @PostMapping("/api/save")
    public ResponseEntity<AppUser> saveAppUser(@RequestBody AppUser appUser) {
        ServletUriComponentsBuilder servletUriComponentsBuilder = null;
        URI url = URI.create(servletUriComponentsBuilder.fromCurrentContextPath().path("/api/save/user").toString());
        return ResponseEntity.created(url).body(appUserService.saveAppUser(appUser));

    }

    @PostMapping("/role/save")
    public ResponseEntity<Role> saveRole(@RequestBody Role role) {
        ServletUriComponentsBuilder servletUriComponentsBuilder = null;
        URI url = URI.create(servletUriComponentsBuilder.fromCurrentContextPath().path("/api/save/role").toString());
         return ResponseEntity.created(url).body(appUserService.saveRole(role));
    }

    @PostMapping("/add_role")
    public void add(@RequestBody Role role) {
        appUserService.addRolesToAppUser(String.valueOf(role));
    }

    public ResponseEntity<?> addRoleToAppUser(@RequestBody RoleToUserForm form) {
        appUserService.addRolesToAppUser(form.getUsername(), form.getRolename());
        return ResponseEntity.ok().build();
    }

}

@Data
class RoleToUserForm {
    private String username;
    private String rolename;

}
