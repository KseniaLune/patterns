package com.example.patterns.structural.chainOfResponsibility;

public class PhoneNotifier extends Notifier{
    public PhoneNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending message on phone: " + message);
    }
}
