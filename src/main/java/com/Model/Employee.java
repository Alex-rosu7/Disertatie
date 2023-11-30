package com.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table
@NoArgsConstructor
public class Employee extends Person {

    @Id
    private String id;

    @Column
    private double salary = 0.00D;

    @Column
    private String company;

    @Column
    boolean deleted;

    public Employee(String FName, String LName, String Email, String Password, double Salary) {
        super(FName, LName, Email, Password);
        this.salary = Salary;
    }


    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

}
