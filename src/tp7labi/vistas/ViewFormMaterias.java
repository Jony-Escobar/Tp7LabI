
package tp7labi.vistas;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import tp7labi.Colegio;
import tp7labi.Materia;

public class ViewFormMaterias extends javax.swing.JInternalFrame {
    
    public ViewFormMaterias() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfIdMateria = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfAnio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbGuardarCambios = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de Materias");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Código de materia:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Nombre de materia:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Año que pertenece:");

        jLabel5.setText("[solo numeros]");

        jbGuardarCambios.setText("Guardar cambios");
        jbGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarCambiosActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel6.setText("[Para guardar cambios ingresar el id de materia a modificar]");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jbGuardarCambios)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtfIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtfAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel5))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardarCambios)
                    .addComponent(jbNuevo)
                    .addComponent(jbSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed
    
    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed

        try {
            
            if(jtfIdMateria.getText().equals("")){
                
                JOptionPane.showMessageDialog(this, "Error. Por favor ingrese un ID.");
                jtfIdMateria.requestFocus();
                
            } else if(jtfNombre.getText().equals("")){
                
                JOptionPane.showMessageDialog(this, "Error. Por favor ingrese un Nombre.");
                jtfNombre.requestFocus();
                
            } else if(jtfAnio.getText().equals("")){
                
                JOptionPane.showMessageDialog(this, "Error. Por favor ingrese un Año.");
                jtfAnio.requestFocus();
                
            } else if(!Colegio.getMaterias().containsKey(Integer.parseInt(jtfIdMateria.getText()))){
                
                Materia m = new Materia(Integer.parseInt(jtfIdMateria.getText()), jtfNombre.getText(), Integer.parseInt(jtfAnio.getText()));
                Colegio.getMaterias().put(m.getIdMateria(), m);
                JOptionPane.showMessageDialog(this, "Materia cargada correctamente.");
                jtfIdMateria.setText("");
                jtfNombre.setText("");
                jtfAnio.setText("");
                jtfIdMateria.requestFocus();
                
            } else{
                
                JOptionPane.showMessageDialog(this, "El id ya se encuentra cargado en sistema.");
                jtfIdMateria.setText("");
                jtfIdMateria.requestFocus();
                
            }
   
        } catch (HeadlessException | NumberFormatException e) {
            
            char a;
            
            for(int i = 0; i < jtfIdMateria.getText().length(); i++){
                
                a = jtfIdMateria.getText().charAt(i);
                
                if(!(a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9' || a == '0')){
                    JOptionPane.showMessageDialog(this, "ID No valido. Solo numeros.");
                    jtfIdMateria.setText("");
                    jtfIdMateria.requestFocus();
                }
                
            }
            
            for(int i = 0; i < jtfAnio.getText().length(); i++){
                
                a = jtfAnio.getText().charAt(i);
                
                if(!(a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9' || a == '0')){
                    JOptionPane.showMessageDialog(this, "Año No valido. Solo numeros.");
                    jtfAnio.setText("");
                    jtfAnio.requestFocus();
                }
                
            }
 
        }

    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarCambiosActionPerformed
        
        try {
            
            if(jtfIdMateria.getText().equals("")){
                
                JOptionPane.showMessageDialog(this, "Error. Por favor ingrese un ID.");
                jtfIdMateria.requestFocus();
                
            } else if(jtfNombre.getText().equals("")){
                
                JOptionPane.showMessageDialog(this, "Error. Por favor ingrese un Nombre.");
                jtfNombre.requestFocus();
                
            } else if(jtfAnio.getText().equals("")){
                
                JOptionPane.showMessageDialog(this, "Error. Por favor ingrese un Año.");
                jtfAnio.requestFocus();
                
            } else if(Colegio.getMaterias().containsKey(Integer.parseInt(jtfIdMateria.getText()))){
                
                Materia m = new Materia(Integer.parseInt(jtfIdMateria.getText()), jtfNombre.getText(), Integer.parseInt(jtfAnio.getText()));
                Colegio.getMaterias().put(m.getIdMateria(), m);
                JOptionPane.showMessageDialog(this, "Cambios guardados correctamente.");
                jtfIdMateria.setText("");
                jtfNombre.setText("");
                jtfAnio.setText("");
                
            }else{
                
                JOptionPane.showMessageDialog(this, "ID no registrado, Pruebe con otro ID.");
                jtfIdMateria.setText("");
                jtfIdMateria.requestFocus();
                
            }
            
        } catch (Exception e) {
            
            char a;
            
            for(int i = 0; i < jtfIdMateria.getText().length(); i++){
                
                a = jtfIdMateria.getText().charAt(i);
                
                if(!(a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9' || a == '0')){
                    JOptionPane.showMessageDialog(this, "ID No valido. Solo numeros.");
                    jtfIdMateria.setText("");
                    jtfIdMateria.requestFocus();
                }
                
            }
            
            for(int i = 0; i < jtfAnio.getText().length(); i++){
                
                a = jtfAnio.getText().charAt(i);
                
                if(!(a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9' || a == '0')){
                    JOptionPane.showMessageDialog(this, "Año No valido. Solo numeros.");
                    jtfAnio.setText("");
                    jtfAnio.requestFocus();
                }
                
            }
            
        }
        
    }//GEN-LAST:event_jbGuardarCambiosActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbGuardarCambios;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtfAnio;
    private javax.swing.JTextField jtfIdMateria;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
