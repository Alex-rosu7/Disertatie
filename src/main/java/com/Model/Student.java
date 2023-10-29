package com.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "student")
public class Student extends Person {

    @Id
    private String id;

    /**
     * Constructor
     *
     * @param firstName
     * @param secondName
     * @param email
     * @param password
     */
    public Student(String firstName, String secondName, String email, String password) {
        super(firstName, secondName, email, password);
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
