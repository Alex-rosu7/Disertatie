package com.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Person implements Identifier<String> {

    private String firstName;
    private String secondName;
    private String email;
    private String password;
}
