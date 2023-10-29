package com.JPARepositories;

import com.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class StudentRepository implements JpaRepository<Student, String> {
}
