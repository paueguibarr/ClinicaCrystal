package Jframes;

import clases.Conectar;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author paueguibar
 */
public class CuentaHosp extends javax.swing.JFrame {
    Conectar conn;
    PreparedStatement pst;
    ResultSet rs;

    /**
     * Creates new form CuentaHosp
     */
    public CuentaHosp() {
        initComponents();
        conn = new Conectar();
        loadPaciente();
        loadMateriales();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        btnAceptarACH = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        combBoxServiciosACH = new javax.swing.JComboBox<>();
        btnCancelarACH = new javax.swing.JButton();
        combBoxMaterialACH = new javax.swing.JComboBox<>();
        combBoxSolucionesACH = new javax.swing.JComboBox<>();
        combBoxMedicamentoACH = new javax.swing.JComboBox<>();
        combBoxServAdACH = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        combBoxServAdExtACH = new javax.swing.JComboBox<>();
        spinMedicamentoACH = new javax.swing.JSpinner();
        spinServiciosACH = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        spinMaterialACH = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        spinSolucionesACH = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        spinServAdACH = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        spinServAdExACH = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        txtNombreACH = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtOtroMat = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtOtroPU = new javax.swing.JTextField();
        spinOtro = new javax.swing.JSpinner();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setText("Servicios Adicionales Externos:");

        btnAceptarACH.setText("Acepatar");
        btnAceptarACH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarACHActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Songti SC", 0, 36)); // NOI18N
        jLabel1.setText("Agregar a Cuenta Hospitalaria");

        btnCancelarACH.setText("Cancelar");
        btnCancelarACH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarACHActionPerformed(evt);
            }
        });

        jLabel2.setText("Meidcamentos:");

        jLabel3.setText("Material de Curación: ");

        jLabel4.setText("Soluciones:");

        jLabel5.setText("Servicios:");

        jLabel6.setText("Servicios adicionales: ");

        jLabel9.setText("Paciente:");

        jLabel8.setText("Otro: ");

        jLabel10.setText("Material");

        jLabel11.setText("precio Unitario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(txtNombreACH, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(combBoxMaterialACH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combBoxServiciosACH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combBoxMedicamentoACH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combBoxSolucionesACH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combBoxServAdACH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combBoxServAdExtACH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOtroMat, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtOtroPU)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinOtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinMedicamentoACH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinServiciosACH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinMaterialACH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinSolucionesACH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinServAdACH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinServAdExACH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(btnAceptarACH)
                .addGap(18, 18, 18)
                .addComponent(btnCancelarACH)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNombreACH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(combBoxServiciosACH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinServiciosACH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(combBoxMaterialACH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinMaterialACH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(combBoxMedicamentoACH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinMedicamentoACH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combBoxSolucionesACH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinSolucionesACH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(combBoxServAdACH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinServAdACH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(combBoxServAdExtACH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinServAdExACH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(txtOtroMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtOtroPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinOtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarACH)
                    .addComponent(btnCancelarACH))
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /*
    This method gets all the users inputs, if the quantity is more than 0, then itll add it to the DB, finally itll call the
    update methods to set prices combining tables with preciosHosb table in DB
     
    */
    private void btnAceptarACHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarACHActionPerformed
        // TODO add your handling code here:
        //read inputs
        String paciente = txtNombreACH.getSelectedItem().toString();
        String servicios = combBoxServiciosACH.getSelectedItem().toString();
        String material = combBoxMaterialACH.getSelectedItem().toString();
        String med = combBoxMedicamentoACH.getSelectedItem().toString();
        String sol = combBoxSolucionesACH.getSelectedItem().toString();
        String ad = combBoxServAdACH.getSelectedItem().toString();
        String adEx = combBoxServAdExtACH.getSelectedItem().toString();
        String otroMat = txtOtroMat.getText();
        double otroPU = 0;
        int servNo = ((Integer) spinServiciosACH.getValue());
        int matNo = ((Integer) spinMaterialACH.getValue());
        int medNo = ((Integer) spinMedicamentoACH.getValue());
        int solNo = ((Integer) spinSolucionesACH.getValue());
        int adNo = ((Integer) spinServAdACH.getValue());
        int adExNo = ((Integer) spinServAdExACH.getValue()); 
        int otro = ((Integer) spinOtro.getValue()); 
        
        //if otro is empty dont read ir or else itll produce error
        if(!"".equals(txtOtroPU.getText())) {
            otroPU = Double.parseDouble(txtOtroPU.getText());
        }
        
        //if the number is more than 0 add it to cuentas
        if(servNo != 0) {
            try {
            pst = conn.getConnection().prepareStatement("insert into cuentas(paciente,material,cantidad,tipo)values(?,?,?,?)");
            pst.setString(1, paciente);
            pst.setString(2, servicios);
            pst.setInt(3, servNo);
            pst.setString(4, "HOSP");
            pst.executeUpdate();
            
            } catch (SQLException ex) {
                Logger.getLogger(CuentaHosp.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(matNo != 0) {
            try {
                pst = conn.getConnection().prepareStatement("insert into cuentas(paciente,material,cantidad,tipo)values(?,?,?,?)");
                pst.setString(1, paciente);
                pst.setString(2, material);
                pst.setInt(3, matNo);
                pst.setString(4, "HOSP");
                pst.executeUpdate();
            
            } catch (SQLException ex) {
                Logger.getLogger(CuentaHosp.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(medNo != 0) {
            
            try {
               pst = conn.getConnection().prepareStatement("insert into cuentas(paciente,material,cantidad,tipo)values(?,?,?,?)");
               pst.setString(1, paciente);
               pst.setString(2, med);   
               pst.setInt(3, medNo);
               pst.setString(4, "HOSP");
               
               pst.executeUpdate();
            
            } catch (SQLException ex) {
                Logger.getLogger(CuentaHosp.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(solNo != 0) {
            try {
                pst = conn.getConnection().prepareStatement("insert into cuentas(paciente,material,cantidad,tipo)values(?,?,?,?)");
                pst.setString(1, paciente);
                pst.setString(2, sol);
                pst.setInt(3, solNo);
                pst.setString(4, "HOSP");
                pst.executeUpdate();
            
            } catch (SQLException ex) {
                Logger.getLogger(CuentaHosp.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if(adNo != 0) {
            try {
                pst = conn.getConnection().prepareStatement("insert into cuentas(paciente,material,cantidad,tipo)values(?,?,?,?)");
                pst.setString(1, paciente);
                pst.setString(2, ad);
                pst.setInt(3, adNo);
                pst.setString(4, "HOSP");
                pst.executeUpdate();
            
            } catch (SQLException ex) {
                Logger.getLogger(CuentaHosp.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(adExNo != 0) {
            try {
                pst = conn.getConnection().prepareStatement("insert into cuentas(paciente,material,cantidad,tipo)values(?,?,?,?)");
                pst.setString(1, paciente);
                pst.setString(2, adEx);
                pst.setInt(3, adExNo);
                pst.setString(4, "HOSP");
                pst.executeUpdate();
            
            } catch (SQLException ex) {
                Logger.getLogger(CuentaHosp.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }  
        
        //if a new material is added to cuenta, first, itll add the material to preciosHosp/AMB, 
        //then it will add it to the patients bill and procede as usual
        
        if(otro != 0) {
            try {
                pst = conn.getConnection().prepareStatement("insert into preciosHosp(material,precio,categoria)values(?,?,?)");
                pst.setString(1, otroMat);
                pst.setDouble(2, otroPU);
                pst.setString(3, "OTROS");
                pst.executeUpdate();
                
                pst = conn.getConnection().prepareStatement("insert into cuentas(paciente,material,cantidad,tipo)values(?,?,?,?)");
                pst.setString(1, paciente);
                pst.setString(2, otroMat);
                pst.setInt(3, otro);
                pst.setString(4, "HOSP");
                pst.executeUpdate();
            
            } catch (SQLException ex) {
                Logger.getLogger(CuentaHosp.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } 
        
        //update columns of precio subtotal and iva in cuentas and cuenta real
        
        updatePrecio();
        updateSubtotal();
        updateIva();
        
        updateCuentaReal();
        
        reiniciarCampos();
        
        
  
    }//GEN-LAST:event_btnAceptarACHActionPerformed

    private void btnCancelarACHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarACHActionPerformed
        // TODO add your handling code here:
        PagPrincipalPiso ppp = new PagPrincipalPiso();
        ppp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarACHActionPerformed
    
    //match price of material w/ DB 
    public void updatePrecio() {
        try {
                pst = conn.getConnection().prepareStatement("UPDATE `cuentas` JOIN `preciosHosp` ON `cuentas`.`material` = `preciosHosp`.`material` SET `cuentas`.`precio` = `preciosHosp`.`precio`");
                pst.executeUpdate();
            
            } catch (SQLException ex) {
                Logger.getLogger(CuentaHosp.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    // update subtotal to multiply the new number of materials
    public void updateSubtotal() {
        try {
                pst = conn.getConnection().prepareStatement("UPDATE `cuentas` SET `cuentas`.`subtotal` = `cuentas`.`precio` * `cuentas`.`cantidad`");
                pst.executeUpdate();
            
            } catch (SQLException ex) {
                Logger.getLogger(CuentaHosp.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
     
    //update iva by multiplying subtotal * 1.16 if its not med or sol
    public void updateIva() {
        try {
                pst = conn.getConnection().prepareStatement("UPDATE `cuentas` JOIN `preciosHosp` ON `cuentas`.`material` = `preciosHosp`.`material` SET `cuentas`.`iva` = `preciosHosp`.`iva` WHERE `cuentas`.`tipo` = 'HOSP'");
                pst.executeUpdate();
                pst = conn.getConnection().prepareStatement("UPDATE `cuentas` SET `cuentas`.`precioIva` = `cuentas`.`subtotal` * 1.16 where `cuentas`.`iva` = 'Y' ");
                pst.executeUpdate();
                pst = conn.getConnection().prepareStatement("UPDATE `cuentas` SET `cuentas`.`precioIva` = `cuentas`.`subtotal` where `cuentas`.`iva` = 'N' ");
                pst.executeUpdate();
                
            
            } catch (SQLException ex) {
                Logger.getLogger(CuentaHosp.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    //This method calls all the pacientes that are active (that have no fecha egraso) to display it in the combobox so they
    //update the cuenta
    public void loadPaciente() {
        try {
            pst = conn.getConnection().prepareStatement("SELECT `nombre` FROM `Paciente` WHERE `egreso` IS NULL");
            rs = pst.executeQuery();
            txtNombreACH.removeAll(); 
            
            while(rs.next()) {
                txtNombreACH.addItem(rs.getString(1));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CuentaHosp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //reset everything
    public void reiniciarCampos() {
        combBoxMaterialACH.setSelectedIndex(0);
        combBoxMedicamentoACH.setSelectedIndex(0);
        combBoxServAdACH.setSelectedIndex(0);
        combBoxServAdExtACH.setSelectedIndex(0);
        combBoxServiciosACH.setSelectedIndex(0);
        combBoxSolucionesACH.setSelectedIndex(0);
        txtNombreACH.setSelectedIndex(0);
        txtOtroMat.setText("");
        txtOtroPU.setText("");
        spinMaterialACH.setValue(0);
        spinMedicamentoACH.setValue(0);
        spinServAdACH.setValue(0);
        spinServAdExACH.setValue(0);
        spinServiciosACH.setValue(0);
        spinSolucionesACH.setValue(0);
        spinOtro.setValue(0);
     
    }
    
    //load materials
    public void loadMateriales() {
        try {
            pst = conn.getConnection().prepareStatement("SELECT `material` FROM `preciosHosp` WHERE `categoria` = 'SERVICIOS'");
            rs = pst.executeQuery();
            combBoxServiciosACH.removeAll(); 
            
            while(rs.next()) {
                combBoxServiciosACH.addItem(rs.getString(1));
            }
            
            pst = conn.getConnection().prepareStatement("SELECT `material` FROM `preciosHosp` WHERE `categoria` = 'CURACION'");
            rs = pst.executeQuery();
            combBoxMaterialACH.removeAll(); 
            
            while(rs.next()) {
                combBoxMaterialACH.addItem(rs.getString(1));
            }
            
            pst = conn.getConnection().prepareStatement("SELECT `material` FROM `preciosHosp` WHERE `categoria` = 'MEDICAMENTO'");
            rs = pst.executeQuery();
            combBoxMedicamentoACH.removeAll(); 
            
            while(rs.next()) {
                combBoxMedicamentoACH.addItem(rs.getString(1));
            }
            
            pst = conn.getConnection().prepareStatement("SELECT `material` FROM `preciosHosp` WHERE `categoria` = 'SOLUCIONES'");
            rs = pst.executeQuery();
            combBoxSolucionesACH.removeAll(); 
            
            while(rs.next()) {
                combBoxSolucionesACH.addItem(rs.getString(1));
            }
            
            pst = conn.getConnection().prepareStatement("SELECT `material` FROM `preciosHosp` WHERE `categoria` = 'SERVAD'");
            rs = pst.executeQuery();
            combBoxServAdACH.removeAll(); 
            
            while(rs.next()) {
                combBoxServAdACH.addItem(rs.getString(1));
            }
            
            pst = conn.getConnection().prepareStatement("SELECT `material` FROM `preciosHosp` WHERE `categoria` = 'SERVADEX'");
            rs = pst.executeQuery();
            combBoxServAdExtACH.removeAll(); 
            
            while(rs.next()) {
                combBoxServAdExtACH.addItem(rs.getString(1));
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CuentaHosp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // update cuenta real by adding all precio + iva
    public void updateCuentaReal() {
        String paciente = txtNombreACH.getSelectedItem().toString();
        // this try and catch will update the total bill of the pacient after adding something to the individual bill
        try {
            pst = conn.getConnection().prepareStatement("UPDATE `Paciente` SET `Paciente`.`cuenta real` = (SELECT SUM(`cuentas`.`precioIva`) FROM `cuentas` WHERE `cuentas`.`paciente` = ?) WHERE `Paciente`.`nombre` = ?");
            pst.setString(1, paciente);
            pst.setString(2,paciente);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Cuenta actualizada exitosamente");
        } catch (SQLException ex) {
            Logger.getLogger(CuentaHosp.class.getName()).log(Level.SEVERE, null, ex);
            
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
            java.util.logging.Logger.getLogger(CuentaHosp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuentaHosp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuentaHosp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuentaHosp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuentaHosp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarACH;
    private javax.swing.JButton btnCancelarACH;
    private javax.swing.JComboBox<String> combBoxMaterialACH;
    private javax.swing.JComboBox<String> combBoxMedicamentoACH;
    private javax.swing.JComboBox<String> combBoxServAdACH;
    private javax.swing.JComboBox<String> combBoxServAdExtACH;
    private javax.swing.JComboBox<String> combBoxServiciosACH;
    private javax.swing.JComboBox<String> combBoxSolucionesACH;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner spinMaterialACH;
    private javax.swing.JSpinner spinMedicamentoACH;
    private javax.swing.JSpinner spinOtro;
    private javax.swing.JSpinner spinServAdACH;
    private javax.swing.JSpinner spinServAdExACH;
    private javax.swing.JSpinner spinServiciosACH;
    private javax.swing.JSpinner spinSolucionesACH;
    private javax.swing.JComboBox<String> txtNombreACH;
    private javax.swing.JTextField txtOtroMat;
    private javax.swing.JTextField txtOtroPU;
    // End of variables declaration//GEN-END:variables
}
