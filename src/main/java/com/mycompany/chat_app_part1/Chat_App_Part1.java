/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chat_app_part1;

import java.util.Scanner;

/**
 *
 * @author Ondwela Mathobo
 */
class chat{
    // global variables that can be accessed throughout the program 
  String storedusername;
    String storedpassword;
    String storedcellphone;
    
    Scanner inputuser=new Scanner(System.in);
    
   // a return method to check username 
   boolean checkUserName(String username){
       
       if ( username.length() <=5 && username.contains ("_")){
           System.out.println("Username successfully captured.");
           return true;
       }else {
           System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
           return false;
       }
       
        
    }
   // a return method to check password requirements
   boolean checkPasswordComplexity( String password){
       
       // check each character in the password
    

    boolean hasUppercase = false;
    boolean hasNumber = false;
    boolean hasSpecialChar = false;

    for (char ch : password.toCharArray()) {
        if (Character.isUpperCase(ch)) {
            hasUppercase = true;
        } 
        if (Character.isDigit(ch)) {
            hasNumber = true;
        } 
          if (!Character.isLetterOrDigit(ch)) {
            hasSpecialChar = true;
        }
    }

    

      
       if (password.length()>=8&& hasUppercase&&hasNumber&&hasSpecialChar){
           System.out.println("Password successfully captured.");
           return true;
       }else{
           System.out.println(" Password is not correctly formatted ; please ensure that password contains at least eight characters, a capital letter,a number,and a special character.");
           return false;
       }
   }
   //method checking the validation of cellphone
    boolean checkCellPhoneNumber(String cellphone){
        if (cellphone.startsWith("+27") && cellphone.length()==10){
            String numberPart=cellphone.substring(1);
            
        if (numberPart.matches("\\d{ 1,10}")){
            System.out.println(" Cell phone number successfully added.");
            return true;
            
        }
        }
        System.out.println(" Cell phone number incorrectly formatted or does not contain international code."); 
        return false;
    }  
             
           
           
    // creating a void method called registerUser since we wont be returning a value
    void registerUser() {
        System.out.println("\n =========REGISTER========="); 
        System.out.println("Enter Username");
        //nextline is used for string
       String username= inputuser.nextLine();
        System.out.println("Enter password");
        String password= inputuser.nextLine();
        
        //if all conditions are true
        if (checkUserName(username)&& checkPasswordComplexity(password)){
            storedusername=username;
            storedpassword=password;
            System.out.println("Registered successfully");
        }else{ 
            System.out.println("Registration failed ,try again");
        }
        
        
    } 
  // creating a void method called loginUser since we wont be returning a value  
  void  loginUser(){
      if (storedusername==null){
          System.out.println("No user registered yet");
          return ;
          
      }
      int attempts=3;
      boolean success= false;
      //while loop-reapeats as long as condition is true
      //!success -not allow the user
      //! is NOT operator (reverses true/false)
      System.out.println("\n=======LOGIN=======");   
      
      while (attempts>0 && !success){
  
       System.out.println("Enter Username");
        String username= inputuser.nextLine();
        System.out.println("Enter password");
        String password= inputuser.nextLine(); 
        //equals () compares string values
        
        if (username.equals(storedusername) && password.equals(storedpassword)){
            System.out.println("Welcome ,it is great to see you again.");
            success=true;
        }else{
            
            attempts--;//decrease attempts
            if (attempts >0){
                System.out.println("Username or password incorrect ,please try again. Attempts left:" + attempts);
                
            }
        }
        }
        if (!success){
            System.out.println(" Too many failed attempts. Account is locked");
        }
    }
  
   
}
public class Chat_App_Part1 {
   
    
    
    

    public static void main(String[] args) {
        Scanner enterMenu=new Scanner(System.in);
        //linking classes
        chat chatApp= new  chat();
        //allows the user's choice
        int choice;
        //do-while loop- runs the code before checking the condition
        // creating menu
        System.out.println("\n=====MENU====");
    System.out.println("1.Register");
        System.out.println("2.Login");
        System.out.println("3.Exit");
        
        System.out.println("Enter Menu option");
        choice=enterMenu.nextInt();
        switch (choice){
            case 1:
                chatApp.registerUser();
                break;
            case 2:
                chatApp.loginUser();
                break;
            case 3:
                System.out.println("Goodbye");
                break;
                default:
                    System.out.println("Invalid choice");
        }
//    }while (choice!=3);{ 
    //loop continue while choice is not equals to 3
    
    enterMenu.close();
    }
}

