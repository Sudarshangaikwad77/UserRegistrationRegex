package com.bl.regex;

public class UserRegistration
{
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Programme");

        ValidateUserInfo user = new ValidateUserInfo();

        user.checkFirstName();
        user.checkLastName();
        user.checkValidEmail();
        user.checkMobileNum();
        user.checkPasswd();
        user.checkSampleEmail();


    }
}
