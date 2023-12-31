package Jframes;


import clases.Conectar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author paueguibar
 */
public class MostrarCuenta extends javax.swing.JFrame {
    Conectar conn;
    PreparedStatement pst;
    ResultSet rs;
    String sub;
    String cr;
    String totI;
    String paq;
    String totP;
    String dif;

    /**
     * Creates new form MostrarCuenta
     */
    public MostrarCuenta() {
        initComponents();
        conn = new Conectar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    /*
    Ths method reads the patient name and calls the DB to retrieve the data on the columns selected to show them in the jTable
    */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCuenta = new javax.swing.JTable();
        btnAceptar = new javax.swing.JButton();
        txtNombre = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSubt = new javax.swing.JLabel();
        lblTot = new javax.swing.JLabel();
        boxLoad = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblPaq = new javax.swing.JLabel();
        lblDif = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePago = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        lblaCR = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblP = new javax.swing.JLabel();
        btnAEditar = new javax.swing.JButton();
        btnAPago = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnPrintPagos = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lblFact = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre del Paciente");

        jLabel8.setFont(new java.awt.Font("Songti TC", 0, 36)); // NOI18N
        jLabel8.setText("Cuenta");

        tableCuenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cantidad", "Materiales", "Precio Unitario", "Subtotal", "I.V.A."
            }
        ));
        jScrollPane1.setViewportView(tableCuenta);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("Subtotal:");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setText("Total + I.V.A.");

        lblSubt.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblSubt.setText("$");

        lblTot.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblTot.setText("$");

        boxLoad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Actuales", "Pasadas" }));
        boxLoad.setSelectedIndex(-1);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setText("Paquete");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel5.setText("Diferencia");

        lblPaq.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblPaq.setText("$");

        lblDif.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblDif.setText("$");

        jLabel9.setFont(new java.awt.Font("Songti TC", 0, 24)); // NOI18N
        jLabel9.setText("Pagos:");

        tablePago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Fecha", "Monto", "Tipo de Pago"
            }
        ));
        jScrollPane3.setViewportView(tablePago);

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel6.setText("Cuenta Real");

        lblaCR.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblaCR.setText("$");

        btnOK.setText("Ok");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel7.setText("Total de Pagos");

        lblP.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblP.setText("$");

        btnAEditar.setText("Editar Cuenta");
        btnAEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAEditarActionPerformed(evt);
            }
        });

        btnAPago.setText("Agregar Pago");
        btnAPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAPagoActionPerformed(evt);
            }
        });

        btnPrint.setText("Imprimir Cuenta");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnPrintPagos.setText("Imprimir Pagos");
        btnPrintPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintPagosActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel10.setText("Factura: ");

        lblFact.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(lblaCR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSubt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPaq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDif, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTot, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(26, 26, 26)
                        .addComponent(lblFact, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(166, 166, 166)
                                .addComponent(jLabel8)
                                .addGap(379, 379, 379)
                                .addComponent(btnAEditar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAceptar)))
                        .addGap(18, 18, 18)
                        .addComponent(btnAPago))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(btnPrintPagos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPrint)
                .addGap(232, 232, 232))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(btnBack)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAEditar)
                        .addComponent(btnAPago)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnAceptar)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxLoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblaCR))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblP))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(lblPaq)
                            .addComponent(lblDif)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(lblSubt)
                                .addComponent(lblTot)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrint)
                    .addComponent(btnPrintPagos))
                .addGap(52, 52, 52))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // display cuenta, pagos, y toatales
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        //read input
        String paciente = txtNombre.getSelectedItem().toString();

        try {
            //select from DB and add to table
            pst = conn.getConnection().prepareStatement("SELECT `cantidad`,`material`,`precio`, `subtotal`,`precioIva` FROM `cuentas` WHERE `paciente` = ?");
            pst.setString(1, paciente);
            rs = pst.executeQuery();
            ResultSetMetaData Rsm = rs.getMetaData();
            int c;
            c = Rsm.getColumnCount();
            DefaultTableModel df = (DefaultTableModel)tableCuenta.getModel();
            df.setRowCount(0);
            while (rs.next()) {
                Vector v2 = new Vector();
                for(int i = 1; i <= c; i++) {
                    v2.add(rs.getString("cantidad"));
                    v2.add(rs.getString("material"));
                    v2.add("$" + rs.getString("precio"));
                    v2.add("$" + rs.getString("subtotal"));
                    v2.add("$" + rs.getString("precioIva"));

                }

                df.addRow(v2);

            }
            
            //show if factura
            pst = conn.getConnection().prepareStatement("SELECT `requiereFact` FROM `Paciente` WHERE `nombre` = ?");
            pst.setString(1, paciente);
            rs = pst.executeQuery(); 
            
            while(rs.next()) {
                lblFact.setText(rs.getString(1));
            }

        } catch (SQLException ex) {
            Logger.getLogger(MostrarCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        //methods
        displayTotales();
        displayPago();

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        PagPrincipalRecep ppr = new PagPrincipalRecep();
        ppr.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        //read input
        String load = boxLoad.getSelectedItem().toString();
        
        //display either actuales or pasados
        if (load.equals("Actuales")) {
            loadPacienteActuales();
            
        } else if (load.equals("Pasadas")) {
            loadPacientePasados();
            
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnAEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAEditarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        EditarCuenta ec = new EditarCuenta();
        ec.setVisible(true);
    }//GEN-LAST:event_btnAEditarActionPerformed

    private void btnAPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAPagoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Pago p = new Pago();
        p.setVisible(true);
    }//GEN-LAST:event_btnAPagoActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        String paciente = txtNombre.getSelectedItem().toString();
        MessageFormat header = new MessageFormat("Cuenta de " + paciente);
        MessageFormat footer = new MessageFormat("Subtotal: $ " + sub + "   Total + I.V.A. $ " + totI + "   Cuenta Real: $ " + cr );
        
        try { 
            tableCuenta.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnPrintPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintPagosActionPerformed
        // TODO add your handling code here:
        String paciente = txtNombre.getSelectedItem().toString();
        MessageFormat header = new MessageFormat("Pagos de " + paciente);
        MessageFormat footer = new MessageFormat("Total pagos: $ " + totP + "   Paquete: $ " + paq + "   Diferencia: $ " + dif );
        
        try { 
            tablePago.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnPrintPagosActionPerformed
    
    //This method calls all the pacientes that are active (that have no fecha egraso) to display it in the combobox so they
    //mostrar the cuenta
    public void loadPacienteActuales() {
        try {
            //call db 
            txtNombre.removeAllItems(); 
            pst = conn.getConnection().prepareStatement("SELECT `nombre` FROM `Paciente` WHERE `egreso` IS NULL");
            rs = pst.executeQuery();
            
            
            while(rs.next()) {
                txtNombre.addItem(rs.getString(1));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MostrarCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*this methodcalls all the pacientes to display it in the combobox so they
    mostrar the cuenta */
    
    public void loadPacientePasados() {
        try {
            //Call DB
            txtNombre.removeAllItems();
            pst = conn.getConnection().prepareStatement("SELECT `nombre` FROM `Paciente`");
            rs = pst.executeQuery();           
            
            while(rs.next()) {
                txtNombre.addItem(rs.getString(1));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MostrarCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //This method display the total of subtotal, precioIva, paquete, and diferencia
    
    public void displayTotales() {
        String paciente = txtNombre.getSelectedItem().toString();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double sumSub = 0;
        double sumTot = 0;
        double sumPago = 0;
        try {
            //call subtotal
            pst = conn.getConnection().prepareStatement("SELECT `subtotal` FROM `cuentas` WHERE `paciente` = ?");
            pst.setString(1,paciente);
            rs = pst.executeQuery();
            while(rs.next()) {
                sumSub += rs.getDouble(1);
            }
            String formated = decimalFormat.format(sumSub);
            //assign to global var
            sub = formated;
            lblSubt.setText("$"+formated);
        } catch (SQLException ex) {
            Logger.getLogger(MostrarCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            //call precio + iva
            pst = conn.getConnection().prepareStatement("SELECT `precioIva` FROM `cuentas` WHERE `paciente` = ?");
            pst.setString(1,paciente);
            rs = pst.executeQuery();
            while(rs.next()) {
                sumTot += rs.getDouble(1);
            }
            String formated = decimalFormat.format(sumTot);
            //assign to global var
            totI = formated;
            lblTot.setText("$"+formated);
        } catch (SQLException ex) {
            Logger.getLogger(MostrarCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            //call paquete
            pst = conn.getConnection().prepareStatement("SELECT `paquete` FROM `Paciente` WHERE `nombre` = ?");
            pst.setString(1,paciente);
            rs = pst.executeQuery();
            while(rs.next()) {
        
                lblPaq.setText("$"+rs.getDouble(1));
            }
            
            //assign to global var
            paq = lblPaq.getText();
            
            //update diferencia
            pst = conn.getConnection().prepareStatement("update Paciente set diferencia = `cuenta real` - `paquete` where nombre = ?");
            pst.setString(1,paciente);
            pst.executeUpdate();
            
            //call diferencia
            pst = conn.getConnection().prepareStatement("SELECT `diferencia` FROM `Paciente` WHERE `nombre` = ?");
            pst.setString(1,paciente);
            rs = pst.executeQuery();
            while(rs.next()) {
                
                lblDif.setText("$"+rs.getDouble(1));
            }
            
            //assign to global var
            dif = lblDif.getText();
            
        } catch (SQLException ex) {
            Logger.getLogger(MostrarCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            //call pagos and sum to diplay total
            pst = conn.getConnection().prepareStatement("SELECT `monto` FROM `pagos` WHERE `paciente` = ?");
            pst.setString(1,paciente);
            rs = pst.executeQuery();
            while(rs.next()) {
                sumPago += rs.getDouble(1);
            }
            String formated = decimalFormat.format(sumPago);
            lblP.setText("$"+formated);
            
            //assign to global var
            totP = formated;
            
        } catch (SQLException ex) {
            Logger.getLogger(MostrarCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            //display cuenta real
            pst = conn.getConnection().prepareStatement("SELECT `cuenta real` FROM `Paciente` WHERE `nombre` = ?");
            pst.setString(1,paciente);
            rs = pst.executeQuery();   
            while (rs.next()) {
                lblaCR.setText("$"+rs.getString("cuenta real"));
            }
            
            //assign to global var
            cr = lblaCR.getText();
            
        } catch (SQLException ex) {
            Logger.getLogger(MostrarCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
    }
    
    // display the payments in the table and the cuenta real
    public void displayPago() {
        
        String paciente = txtNombre.getSelectedItem().toString();

        try {
            //select pago to display in table
            pst = conn.getConnection().prepareStatement("SELECT `fecha`,`monto`,`tipo` FROM `pagos` WHERE `paciente` = ?");
            pst.setString(1, paciente);
            rs = pst.executeQuery();
            ResultSetMetaData Rsm = rs.getMetaData();
            int c;
            c = Rsm.getColumnCount();
            DefaultTableModel df = (DefaultTableModel)tablePago.getModel();
            df.setRowCount(0);
            while (rs.next()) {
                Vector v2 = new Vector();
                for(int i = 1; i <= c; i++) {
                    v2.add(rs.getString("fecha"));
                    v2.add("$" + rs.getString("monto"));
                    v2.add(rs.getString("tipo"));     
                }

                df.addRow(v2);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Pago.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(MostrarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxLoad;
    private javax.swing.JButton btnAEditar;
    private javax.swing.JButton btnAPago;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnPrintPagos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDif;
    private javax.swing.JLabel lblFact;
    private javax.swing.JLabel lblP;
    private javax.swing.JLabel lblPaq;
    private javax.swing.JLabel lblSubt;
    private javax.swing.JLabel lblTot;
    private javax.swing.JLabel lblaCR;
    private javax.swing.JTable tableCuenta;
    private javax.swing.JTable tablePago;
    private javax.swing.JComboBox<String> txtNombre;
    // End of variables declaration//GEN-END:variables
}
