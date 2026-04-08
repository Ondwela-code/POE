/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestClasses;

import com.mycompany.chat_app_part1.Chat_App_Part1;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ondwela Mathobo
 */
public class JUnitTest_Part1 {
    @Test 
    public void TestUserName(){
         Chat_App_Part1 s =new Chat_App_Part1();
        String expected = "kyl_1";
        String Actual =s.checkUserName();
        assertEquals(expected,Actual,"Expect the same to match of kyl_1");
        
    }
}