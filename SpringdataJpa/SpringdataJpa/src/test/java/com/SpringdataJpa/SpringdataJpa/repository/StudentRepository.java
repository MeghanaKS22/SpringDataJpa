package com.SpringdataJpa.SpringdataJpa.repository;

import com.SpringdataJpa.SpringdataJpa.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByStudentName(String name);
    List<Student>  findByStudentNameContaining(String name);
}
