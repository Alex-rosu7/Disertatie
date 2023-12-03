package com.Validators;

import io.micrometer.core.instrument.config.validate.ValidationException;

public interface Validator<E> {
    void validate(E var)  throws ValidationException;
}
