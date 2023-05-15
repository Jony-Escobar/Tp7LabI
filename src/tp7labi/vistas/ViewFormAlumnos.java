/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7labi.vistas;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import tp7labi.Alumno;
import tp7labi.Colegio;

/**
 *
 * @author Usuario
 */
public class ViewFormAlumnos extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewFormAlumnos
     */
    public ViewFormAlumnos() {
        initComponents();
        jtfLegajo.setText(Colegio.getAlumnos().size() + 1 + ""); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfLegajo = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de alumnos");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Legajo:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setText("[Solo números]  [Para modificar un alumno, colocar su legajo]");

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar Cambios");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfNombre))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbNuevo)
                .addGap(18, 18, 18)
                .addComponent(jbGuardar)
                .addGap(18, 18, 18)
                .addComponent(jbSalir))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbGuardar)
                    .addComponent(jbNuevo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        
        Alumno a = null;
        
        try {
            
            if(Colegio.getAlumnos().containsKey(Integer.parseInt(jtfLegajo.getText()))){
                
                JOptionPane.showMessageDialog(this, "El legajo ya existe. Ingrese un nuevo legajo.");
                jtfLegajo.setText("");
                jtfLegajo.requestFocus();
                
            } else if(jtfApellido.getText().equals("")){
                
                JOptionPane.showMessageDialog(this, "Falta completar Apellido.");
                jtfApellido.requestFocus();
                
            }else if(jtfNombre.getText().equals("")){
                
                JOptionPane.showMessageDialog(this, "Falta completar nombre.");
                jtfNombre.requestFocus();
                
            }else{
                
                a = new Alumno(Integer.parseInt(jtfLegajo.getText()), jtfApellido.getText(), jtfNombre.getText());
                Colegio.getAlumnos().put(Integer.parseInt(jtfLegajo.getText()), a);
                JOptionPane.showMessageDialog(this, "Alumno cargado correctamente.");
                jtfApellido.setText("");
                jtfNombre.setText("");
                
            }

        } catch (HeadlessException | NumberFormatException e) {
            
            JOptionPane.showMessageDialog(this, "Error. formato incorrecto de legajo. Solo números");
            jtfLegajo.setText("");
            jtfLegajo.requestFocus();
            
        } finally{
            
            jtfLegajo.setText(Colegio.getAlumnos().size() + 1 + "");
            
        }
        
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
        try {
            
            if(jtfLegajo.getText().equals("")){
                
                JOptionPane.showMessageDialog(this, "Error. Por favor ingrese un número de legajo.");
                jtfLegajo.requestFocus();
                
            } else if(jtfApellido.getText().equals("")){
                
                JOptionPane.showMessageDialog(this, "Error. Por favor ingrese un Apellido");
                jtfApellido.requestFocus();
                
            } else if(jtfNombre.getText().equals("")){
                
                JOptionPane.showMessageDialog(this, "Error. Por favor ingrese un Nombre.");
                jtfNombre.requestFocus();
                
            } else if(Colegio.getAlumnos().containsKey(Integer.parseInt(jtfLegajo.getText()))){
            
            Alumno a = new Alumno(Integer.parseInt(jtfLegajo.getText()), jtfApellido.getText(), jtfNombre.getText());
            Colegio.getAlumnos().put(Integer.parseInt(jtfLegajo.getText()), a);
            jtfLegajo.setText("");
            jtfApellido.setText("");
            jtfNombre.setText("");
            jtfLegajo.requestFocus();
            JOptionPane.showMessageDialog(this, "Cambios guardados correctamente.");
                
            } else{
                
                JOptionPane.showMessageDialog(this, "Legajo no encontrado. Por favor intente nuevamente.");
                jtfLegajo.requestFocus();
                jtfLegajo.setText("");
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this, "Error. formato incorrecto de legajo. Solo números");
            jtfLegajo.setText("");
            jtfLegajo.requestFocus();
            
        }
        
        
        
    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfLegajo;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
