package Proyecto.view;

import Proyecto.util.MyMath;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class CalculadoraView extends javax.swing.JFrame {

    private MyMath math = new MyMath();

    public CalculadoraView() {
        initComponents();

        txtExplicacion.setVisible(false);
        btnExplicar.setVisible(false);
        btnClear.setVisible(false);

        lblNum2.setVisible(false);
        txtNum2.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbnFactorial = new javax.swing.JRadioButton();
        rbnMcdMcm = new javax.swing.JRadioButton();
        rbnFibonacci = new javax.swing.JRadioButton();
        rbnNumeroPrimo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNum1 = new javax.swing.JLabel();
        lblNum2 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtExplicacion = new javax.swing.JTextArea();
        btnExplicar = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Operación a realizar"));

        buttonGroup1.add(rbnFactorial);
        rbnFactorial.setSelected(true);
        rbnFactorial.setText("Calculo Factorial");
        rbnFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnFactorialActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbnMcdMcm);
        rbnMcdMcm.setText("MCD y MCM ");
        rbnMcdMcm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnMcdMcmActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbnFibonacci);
        rbnFibonacci.setText("Serie de Fibonacci");
        rbnFibonacci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnFibonacciActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbnNumeroPrimo);
        rbnNumeroPrimo.setText("Número Primo");
        rbnNumeroPrimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnNumeroPrimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(rbnFactorial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnMcdMcm)
                .addGap(18, 18, 18)
                .addComponent(rbnFibonacci)
                .addGap(12, 12, 12)
                .addComponent(rbnNumeroPrimo)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnFactorial)
                    .addComponent(rbnMcdMcm)
                    .addComponent(rbnFibonacci)
                    .addComponent(rbnNumeroPrimo))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel1.setText("Colegio: \"Ángeles del cielo\"");

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel2.setText("Calculadora para verificar respuestas");

        lblNum1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lblNum1.setText("Ingrese el número 1=");

        lblNum2.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lblNum2.setText("Ingrese el número 2=");

        txtNum2.setText("0.0");

        btnCalcular.setBackground(new java.awt.Color(51, 153, 255));
        btnCalcular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        txtExplicacion.setEditable(false);
        txtExplicacion.setColumns(20);
        txtExplicacion.setRows(5);
        jScrollPane1.setViewportView(txtExplicacion);

        btnExplicar.setBackground(new java.awt.Color(0, 102, 204));
        btnExplicar.setFont(new java.awt.Font("SimSun-ExtG", 1, 14)); // NOI18N
        btnExplicar.setText("Explicar");
        btnExplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExplicarActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(51, 153, 255));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setText("Limpiar");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane2.setViewportView(txtResultado);

        btnSalir.setBackground(new java.awt.Color(204, 0, 0));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir del programa");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(219, 219, 219))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(btnExplicar)
                        .addGap(50, 50, 50)
                        .addComponent(btnClear))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(btnCalcular)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNum1)
                    .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNum2)
                    .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCalcular)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExplicar)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        nuevo();
    }//GEN-LAST:event_btnClearActionPerformed

    private void rbnMcdMcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnMcdMcmActionPerformed
        clear();
        
        lblNum2.setVisible(true);
        txtNum2.setVisible(true);
    }//GEN-LAST:event_rbnMcdMcmActionPerformed

    private void rbnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnFactorialActionPerformed
        clear();
    }//GEN-LAST:event_rbnFactorialActionPerformed

    private void rbnFibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnFibonacciActionPerformed
        clear();
    }//GEN-LAST:event_rbnFibonacciActionPerformed

    private void rbnNumeroPrimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnNumeroPrimoActionPerformed
        clear();
    }//GEN-LAST:event_rbnNumeroPrimoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        calcular();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnExplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExplicarActionPerformed
        explicar();
    }//GEN-LAST:event_btnExplicarActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExplicar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNum1;
    private javax.swing.JLabel lblNum2;
    private javax.swing.JRadioButton rbnAlumno;
    private javax.swing.JRadioButton rbnAlumno1;
    private javax.swing.JRadioButton rbnAlumno2;
    private javax.swing.JRadioButton rbnAlumno3;
    private javax.swing.JRadioButton rbnAlumno4;
    private javax.swing.JRadioButton rbnAlumno5;
    private javax.swing.JRadioButton rbnEmpleado;
    private javax.swing.JRadioButton rbnEmpleado1;
    private javax.swing.JRadioButton rbnEmpleado2;
    private javax.swing.JRadioButton rbnEmpleado3;
    private javax.swing.JRadioButton rbnEmpleado4;
    private javax.swing.JRadioButton rbnEmpleado5;
    private javax.swing.JRadioButton rbnFactorial;
    private javax.swing.JRadioButton rbnFibonacci;
    private javax.swing.JRadioButton rbnMcdMcm;
    private javax.swing.JRadioButton rbnNumeroPrimo;
    private javax.swing.JRadioButton rbnProfesor;
    private javax.swing.JRadioButton rbnProfesor1;
    private javax.swing.JRadioButton rbnProfesor2;
    private javax.swing.JRadioButton rbnProfesor3;
    private javax.swing.JRadioButton rbnProfesor4;
    private javax.swing.JRadioButton rbnProfesor5;
    private javax.swing.JTextArea txtExplicacion;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables

    private void clear() {

        txtNum1.setText("");
        txtNum2.setText("0.0");
        txtResultado.setText("");
        txtExplicacion.setText("");

        lblNum2.setVisible(false);
        txtNum2.setVisible(false);
        txtExplicacion.setVisible(false);
        btnExplicar.setVisible(false);
        btnClear.setVisible(false);

    }

    private void nuevo() {
        rbnFactorial.setSelected(true);
        clear();
    }

    private void calcular() {

        txtExplicacion.setVisible(true);
        btnExplicar.setVisible(true);
        btnClear.setVisible(true);

        String num1 = txtNum1.getText().trim();
        String num2 = txtNum2.getText().trim();

        if (num1.isEmpty() || num2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un número", "Error", JOptionPane.ERROR_MESSAGE);
            txtExplicacion.setVisible(false);
            btnExplicar.setVisible(false);
            btnClear.setVisible(false);
            return;
        }

        try {
            double n1 = Double.parseDouble(num1);
            double n2 = Double.parseDouble(num2);

            if (rbnFactorial.isSelected()) {
                txtResultado.setText("El resultado es: " + String.valueOf(math.calculoFactorial(Double.parseDouble(num1))));

            } else if (rbnMcdMcm.isSelected()) {
                txtResultado.setText("Metodo MCD MCM aun en proceso");
            } else if (rbnFibonacci.isSelected()) {
                txtResultado.setText("Metodo Fibonacci aun en proceso");
            } else if (rbnNumeroPrimo.isSelected()) {
                txtResultado.setText("Metodo primo aun en proceso");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Verifique que el número ingresado sea un número Valido", "Error", JOptionPane.ERROR_MESSAGE);
            txtExplicacion.setVisible(false);
            btnExplicar.setVisible(false);
            btnClear.setVisible(false);
            txtResultado.setText("");
        }

    }

    private void explicar() {

        if (rbnFactorial.isSelected()) {
            txtExplicacion.setText(math.explicacionResultadoFactorial(Double.parseDouble(txtNum1.getText())));

        } else if (rbnMcdMcm.isSelected()) {

        } else if (rbnFibonacci.isSelected()) {

        } else if (rbnNumeroPrimo.isSelected()) {

        }
    }
}
