package com.bl.regex;
import java.util.Scanner;
import java.util.regex.*;
public class ValidateUserInfo
{
    Scanner sc = new Scanner(System.in);

    public void checkFirstName(){
        System.out.println("Enter The First Name: ");
        String firstName = sc.nextLine();



        if(Pattern.matches("^[A-Z] {1} [a-z] {3,}", firstName)){
            System.out.println("First Name is Valid");
        }else {
            System.out.println("Invalid Input");
        }
    }

    public void checkLastName(){
        System.out.print("Enter Valid Last Name: ");
        String lastName = sc.nextLine();

        if (Pattern.matches("[A-Z]{1}+[a-z]{3,}", lastName)){
            System.out.println("Last Name Is Valid");
        }else {
            System.out.println("Invalid LastName!!");
        }
    }

}
