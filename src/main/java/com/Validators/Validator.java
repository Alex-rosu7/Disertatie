package com.Validators;


import com.Exceptions.ValidationException;

public interface Validator<E> {
    void validate(E var)  throws ValidationException;
}
