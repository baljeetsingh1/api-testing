package net.javaguides.springboot.tutorial.Test.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
    private List<Student> students;

    // getters and setters
}
