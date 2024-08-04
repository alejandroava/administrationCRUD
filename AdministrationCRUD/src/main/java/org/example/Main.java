package org.example;

import org.example.controller.CoderController;
import org.example.persistence.ConnectionDB;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConnectionDB.openConnection();
        CoderController coderController = new CoderController();
        //coderController.create();
        //coderController.delete();
        coderController.readyByCohorte();

    }
}