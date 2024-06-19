package net.javaguides.springboot.tutorial.Test.repository;

import net.javaguides.springboot.tutorial.Test.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
