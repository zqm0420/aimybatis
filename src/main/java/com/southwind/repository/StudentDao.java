package com.southwind.repository;

import com.southwind.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAll();
    Student findByID(Integer id);
}
