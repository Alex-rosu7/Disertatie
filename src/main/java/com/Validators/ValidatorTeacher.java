package com.Validators;


import com.Exceptions.ValidationException;
import com.Model.Teacher;


import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ValidatorTeacher implements Validator<Teacher> {

    public void validate(Teacher entity) throws ValidationException {
String err;
        if (entity.getFirstName().isEmpty()) {
            err = "Field is not properly configured: " + "FirstName" + ". For " + entity + ". Case " + "First name shouldn't be empty.";
            throw new ValidationException(err);
        }

        if (entity.getSecondName().isEmpty()) {
             err = "Field is not properly configured: " + "SecondName" + ". For " + entity + ". Case " + "Second name shouldn't be empty.";
            throw new ValidationException(err);
        }

        if (entity.getEmail().isEmpty()) {
             err = "Field is not properly configured: " + "Email" + ". For " + entity + ". Case " + "Email shouldn't be empty.";
            throw new ValidationException(err);
        }

        if (entity.getEmail().indexOf(64) < 0) {
            err = "Field is not properly configured: " + "Email" + ". For " + entity + ". Case " + "The Email is not properly introduced.";
            throw new ValidationException(err);
        }

        if (entity.getPassword().isEmpty()) {
             err = "Field is not properly configured: " + "Email" + ". For " + entity + ". Case " + "Password shouldn't be empty.";
            throw new ValidationException(err);
        }

        if (entity.getSalary() < 0.0D) {
            err = "Field is not properly configured: " + "Salary" + ". For " + entity + ". Case " + "Salary can't have this value.";
            throw new ValidationException(err);
        }

    }
}
