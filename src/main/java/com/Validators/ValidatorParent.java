package com.Validators;


import com.Exceptions.ValidationException;
import com.Model.Parent;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class ValidatorParent implements Validator<Parent> {

    public void validate(Parent entity) throws ValidationException {

        if (entity.getFirstName().isEmpty()) {
            String err = "Field is not properly configured: " + "FirstName" + ". For " + entity + ". Case " + "First name shouldn't be empty.";
            throw new ValidationException(err);
        }

        if (entity.getSecondName().isEmpty()) {
            String err = "Field is not properly configured: " + "SecondName" + ". For " + entity + ". Case " + "Second name shouldn't be empty.";
            throw new ValidationException(err);
        }

        if (entity.getEmail().isEmpty()) {
            String err = "Field is not properly configured: " + "Email" + ". For " + entity + ". Case " + "Email shouldn't be empty.";
            throw new ValidationException(err);
        }

        if (entity.getEmail().indexOf(64) < 0) {
            String err = "Field is not properly configured: " + "Email" + ". For " + entity + ". Case " + "The Email is not properly introduced.";
            throw new ValidationException(err);
        }

        if (entity.getPassword().isEmpty()) {
            String err = "Field is not properly configured: " + "Email" + ". For " + entity + ". Case " + "Password shouldn't be empty.";
            throw new ValidationException(err);
        }

    }
}

