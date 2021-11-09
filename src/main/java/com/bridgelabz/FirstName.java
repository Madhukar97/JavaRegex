package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstName {
    /**
     * This method takes First Name which starts with Capital letter and has minimum of 3 characters
     *
     * @param Firstname is used for comparing with regex
     */
    public boolean isFirstName(String Firstname) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher(Firstname);
        if (matcher.matches()) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        FirstName obj = new FirstName();
        obj.isFirstName("MadHuKar");
        obj.isFirstName("madhukar");
    }
}