package com.biz.regex;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
    @Test
    public void givenFirstName_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = true;
        try {
            actualResult = validation.firstNameValidation("Manish");
        } catch (UserValidationException exception) {
            Assert.assertEquals(actualResult, exception.message);
        }
    }

    @Test
    public void giveLastName_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = true;
        try {
            actualResult = validation.lastNameValidation("Kumar");
        } catch (UserValidationException exception) {
            Assert.assertEquals(actualResult, exception.message);
        }
    }

    @Test
    public void givenEmail_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = true;
        try {
            actualResult = validation.emailValidation("mkaubr007@gmail.com");
        } catch (UserValidationException exception) {
            Assert.assertEquals(actualResult, exception);
        }
    }

    @Test
    public void givenPhoneNumber_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = true;
        try {
            actualResult = validation.phoneNumberValidation("+918002695700");
        } catch (UserValidationException exception) {
            Assert.assertEquals(actualResult, exception.message);
        }
    }

    @Test
    public void givenPassword_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult=true;
        try {
             actualResult = validation.passwordValidation("qw1rt@Ms");
        }catch (UserValidationException exception) {
            Assert.assertEquals(actualResult,exception.message);
        }
    }
}
