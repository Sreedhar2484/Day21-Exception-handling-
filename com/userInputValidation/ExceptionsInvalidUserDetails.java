package com.userInputValidation;

import org.junit.Assert;
import org.junit.Test;

import exceptions.InvalidEmailException;
import exceptions.InvalidFirstNameException;
import exceptions.InvalidLastNameException;
import exceptions.InvalidMobileNumberException;
import exceptions.InvalidPasswordException;

public class ExceptionsInvalidUserDetails {
	@Test
    public void givenFirstNameWhenProperShouldReturnTrue() {
        UserInputValidation userInputValidation = new UserInputValidation();
        boolean result = false;
        try {
        result = userInputValidation.isValidFirstName("Nagalli");
        Assert.assertEquals(true, result);
        } catch (InvalidFirstNameException e) {
        }
    }
	 @Test
	    public void givenFirstName_WhenShort_ShouldThrowException() {
	        UserInputValidation userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	        result = userInputValidation.isValidFirstName("Nag");
	        } catch (InvalidFirstNameException e) {
	        	Assert.assertEquals("Please enter valid input.", e.getMessage());
	        }
	 }
	 @Test
	    public void givenLastNameWhenProperShouldReturnTrue() {
		 UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidLastName("Sreedhar");
	        } catch (InvalidLastNameException e) {
	            Assert.assertEquals(true, result);
	        }
	    }

	    @Test
	    public void givenLastNameWhenShortShouldThrowException() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidLastName("Sree");
	        } catch (InvalidLastNameException e) {
	            Assert.assertEquals("Please enter valid input.", e.getMessage());
	        }
	    }

	    @Test
	    public void givenEmail_WhenValidShouldReturnTrue() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidEmail("nsridhary2k@gmail.com");
	        } catch (InvalidEmailException e) {
	            Assert.assertEquals(true, result);
	        }
	    }


	    @Test
	    public void givenMobileNum_WhenProper_ShouldReturnTrue() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidMobileNumber("7356842245");
	        } catch (InvalidMobileNumberException e) {
	            Assert.assertEquals(true, result);
	        }
	    }

	    @Test
	    public void givenMobileNum_WhenNotProper_ShouldThrowException() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidMobileNumber("90885-755-558");
	        } catch (InvalidMobileNumberException e) {
	            Assert.assertEquals("Please enter valid input.", e.getMessage());
	        }
	    }

	    @Test
	    public void givenPassword_WhenValid_ShouldReturnTrue() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidPassword("P@ssword123");
	        } catch (InvalidPasswordException e) {
	            Assert.assertEquals(true, result);
	        }
	    }

	    @Test
	    public void givenPassword_WithoutNumericValue_ShouldReturnFalse() {
	    	UserInputValidation  userInputValidation = new UserInputValidation();
	        boolean result = false;
	        try {
	            result = userInputValidation.isValidPassword("hsjH@hdi@i");
	        } catch (InvalidPasswordException e) {
	            Assert.assertEquals("Please enter valid input.", e.getMessage());
	        }
	    }
