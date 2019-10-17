/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Presentacion;

import Logica.fUsuario;
import blackboard.Persona;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author María Zapata
 */
public class JFUsuario extends javax.swing.JFrame {

    /** Creates new form JFUsuario */
    public JFUsuario() 
    {
        initComponents();
        mostrar("");
        inhabilitar();
        
    }
    private String accion="guardar";
    
    void inhabilitar()
    {
        //Inhabilita los campos para que no se pueda digitar información
        txtCod.setEnabled(false);
        comboBoxTU.setEnabled(false);
        txtNomUsuario.setEnabled(false);
        txtApUsuario.setEnabled(false);
        sEdad.setEnabled(false);
        txtCorreoUsuario.setEnabled(false);
        txtCedulaUsuario.setEnabled(false);
        txtContraseña.setEnabled(false);
        txtCContraseña.setEnabled(false);
        bEliminar.setEnabled(false);
        bGuardar.setEnabled(false);
        txtCod.setText("");
        txtNomUsuario.setText("");
        txtApUsuario.setText("");
        txtCorreoUsuario.setText("");
        txtCedulaUsuario.setText("");
        txtContraseña.setText("");
        sEdad.setValue(0);
    }
    
    void habilitar()
    {
        //Habilita los campos para que se pueda digitar información
        txtCod.setEnabled(true);
        comboBoxTU.setEnabled(true);
        txtNomUsuario.setEnabled(true);
        txtApUsuario.setEnabled(true);
        sEdad.setEnabled(true);
        txtCorreoUsuario.setEnabled(true);
        txtCedulaUsuario.setEnabled(true);
        txtContraseña.setEnabled(true);
        txtCContraseña.setEnabled(true);
        bEliminar.setEnabled(true);
        bGuardar.setEnabled(true);
        txtCod.setText("");
        txtNomUsuario.setText("");
        txtApUsuario.setText("");
        txtCorreoUsuario.setText("");
        txtCedulaUsuario.setText("");
        txtContraseña.setText("");
        txtCContraseña.setText("");
        sEdad.setValue(0);
    }
    
    void mostrar(String buscar)
    {
        try
        {
          DefaultTableModel modelo;
          fUsuario func= new fUsuario();
          //Llama la función que devuelve una tabla
          modelo= func.mostrar(buscar);
          //Esa tabla se la asigna a nuestra tabla del JFrame
          tUsuarios.setModel(modelo);
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
        txtCod = new javax.swing.JTextField();
        txtNomUsuario = new javax.swing.JTextField();
        txtCorreoUsuario = new javax.swing.JTextField();
        txtCedulaUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboBoxTU = new javax.swing.JComboBox<>();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCContraseña = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtApUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sEdad = new javax.swing.JSpinner();
        bEliminar = new javax.swing.JButton();
        bNuevo = new javax.swing.JButton();
        bGuardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tUsuarios = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        lbTotalRegistros = new javax.swing.JLabel();
        bMostrarTodo = new javax.swing.JButton();
        bAtras2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(30, 160, 250));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("AGREGAR USUARIO");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });

        txtNomUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomUsuarioActionPerformed(evt);
            }
        });

        txtCorreoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoUsuarioActionPerformed(evt);
            }
        });

        txtCedulaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo de usuario:");

        jLabel7.setText("Contraseña:");

        comboBoxTU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Profesor", "Docente auxiliar" }));
        comboBoxTU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTUActionPerformed(evt);
            }
        });

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombres:");

        jLabel8.setText("Confirme contraseña:");

        jLabel4.setText("Correo:");

        txtCContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCContraseñaActionPerformed(evt);
            }
        });

        jLabel5.setText("Cédula:");

        jLabel9.setText("Código:");

        jLabel1.setText("Apellidos:");

        txtApUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApUsuarioActionPerformed(evt);
            }
        });

        jLabel6.setText("Edad");

        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de usuarios"));

        tUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        tUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tUsuarios);

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

        lbTotalRegistros.setText("Total de registros");

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(bMostrarTodo)
                        .addGap(0, 138, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(bAtras2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTotalRegistros)
                .addGap(106, 106, 106))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar)
                    .addComponent(bMostrarTodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTotalRegistros)
                    .addComponent(bAtras2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel11.setText("NOTA:");

        jLabel12.setText("Para eliminar sólo necesita digitar el código");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCorreoUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCedulaUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(bGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(bEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboBoxTU, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNomUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comboBoxTU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNomUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCorreoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bEliminar)
                            .addComponent(bNuevo)
                            .addComponent(bGuardar)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxTUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTUActionPerformed
       comboBoxTU.transferFocus();
    }//GEN-LAST:event_comboBoxTUActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        txtContraseña.transferFocus();
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        //Botón que solicita habilitar los campos para ingresar un nuevo usuario
        habilitar();
        bGuardar.setText("Guardar");
        accion="guardar";
    }//GEN-LAST:event_bNuevoActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        //Antes de guardar o editar, válida que todos los campos estén digitados de 
        //manera correcta
        if( txtCod.getText().length()==0|| txtNomUsuario.getText().length()==0||
            txtApUsuario.getText().length()==0||txtCorreoUsuario.getText().length()==0
            ||txtCedulaUsuario.getText().length()==0||txtContraseña.getText().length()==0)
        {
            JOptionPane.showConfirmDialog(rootPane, "Debe ingresar todos los "
                    + "campos");
          
        }else if (!(txtContraseña.getText().equals(txtCContraseña.getText())))
        {
            JOptionPane.showMessageDialog(rootPane, "Las contraseñas no "
                    + "coinciden");
        }else
        {
            try
            {
                //Conectar la clase persona con la clase de conexion, con la base de
                //datos, con la interfaz
                Persona dts= new Persona();
                fUsuario func= new fUsuario();
                //Obtener los datos de los txt y asignarselos a la instancia dts de la
                //clase Persona
                dts.setCodigo(Integer.parseInt(txtCod.getText()));
                int seleccionado= comboBoxTU.getSelectedIndex();
                dts.setTipoUsuario((String)comboBoxTU.getItemAt(seleccionado));
                dts.setNombres(txtNomUsuario.getText());
                dts.setApellidos(txtApUsuario.getText());
                int value = (Integer) sEdad.getValue(); 
                dts.setEdad(value);
                dts.setCorreo(txtCorreoUsuario.getText());
                dts.setContraseña(txtContraseña.getText());
                dts.setCedula(Integer.parseInt(txtCedulaUsuario.getText()));
                

                //Pasa algo dependiendo de si el botón tiene la acción de guardar o 
                //editar
                if (accion.equals("guardar"))
                {
                    //La función insertar es de tipo booleano, por eso es que se 
                    //coloca como instructivo del if. Si el booleano es del tipo 
                    //true entonces se prosigue la acción
                    if (func.insertar(dts))
                    {
                        JOptionPane.showMessageDialog(rootPane, "El usuario fue registrado"
                                + " satisfactoriamente");
                        mostrar("");
                        inhabilitar();
                    }

                }
                else if(accion.equals("editar"))
                {
                   dts.setCodigo(Integer.parseInt(txtCod.getText()));

                   if (func.editar(dts))
                   {
                       JOptionPane.showMessageDialog(rootPane, "El usuario fue editado"
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

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        if (!txtCod.getText().equals(""))
        {
            int confirm=JOptionPane.showConfirmDialog(rootPane, "¿Está seguro de"
                    + " eliminar al usuario?");
            if (confirm==0)
            {
             Persona dts= new Persona();
             fUsuario func= new fUsuario();   
             dts.setCodigo(Integer.parseInt(txtCod.getText()));
             func.eliminar(dts);
             mostrar("");
             inhabilitar();
             
            }
        }
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        mostrar(txtBuscar.getText());
    }//GEN-LAST:event_bBuscarActionPerformed

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        txtCod.transferFocus();
    }//GEN-LAST:event_txtCodActionPerformed

    private void txtNomUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomUsuarioActionPerformed
        txtNomUsuario.transferFocus();
    }//GEN-LAST:event_txtNomUsuarioActionPerformed

    private void txtApUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApUsuarioActionPerformed
        txtApUsuario.transferFocus();
    }//GEN-LAST:event_txtApUsuarioActionPerformed

    private void txtCorreoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoUsuarioActionPerformed
        txtCorreoUsuario.transferFocus();
    }//GEN-LAST:event_txtCorreoUsuarioActionPerformed

    private void txtCedulaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaUsuarioActionPerformed
        txtCedulaUsuario.transferFocus();
    }//GEN-LAST:event_txtCedulaUsuarioActionPerformed

    private void txtCContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCContraseñaActionPerformed
        txtCContraseña.transferFocus();
    }//GEN-LAST:event_txtCContraseñaActionPerformed

    private void tUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tUsuariosMouseClicked
        bGuardar.setText("Editar");
        habilitar();
        bEliminar.setEnabled(true);
        accion="editar";
        
        int fila= tUsuarios.rowAtPoint(evt.getPoint());
        //Poner los datos que estaban en la fila dentro de la caja de texto
        //nuevamente
        
        txtCod.setText(tUsuarios.getValueAt(fila, 0).toString());
        txtNomUsuario.setText(tUsuarios.getValueAt(fila, 1).toString());
        txtApUsuario.setText(tUsuarios.getValueAt(fila, 2).toString());
        txtCedulaUsuario.setText(tUsuarios.getValueAt(fila, 4).toString());
        txtCorreoUsuario.setText(tUsuarios.getValueAt(fila, 5).toString());
        txtContraseña.setText(tUsuarios.getValueAt(fila, 6).toString());
        txtCContraseña.setText(tUsuarios.getValueAt(fila, 6).toString());
        comboBoxTU.setSelectedItem(tUsuarios.getValueAt(fila, 7).toString());
        //En este caso, el spinner contiene un dato de tipo entero, entonces 
        //primero hay que pasar los datos a String y después a Integer, ya que 
        //no se puede de manera directa.
        sEdad.setValue(Integer.parseInt(tUsuarios.getValueAt(fila, 3).toString()));
        
        
        
        
    }//GEN-LAST:event_tUsuariosMouseClicked

    private void bMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarTodoActionPerformed
        inhabilitar();
        mostrar("");
    }//GEN-LAST:event_bMostrarTodoActionPerformed

    private void bAtras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtras2ActionPerformed
        //Devolverse a la ventana de las opciones del administrador
        JFGrupos ventana = new JFGrupos();
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
            java.util.logging.Logger.getLogger(JFUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFUsuario().setVisible(true);
                new JFBlackboard().setVisible(true);
                
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
    private javax.swing.JComboBox<String> comboBoxTU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTotalRegistros;
    private javax.swing.JSpinner sEdad;
    private javax.swing.JTable tUsuarios;
    private javax.swing.JTextField txtApUsuario;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JPasswordField txtCContraseña;
    private javax.swing.JTextField txtCedulaUsuario;
    private javax.swing.JTextField txtCod;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreoUsuario;
    private javax.swing.JTextField txtNomUsuario;
    // End of variables declaration//GEN-END:variables

}
