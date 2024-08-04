package org.example.controller;

import org.example.entities.Coder;
import org.example.model.CoderModel;

import javax.swing.*;
import java.util.List;

public class CoderController {
    CoderModel coderModel;
    public CoderController(){
        this.coderModel=new CoderModel();
    }
    public void create(){
        String name = JOptionPane.showInputDialog("Ingrese el nombre del Coder");
        String lastName= JOptionPane.showInputDialog("Ingrese el apellido del Coder");
        int cc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del Coder"));
        String technology = JOptionPane.showInputDialog("Ingrese la tecnologia que estudio el Coder");
        String clan = JOptionPane.showInputDialog("Ingrese el clan del Coder");
        int cohorte = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que cohorte es el Coder"));

        Coder coder = new Coder(name,lastName,cc,technology,clan,cohorte);
        Coder result = this.coderModel.create(coder);
        JOptionPane.showMessageDialog(null,result.toString());
    }

    public void delete(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula  del Coder "));
        this.coderModel.delete(id);

    }
    public List<Coder> readyByCohorte(){
        int cohorte = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cohorte"));
        List<Coder> coders= this.coderModel.readByCohorte(cohorte);
        for(Coder coder:coders){
            JOptionPane.showMessageDialog(null,coder.toString());
        }
        return coders;
    }
}
