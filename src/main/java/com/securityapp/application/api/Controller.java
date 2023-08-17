package com.securityapp.application.api;

import com.securityapp.application.appentity.AppUser;
import com.securityapp.application.appservice.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class Controller {
    private final AppUserService appUserService;
    @GetMapping("/app")
    public ResponseEntity<List<AppUser>>getAppUsers(){

        return ResponseEntity.ok().body(appUserService.getAppUser());
    }
    @PostMapping("/app/save")
    public ResponseEntity <AppUser> saveAppUser(@RequestBody  AppUser appUser){
        return ResponseEntity.ok().body(appUserService.saveAppUser(appUser));

    }

}
