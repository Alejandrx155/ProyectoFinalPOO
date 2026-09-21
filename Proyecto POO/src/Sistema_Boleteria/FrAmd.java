package Sistema_Boleteria;

public class FrAmd extends javax.swing.JFrame {

    public FrPrincipal ventanaPrincipal;
    boolean cargando = true;

    public FrAmd() {
        initComponents();

        cargarCombos();
    }

    public FrAmd(FrPrincipal principal) {
        initComponents();

        this.ventanaPrincipal = principal;

        cargarCombos();
    }

    public String cargarCombos() {
        cargando = true;

        CbOrigen.removeAllItems();
        CbDestino.removeAllItems();

        CbOrigen.addItem("Seleccione Origen");
        CbOrigen.addItem("Machala");

        CbDestino.addItem("Seleccione Destino");
        CbDestino.addItem("Guayaquil");
        CbDestino.addItem("Loja");
        CbDestino.addItem("Quito");
        CbDestino.addItem("Cuenca");

        CbOrigen.setSelectedIndex(0);
        CbDestino.setSelectedIndex(0);

        CbDestino.setEnabled(false);
        txtCliente.setEnabled(false);
        txtCedula.setEnabled(false);

        cargando = false;

        return "Combos cargados";
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnContinuar2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        CbOrigen = new javax.swing.JComboBox<>();
        CbDestino = new javax.swing.JComboBox<>();
        btnContinuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnContinuar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnContinuar2.setFont(new java.awt.Font("Sitka Heading", 3, 24)); // NOI18N
        btnContinuar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/CLICK FINAL.png"))); // NOI18N
        btnContinuar2.setText("LIMPIAR");
        btnContinuar2.setContentAreaFilled(false);
        btnContinuar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnContinuar2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/CLICK FINALF.png"))); // NOI18N
        btnContinuar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnContinuar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 220, 60));

        jLabel4.setFont(new java.awt.Font("Sitka Heading", 3, 30)); // NOI18N
        jLabel4.setText("Origen :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 150, 40));

        jLabel8.setFont(new java.awt.Font("Sitka Heading", 3, 30)); // NOI18N
        jLabel8.setText("Cliente :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 130, 40));

        jLabel9.setFont(new java.awt.Font("Sitka Heading", 3, 30)); // NOI18N
        jLabel9.setText("Cedula :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 130, 40));

        jLabel10.setFont(new java.awt.Font("Sitka Heading", 3, 30)); // NOI18N
        jLabel10.setText("Destino :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 150, 40));

        txtCliente.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 200, 50));

        txtCedula.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtCedula.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 210, 50));

        CbOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbOrigenActionPerformed(evt);
            }
        });
        jPanel1.add(CbOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 160, 30));

        CbDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbDestinoActionPerformed(evt);
            }
        });
        jPanel1.add(CbDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 150, 30));

        btnContinuar.setFont(new java.awt.Font("Sitka Heading", 3, 24)); // NOI18N
        btnContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/CLICK FINAL.png"))); // NOI18N
        btnContinuar.setText("Continuar");
        btnContinuar.setContentAreaFilled(false);
        btnContinuar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnContinuar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/CLICK FINALF.png"))); // NOI18N
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 220, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Boleteria Final.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 560));

        btnContinuar1.setFont(new java.awt.Font("Sitka Heading", 3, 24)); // NOI18N
        btnContinuar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/CLICK FINAL.png"))); // NOI18N
        btnContinuar1.setContentAreaFilled(false);
        btnContinuar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnContinuar1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/CLICK FINALF.png"))); // NOI18N
        btnContinuar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnContinuar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 220, 60));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CbOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbOrigenActionPerformed
                                       

    if (cargando) {
        return;
    }

    if (CbOrigen.getSelectedIndex() > 0) {
        CbDestino.setEnabled(true);
    } else {
        CbDestino.setEnabled(false);
        CbDestino.setSelectedIndex(0);
        txtCliente.setEnabled(false);
        txtCedula.setEnabled(false);
}
        }//GEN-LAST:event_CbOrigenActionPerformed

    private void CbDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbDestinoActionPerformed
     if (cargando) {
        return;
    }

    if (CbDestino.getSelectedIndex() > 0) {
        txtCliente.setEnabled(true);
        txtCedula.setEnabled(true);
    } else {
        txtCliente.setEnabled(false);
        txtCedula.setEnabled(false);
    
}
    }//GEN-LAST:event_CbDestinoActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
     String nombre = txtCliente.getText().trim();
    String cedula = txtCedula.getText().trim();

    if (CbOrigen.getSelectedIndex() <= 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "Seleccione el origen");
        return;
    }

    if (CbDestino.getSelectedIndex() <= 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "Seleccione el destino");
        return;
    }

    String origen = CbOrigen.getSelectedItem().toString();
    String destino = CbDestino.getSelectedItem().toString();

    Terminal terminal = new Terminal(
            nombre,
            cedula,
            origen,
            destino,
            12.00
    );

    if (!terminal.validarTerminal()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Revise el nombre o la cédula");
        return;
    }

    Horario horario = new Horario(
            nombre,
            cedula,
            origen,
            destino,
            12.00,
            "",
            "",
            ""
    );

   horario.prepararHorarios();

FrHorario ventanaHorario = new FrHorario(
        horario,
        ventanaPrincipal
);

if (ventanaPrincipal != null) {
    ventanaPrincipal.mostrarPanel(
            ventanaHorario.getContentPane(),
            "FrHorario"
    );
} else {
    ventanaHorario.setVisible(true);
    this.setVisible(false);
}

    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnContinuar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContinuar1ActionPerformed

    private void btnContinuar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuar2ActionPerformed
txtCedula.setText("");
txtCliente.setText("");       
    }//GEN-LAST:event_btnContinuar2ActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

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
            java.util.logging.Logger.getLogger(FrAmd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrAmd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrAmd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrAmd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrAmd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbDestino;
    private javax.swing.JComboBox<String> CbOrigen;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnContinuar1;
    private javax.swing.JButton btnContinuar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCliente;
    // End of variables declaration//GEN-END:variables

 
}
