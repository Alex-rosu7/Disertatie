package com.Validators;



import com.Model.Student;
import io.micrometer.core.instrument.config.validate.InvalidReason;
import io.micrometer.core.instrument.config.validate.Validated;
import io.micrometer.core.instrument.config.validate.ValidationException;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ValidatorStudent implements Validator<Student> {

    public void validate(Student entity) throws ValidationException {
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


        if (entity.getGrade() < 0) {
            throw new ValidationException(Validated.invalid("Grade", entity, "Student grade can't be negative", malformed));
        }

        if (entity.getGrade() > 12) {
            throw new ValidationException(Validated.invalid("Grade", entity, "The introduce grade doesn't exist", malformed));
        }

    }
}