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
        assertTrue(passwordValidator.passwordLegnth8("12345678"));

        assertTrue(passwordValidator.notPassword("Passord"));
        }


    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }


}