package com.example.classdemo;

public class BackendService {
    // A simple method to authenticate the user based on hardcoded credentials
    public static boolean authenticateUser(String username, String password) {
        // In a real-world scenario, you should validate the user credentials against a database or secure source
        String validUsername = "user123";
        String validPassword = "password123";

        return validUsername.equals(username) && validPassword.equals(password);
    }
}
