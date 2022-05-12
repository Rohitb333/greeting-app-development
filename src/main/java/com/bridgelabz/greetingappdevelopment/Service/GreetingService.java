package com.bridgelabz.greetingappdevelopment.Service;

import org.springframework.stereotype.Service;


@Service
public class GreetingService {
    public String getMessage() {
        return "Hello World";
    }

    public String getGreetingMessage(String firstName, String lastName) {
        return "Hello " + firstName + "" + lastName;
    }

    public String postMessage(String firstName, String lastName) {
        return "Hello " + firstName + "" + lastName;
    }
}