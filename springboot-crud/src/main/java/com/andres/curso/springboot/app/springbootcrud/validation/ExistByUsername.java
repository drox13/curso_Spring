package com.andres.curso.springboot.app.springbootcrud.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ExistByUsernameValidation.class)
@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ExistByUsername {

    String message() default "ya existe en la Bd, escoja otro nombre!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
