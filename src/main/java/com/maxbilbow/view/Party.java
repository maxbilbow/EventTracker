package com.maxbilbow.view;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by bilbowm on 28/09/2015.
 */

@Documented
@Constraint(validatedBy = PartyConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Party {

    String message() default "{Party}";

    Class<?>[] groups() default  {};

    Class<? extends Payload>[] payload() default {};

}


