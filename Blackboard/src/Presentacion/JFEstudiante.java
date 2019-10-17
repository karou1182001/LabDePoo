/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.fCurso;
import Logica.fEstudiante;
import blackboard.Estudiante;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author María Zapata
 */
public class JFEstudiante extends javax.swing.JFrame {

    /**
     * Creates new form JFEstudiante
     */
    public JFEstudiante() 
    {
        initComponents();
    }
    private String accion="guardar";
    void inhabilitar()
    {
        //Inhabilita los campos para que no se pueda digitar información
        txtCodigoEst.setEnabled(false);
        txtCarrera.setEnabled(false);
        txtSemestre.setEnabled(false);
        cbAsis.setEnabled(false);
        bEliminar.setEnabled(false);
        bGuardar.setEnabled(false);
        txtCodigoEst.setText("");
        txtCarrera.setText("");
        txtSemestre.setText("");
    }
    void habilitar()
    {
        //Inhabilita los campos para que no se pueda digitar información
        txtCodigoEst.setEnabled(true);
        txtCarrera.setEnabled(true);
        txtSemestre.setEnabled(true);
        cbAsis.setEnabled(true);
        bEliminar.setEnabled(true);
        bGuardar.setEnabled(true);
        txtCodigoEst.setText("");
        txtCarrera.setText("");
        txtSemestre.setText("");
    }
    void mostrar(String buscar)
    {
        try
        {
          DefaultTableModel modelo;
          fEstudiante func= new fEstudiante();
          //Llama la función que devuelve una tabla
          modelo= func.mostrar(buscar);
          //Esa tabla se la asigna a nuestra tabla del JFrame
          tEstudiante.setModel(modelo);
          //Al label total de registros le vamos a signar el valor obtenido en 
          //la subrutina mostrar de la clase fUsuario
          lbTotalRegistros2.setText("Total de registros: "+ Integer.toString(func.totalRegistros));
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSemestre = new javax.swing.JTextField();
        bNuevo = new javax.swing.JButton();
        bGuardar = new javax.swing.JButton();
        txtCodigoEst = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCarrera = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tEstudiante = new javax.swing.JTable();
        lbTotalRegistros2 = new javax.swing.JLabel();
        txtBuscar2 = new javax.swing.JTextField();
        bBuscar2 = new javax.swing.JButton();
        bMostrarTodo2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cbAsis = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSemestreActionPerformed(evt);
            }
        });

        bNuevo.setText("Nuevo");
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });

        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });

        txtCodigoEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEstActionPerformed(evt);
            }
        });

        jLabel9.setText("Código del Estudiante:");

        txtCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarreraActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel11.setText("NOTA:");

        jLabel5.setText("Asistente de enseñanza");

        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText(" Semestre:");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de cursos"));

        tEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tEstudianteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tEstudiante);

        lbTotalRegistros2.setText("Total de registros");

        txtBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscar2ActionPerformed(evt);
            }
        });

        bBuscar2.setText("Buscar por nombre");
        bBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscar2ActionPerformed(evt);
            }
        });

        bMostrarTodo2.setText("Todo");
        bMostrarTodo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrarTodo2ActionPerformed(evt);
            }
        });

        jButton1.setText("<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txtBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bBuscar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bMostrarTodo2)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTotalRegistros2)
                .addGap(71, 71, 71))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar2)
                    .addComponent(bMostrarTodo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTotalRegistros2)
                    .addComponent(jButton1))
                .addGap(17, 17, 17))
        );

        jLabel2.setText("Para eliminar sólo decesita el digitar el código");

        jLabel3.setText("Carrera:");

        jPanel1.setBackground(new java.awt.Color(30, 160, 250));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Estudiantes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        cbAsis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Sí" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(cbAsis, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(bGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel9)
                                .addComponent(jLabel1)
                                .addComponent(jLabel5))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCodigoEst, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(bNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(533, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(cbAsis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bGuardar)
                        .addGap(48, 48, 48))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel2))
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtCodigoEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGap(25, 25, 25)
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bEliminar)
                        .addComponent(bNuevo))
                    .addGap(49, 49, 49)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSemestreActionPerformed
        txtSemestre.transferFocus();
    }//GEN-LAST:event_txtSemestreActionPerformed

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        //Botón que solicita habilitar los campos para ingresar un nuevo usuario
        habilitar();
        bGuardar.setText("Guardar");
        accion="guardar";
    }//GEN-LAST:event_bNuevoActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        //Antes de guardar o editar, válida que todos los campos estén digitados de
        //manera correcta
        if( txtCodigoEst.getText().length()==0|| txtCarrera.getText().length()==0||
            txtSemestre.getText().length()==0)
        {
            JOptionPane.showConfirmDialog(rootPane, "Debe ingresar todos los "
                + "campos");

        }else
        {
            try
            {
                //Conectar la clase persona con la clase de conexion, con la base de
                //datos, con la interfaz
                Estudiante dts= new Estudiante();
                fEstudiante func= new fEstudiante();
                //Obtener los datos de los txt y asignarselos a la instancia dts de la
                //clase Persona
                dts.setCodigoEst(Integer.parseInt(txtCodigoEst.getText()));
                dts.setCarrera(txtCarrera.getText());
                dts.setSemestre(Integer.parseInt(txtSemestre.getText()));
                int seleccionado= cbAsis.getSelectedIndex();
                dts.setTipoUsuario((String)cbAsis.getItemAt(seleccionado));
                //Pasa algo dependiendo de si el botón tiene la acción de guardar o
                //editar
                if (accion.equals("guardar"))
                {
                    //La función insertar es de tipo booleano, por eso es que se
                    //coloca como instructivo del if. Si el booleano es del tipo
                    //true entonces se prosigue la acción
                    JOptionPane.showMessageDialog(null, "AQUÍ");
                    if (func.insertar(dts))
                    {
                        JOptionPane.showMessageDialog(rootPane, "El estudiante fue registrado"
                            + " satisfactoriamente");
                        mostrar("");
                        inhabilitar();
                    }

                }
                else if(accion.equals("editar"))
                {
                    dts.setCodigoEst(Integer.parseInt(txtCodigoEst.getText()));

                    if (func.editar(dts))
                    {
                        JOptionPane.showMessageDialog(rootPane, "El estudiante fue editado"
                            + " satisfactoriamente");
                        mostrar("");
                        inhabilitar();
                    }
                }
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Hay algún dato mal digitado");
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_bGuardarActionPerformed

    private void txtCodigoEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEstActionPerformed
        txtCodigoEst.transferFocus();
    }//GEN-LAST:event_txtCodigoEstActionPerformed

    private void txtCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarreraActionPerformed
        txtCarrera.transferFocus();
    }//GEN-LAST:event_txtCarreraActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        if (!txtCodigoEst.getText().equals(""))
        {
            int confirm=JOptionPane.showConfirmDialog(rootPane, "¿Está seguro de"
                + " eliminar al estudiante?");
            if (confirm==0)
            {
                Estudiante dts= new Estudiante();
                fEstudiante func= new fEstudiante();
                dts.setCodigoEst(Integer.parseInt(txtCodigoEst.getText()));
                func.eliminar(dts);
                mostrar("");
                inhabilitar();

            }
        }
    }//GEN-LAST:event_bEliminarActionPerformed

    private void tEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tEstudianteMouseClicked
        bGuardar.setText("Editar");
        habilitar();
        bEliminar.setEnabled(true);
        accion="editar";

        int fila= tEstudiante.rowAtPoint(evt.getPoint());
        //Poner los datos que estaban en la fila dentro de la caja de texto
        //nuevamente

        txtCodigoEst.setText(tEstudiante.getValueAt(fila, 0).toString());
        txtCarrera.setText(tEstudiante.getValueAt(fila, 1).toString());
        txtSemestre.setText(tEstudiante.getValueAt(fila, 2).toString());
        cbAsis.setSelectedItem(tEstudiante.getValueAt(fila,3).toString());
    }//GEN-LAST:event_tEstudianteMouseClicked

    private void txtBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscar2ActionPerformed

    private void bBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscar2ActionPerformed
        mostrar(txtBuscar2.getText());
    }//GEN-LAST:event_bBuscar2ActionPerformed

    private void bMostrarTodo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarTodo2ActionPerformed
        inhabilitar();
        mostrar("");
    }//GEN-LAST:event_bMostrarTodo2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFBlackboard abrir=new JFBlackboard();
            abrir.setVisible(true); 
            this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar2;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bMostrarTodo2;
    private javax.swing.JButton bNuevo;
    private javax.swing.JComboBox<String> cbAsis;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbTotalRegistros2;
    private javax.swing.JTable tEstudiante;
    private javax.swing.JTextField txtBuscar2;
    private javax.swing.JTextField txtCarrera;
    private javax.swing.JTextField txtCodigoEst;
    private javax.swing.JTextField txtSemestre;
    // End of variables declaration//GEN-END:variables
}
