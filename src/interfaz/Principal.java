/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author LUCYLEONOR
 */
import clases.*;
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNumerador1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtDenominador1 = new javax.swing.JTextField();
        txtNumerador2 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtDenominador2 = new javax.swing.JTextField();
        txtNumerador3 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtDenominador3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbOp = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        cmdCalcular = new javax.swing.JButton();
        cmdNumeroMixto = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEntero3 = new javax.swing.JTextField();
        txtNumerador4 = new javax.swing.JTextField();
        txtDenominador4 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtEntero1 = new javax.swing.JTextField();
        txtEntero2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNumerador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumerador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerador1KeyTyped(evt);
            }
        });
        jPanel1.add(txtNumerador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 40, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 40, 10));

        txtDenominador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDenominador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominador1KeyTyped(evt);
            }
        });
        jPanel1.add(txtDenominador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 40, -1));

        txtNumerador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumerador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerador2KeyTyped(evt);
            }
        });
        jPanel1.add(txtNumerador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 30, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 30, 10));

        txtDenominador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDenominador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominador2KeyTyped(evt);
            }
        });
        jPanel1.add(txtDenominador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 30, -1));

        txtNumerador3.setEditable(false);
        txtNumerador3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtNumerador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 40, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 40, 10));

        txtDenominador3.setEditable(false);
        txtDenominador3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtDenominador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 40, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 20, -1));

        cmbOp.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmbOp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicación", "División" }));
        cmbOp.setAutoscrolls(true);
        jPanel1.add(cmbOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 90, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Options", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel2.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, -1));

        cmdNumeroMixto.setText("Número Mixto");
        cmdNumeroMixto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNumeroMixtoActionPerformed(evt);
            }
        });
        jPanel2.add(cmdNumeroMixto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 110, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 110, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 130, 150));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Fraccionarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jLabel3.setText("-------");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 30, 20));

        txtEntero3.setEditable(false);
        txtEntero3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtEntero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 30, -1));

        txtNumerador4.setEditable(false);
        txtNumerador4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtNumerador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 40, -1));

        txtDenominador4.setEditable(false);
        txtDenominador4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtDenominador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 40, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 40, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText(">");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 10, 60));
        jPanel1.add(txtEntero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 30, -1));
        jPanel1.add(txtEntero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 30, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumerador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerador1KeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtNumerador1KeyTyped

    private void txtDenominador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominador1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtDenominador1KeyTyped

    private void txtNumerador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerador2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtNumerador2KeyTyped

    private void txtDenominador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominador2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtDenominador2KeyTyped

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed

        if (txtNumerador1.getText().trim().isEmpty() && txtNumerador2.getText().trim().isEmpty() && txtDenominador1.getText().trim().isEmpty() && txtDenominador2.getText().trim().isEmpty()) {
            Helper.mensaje(null, "Ingrese Los Datos", "Error", 2);
            txtNumerador1.requestFocusInWindow();

            txtNumerador1.setEnabled(true);
            txtNumerador2.setEnabled(true);
            txtDenominador1.setEnabled(true);
            txtDenominador2.setEnabled(true);

        } else if (txtNumerador1.getText().trim().isEmpty()) {
            Helper.mensaje(null, "Ingrese El Numerador 1", "Error", 2);
            txtNumerador1.requestFocusInWindow();

            txtNumerador1.setEnabled(true);
            txtNumerador2.setEnabled(true);
            txtDenominador1.setEnabled(true);
            txtDenominador2.setEnabled(true);

        } else if (txtNumerador2.getText().trim().isEmpty()) {
            Helper.mensaje(null, "Ingrese El Numerador 2", "Error", 2);
            txtNumerador2.requestFocusInWindow();

            txtNumerador1.setEnabled(true);
            txtNumerador2.setEnabled(true);
            txtDenominador1.setEnabled(true);
            txtDenominador2.setEnabled(true);

        } else if (txtDenominador1.getText().trim().isEmpty()) {
            Helper.mensaje(null, "Ingrese El Denominador 1", "Error", 2);
            txtDenominador1.requestFocusInWindow();

            txtNumerador1.setEnabled(true);
            txtNumerador2.setEnabled(true);
            txtDenominador1.setEnabled(true);
            txtDenominador2.setEnabled(true);

        } else if (txtDenominador2.getText().trim().isEmpty()) {
            Helper.mensaje(null, "Ingrese El Denominador 2", "Error", 2);
            txtDenominador2.requestFocusInWindow();

            txtNumerador1.setEnabled(true);
            txtNumerador2.setEnabled(true);
            txtDenominador1.setEnabled(true);
            txtDenominador2.setEnabled(true);

        } else {

            int op, n1, n2, d1, d2, e1,e2;
            NumeroMixto m1, m2, m3 = null;
            op = cmbOp.getSelectedIndex();

            n1 = Integer.parseInt(txtNumerador1.getText());
            n2 = Integer.parseInt(txtDenominador1.getText());
            d1 = Integer.parseInt(txtNumerador2.getText());
            d2 = Integer.parseInt(txtDenominador2.getText());
            e1 = Integer.parseInt(txtEntero1.getText());
            e2 = Integer.parseInt(txtEntero2.getText());

            try {
                m1 = new NumeroMixto(e1, n1, n2);
                m2 = new NumeroMixto(e2, d1 ,d2 );

                switch (op) {
                    case 0:
                    m3 = m1.Suma(m2);
                    break;
                    case 1:
                    m3 = m1.Resta(m2);
                    break;
                    case 2:
                    m3 = m1.Multiplicacion(m2);
                    break;
                    case 3:
                    m3 = m1.Division(m2);
                    break;
                    
                    

                }
                txtNumerador3.setText("" + m3.getNumerador());
                txtDenominador3.setText("" + m3.getDenominador());
                txtEntero3.setText(""+m3.getEntero());
            } catch (DenominadorCeroException e) {
                Helper.mensaje(null, "No se puede colocar 0 en el denominador", "Error", 2);

            }
            cmdNumeroMixto.setEnabled(true);
            txtNumerador1.setEnabled(false);
            txtNumerador2.setEnabled(false);
            txtDenominador1.setEnabled(false);
            txtDenominador2.setEnabled(false);
            txtNumerador3.setEnabled(true);
            txtDenominador3.setEnabled(true);
            txtEntero3.setEnabled(false);
            txtNumerador4.setEnabled(false);
            txtDenominador4.setEnabled(false);
        }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdNumeroMixtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNumeroMixtoActionPerformed

        if (Integer.parseInt(txtNumerador3.getText()) <= Integer.parseInt(txtDenominador3.getText())) {
            Helper.mensaje(null, "El Numerador Debe Ser Mayor Que El Denominador Para Pasarlo A Mixto", "Error", 2);
            cmdCalcular.setEnabled(true);
            cmdNumeroMixto.setEnabled(true);
            txtNumerador1.setEnabled(false);
            txtNumerador2.setEnabled(false);
            txtDenominador1.setEnabled(false);
            txtDenominador2.setEnabled(false);
            txtNumerador3.setEnabled(true);
            txtDenominador3.setEnabled(true);
            txtEntero3.setEnabled(false);
            txtNumerador4.setEnabled(false);
            txtDenominador4.setEnabled(false);

        } else {

            int Mod, Coc;

            Mod = Integer.parseInt(txtNumerador3.getText()) % Integer.parseInt(txtDenominador3.getText());
            Coc = Integer.parseInt(txtNumerador3.getText()) / Integer.parseInt(txtDenominador3.getText());

            txtNumerador4.setText("" + Mod);
            txtEntero3.setText("" + Coc);
            txtDenominador4.setText(txtDenominador3.getText());
            cmdCalcular.setEnabled(true);
            cmdNumeroMixto.setEnabled(true);
            txtNumerador1.setEnabled(false);
            txtNumerador2.setEnabled(false);
            txtDenominador1.setEnabled(false);
            txtDenominador2.setEnabled(false);
            txtNumerador3.setEnabled(false);
            txtDenominador3.setEnabled(false);
            txtEntero3.setEnabled(true);
            txtNumerador4.setEnabled(true);
            txtDenominador4.setEnabled(true);
        }
    }//GEN-LAST:event_cmdNumeroMixtoActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed

        txtNumerador1.setText("");
        txtNumerador2.setText("");
        txtNumerador3.setText("");
        txtDenominador1.setText("");
        txtDenominador2.setText("");
        txtDenominador3.setText("");
        txtEntero3.setText("");
        txtDenominador4.setText("");
        txtNumerador4.setText("");
        txtNumerador1.setEnabled(true);
        txtNumerador2.setEnabled(true);
        txtDenominador1.setEnabled(true);
        txtDenominador2.setEnabled(true);
        cmdNumeroMixto.setEnabled(false);
        txtNumerador3.setEnabled(false);
        txtDenominador3.setEnabled(false);
        cmdCalcular.setEnabled(true);
        txtEntero3.setEnabled(false);
        txtNumerador4.setEnabled(false);
        txtDenominador4.setEnabled(false);
        txtNumerador1.requestFocusInWindow();
        cmbOp.setEnabled(true);
        cmbOp.setSelectedIndex(0);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOp;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdNumeroMixto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txtDenominador1;
    private javax.swing.JTextField txtDenominador2;
    private javax.swing.JTextField txtDenominador3;
    private javax.swing.JTextField txtDenominador4;
    private javax.swing.JTextField txtEntero1;
    private javax.swing.JTextField txtEntero2;
    private javax.swing.JTextField txtEntero3;
    private javax.swing.JTextField txtNumerador1;
    private javax.swing.JTextField txtNumerador2;
    private javax.swing.JTextField txtNumerador3;
    private javax.swing.JTextField txtNumerador4;
    // End of variables declaration//GEN-END:variables
}
