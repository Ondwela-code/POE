/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.chat_app_part1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ondwela Mathobo
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserNameTrue() {
        System.out.println("checkUserName");
        String username = "kyl_1";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckUserNameFalse() {
        System.out.println("checkUserName");
        String username = "kyle!!!!!!!";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexityTrue() {
        System.out.println("checkPasswordComplexity");
        String password = " Ch&&sec@ke99!";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        
    }
    
    public void testCheckPasswordComplexityFalse() {
        System.out.println("checkPasswordComplexity");
        String password = " password";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkCellPhoneNumber method, of class Login.
     */
    @Test
    public void testCheckCellPhoneNumberTrue() {
        System.out.println("checkCellPhoneNumber");
        String cellphone = "+27838968976";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkCellPhoneNumber(cellphone);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testCheckCellPhoneNumberFalse() {
        System.out.println("checkCellPhoneNumber");
        String cellphone = "08966553";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkCellPhoneNumber(cellphone);
        assertEquals(expResult, result);
       
    }


    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        Login instance = new Login();
        instance.registerUser();
        
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        Login instance = new Login();
        instance.loginUser();
        
    }
    
}
