package com.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "Student")
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Student extends Person {

    private String room;

    private int Grade;

    public Student(String firstName, String secondName, String email, String password) {
        super(firstName, secondName, email, password);
    }

}
