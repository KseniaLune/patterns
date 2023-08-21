package com.example.patterns.structural.command;

import javax.xml.crypto.Data;

public class InsertCommand implements Command{
    Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
