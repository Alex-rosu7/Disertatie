package com.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.NonNull;
import org.springframework.security.core.parameters.P;

public class Teacher extends Person {
    @Id
    private String id;

    @Column
    @NonNull
    private Subject subject;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
