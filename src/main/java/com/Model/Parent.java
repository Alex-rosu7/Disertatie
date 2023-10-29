package com.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class Parent extends Person {
    @Id
    @NonNull
    private String id;


    public Parent() {
        super();
    }

    public Parent(String firstName, String lastName, String email, String password) {
        super(firstName, lastName, email, password);

    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
