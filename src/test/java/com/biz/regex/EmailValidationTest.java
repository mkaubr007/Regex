package com.biz.regex;

import org.junit.Assert;
import org.junit.Test;

public class EmailValidationTest {
    @Test
    public void email_Validation_One(){
        EmailValidation validation=new EmailValidation();
        boolean actualResult=validation.email("abc@1yahoo.com");
        Assert.assertTrue(actualResult);
    }
    @Test
    public void email_Validation_Two(){
        EmailValidation validation=new EmailValidation();
        boolean actualResult=validation.email("abc-100@yahoo.com");
        Assert.assertTrue(actualResult);
    }
    @Test
    public void emailValidation_Three(){
        EmailValidation validation=new EmailValidation();
        boolean actualResult=validation.email("abc.100@yahoo.com");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void email_Validation_Four(){
        EmailValidation validation=new EmailValidation();
        boolean actualResult=validation.email("abc111@abc.com");
        Assert.assertTrue(actualResult);
    }
    @Test
    public void email_Validation_Five(){
        EmailValidation validation=new EmailValidation();
        boolean actualResult=validation.email("abc-100@abc.net");
        Assert.assertTrue(actualResult);
    }
    @Test
    public void email_Validation_Six(){
        EmailValidation validation=new EmailValidation();
        boolean actualResult=validation.email("abc.100@abc.com.au");
        Assert.assertTrue(actualResult);
    }
    @Test
    public void email_Validation_Seven(){
        EmailValidation validation=new EmailValidation();
        boolean actualResult=validation.email("abc@1yahoo.nett.com");
        Assert.assertTrue(actualResult);
    }
//    "^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z0-9]+\.[a-z]+.([a-z]{2,3})$";
}
