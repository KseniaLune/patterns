package com.example.patterns.structural.command;

public class Database {
    public void insert() {
        System.out.println("Inserting data...");
    }
    public void update() {
        System.out.println("Updating data...");
    }
    public void select() {
        System.out.println("Reading data...");
    }
    public void delete() {
        System.out.println("Deleting data...");
    }

}
