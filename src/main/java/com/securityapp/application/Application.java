package com.securityapp.application;

import com.securityapp.application.appentity.AppUser;
import com.securityapp.application.appentity.Role;
import com.securityapp.application.appservice.AppUserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * @Bean
    CommandLineRunner run(AppUserService appUserService) {
        return args -> {
            Role roleUser = appUserService.saveRole(new Role(null, "ROLE_USER"));
            Role roleAdmin = appUserService.saveRole(new Role(null, "ROLE_ADMIN"));

            AppUser user1 = new AppUser();
            user1.setName("Joshua Sibendire");
            user1.setUsername("joshua");
            user1.setEmail("joshua@gmail.com");
            user1.setPassword("1234");
            user1.setRoles(new ArrayList<>());

            AppUser user2 = new AppUser();
            user2.setName("Moses  Sibendire");
            user2.setUsername("moses");
            user2.setEmail("moses@gmail.com");
            user2.setPassword("12342");
            user2.setRoles(new ArrayList<>());


            appUserService.saveAppUser(user1);
            appUserService.saveAppUser(user2);

            appUserService.addRolesToAppUser(user1.getUsername(), "ROLE_USER");
            appUserService.addRolesToAppUser(user2.getUsername(), "ROLE_USER");

            appUserService.addRolesToAppUser(user1.getUsername(), "ROLE_ADMIN");
        };
    }*/
}
