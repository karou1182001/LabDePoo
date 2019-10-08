/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.fCurso;
import blackboard.Curso;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author María Zapata
 */
public class JFCurso extends javax.swing.JFrame {

    /**
     * Creates new form JFCurso
     */
    public JFCurso()
    {
        initComponents();
    }
    private String accion="guardar";
     void inhabilitar()
    {
        //Inhabilita los campos para que no se pueda digitar información
        txtCodCurso.setEnabled(false);
        txtNomCurso.setEnabled(false);
        txtDirCurso.setEnabled(false);
        txtProfDictan.setEnabled(false);
        bEliminar.setEnabled(false);
        bGuardar.setEnabled(false);
        txtCodCurso.setText("");
        txtNomCurso.setText("");
        txtDirCurso.setText("");
        txtProfDictan.setText("");
    }
    
      void habilitar()
    {
        //Inhabilita los campos para que no se pueda digitar información
        txtCodCurso.setEnabled(true);
        txtNomCurso.setEnabled(true);
        txtDirCurso.setEnabled(true);
        txtProfDictan.setEnabled(true);
        bEliminar.setEnabled(true);
        bGuardar.setEnabled(true);
        txtCodCurso.setText("");
        txtNomCurso.setText("");
        txtDirCurso.setText("");
        txtProfDictan.setText("");
    }
      
      void mostrar(String buscar)
    {
        try
        {
          DefaultTableModel modelo;
          fCurso func= new fCurso();
          //Llama la función que devuelve una tabla
          modelo= func.mostrar(buscar);
          //Esa tabla se la asigna a nuestra tabla del JFrame
          tCursos.setModel(modelo);
          //Al label total de registros le vamos a signar el valor obtenido en 
          //la subrutina mostrar de la clase fUsuario
          lbTotalRegistros.setText("Total de registros: "+ Integer.toString(func.totalRegistros));
        } catch (Exception e)
        {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDirCurso = new javax.swing.JTextField();
        bNuevo = new javax.swing.JButton();
        bGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCodCurso = new javax.swing.JTextField();
        txtNomCurso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtProfDictan = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCursos = new javax.swing.JTable();
        lbTotalRegistros = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        bMostrarTodo = new javax.swing.JButton();
        bAtras4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(30, 160, 250));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cursos");

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

        jLabel9.setText("Código del curso:");

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel11.setText("NOTA:");

        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Director del curso:");

        jLabel2.setText("Para eliminar sólo decesita el digitar el código");

        jLabel3.setText("Nombre del curso:");

        txtDirCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirCursoActionPerformed(evt);
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

        txtCodCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodCursoActionPerformed(evt);
            }
        });

        txtNomCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomCursoActionPerformed(evt);
            }
        });

        jLabel5.setText("Cant. profesores que lo dictan");

        txtProfDictan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfDictanActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de cursos"));

        tCursos.setModel(new javax.swing.table.DefaultTableModel(
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
        tCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tCursosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tCursos);

        lbTotalRegistros.setText("Total de registros");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        bBuscar.setText("Buscar por nombre");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        bMostrarTodo.setText("Todo");
        bMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrarTodoActionPerformed(evt);
            }
        });

        bAtras4.setText("Vamos a estudiante");
        bAtras4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtras4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bMostrarTodo)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(bAtras4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTotalRegistros)
                .addGap(71, 71, 71))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar)
                    .addComponent(bMostrarTodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTotalRegistros)
                    .addComponent(bAtras4))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProfDictan, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDirCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(bEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCodCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNomCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDirCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addComponent(txtProfDictan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bEliminar)
                            .addComponent(bGuardar)
                            .addComponent(bNuevo))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        if (!txtCodCurso.getText().equals(""))
        {
            int confirm=JOptionPane.showConfirmDialog(rootPane, "¿Está seguro de"
                + " eliminar al grupo?");
            if (confirm==0)
            {
                Curso dts= new Curso();
                fCurso func= new fCurso();
                dts.setCodCurso(txtCodCurso.getText());
                func.eliminar(dts);
                mostrar("");
                inhabilitar();

            }
        }
    }//GEN-LAST:event_bEliminarActionPerformed

    private void txtDirCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirCursoActionPerformed
        txtDirCurso.transferFocus();
    }//GEN-LAST:event_txtDirCursoActionPerformed

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        //Botón que solicita habilitar los campos para ingresar un nuevo usuario
        habilitar();
        bGuardar.setText("Guardar");
        accion="guardar";
    }//GEN-LAST:event_bNuevoActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        //Antes de guardar o editar, válida que todos los campos estén digitados de
        //manera correcta
        if( txtCodCurso.getText().length()==0|| txtNomCurso.getText().length()==0||
            txtDirCurso.getText().length()==0||txtProfDictan.getText().length()==0)
        {
            JOptionPane.showConfirmDialog(rootPane, "Debe ingresar todos los "
                + "campos");

        }else
        {
            try
            {
                //Conectar la clase persona con la clase de conexion, con la base de
                //datos, con la interfaz
                Curso dts= new Curso();
                fCurso func= new fCurso();
                //Obtener los datos de los txt y asignarselos a la instancia dts de la
                //clase Persona
                dts.setCodCurso(txtCodCurso.getText());
                dts.setNomCurso(txtNomCurso.getText());
                dts.setDirectorCurso(txtDirCurso.getText());
                dts.setCantProfesores(Integer.parseInt(txtProfDictan.getText()));

                //Pasa algo dependiendo de si el botón tiene la acción de guardar o
                //editar
                if (accion.equals("guardar"))
                {
                    //La función insertar es de tipo booleano, por eso es que se
                    //coloca como instructivo del if. Si el booleano es del tipo
                    //true entonces se prosigue la acción
                    if (func.insertar(dts))
                    {
                        JOptionPane.showMessageDialog(rootPane, "El grupo fue registrado"
                            + " satisfactoriamente");
                        mostrar("");
                        inhabilitar();
                    }

                }
                else if(accion.equals("editar"))
                {
                    dts.setCodCurso(txtCodCurso.getText());

                    if (func.editar(dts))
                    {
                        JOptionPane.showMessageDialog(rootPane, "El grupo fue editado"
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

    private void txtCodCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodCursoActionPerformed
        txtCodCurso.transferFocus();
    }//GEN-LAST:event_txtCodCursoActionPerformed

    private void txtNomCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomCursoActionPerformed
        txtNomCurso.transferFocus();
    }//GEN-LAST:event_txtNomCursoActionPerformed

    private void txtProfDictanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfDictanActionPerformed
        txtProfDictan.transferFocus();
    }//GEN-LAST:event_txtProfDictanActionPerformed

    private void tCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCursosMouseClicked
        bGuardar.setText("Editar");
        habilitar();
        bEliminar.setEnabled(true);
        accion="editar";

        int fila= tCursos.rowAtPoint(evt.getPoint());
        //Poner los datos que estaban en la fila dentro de la caja de texto
        //nuevamente

        txtCodCurso.setText(tCursos.getValueAt(fila, 0).toString());
        txtNomCurso.setText(tCursos.getValueAt(fila, 1).toString());
        txtDirCurso.setText(tCursos.getValueAt(fila, 2).toString());
        txtProfDictan.setText(tCursos.getValueAt(fila,3).toString());
    }//GEN-LAST:event_tCursosMouseClicked

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        mostrar(txtBuscar.getText());
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarTodoActionPerformed
        inhabilitar();
        mostrar("");
    }//GEN-LAST:event_bMostrarTodoActionPerformed

    private void bAtras4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtras4ActionPerformed
        //Devolverse a la ventana de las opciones del administrador
        JFEstudiante ventana = new JFEstudiante();
        ventana.setVisible(true);
        //Cerrar ventana actual
        this.dispose();
    }//GEN-LAST:event_bAtras4ActionPerformed

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
            java.util.logging.Logger.getLogger(JFCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtras2;
    private javax.swing.JButton bAtras3;
    private javax.swing.JButton bAtras4;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bMostrarTodo;
    private javax.swing.JButton bNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTotalRegistros;
    private javax.swing.JTable tCursos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodCurso;
    private javax.swing.JTextField txtDirCurso;
    private javax.swing.JTextField txtNomCurso;
    private javax.swing.JTextField txtProfDictan;
    // End of variables declaration//GEN-END:variables
}
