/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RecetasDB;

/**
 *
 * @author ackdot
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * DatabaseConexion
 */
public class DatabaseConnection {

    private Connection connection;

    public DatabaseConnection() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://us-east.connect.psdb.cloud/recipes?sslMode=VERIFY_IDENTITY",
                    "s674h3cmydc5zb924t4a",
                    "pscale_pw_QRqZc5Y2Yfaj8606oXXw6gulUjpvQk1nryWxOlwQXo");
            System.out.print("conected");
        } catch (SQLException e) {
            System.out.print("error");
        }
    }

    public Connection getConnection(){
        return connection;
    }
}
