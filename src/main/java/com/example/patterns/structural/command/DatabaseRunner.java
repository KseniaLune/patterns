package com.example.patterns.structural.command;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database db = new Database();
        Developer dev = new Developer(
            new InsertCommand(db),
            new UpdateCommand(db),
            new SelectCommand(db),
            new DeleteCommand(db)
        );

        dev.insertData();
        dev.updateData();
        dev.selectData();
        dev.deleteData();
    }
}
