package com.Validators;


import com.Model.Parent;
import io.micrometer.core.instrument.config.validate.InvalidReason;
import io.micrometer.core.instrument.config.validate.Validated;
import io.micrometer.core.instrument.config.validate.ValidationException;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class ValidatorParent implements Validator<Parent> {

    public void validate(Parent entity) throws ValidationException {
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

    }
}

