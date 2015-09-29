package com.maxbilbow.view;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by bilbowm on 29/09/2015.
 */

@Documented
@Constraint(validatedBy = EventNameConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface EventName {

    String message() default "{EventName}";

    Class<?>[] groups() default  {};

    Class<? extends Payload>[] payload() default {};
}
