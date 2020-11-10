
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
        filas.requestFocus();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        filas = new javax.swing.JTextField();
        crear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        columnas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Método simplex");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel1.setText("Filas");

        filas.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        filas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filasActionPerformed(evt);
            }
        });

        crear.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        crear.setText("Generar matriz");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });

        jScrollPane1.setForeground(new java.awt.Color(0, 102, 204));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        text.setEditable(false);
        text.setColumns(20);
        text.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        text.setRows(5);
        text.setEnabled(false);
        jScrollPane5.setViewportView(text);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel8.setText("Método Simplex");

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel5.setText("columnas");

        columnas.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        columnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel2.setText("Resultado:");

        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jButton2.setText("Limpiar");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(columnas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(filas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(crear)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton2)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(filas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(columnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(crear)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("© 2020 - Realizado por: Santiago Carrasco, Pablo Martínez, Sebastián Medina, Diego Orellana");

        jMenu2.setText("Ayuda");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Acerca de...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filasActionPerformed

    }//GEN-LAST:event_filasActionPerformed
    
    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        if (filas.getText().matches("[1-9][0-9]*")) {
            if (columnas.getText().matches("[1-9][0-9]*")) {
                jButton1.setEnabled(true);
                filas.setEnabled(false);
                columnas.setEnabled(false);
                jButton1.requestFocus();
                DefaultTableModel model = (DefaultTableModel) tabla.getModel();
                int fila = Integer.parseInt(filas.getText());
                int columna = Integer.parseInt(columnas.getText());
                int columna1 = columna;
                for (int i = 0; i < columna; i++) {
                    model.addColumn("x" + (i + 1));
                }
                columna = fila + columna;

                model.setRowCount(fila);
                model.setColumnCount(columna);
                for (int j = columna1; j < columna; j++) {
                    tabla.setValueAt(0, 0, j);
                }
                int i1 = 1, j1 = columna1;
                for (int i = 1; i < fila; i++) {
                    for (int j = columna1; j < columna - 1; j++) {
                        if (i1 == i && j1 == j) {
                            tabla.setValueAt(1, i, j);
                        } else {
                            tabla.setValueAt(0, i, j);
                        }
                    }
                    j1++;
                    i1++;
                }
            } else {
                JOptionPane.showMessageDialog(this, "El valor ingresado en las columnas es incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "El valor ingresado en las filas es incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_crearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        text.setText("");
        text.setEnabled(true);

        jButton2.setEnabled(true);
        jButton2.requestFocus();
        tabla.editCellAt(0, 0);
        text.append("Resolución por el Método Simplex\n");
        DecimalFormat l = new DecimalFormat("0.00");
        int fila = Integer.parseInt(filas.getText());
        int columna = Integer.parseInt(columnas.getText());
        int columna1 = columna;
        columna = fila + columna;
        double v[][] = new double[fila][columna];
        int y1 = 1;
        for (int i = 0; i < columna; i++) {
            if (i < columna1) {
                text.append("\t x" + (i + 1));
            } else if (i >= columna1 && i < columna - 1) {
                text.append("\t d" + (y1));
                y1++;

            } else {
                text.append("\t R");

            }
        }
        text.append("\n");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                v[i][j] = Double.parseDouble(tabla.getValueAt(i, j).toString());
            }
        }

        for (int i = 0; i < fila; i++) {
            if (i != 0) {
                text.append("F" + i);
            }
            for (int j = 0; j < columna; j++) {
                text.append("\t " + l.format(v[i][j]));
            }
            text.append("\n");
        }
        text.append("\n\n");
        String v2[] = new String[fila];
        int v3[] = new int[fila];
        int v4[] = new int[fila];
        int co = 0;
        while (true) {
            if (co == columna1) {
                break;
            }

            int f = 0, c = 0;
            double negativo = 0;
            for (int i = 0; i < columna1; i++) {
                if (v[0][i] < negativo) {
                    negativo = v[0][i];
                    c = i;
                }
            }
            text.append("El máximo negativo es: \n");
            text.append(negativo + "\nLa columna es: \n");
            for (int i = 0; i < fila; i++) {
                text.append(" " + v[i][c] + "\n");
            }
            text.append("\n");
            text.append("\nDividiendo con la columna\n");
            double menor = 0;
            double v1[] = new double[fila - 1];
            int h = 0;
            for (int i = 1; i < fila; i++) {
                v1[h] = v[i][columna - 1] / v[i][c];
                text.append(" " + v[i][columna - 1] + " / " + v[i][c] + " = " + v1[h] + " \n");
                h++;
            }
            menor = v1[0];
            for (int i = 0; i < fila - 1; i++) {
                if (v1[i] <= menor) {
                    menor = v1[i];
                    f = i + 1;
                }
            }
            text.append("El menor número de la division es: " + menor + "\n");
            double pivo = v[f][c];
            text.append("El elemento pivote es:" + pivo);

            text.append("\nProceso de convertir el pivote en 1\nDividiendo toda la fila con el pivote\n");
            for (int i = 0; i < columna; i++) {
                double va  = v[f][i];
                v[f][i] = v[f][i] / pivo;
                text.append("" + va  + " / " + l.format(pivo) + " = " + l.format(v[f][i]) + "\n");
            }
            for (int i = 1; i < fila; i++) {
                if (i == f) {
                    v2[i] = "F" + (c + 1);
                    v3[i] = c + 1;
                    v4[i] = i;
                }
                if (v3[i] <= 0) {

                    v2[i] = "d" + (i);
                }
            }

            text.append("\n\n Proceso \n ");
            for (int i = 0; i < fila; i++) {
                if (i != f) {
                    text.append("Convertiendo la columna del pivote en cero, en la fila " + (i + 1) + "\n\n");

                    double guar = 0;
                    guar = -v[i][c];
                    for (int j = 0; j < columna; j++) {
                        double vaa = v[i][j];
                        v[i][j] = guar * v[f][j] + v[i][j];
                        text.append(" " + l.format(guar) + "*" + l.format(v[f][j]) + " + " + l.format(vaa) + " = " + l.format(v[i][j]) + "\n");
                    }
                }
            }
            co = 0;
            for (int i = 0; i < columna1; i++) {
                if (v[0][i] >= 0) {
                    co++;
                }
            }
            y1 = 1;
            for (int i = 0; i < columna; i++) {
                if (i < columna1) {
                    text.append("\t x" + (i + 1));
                } else if (i >= columna1 && i < columna - 1) {
                    text.append("\t d" + (y1));
                    y1++;

                } else {
                    text.append("\t R");

                }
            }
            text.append("\n");

            for (int i = 0; i < fila; i++) {
                if (i != 0) {
                    text.append(v2[i]);
                }
                for (int j = 0; j < columna; j++) {
                    text.append("\t " + l.format(v[i][j]));
                }
                text.append("\n");
            }
            text.append("\n\n");

        }
        int y2 = 0;
        text.append("RESULTADO\n");
        text.append("z = " + v[0][columna - 1] + "\n");
        for (int i = 1; i < fila; i++) {
            char m1[] = v2[i].toCharArray();
            if (m1[0] == 'x') {
                text.append(v2[i] + " = " + v[v4[i]][columna - 1] + "\n");
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void columnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnasActionPerformed

    }//GEN-LAST:event_columnasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        filas.setEnabled(true);
        filas.requestFocus();
        columnas.setEnabled(true);
        crear.setEnabled(true);
        jButton1.setEnabled(false);
        text.setText("");
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(this, "© 2020 - Realizado por: Santiago Carrasco, Pablo Martínez, Sebastián Medina, Diego Orellana", "Acerca de", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField columnas;
    private javax.swing.JButton crear;
    private javax.swing.JTextField filas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tabla;
    private javax.swing.JTextArea text;
    // End of variables declaration//GEN-END:variables
}
