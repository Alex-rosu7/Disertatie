package com.Model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.Date;

import static java.util.Objects.isNull;

@Data
@NoArgsConstructor
public abstract class Person implements GenericObject {

    @Id
    private String id;

    public Person(String firstName, String secondName, String email, String password) {
        this.email = email;
        this.firstName = firstName;
        this.secondName = secondName;
        this.password = password;
    }

    @Indexed(direction = IndexDirection.DESCENDING, unique = true)
    private String email;

    private String firstName;
    private String secondName;
    private String password;
    private String jwtToken;

    @CreatedDate
    public Date createdAt;
    @LastModifiedDate
    private Date updatedAt;

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public boolean isNew() {
        return isNull(this.createdAt);
    }
}
