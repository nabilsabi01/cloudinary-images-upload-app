package com.devart.cloudimages.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = FileSizeValidator.class)
@Target({ ElementType.PARAMETER, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface FileSize {
    String message() default "File size exceeds the maximum allowed limit";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    String max();
}