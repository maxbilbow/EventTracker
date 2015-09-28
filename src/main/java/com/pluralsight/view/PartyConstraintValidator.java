package com.pluralsight.view;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by bilbowm on 28/09/2015.
 */
public class PartyConstraintValidator implements ConstraintValidator<Party, String> {
    @Override
    public void initialize(Party party) {

    }

    @Override
    public boolean isValid(String partyField, ConstraintValidatorContext constraintValidatorContext) {
        if (partyField == null || partyField.isEmpty())
            return false;
        return true;
    }
}
