package com.securityapp.application.Studententity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;
@Entity

public class Classroom {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    private  Long id;
    private String name;
    private String description;

    public Classroom(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @OneToMany(mappedBy = "classroom",cascade = CascadeType.ALL)
    private List<StudentInformation> studentInformations;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_id",referencedColumnName = "id")
    private Teacher teacher;
}
