package com.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "Parents")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Parent extends Person {

    public Parent(String firstName, String lastName, String email, String password) {
        super(firstName, lastName, email, password);

    }

    @Override
    public String getId() {
        return super.getId();
    }

}
