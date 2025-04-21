package com.hogwartss.school.h.repository;

import com.hogwartss.school.h.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    public List<Student> getStudentByAge(int age);

    List<Student> findByAgeBetween(int minAge, int maxAge);

    List<Student> findStudentByFacultyId(Long facultyId);
}

