package Sistema_Boleteria;

import java.awt.CardLayout;

public class FrPrincipal extends javax.swing.JFrame {
FrAmd ventanaAmd;
FrHorario ventanaHorario;
FrAsiento ventanaAsiento;
FrFactura ventanaFactura;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrPrincipal.class.getName());

    public FrPrincipal() {
        initComponents();
    }

    public void mostrarPanel(java.awt.Container contenido, String nombre) {
        panelCentral.add(contenido, nombre);
        ((java.awt.CardLayout) panelCentral.getLayout()).show(panelCentral, nombre);
        panelCentral.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAmd = new javax.swing.JButton();
        btnHorario = new javax.swing.JButton();
        btnAsiento = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        btHome1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ladpo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelCentral = new javax.swing.JPanel();
        lbfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(190, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAmd.setBackground(new java.awt.Color(0, 0, 0));
        btnAmd.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        btnAmd.setForeground(new java.awt.Color(0, 0, 0));
        btnAmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_2.png"))); // NOI18N
        btnAmd.setText("Destino");
        btnAmd.setContentAreaFilled(false);
        btnAmd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAmd.setPreferredSize(new java.awt.Dimension(100, 50));
        btnAmd.addActionListener(this::btnAmdActionPerformed);
        jPanel1.add(btnAmd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        btnHorario.setBackground(new java.awt.Color(0, 0, 0));
        btnHorario.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        btnHorario.setForeground(new java.awt.Color(0, 0, 0));
        btnHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_2.png"))); // NOI18N
        btnHorario.setText("Horario");
        btnHorario.setContentAreaFilled(false);
        btnHorario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHorario.setPreferredSize(new java.awt.Dimension(100, 50));
        btnHorario.addActionListener(this::btnHorarioActionPerformed);
        jPanel1.add(btnHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        btnAsiento.setBackground(new java.awt.Color(0, 0, 0));
        btnAsiento.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        btnAsiento.setForeground(new java.awt.Color(0, 0, 0));
        btnAsiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_2.png"))); // NOI18N
        btnAsiento.setText("Asiento");
        btnAsiento.setContentAreaFilled(false);
        btnAsiento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAsiento.setPreferredSize(new java.awt.Dimension(100, 50));
        btnAsiento.addActionListener(this::btnAsientoActionPerformed);
        jPanel1.add(btnAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        btnFactura.setBackground(new java.awt.Color(0, 0, 0));
        btnFactura.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        btnFactura.setForeground(new java.awt.Color(0, 0, 0));
        btnFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton_2.png"))); // NOI18N
        btnFactura.setText("Factura");
        btnFactura.setContentAreaFilled(false);
        btnFactura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFactura.setPreferredSize(new java.awt.Dimension(100, 50));
        btnFactura.addActionListener(this::btnFacturaActionPerformed);
        jPanel1.add(btnFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        btHome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/HOME VERDE_1.png"))); // NOI18N
        btHome1.setBorderPainted(false);
        btHome1.setContentAreaFilled(false);
        btHome1.addActionListener(this::btHome1ActionPerformed);
        jPanel1.add(btHome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 76, 80));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/pngegg (1).png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton5.addActionListener(this::jButton5ActionPerformed);
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 79, 70));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        ladpo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ladd.png"))); // NOI18N
        jPanel1.add(ladpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 560));

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Sitka Small", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Grupo # 6");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_END);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Sitka Small", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("UTMACH");
        jLabel2.setPreferredSize(new java.awt.Dimension(110, 31));
        getContentPane().add(jLabel2, java.awt.BorderLayout.PAGE_START);

        panelCentral.setLayout(new java.awt.CardLayout());

        lbfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/caratula.png"))); // NOI18N
        lbfondo.setPreferredSize(new java.awt.Dimension(867, 556));
        panelCentral.add(lbfondo, "card2");

        getContentPane().add(panelCentral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmdActionPerformed
     
    if (ventanaAmd == null) {
        ventanaAmd = new FrAmd(this);
        panelCentral.add(ventanaAmd.getContentPane(), "FrAmd");
    }

    CardLayout cl = (CardLayout) panelCentral.getLayout();
    cl.show(panelCentral, "FrAmd");

    panelCentral.repaint();
    panelCentral.revalidate();
    }//GEN-LAST:event_btnAmdActionPerformed

    private void btnHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorarioActionPerformed
       if (ventanaHorario == null) {
        ventanaHorario = new FrHorario();
        panelCentral.add(ventanaHorario.getContentPane(), "FrHorario");
    }

    CardLayout cl = (CardLayout) panelCentral.getLayout();
    cl.show(panelCentral, "FrHorario");

    panelCentral.repaint();
    panelCentral.revalidate();

    }//GEN-LAST:event_btnHorarioActionPerformed

    private void btnAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsientoActionPerformed
      
    if (ventanaAsiento == null) {
        ventanaAsiento = new FrAsiento();
        panelCentral.add(ventanaAsiento.getContentPane(), "FrAsiento");
    }

    CardLayout cl = (CardLayout) panelCentral.getLayout();
    cl.show(panelCentral, "FrAsiento");

    panelCentral.repaint();
    panelCentral.revalidate();


    }//GEN-LAST:event_btnAsientoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHome1ActionPerformed
        CardLayout cl = (CardLayout) panelCentral.getLayout();
        cl.show(panelCentral, "card2");

        panelCentral.revalidate();
        panelCentral.repaint();
    }//GEN-LAST:event_btHome1ActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
    
    if (ventanaFactura == null) {
        ventanaFactura = new FrFactura();
        panelCentral.add(ventanaFactura.getContentPane(), "FrFactura");
    }

    CardLayout cl = (CardLayout) panelCentral.getLayout();
    cl.show(panelCentral, "FrFactura");

    panelCentral.repaint();
    panelCentral.revalidate();

    }//GEN-LAST:event_btnFacturaActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FrPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHome1;
    private javax.swing.JButton btnAmd;
    private javax.swing.JButton btnAsiento;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnHorario;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel ladpo;
    private javax.swing.JLabel lbfondo;
    private javax.swing.JPanel panelCentral;
    // End of variables declaration//GEN-END:variables
}
