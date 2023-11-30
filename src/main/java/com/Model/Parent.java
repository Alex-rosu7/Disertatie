package com.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Table
@Entity
@NoArgsConstructor
public class Parent extends Person {

    @Id
    private String id;

    // list of children


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
