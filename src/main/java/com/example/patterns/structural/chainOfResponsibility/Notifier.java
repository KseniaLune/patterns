package com.example.patterns.structural.chainOfResponsibility;

public abstract class Notifier {
    private int priority;
    private Notifier next;

    public Notifier(Priority priority) {
        this.priority = priority.ordinal();
    }

    public void setNext(Notifier next) {
        this.next = next;
    }

    public void notifyManager(String message, Priority level) {
        if (level.ordinal() >= priority) {
            write(message);
        }
        if (next != null) {
            next.notifyManager(message, level);
        }
    }

    public abstract void write(String message);
}
