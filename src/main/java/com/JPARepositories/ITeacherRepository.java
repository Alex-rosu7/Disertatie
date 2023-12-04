package com.JPARepositories;

import com.Model.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeacherRepository  extends MongoRepository<String, Teacher> {
}
