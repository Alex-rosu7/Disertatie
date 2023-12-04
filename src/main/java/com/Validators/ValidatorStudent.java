package com.Validators;


import com.Exceptions.ValidationException;
import com.Model.Student;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ValidatorStudent implements Validator<Student> {

    public void validate(Student entity) throws ValidationException {

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


        if (entity.getGrade() < 0) {
            err = "Field is not properly configured: " + "Grade" + ". For " + entity + ". Case " + "Student grade can't be negative.";
            throw new ValidationException(err);
        }

        if (entity.getGrade() > 12) {
            err = "Field is not properly configured: " + "Grade" + ". For " + entity + ". Case " + "The introduce grade doesn't exist.";
            throw new ValidationException(err);
        }

    }
}