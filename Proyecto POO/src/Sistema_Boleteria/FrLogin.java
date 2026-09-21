package Sistema_Boleteria;

import javax.swing.JOptionPane;

public class FrLogin extends javax.swing.JFrame {

    public FrLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Sitka Small", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("©UTMACH GRUPO 6 ");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 503, 872, 53);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Sitka Small", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingrese Contraseña");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-8, 0, 880, 53);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/CLICK FINAL.png"))); // NOI18N
        jButton2.setText("LIMPIAR");
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/CLICK FINALF.png"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/CLICK FINALF.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(460, 350, 210, 60);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/CLICK FINAL.png"))); // NOI18N
        jButton1.setText("INGRESAR");
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/CLICK FINALF.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/CLICK FINALF.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 350, 210, 60);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 70, 0);

        txtContraseña.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtContraseña.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContraseña);
        txtContraseña.setBounds(260, 260, 380, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/poo.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(180, 140, 550, 310);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/jjj.png"))); // NOI18N
        jLabel4.setText("678");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 50, 870, 460);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 867, 556));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String clave = txtContraseña.getText();
        int mayus = 0;
        int numeros = 0;
        int especiales = 0;
        String listaEspeciales = "!@#$%^&*().,?";

        // Validar longitud primero
        if (clave.length() == 5) {

            for (int i = 0; i < clave.length(); i++) {
                char c = clave.charAt(i);

                if (c >= 'A' && c <= 'Z') {
                    mayus++;
                }

                if (c >= '0' && c <= '9') {
                    numeros++;
                }

                if (listaEspeciales.indexOf(c) != -1) {
                    especiales++;
                }
            }
        }

        if (clave.length() == 5 && mayus > 0 && numeros > 0 && especiales > 0) {
            FrPrincipal v1 = new FrPrincipal();
            v1.setVisible(true);
            this.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(this,
                    "La clave debe tener:\n"
                    + "- 5 caracteres exactos\n"
                    + "- Al menos 1 mayúscula\n"
                    + "- Al menos 1 número\n"
                    + "- Al menos 1 carácter especial");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
    }//GEN-LAST:event_txtContraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(FrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtContraseña;
    // End of variables declaration//GEN-END:variables
}
