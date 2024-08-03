package org.example.model;

import org.example.entities.Coder;
import org.example.persistence.ConnectionDB;
import org.example.persistence.imodel.IModelCoder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CoderModel implements IModelCoder {
    @Override
    public Coder create(Coder request) {
        Coder coder;
        Connection connection = ConnectionDB.openConnection();

        try{
            String sql = "INSERT INTO Coder (name,lastname,cc,technology,clan,cohorte) VALUES (?,?,?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, request.getName());
            preparedStatement.setString(2,request.getLastname());
            preparedStatement.setInt(3,request.getCc());
            preparedStatement.setString(4,request.getTechnology());
            preparedStatement.setString(5,request.getClan());
            preparedStatement.setInt(6,request.getCohorte());

            int rowsAffected= preparedStatement.executeUpdate();
            if(rowsAffected == 1){
                return request;
            }
            preparedStatement.close();
            connection.close();

        }catch (SQLException error){
            throw new RuntimeException(error.getMessage());
        }
        return null;
    }

    @Override
    public void delete(int id) {
        Connection connection = ConnectionDB.openConnection();
        try{
            String sql = "DELETE FROM Coder WHERE id = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);

            int rowsAffected = preparedStatement.executeUpdate();
            if(rowsAffected == 1){
                System.out.println("Registro eliminado");
            }
        }catch (SQLException error){
            throw new RuntimeException();
        }

    }

    @Override
    public List<String> readByClan(String clan) {
        return List.of();
    }

    @Override
    public List<String> readByCohorte(int cohorte) {
        return List.of();
    }

    @Override
    public Coder updateModel(Coder request, int id) {
        return null;
    }
}
