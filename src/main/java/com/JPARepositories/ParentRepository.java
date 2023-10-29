package com.JPARepositories;

import com.Model.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class ParentRepository implements JpaRepository<Parent, String> {
}
