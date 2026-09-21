package Sistema_Boleteria;

public class FrAsiento extends javax.swing.JFrame {

    public String opcionHorario;
    public FrPrincipal ventanaPrincipal;
    public int asientoSeleccionado;
    public double precioAsiento = 2.50;

    public FrAsiento() {
        initComponents();
    }

    public String cargarHorarioSeleccionado(String opcionHorario, FrPrincipal principal) {
        this.opcionHorario = opcionHorario;
        this.ventanaPrincipal = principal;

        txtPreResultado.setText(
                "HORARIO SELECCIONADO\n"
                + "--------------------------\n"
                + opcionHorario
        );

        return "Horario cargado";
    }

    public String seleccionarAsiento(int numero, javax.swing.JButton boton) {

        asientoSeleccionado = numero;

        Asiento asiento = new Asiento(
                "",
                "0000000000",
                "Machala",
                "Loja",
                12.00,
                asientoSeleccionado,
                precioAsiento
        );

        boton.setEnabled(false);
        boton.setBackground(java.awt.Color.RED);

        txtPreResultado.setText(
                asiento.mostrarResumenAsiento(opcionHorario)
        );

        return asiento.seleccionarAsiento();
    }

     
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtPreResultado = new javax.swing.JTextArea();
        A5 = new javax.swing.JButton();
        A10 = new javax.swing.JButton();
        A7 = new javax.swing.JButton();
        A8 = new javax.swing.JButton();
        A1 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        A6 = new javax.swing.JButton();
        A9 = new javax.swing.JButton();
        A11 = new javax.swing.JButton();
        A12 = new javax.swing.JButton();
        A13 = new javax.swing.JButton();
        A14 = new javax.swing.JButton();
        A15 = new javax.swing.JButton();
        A16 = new javax.swing.JButton();
        A17 = new javax.swing.JButton();
        A18 = new javax.swing.JButton();
        A19 = new javax.swing.JButton();
        A20 = new javax.swing.JButton();
        btnAsiento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPreResultado.setColumns(20);
        txtPreResultado.setRows(5);
        jScrollPane1.setViewportView(txtPreResultado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, 140));

        A5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        A5.setForeground(new java.awt.Color(255, 255, 255));
        A5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BOTON_1.png"))); // NOI18N
        A5.setText("5");
        A5.setContentAreaFilled(false);
        A5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });
        getContentPane().add(A5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 60, -1));

        A10.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        A10.setForeground(new java.awt.Color(255, 255, 255));
        A10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BOTON_1.png"))); // NOI18N
        A10.setText("10");
        A10.setContentAreaFilled(false);
        A10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A10ActionPerformed(evt);
            }
        });
        getContentPane().add(A10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 80, 30));

        A7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        A7.setForeground(new java.awt.Color(255, 255, 255));
        A7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BOTON_1.png"))); // NOI18N
        A7.setText("7");
        A7.setContentAreaFilled(false);
        A7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A7ActionPerformed(evt);
            }
        });
        getContentPane().add(A7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 80, 30));

        A8.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        A8.setForeground(new java.awt.Color(255, 255, 255));
        A8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BOTON_1.png"))); // NOI18N
        A8.setText("8");
        A8.setContentAreaFilled(false);
        A8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A8ActionPerformed(evt);
            }
        });
        getContentPane().add(A8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 80, 30));

        A1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        A1.setForeground(new java.awt.Color(255, 255, 255));
        A1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BOTON_1.png"))); // NOI18N
        A1.setText("1");
        A1.setContentAreaFilled(false);
        A1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });
        getContentPane().add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 80, 30));

        A3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        A3.setForeground(new java.awt.Color(255, 255, 255));
        A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BOTON_1.png"))); // NOI18N
        A3.setText("3");
        A3.setContentAreaFilled(false);
        A3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });
        getContentPane().add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 80, 30));

        A2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        A2.setForeground(new java.awt.Color(255, 255, 255));
        A2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BOTON_1.png"))); // NOI18N
        A2.setText("2");
        A2.setContentAreaFilled(false);
        A2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });
        getContentPane().add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 80, 30));

        A4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        A4.setForeground(new java.awt.Color(255, 255, 255));
        A4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BOTON_1.png"))); // NOI18N
        A4.setText("4");
        A4.setContentAreaFilled(false);
        A4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });
        getContentPane().add(A4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 80, 30));

        A6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        A6.setForeground(new java.awt.Color(255, 255, 255));
        A6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BOTON_1.png"))); // NOI18N
        A6.setText("6");
        A6.setContentAreaFilled(false);
        A6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });
        getContentPane().add(A6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 80, 30));

        A9.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        A9.setForeground(new java.awt.Color(255, 255, 255));
        A9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BOTON_1.png"))); // NOI18N
        A9.setText("9");
        A9.setContentAreaFilled(false);
        A9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A9ActionPerformed(evt);
            }
        });
        getContentPane().add(A9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 80, 30));

        A11.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        A11.setForeground(new java.awt.Color(255, 255, 255));
        A11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BOTON_1.png"))); // NOI18N
        A11.setText("11");
        A11.setContentAreaFilled(false);
        A11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A11ActionPerformed(evt);
            }
        });
        getContentPane().add(A11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 80, 30));

        A12.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        A12.setForeground(new java.awt.Color(255, 255, 255));
        A12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BOTON_1.png"))); // NOI18N
        A12.setText("12");
        A12.setContentAreaFilled(false);
        A12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A12ActionPerformed(evt);
            }
        });
        getContentPane().add(A12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 80, 30));

        A13.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        A13.setForeground(new java.awt.Color(255, 255, 255));
        A13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BOTON_1.png"))); // NOI18N
        A13.setText("13");
        A13.setContentAreaFilled(false);
        A13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A13ActionPerformed(evt);
            }
        });
        getContentPane().add(A13, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 80, 30));

        A14.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        A14.setForeground(new java.awt.Color(255, 255, 255));
        A14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BOTON_1.png"))); // NOI18N
        A14.setText("14");
        A14.setContentAreaFilled(false);
        A14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A14ActionPerformed(evt);
            }
        });
        getContentPane().add(A14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 80, 30));

        A15.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        A15.setForeground(new java.awt.Color(255, 255, 255));
        A15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BOTON_1.png"))); // NOI18N
        A15.setText("15");
        A15.setContentAreaFilled(false);
        A15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A15ActionPerformed(evt);
            }
        });
        getContentPane().add(A15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 80, 30));

        A16.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        A16.setForeground(new java.awt.Color(255, 255, 255));
        A16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BOTON_1.png"))); // NOI18N
        A16.setText("16");
        A16.setContentAreaFilled(false);
        A16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A16ActionPerformed(evt);
            }
        });
        getContentPane().add(A16, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 80, 30));

        A17.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        A17.setForeground(new java.awt.Color(255, 255, 255));
        A17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BOTON_1.png"))); // NOI18N
        A17.setText("17");
        A17.setContentAreaFilled(false);
        A17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A17ActionPerformed(evt);
            }
        });
        getContentPane().add(A17, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 80, 30));

        A18.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        A18.setForeground(new java.awt.Color(255, 255, 255));
        A18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BOTON_1.png"))); // NOI18N
        A18.setText("18");
        A18.setContentAreaFilled(false);
        A18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A18ActionPerformed(evt);
            }
        });
        getContentPane().add(A18, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 80, 30));

        A19.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        A19.setForeground(new java.awt.Color(255, 255, 255));
        A19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BOTON_1.png"))); // NOI18N
        A19.setText("19");
        A19.setContentAreaFilled(false);
        A19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A19ActionPerformed(evt);
            }
        });
        getContentPane().add(A19, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 80, 30));

        A20.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        A20.setForeground(new java.awt.Color(255, 255, 255));
        A20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/BOTON_1.png"))); // NOI18N
        A20.setText("20");
        A20.setContentAreaFilled(false);
        A20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A20ActionPerformed(evt);
            }
        });
        getContentPane().add(A20, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 80, 30));

        btnAsiento.setFont(new java.awt.Font("Sitka Small", 3, 24)); // NOI18N
        btnAsiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/CLICK FINAL.png"))); // NOI18N
        btnAsiento.setText("SIGUIENTE");
        btnAsiento.setContentAreaFilled(false);
        btnAsiento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAsiento.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/CLICK FINALF.png"))); // NOI18N
        btnAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsientoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 260, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Asiento Final.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsientoActionPerformed
  if (asientoSeleccionado == 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un asiento");
        return;
    }

    Factura factura = new Factura(
            "",
            "0000000000",
            "Machala",
            "Loja",
            12.00,
            asientoSeleccionado,
            precioAsiento,
            opcionHorario
    );

    FrFactura ventanaFactura = new FrFactura();

    ventanaFactura.cargarFactura(factura);

    if (ventanaPrincipal != null) {
        ventanaPrincipal.mostrarPanel(
                ventanaFactura.getContentPane(),
                "FrFactura"
        );
    } else {
        ventanaFactura.setVisible(true);
        this.setVisible(false);
    }        
    }//GEN-LAST:event_btnAsientoActionPerformed

    private void A20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A20ActionPerformed
    seleccionarAsiento(20, A20);      

    }//GEN-LAST:event_A20ActionPerformed

    private void A19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A19ActionPerformed
    seleccionarAsiento(19, A19);      

    }//GEN-LAST:event_A19ActionPerformed

    private void A18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A18ActionPerformed
           seleccionarAsiento(18, A18);      

    }//GEN-LAST:event_A18ActionPerformed

    private void A17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A17ActionPerformed
           seleccionarAsiento(17, A17);      

    }//GEN-LAST:event_A17ActionPerformed

    private void A16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A16ActionPerformed
           seleccionarAsiento(16, A16);      

    }//GEN-LAST:event_A16ActionPerformed

    private void A15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A15ActionPerformed
           seleccionarAsiento(15, A15);      

    }//GEN-LAST:event_A15ActionPerformed

    private void A14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A14ActionPerformed
           seleccionarAsiento(14, A14);      

    }//GEN-LAST:event_A14ActionPerformed

    private void A13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A13ActionPerformed
           seleccionarAsiento(13, A13);      

    }//GEN-LAST:event_A13ActionPerformed

    private void A12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A12ActionPerformed
           seleccionarAsiento(12, A12);      

    }//GEN-LAST:event_A12ActionPerformed

    private void A11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A11ActionPerformed
           seleccionarAsiento(11, A11);      

    }//GEN-LAST:event_A11ActionPerformed

    private void A9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A9ActionPerformed
          seleccionarAsiento(9, A9);      

    }//GEN-LAST:event_A9ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
            seleccionarAsiento(6, A6);      


    }//GEN-LAST:event_A6ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
           seleccionarAsiento(4, A4);      

    }//GEN-LAST:event_A4ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
    seleccionarAsiento(2, A2);     
    }//GEN-LAST:event_A2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
          seleccionarAsiento(3, A3);      

    }//GEN-LAST:event_A3ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
    seleccionarAsiento(1, A1);      

    }//GEN-LAST:event_A1ActionPerformed

    private void A8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A8ActionPerformed
          seleccionarAsiento(8, A8);      

    }//GEN-LAST:event_A8ActionPerformed

    private void A7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A7ActionPerformed
           seleccionarAsiento(7, A7);      

    }//GEN-LAST:event_A7ActionPerformed

    private void A10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A10ActionPerformed
          seleccionarAsiento(10, A10);      

    }//GEN-LAST:event_A10ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
       seleccionarAsiento(5, A5);      


    }//GEN-LAST:event_A5ActionPerformed

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
            java.util.logging.Logger.getLogger(FrAsiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrAsiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrAsiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrAsiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrAsiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A10;
    private javax.swing.JButton A11;
    private javax.swing.JButton A12;
    private javax.swing.JButton A13;
    private javax.swing.JButton A14;
    private javax.swing.JButton A15;
    private javax.swing.JButton A16;
    private javax.swing.JButton A17;
    private javax.swing.JButton A18;
    private javax.swing.JButton A19;
    private javax.swing.JButton A2;
    private javax.swing.JButton A20;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton A6;
    private javax.swing.JButton A7;
    private javax.swing.JButton A8;
    private javax.swing.JButton A9;
    private javax.swing.JButton btnAsiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtPreResultado;
    // End of variables declaration//GEN-END:variables
}
