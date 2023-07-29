package Jframes;


import Filtros.FiltroDiag;
import Filtros.FiltroEdad;
import Filtros.FiltroSexo;
import Filtros.FiltroFecha;
import Filtros.FiltroMedico;
import clases.Conectar;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author paueguibar
 */
public class Historial extends javax.swing.JFrame {
    Conectar conn;
    PreparedStatement pst;
    ResultSet rs;

    /**
     * Creates new form Historial
     */
    public Historial() {
        initComponents();
        conn = new Conectar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHistorial = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        combBoxMostrar = new javax.swing.JComboBox<>();
        btnAceptarH = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setFont(new java.awt.Font("Songti TC", 0, 36)); // NOI18N
        jLabel8.setText("Historial de Pacientes");

        tableHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Ingreso", "Egreso", "Expediente", "Habitacion", "Medico", "Nombre", "Sexo", "Edad", "Diagnostico Ingreso", "Diagnostico Egreso", "Cuenta Real", "Paquete", "Diferencia", "Facturas", "Recibo"
            }
        ));
        jScrollPane1.setViewportView(tableHistorial);

        jLabel1.setText("Mostrar: ");

        combBoxMostrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todo", "Fecha", "Médico", "Sexo", "Edad", "Diagnostico/procedimiento", " " }));
        combBoxMostrar.setSelectedIndex(-1);

        btnAceptarH.setText("Aceptar");
        btnAceptarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarHActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 1088, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(combBoxMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAceptarH)
                        .addGap(385, 385, 385))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(297, 297, 297)
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(combBoxMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptarH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarHActionPerformed
        // TODO add your handling code here:
        
        //read input
        String mostrar = combBoxMostrar.getSelectedItem().toString();
        switch(mostrar) {
            case "Todo":             
                try {
                    //show all pacientes
                    pst = conn.getConnection().prepareStatement("select * from Paciente");
                    rs = pst.executeQuery();
                    createTable(rs);

                } catch (SQLException ex) {
                    Logger.getLogger(Historial.class.getName()).log(Level.SEVERE, null, ex);
                }              
                break;
            case "Fecha":
                //new window
                FiltroFecha ff = new FiltroFecha();
                ff.setVisible(true);
                this.dispose();
                break;
            case "Sexo":
                //new window
                FiltroSexo fs = new FiltroSexo();
                fs.setVisible(true);
                this.dispose();
                break;
            case "Médico":
                //new window
                FiltroMedico fm = new FiltroMedico();
                fm.setVisible(true);
                this.dispose();
                break;
            case "Edad":
                //new window
                FiltroEdad fe = new FiltroEdad();
                fe.setVisible(true);
                this.dispose();
                break;
            case "Diagnostico/procedimiento":
                //new window
                FiltroDiag fd = new FiltroDiag();
                fd.setVisible(true);
                this.dispose();
                break;    
   
        }
    }//GEN-LAST:event_btnAceptarHActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        PagPrincipalRecep ppr = new PagPrincipalRecep();
        ppr.setVisible(true);
        

                
    }//GEN-LAST:event_btnBackActionPerformed
    
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
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historial().setVisible(true);
            }
        });
    }
    
    //display in table
    public void createTable(ResultSet rs) {
        //System.out.println("filtro called method");
        try {
            ResultSetMetaData Rsm = rs.getMetaData();
            int c;
            c = Rsm.getColumnCount();            
            DefaultTableModel df = (DefaultTableModel)tableHistorial.getModel();
            df.setRowCount(0);                    
            while (rs.next()) {
                Vector v2 = new Vector();
                for(int i = 1; i <= c; i++) {
                    v2.add(rs.getString("ingreso"));
                    v2.add(rs.getString("egreso"));
                    v2.add(rs.getString("expediente"));
                    v2.add(rs.getString("habitacion"));
                    v2.add(rs.getString("medico"));
                    v2.add(rs.getString("nombre"));
                    v2.add(rs.getString("sexo"));
                    v2.add(rs.getString("edad"));
                    v2.add(rs.getString("diagnosticoIngreso"));
                    v2.add(rs.getString("diagnosticoEgreso"));
                    v2.add(rs.getString("cuenta real"));
                    v2.add(rs.getString("paquete"));
                    v2.add(rs.getString("diferencia"));
                    v2.add(rs.getString("facturas"));
                    v2.add(rs.getString("recibo"));
                }
                        
                df.addRow(v2);
                                                         
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Historial.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarH;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> combBoxMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableHistorial;
    // End of variables declaration//GEN-END:variables
}
