package org.example;

import org.example.controller.CoderController;
import org.example.persistence.ConnectionDB;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConnectionDB.openConnection();
        CoderController coderController = new CoderController();
        //coderController.create();
        //coderController.delete();
        //coderController.readyByCohorte();
        //coderController.update();
        String optionUser=null;
        while (true) {
            optionUser=JOptionPane.showInputDialog("Bienvenido al administrador de Coders\n" +
                    "1.Crear coder\n" +
                    "2.Actualizar Coder\n" +
                    "3.Borrar coder\n" +
                    "4.Mostrar coder por clan\n" +
                    "5.Mostrar coder por cohorte\n" +
                    "6.Salir\n" +
                    "Ingrese una opcion valida");
            if (optionUser == null || optionUser.trim().isEmpty())
                JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");

            switch (optionUser) {
                case "1":
                    coderController.create();
                    break;
                case "2":
                    coderController.update();
                    break;
                case "3":
                    coderController.delete();
                    break;
                case "4":
                    coderController.readyByClan();
                    break;
                case "5":
                    coderController.readyByCohorte();
                    break;
                case "6":
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion del menu");
            }
        }
    }
}