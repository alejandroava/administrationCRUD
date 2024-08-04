package org.example.model;

import org.example.entities.Coder;
import org.example.persistence.ConnectionDB;
import org.example.persistence.imodel.IModelCoder;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
            String sql = "DELETE FROM Coder WHERE cc = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);

            int rowsAffected = preparedStatement.executeUpdate();
            if(rowsAffected == 1){
                JOptionPane.showMessageDialog(null,"Registro eliminado");
            }
        }catch (SQLException error){
            throw new RuntimeException();
        }

    }

    @Override
    public List<Coder> readByCohorte(int cohorte) {
        Connection connection = ConnectionDB.openConnection();
        List<Coder> coders = new ArrayList<>();
        try{
            String sqlquery = "SELECT * FROM Coder WHERE cohorte = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlquery);
            preparedStatement.setInt(1,cohorte);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Coder coder = new Coder(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("lastname"),
                        resultSet.getInt("cc"),
                        resultSet.getString("technology"),
                        resultSet.getString("clan"),
                        resultSet.getInt("cohorte"));
                coders.add(coder);
            }
            preparedStatement.close();
            connection.close();
        }catch (SQLException error){
            throw new RuntimeException();
        }
        return coders;
    }

    @Override
    public Coder updateModel(Coder request, int id) {
        Connection connection = ConnectionDB.openConnection();
        Coder coder;
        try {
            String sqlQuery = "UPDATE Coder SET name=?,lastname=?,cc=?,technology=?,clan=?,cohorte=? WHERE cc=?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1,request.getName());
            preparedStatement.setString(2,request.getLastname());
            preparedStatement.setInt(3,request.getCc());
            preparedStatement.setString(4,request.getTechnology());
            preparedStatement.setString(5,request.getClan());
            preparedStatement.setInt(6,request.getCohorte());
            preparedStatement.setInt(7,id);

            int rowAffected = preparedStatement.executeUpdate();
            if(rowAffected == 1){
                return request;
            }
            preparedStatement.close();
            connection.close();

        } catch (SQLException error){
            throw new RuntimeException(error.getMessage());
        }
        return null;
    }

    @Override
    public List<Coder> readByClan(String clan) {
            Connection connection = ConnectionDB.openConnection();
            List<Coder> codersByClan=new ArrayList<>();
            try{
                String sqlQuery = "SELECT * FROM Coder WHERE clan=?;";
                PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
                preparedStatement.setString(1,clan);
                ResultSet result = preparedStatement.executeQuery();
                while(result.next()){
                    Coder coder = new Coder(result.getString("name"),
                            result.getString("lastname"),
                            result.getInt("cc"),
                            result.getString("technology"),
                            result.getString("clan"),
                            result.getInt("cohorte"));
                    codersByClan.add(coder);
                    //JOptionPane.showMessageDialog(null,coder);
                }
                preparedStatement.close();
                connection.close();
            }catch (SQLException error){
                throw new RuntimeException();
            }
        return codersByClan;
    }
}
