package com.maxbilbow.view;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by bilbowm on 29/09/2015.
 */
public class EventNameConstraintValidator implements ConstraintValidator<EventName, String> {
    @Override
    public void initialize(EventName eventName) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s != null && s.contains("ring all your mates"))
            return true;
        return false;
    }
}
