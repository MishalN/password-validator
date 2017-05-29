package com.acme.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testStage1() {
        // Assert test for password length function
        assertTrue(passwordValidator.passwordLegnth8("12345678"));
        // Assert test for password is not "password" function
        assertTrue(passwordValidator.notPassword("Passord"));
        }

    @Test
    public void testStage2() {
        // Assert test for password length function
        assertTrue(passwordValidator.passwordLegnth8("12345678"));
        // Assert test for password is not "password" function
        assertTrue(passwordValidator.notPassword("Passord"));
        // Assert test for password has at least one upper case  function
        assertTrue(passwordValidator.upperCase("passoOrd"));
        // Assert test for password has at least one lower case  function
        assertTrue(passwordValidator.lowerCase("PPOIUUp"));
        // Assert test for password has at least one NUMBER  function
        assertTrue(passwordValidator.isNumber("PPO1IUUp"));
    }

    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }


}