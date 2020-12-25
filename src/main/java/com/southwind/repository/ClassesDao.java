package com.southwind.repository;

import com.southwind.entity.Classes;
import com.southwind.entity.Student;

import java.util.List;

public interface ClassesDao {
    Classes findByID(Integer id);
}
