package Sistema_Boleteria;

public class FrHorario extends javax.swing.JFrame {

    public Horario horario;
    public FrPrincipal ventanaPrincipal;

    public FrHorario() {
        initComponents();
    }

    public FrHorario(Horario horario, FrPrincipal principal) {
        initComponents();

        this.horario = horario;
        this.ventanaPrincipal = principal;

        txthorario1.setText(horario.horario1);
        txthorario2.setText(horario.horario2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnH2 = new javax.swing.JButton();
        BtnH1 = new javax.swing.JButton();
        txthorario1 = new java.awt.TextArea();
        txthorario2 = new java.awt.TextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnH2.setBackground(new java.awt.Color(0, 153, 153));
        BtnH2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        BtnH2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/CLICK FINAL.png"))); // NOI18N
        BtnH2.setText("SIGUIENTE------>");
        BtnH2.setContentAreaFilled(false);
        BtnH2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnH2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/CLICK FINALF.png"))); // NOI18N
        BtnH2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnH2ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 210, 50));

        BtnH1.setBackground(new java.awt.Color(0, 153, 153));
        BtnH1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        BtnH1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/CLICK FINAL.png"))); // NOI18N
        BtnH1.setText("SIGUIENTE------>");
        BtnH1.setContentAreaFilled(false);
        BtnH1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnH1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/CLICK FINALF.png"))); // NOI18N
        BtnH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnH1ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 210, 50));

        txthorario1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txthorario1.setFont(new java.awt.Font("Nirmala UI Semilight", 3, 14)); // NOI18N
        jPanel1.add(txthorario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 330, 260));

        txthorario2.setFont(new java.awt.Font("Nirmala UI Semilight", 3, 14)); // NOI18N
        jPanel1.add(txthorario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 330, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Horario Final.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 560));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnH2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnH2ActionPerformed
     String opcionSeleccionada = horario.seleccionarHorario(2);

    FrAsiento ventanaAsiento = new FrAsiento();

    ventanaAsiento.cargarHorarioSeleccionado(
            opcionSeleccionada,
            ventanaPrincipal
    );

    if (ventanaPrincipal != null) {
        ventanaPrincipal.mostrarPanel(
                ventanaAsiento.getContentPane(),
                "FrAsiento"
        );
    } else {
        ventanaAsiento.setVisible(true);
        this.setVisible(false);
    } 
    }//GEN-LAST:event_BtnH2ActionPerformed

    private void BtnH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnH1ActionPerformed
   
    String opcionSeleccionada = horario.seleccionarHorario(1);

    FrAsiento ventanaAsiento = new FrAsiento();

    ventanaAsiento.cargarHorarioSeleccionado(
            opcionSeleccionada,
            ventanaPrincipal
    );

    if (ventanaPrincipal != null) {
        ventanaPrincipal.mostrarPanel(
                ventanaAsiento.getContentPane(),
                "FrAsiento"
        );
    } else {
        ventanaAsiento.setVisible(true);
        this.setVisible(false);
    }
    }//GEN-LAST:event_BtnH1ActionPerformed
 public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrHorario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnH1;
    private javax.swing.JButton BtnH2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.TextArea txthorario1;
    private java.awt.TextArea txthorario2;
    // End of variables declaration//GEN-END:variables
}
