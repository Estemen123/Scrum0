/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recipesViews;

import DataBase.DatabaseConnection;
import DataBase.Recipe;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Controller {

    private DatabaseConnection connector;
    private Window interfaz;

    public Controller() {
        interfaz = new Window();
        connector = new DatabaseConnection();
        addListeners();
    }

    private void addListeners() {
        interfaz.getBotonGuardar().addActionListener((ActionEvent e) -> {
            gestorReceta();
        });
        interfaz.getBotonSalir().addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
    }

    private void gestorReceta() {

        String receta = interfaz.getCajaNomPlato().getText().trim().toLowerCase();
        String ingredientes = interfaz.getCajaIngredientes().getText().trim().toLowerCase();
        int puntuacion = Integer.parseInt(interfaz.getCajaValor().getText().trim());
        connector.insertRecipe(new Recipe(receta, ingredientes, puntuacion));

    }

}
