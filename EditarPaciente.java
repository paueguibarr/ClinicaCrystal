/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Jframes;

import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import clases.Conectar;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paueguibar
 */
public class EditarPaciente extends javax.swing.JFrame {
    Conectar conn;
    PagPrincipalRecep principal = new PagPrincipalRecep();
    PreparedStatement pst;
    ResultSet rs;
    /**
     * Creates new form EditarPaciente
     */
    public EditarPaciente() {
        initComponents();
        conn = new Conectar();
        loadPaciente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSexo = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtMotivo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtHabitacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAceptarNP = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnCancelarNP = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtExpediente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        boxNombre = new javax.swing.JComboBox<>();
        btnOk = new javax.swing.JButton();
        txtDoc = new javax.swing.JTextField();
        btnBack = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre del Paciente");

        jLabel2.setText("Fecha de Ingreso");

        btnAceptarNP.setText("Aceptar");
        btnAceptarNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarNPActionPerformed(evt);
            }
        });

        jLabel3.setText("Sexo");

        btnCancelarNP.setText("Cancelar");
        btnCancelarNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarNPActionPerformed(evt);
            }
        });

        jLabel4.setText("Edad");

        jLabel8.setFont(new java.awt.Font("Songti TC", 0, 36)); // NOI18N
        jLabel8.setText("Editar Paciente");

        jLabel5.setText("Motivo de Ingreso");

        jLabel6.setText("Habitacion");

        jLabel7.setText("Medico");

        jLabel9.setText("Expediente ");

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel9))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSexo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMotivo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHabitacion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtExpediente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnAceptarNP)
                                .addGap(52, 52, 52)
                                .addComponent(btnCancelarNP)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(boxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDoc))
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnBack)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(boxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarNP)
                    .addComponent(btnCancelarNP))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarNPActionPerformed
        try {
            //read input to updtate
            String nombre = boxNombre.getSelectedItem().toString();
            String exp = txtExpediente.getText();
            String ingreso = txtFecha.getText();
            String sex = txtSexo.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            String diag = txtMotivo.getText();  
            String hab = txtHabitacion.getText();
            String doc = txtDoc.getText();
           
            //make the updates 
            pst = conn.getConnection().prepareStatement("update Paciente set expediente = ?, ingreso = ?, sexo = ?, edad = ?, diagnosticoIngreso = ?, habitacion = ?, medico = ? where nombre = ?");
            pst.setString(1,exp);
            pst.setString(2,ingreso);
            pst.setString(3,sex);
            pst.setInt(4, edad);
            pst.setString(5,diag);
            pst.setString(6,hab);
            pst.setString(7,doc);
            pst.setString(8,nombre);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Paciente Actualizado");
            
            //reset and exit
            boxNombre.setSelectedIndex(-1);
            txtExpediente.setText("");
            txtFecha.setText("");
            txtSexo.setText("");
            txtEdad.setText("");
            txtMotivo.setText("");
            txtHabitacion.setText("");
            txtDoc.setText("");
            
        } catch(SQLException e) {
            Logger.getLogger(EditarCuenta.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this,"Paciente NO Actualizado, intente de nuevo");
        }

    }//GEN-LAST:event_btnAceptarNPActionPerformed

    private void btnCancelarNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarNPActionPerformed
        // TODO add your handling code here:
        this.dispose();
        principal.setVisible(true);
    }//GEN-LAST:event_btnCancelarNPActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        try {
            //read patient
            String paciente = boxNombre.getSelectedItem().toString();
            
            //get all the data from that patient
            pst = conn.getConnection().prepareStatement("SELECT `expediente`,`ingreso`,`sexo`,`edad`, `diagnosticoIngreso`,`habitacion`, `medico` FROM `Paciente` WHERE `nombre` = ?");
            pst.setString(1, paciente);
            rs = pst.executeQuery();
            
            //display data to be editted
            while (rs.next()) {
               txtExpediente.setText(rs.getString("expediente"));
               txtFecha.setText(rs.getString("ingreso"));
               txtSexo.setText(rs.getString("sexo"));
               txtEdad.setText(rs.getString("edad"));
               txtMotivo.setText(rs.getString("diagnosticoIngreso"));
               txtHabitacion.setText(rs.getString("habitacion"));
               txtDoc.setText(rs.getString("medico"));
                                             
            }
        } catch (SQLException ex) {
            Logger.getLogger(EditarPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        principal.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed
    
    //load pacientes actuales
    public void loadPaciente() {
        try {
            pst = conn.getConnection().prepareStatement("SELECT `nombre` FROM `Paciente` WHERE `egreso` IS NULL");
            rs = pst.executeQuery();
            boxNombre.removeAll(); 
            
            while(rs.next()) {
                boxNombre.addItem(rs.getString(1));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EditarCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
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
            java.util.logging.Logger.getLogger(EditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxNombre;
    private javax.swing.JButton btnAceptarNP;
    private javax.swing.JToggleButton btnBack;
    private javax.swing.JButton btnCancelarNP;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDoc;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtExpediente;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHabitacion;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
