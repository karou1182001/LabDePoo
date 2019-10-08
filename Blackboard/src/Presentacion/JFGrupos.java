/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;


import Logica.fGrupos;
import blackboard.Grupo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author María Zapata
 */
public class JFGrupos extends javax.swing.JFrame {

    /**
     * Creates new form JFGrupos
     */
    public JFGrupos() 
    {
        initComponents();
    }
    private String accion="guardar";
    
    void inhabilitar()
    {
        //Inhabilita los campos para que no se pueda digitar información
        txtNrc.setEnabled(false);
        txtCantEst.setEnabled(false);
        txtCodCurso.setEnabled(false);
        txtProfesor.setEnabled(false);
        txtCodAsistEnseñanza.setEnabled(false);
        bEliminar.setEnabled(false);
        bGuardar.setEnabled(false);
        txtNrc.setText("");
        txtCantEst.setText("");
        txtCodCurso.setText("");
        txtProfesor.setText("");
        txtCodAsistEnseñanza.setText("");
    }
    
    void habilitar()
    {
        //Inhabilita los campos para que no se pueda digitar información
        txtNrc.setEnabled(true);
        txtCantEst.setEnabled(true);
        txtCodCurso.setEnabled(true);
        txtProfesor.setEnabled(true);
        txtCodAsistEnseñanza.setEnabled(true);
        bEliminar.setEnabled(true);
        bGuardar.setEnabled(true);
        txtNrc.setText("");
        txtCantEst.setText("");
        txtCodCurso.setText("");
        txtProfesor.setText("");
        txtCodAsistEnseñanza.setText("");
    }
    
    void mostrar(String buscar)
    {
        try
        {
          DefaultTableModel modelo;
          fGrupos func= new fGrupos();
          //Llama la función que devuelve una tabla
          modelo= func.mostrar(buscar);
          //Esa tabla se la asigna a nuestra tabla del JFrame
          tGrupos.setModel(modelo);
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
        bEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bNuevo = new javax.swing.JButton();
        bGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNrc = new javax.swing.JTextField();
        txtCantEst = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtProfesor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCodAsistEnseñanza = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCodCurso = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tGrupos = new javax.swing.JTable();
        lbTotalRegistros = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        bMostrarTodo = new javax.swing.JButton();
        bAtras2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(30, 160, 250));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Grupos");

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

        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        jLabel3.setText("cant. Estudiantes");

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

        jLabel4.setText("Cod. profesor");

        txtNrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNrcActionPerformed(evt);
            }
        });

        txtCantEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantEstActionPerformed(evt);
            }
        });

        jLabel5.setText("Cod. Asist. enseñanza");

        txtProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfesorActionPerformed(evt);
            }
        });

        jLabel9.setText("Nrc:");

        txtCodAsistEnseñanza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodAsistEnseñanzaActionPerformed(evt);
            }
        });

        jLabel1.setText("Cod. curso");

        txtCodCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodCursoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de grupos"));

        tGrupos.setModel(new javax.swing.table.DefaultTableModel(
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
        tGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tGruposMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tGrupos);

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

        bAtras2.setText("<<");
        bAtras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtras2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(bAtras2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTotalRegistros)
                .addGap(71, 71, 71))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(bMostrarTodo)
                .addGap(26, 26, 26))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar)
                    .addComponent(bMostrarTodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbTotalRegistros)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(bAtras2)
                        .addContainerGap())))
        );

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel11.setText("NOTA:");

        jLabel2.setText("Para eliminar sólo decesita el digitar el nrc.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
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
                            .addComponent(txtCodAsistEnseñanza, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNrc, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantEst, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(bGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtNrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCantEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCodAsistEnseñanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bNuevo)
                            .addComponent(bGuardar)
                            .addComponent(bEliminar))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        if (!txtNrc.getText().equals(""))
        {
            int confirm=JOptionPane.showConfirmDialog(rootPane, "¿Está seguro de"
                    + " eliminar al grupo?");
            if (confirm==0)
            {
             Grupo dts= new Grupo();
             fGrupos func= new fGrupos();   
             dts.setNrc(Integer.parseInt(txtNrc.getText()));
             func.eliminar(dts);
             mostrar("");
             inhabilitar();
             
            }
        }
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        //Botón que solicita habilitar los campos para ingresar un nuevo usuario
        habilitar();
        bGuardar.setText("Guardar");
        accion="guardar";
    }//GEN-LAST:event_bNuevoActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        //Antes de guardar o editar, válida que todos los campos estén digitados de 
        //manera correcta
        if( txtNrc.getText().length()==0|| txtCantEst.getText().length()==0||
            txtCodCurso.getText().length()==0||txtProfesor.getText().length()==0
            ||txtCodAsistEnseñanza.getText().length()==0)
        {
            JOptionPane.showConfirmDialog(rootPane, "Debe ingresar todos los "
                    + "campos");
          
        }else
        {
            try
            {
                //Conectar la clase persona con la clase de conexion, con la base de
                //datos, con la interfaz
                Grupo dts= new Grupo();
                fGrupos func= new fGrupos();
                //Obtener los datos de los txt y asignarselos a la instancia dts de la
                //clase Persona
                dts.setNrc(Integer.parseInt(txtNrc.getText()));
                dts.setCantEst(Integer.parseInt(txtCantEst.getText()));
                dts.setCodCurso(Integer.parseInt(txtCodCurso.getText()));
                dts.setCodigoProf(Integer.parseInt(txtProfesor.getText()));
                dts.setCodAsistEnseñanza(Integer.parseInt(txtCodAsistEnseñanza.getText()));
                

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
                   dts.setNrc(Integer.parseInt(txtNrc.getText()));

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

    private void txtNrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNrcActionPerformed
        txtNrc.transferFocus();
    }//GEN-LAST:event_txtNrcActionPerformed

    private void txtCantEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantEstActionPerformed
        txtCantEst.transferFocus();
    }//GEN-LAST:event_txtCantEstActionPerformed

    private void txtProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfesorActionPerformed
        txtProfesor.transferFocus();
    }//GEN-LAST:event_txtProfesorActionPerformed

    private void txtCodAsistEnseñanzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodAsistEnseñanzaActionPerformed
        txtCodAsistEnseñanza.transferFocus();
    }//GEN-LAST:event_txtCodAsistEnseñanzaActionPerformed

    private void txtCodCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodCursoActionPerformed
        txtCodCurso.transferFocus();
    }//GEN-LAST:event_txtCodCursoActionPerformed

    private void tGruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tGruposMouseClicked
        bGuardar.setText("Editar");
        habilitar();
        bEliminar.setEnabled(true);
        accion="editar";

        int fila= tGrupos.rowAtPoint(evt.getPoint());
        //Poner los datos que estaban en la fila dentro de la caja de texto
        //nuevamente

        txtNrc.setText(tGrupos.getValueAt(fila, 0).toString());
        txtCantEst.setText(tGrupos.getValueAt(fila, 1).toString());
        txtCodCurso.setText(tGrupos.getValueAt(fila, 2).toString());
        txtProfesor.setText(tGrupos.getValueAt(fila,3).toString());
        txtCodAsistEnseñanza.setText(tGrupos.getValueAt(fila, 4).toString());

    }//GEN-LAST:event_tGruposMouseClicked

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

    private void bAtras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtras2ActionPerformed
        //Devolverse a la ventana de las opciones del administrador
        JFCurso ventana = new JFCurso();
        ventana.setVisible(true);
        //Cerrar ventana actual
        this.dispose();
    }//GEN-LAST:event_bAtras2ActionPerformed

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
            java.util.logging.Logger.getLogger(JFGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFGrupos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtras2;
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
    private javax.swing.JTable tGrupos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantEst;
    private javax.swing.JTextField txtCodAsistEnseñanza;
    private javax.swing.JTextField txtCodCurso;
    private javax.swing.JTextField txtNrc;
    private javax.swing.JTextField txtProfesor;
    // End of variables declaration//GEN-END:variables
}
