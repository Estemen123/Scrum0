package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

    public Connection getConnection() {
        return connection;
    }

    public void insertRecipe(Recipe r) {
        try {
            String sql = "INSERT INTO recipes(name_recipe, ingredients, score) VALUES (?,?,?)";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, r.getNameRecipe());
            st.setString(2, r.getIngredients());
            st.setInt(3, r.getScore());
            st.execute();
            JOptionPane.showMessageDialog(null, "Receta guardada exitosamente.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La receta ya existe en la BD.");
        }
    }
}
