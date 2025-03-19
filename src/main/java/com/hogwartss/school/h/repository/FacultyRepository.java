package com.hogwartss.school.h.repository;

import com.hogwartss.school.h.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    public List<Faculty> getFacultyByColor(String color);
}
