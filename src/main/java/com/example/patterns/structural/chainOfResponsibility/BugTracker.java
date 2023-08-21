package com.example.patterns.structural.chainOfResponsibility;

public class BugTracker {
    public static void main(String[] args) {
        Notifier simpleReportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailReportNotifier = new EmailReportNotifier(Priority.IMPORTANT);
        Notifier phoneNotifier = new PhoneNotifier(Priority.ASAP);

        simpleReportNotifier.setNext(emailReportNotifier);
        emailReportNotifier.setNext(phoneNotifier);

        simpleReportNotifier.notifyManager("simple", Priority.ROUTINE);
        System.out.println("-------------------");
        simpleReportNotifier.notifyManager("important", Priority.IMPORTANT);
        System.out.println("-------------------");
        simpleReportNotifier.notifyManager("asap", Priority.ASAP);



    }
}
