






//import recepiesView.ventJLZE;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import recipesViews.Denis.Controller;
import recipesViews.jorgeS.Receta;
import recipesViews.josue.ventanaJosue;
import recipesViews.roberto.RecetasGUI;
import recipesViews.IvanPalacios.RecipeGUI;
import recipesViews.ledezma.winJLZ;


public class Main {

    public static void main(String[] args) {

        new Controller();

        // TODO code application logic here
        
        //new winJLZ().setVisible(true);
        //new RecipeGUI().setVisible(true);
        //new Receta();


        new winJLZ().setVisible(true);
        new RecipeGUI().setVisible(true);
        new Receta();
        new ventanaJosue().setVisible(true);

         new RecetasGUI().setVisible(true);


    }
   
}
