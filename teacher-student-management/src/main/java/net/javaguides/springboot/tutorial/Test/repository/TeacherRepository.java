package net.javaguides.springboot.tutorial.Test.repository;


import net.javaguides.springboot.tutorial.Test.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
