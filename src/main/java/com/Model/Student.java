package com.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@Table
@Entity
@NoArgsConstructor
public class Student extends Person {

    @Id
    private String id;

    /**
     * The class of the student ( example : 8A ).
     */
    @Column
    private String room;

    @Column
    private int Grade;


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
