package com.example.patterns.structural.chainOfResponsibility;

public class EmailReportNotifier extends Notifier{
    public EmailReportNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: " + message);
    }
}
