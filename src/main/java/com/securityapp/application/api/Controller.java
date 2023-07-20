package com.securityapp.application.api;

import com.securityapp.application.appentity.AppUser;
import com.securityapp.application.appservice.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
