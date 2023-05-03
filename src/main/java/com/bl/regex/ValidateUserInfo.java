package com.bl.regex;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;
public class ValidateUserInfo {
    Scanner sc = new Scanner(System.in);

   //First name starts with Cap and has minimum 3 characters
    public void checkFirstName(){
        System.out.print("Enter The First Name: ");
        String firstName = sc.nextLine();



        if(Pattern.matches("^[A-Z]{1}+[a-z]{3,}", firstName)){
            System.out.println("First Name is Valid");
        }else {
            System.out.println("Invalid Input");
        }
    }
   // Last name starts with Cap and has minimum 3 characters
    public void checkLastName(){
        System.out.print("Enter Valid Last Name: ");
        String lastName = sc.nextLine();

        if (Pattern.matches("[A-Z]{1}+[a-z]{3,}", lastName)){
            System.out.println("Last Name Is Valid");
        }else {
            System.out.println("Invalid LastName!!");
        }
    }
    // Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
    public void checkValidEmail(){
        System.out.print("Enter Valid Mail: ");
        String email = sc.nextLine();

        if (Pattern.matches("^[a-z]+([.][a-z]+)*@[a-z]+.[a-z]{2,3}([.][a-z]{2,3})*$", email)){
            System.out.println("EMail Is Valid!!");
        }else{
            System.out.println("Wrong Email!!");
        }
    }
    // Country code follow by space and 10 digit number
    public void checkMobileNum(){
        System.out.print("Enter Valid Mobile Number: ");
        String mobNum = sc.nextLine();

        if (Pattern.matches("^[0-9]{2,3} +[0-9]{10}", mobNum)){
            System.out.println("Mobile Number is Valid");
        }else {
            System.out.println("Invalid Number!!");
        }
    }
    //rules-- minimum 8,Should have at least 1 Upper Case,Should have at least 1 numeric number in the password,– Has exactly 1 Special Character
    public void checkPasswd(){
        System.out.print("Enter Valid Password: ");
        String passwd = sc.nextLine();

        if (Pattern.matches("\"^(?=.*[A-Z])(?=.*[a-z][0-9])(?=.*[@#$%^&+=!]).{8,}$\", passwd", passwd)){
            System.out.println("Password is Correct!");
        }else {
            System.out.println("Wrong Password!");
        }
        checkPasswd();
    }
    public void checkSampleEmail() {
        System.out.println("Checking Sample Emails ");

        ArrayList<String> email = new ArrayList<>();
        // valid EmailIDs
        email.add("abc@yahoo.com");
        email.add("abc-100@yahoo.com");
        email.add("abc.100@yahoo.com");
        email.add("abc111@abc.com");
        email.add("abc-100@abc.net");
        email.add("abc.100@abc.com.au");
        email.add("abc@1.com");
        email.add("abc@gmail.com.com");
        email.add("abc+100@gmail.com");
        // Wrongs EmailIDs
        email.add("abc");
        email.add("abc..");
        email.add("abc..@gmail.com");
        email.add("abc@abc@gmail.com");
        email.add("abc@.com.my");
        email.add("abc123@gmail.a");
        email.add("abc123@.com");
        email.add("abc123@.com.com");
        email.add(".abc@abc.com");
        email.add("abc()*@gmail.com");
        email.add("abc..2002@gmail.com");
        email.add("abc.@gmail.com");
        email.add("abc@abc@gmail.com");
        email.add("abc@gmail.com.1a");
        email.add("abc..@gmail.com");
        email.add("abc@gmail.com.aa.au");

        String reGex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:([0-9]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}";

        Pattern pattern = Pattern.compile(reGex);

        for (String str : email) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                System.out.println("valid email: " + str + " :" + matcher.matches());
            } else {
                System.out.println("Invalid email: " + str + " :" + matcher.matches());
            }
        }
    }
    }

