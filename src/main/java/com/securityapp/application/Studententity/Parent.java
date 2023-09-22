package com.securityapp.application.Studententity;

import com.securityapp.application.appentity.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;
import lombok.Data;

import java.util.Optional;

@Entity
@Data

public class Parent {
    private long parentId;

    @Column(name = "user_name",unique = true)
    private String username;

    @Column(name = "password")
    private String password;

    private boolean active = true;

    @Column(name = "first_Name")
    private String firstName;

    @Column(name = "last_Name")
    private String lastName;

    @ManyToOne
    private Role role;

    @Column(name = "guardians_Information")
    private String guardiansInformation;

    @Column(name = "guardian_Phone_Number")
    private String phoneNumber;

    @Column(name = "address", length = 10485760)
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "photos")
    private String parentPhotos;

    public static Optional<Object> findById(long id) {

        return null;
    }

    @Transient
    public String getPhotosImagePath() {
        if (parentPhotos.isEmpty() && parentId == 0) {
            return null;
        } else {
            return "/productImages/" + parentPhotos.trim();
        }
    }
}
