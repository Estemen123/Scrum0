/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package recipesViews.ledezma;
import java.sql.*;
import javax.swing.JOptionPane;
import DataBase.DatabaseConnection;
import DataBase.Recipe;
/**
 *
 * @author Usuario
 */
public class winJLZ extends javax.swing.JFrame {

    /**
     * Creates new form rogistro
     */
    public winJLZ() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPlato = new javax.swing.JLabel();
        txtPlato = new javax.swing.JTextField();
        txtIngredientes = new javax.swing.JTextField();
        lblIngredientes = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        lblAviso = new javax.swing.JLabel();
        lblPuntos = new javax.swing.JLabel();
        txtPuntos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPlato.setText("Plato");

        lblIngredientes.setText("Ingredientes");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblAviso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lblPuntos.setText("Puntos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAviso)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnRegistrar)
                        .addComponent(lblIngredientes)
                        .addComponent(txtIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPlato))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPuntos)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(txtPuntos)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlato)
                    .addComponent(lblPuntos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIngredientes)
                .addGap(3, 3, 3)
                .addComponent(txtIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnRegistrar)
                .addGap(28, 28, 28)
                .addComponent(lblAviso)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        /*try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/comida","root","osito2021");
            PreparedStatement pst = cn.prepareStatement("INSERT INTO listaor VALUES(?,?,?,?)");
            pst.setString(1,"0" );
            pst.setString(2,txtPlato.getText().trim());
            pst.setString(3,txtIngredientes.getText().trim());
            pst.setInt(4, Integer.parseInt(txtPuntos.getText())); 
            pst.executeUpdate();
            
            //limpiar campos
            txtPlato.setText("");
            txtIngredientes.setText("");
            txtPuntos.setText("");
            lblAviso.setText("Registro exitoso. ¡¡");*/
            
            String nameRecipeString = txtPlato.getText().trim();
            String ingredientsString = txtIngredientes.getText();
            int scoreInt = Integer.parseInt(txtPuntos.getText());
        
            Recipe recipe = new Recipe(nameRecipeString, ingredientsString, scoreInt);
            DatabaseConnection db = new DatabaseConnection();
            db.insertRecipe(recipe);
            
        /*}catch(Exception e){
            txtPlato.setText("");
            txtIngredientes.setText("");
            txtPuntos.setText("");
            lblAviso.setText("Registro Duplicado.No se ha guardado ¡");
        }*/
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(winJLZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(winJLZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(winJLZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(winJLZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new winJLZ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblIngredientes;
    private javax.swing.JLabel lblPlato;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JTextField txtIngredientes;
    private javax.swing.JTextField txtPlato;
    private javax.swing.JTextField txtPuntos;
    // End of variables declaration//GEN-END:variables
}
