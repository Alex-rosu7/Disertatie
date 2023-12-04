package com.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import static java.util.Objects.isNull;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Employee extends Person {

    private double salary = 0.00D;

    private String company;

    boolean deleted;

    public Employee(String FName, String LName, String Email, String Password, double Salary) {
        super(FName, LName, Email, Password);
        this.salary = Salary;
    }


    @Override
    public boolean isNew() {
        return isNull(super.getCreatedAt());
    }


}
