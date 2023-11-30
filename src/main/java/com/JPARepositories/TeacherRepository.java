package com.JPARepositories;

import com.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class TeacherRepository implements JpaRepository<Student, String> {
}
