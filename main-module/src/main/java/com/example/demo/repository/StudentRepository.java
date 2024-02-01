package com.example.demo.repository;

import com.example.demo.model.StudentTbl;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentTbl, Long> {

    StudentTbl findByName(String name);
}
