package recipesViews.jorgeS;

import DataBase.DatabaseConnection;
import DataBase.Recipe;
import java.awt.event.ActionEvent;

public class Receta {
     
    //GUI
    private static RecetaGUI interfaz;
   //DB
    private DatabaseConnection db;
    
    public Receta(){
        interfaz = new RecetaGUI();
        addListeners();
        db = new DatabaseConnection();
    }
    
    private void addListeners(){
        interfaz.guardarButton.addActionListener((ActionEvent e) -> {
            gestorReceta();
        });
    }
    
    private void gestorReceta(){
        String receta = interfaz.recetaField.getText();
        String ingredientes = interfaz.ingredientesArea.getText();
        int puntuacion = Integer.parseInt(interfaz.difField.getText());
        db.insertRecipe(new Recipe(receta, ingredientes, puntuacion));
    }
}
