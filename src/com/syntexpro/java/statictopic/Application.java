package com.syntexpro.java.statictopic;

import static com.syntexpro.java.statictopic.StudentRegistration.*;


public class Application {

    public static void main(String[] args) {
        StudentRegistration studentRegistration = new StudentRegistration();
        firstName  = "jamshed";
        studentRegistration.lastName = "hossain";
        studentRegistration.emailAddress = "abcd";

        System.out.println(INSTITUTION_NAME);
        System.out.println(firstName);
        System.out.println(studentRegistration.lastName);
        System.out.println(studentRegistration.emailAddress);
        drink();

    }


}
