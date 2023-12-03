package com.Validators;


import com.Model.Teacher;
import io.micrometer.core.instrument.config.validate.InvalidReason;
import io.micrometer.core.instrument.config.validate.Validated;
import io.micrometer.core.instrument.config.validate.ValidationException;


import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ValidatorTeacher implements Validator<Teacher> {

    public void validate(Teacher entity) {
        InvalidReason missing = InvalidReason.MISSING;
        InvalidReason malformed = InvalidReason.MALFORMED;

        if (entity.getFirstName().isEmpty()) {
            throw new ValidationException(Validated.invalid("FirstName", entity, "First name shouldn't be empty ", missing));
        }

        if (entity.getSecondName().isEmpty()) {
            throw new ValidationException(Validated.invalid("SecondName", entity, "Second name shouldn't be empty ", missing));
        }

        if (entity.getEmail().isEmpty()) {
            throw new ValidationException(Validated.invalid("Email", entity, "Email shouldn't be empty ", missing));
        }

        if (entity.getEmail().indexOf(64) < 0) {
            throw new ValidationException(Validated.invalid("Email", entity, "The Email is not properly introduced", malformed));
        }

        if (entity.getPassword().isEmpty()) {
            throw new ValidationException(Validated.invalid("Password", entity, "Password shouldn't be empty ", missing));
        }

        if (entity.getSalary() < 0.0D) {
            throw new ValidationException(Validated.invalid("Salary", entity, "Salary can't have this value", malformed));
        }

    }
}
