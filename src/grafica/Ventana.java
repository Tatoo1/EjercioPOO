/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package grafica;
import datose.Estudiante;
import datose.Calificaciones;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Generador;
import datose.Calificaciones;
import memoria.Memoria;
import datose.Materias;
import java.awt.Color;
/**
 *
 * @author JuanR
 */
public class Ventana extends javax.swing.JFrame {

    

    
    public Ventana() {
        initComponents();
        
        String codigo ="b";
        
        codigo = JOptionPane.showInputDialog("Introduce el codigo del estudiante");
       
            
        
    
        
      cjCodigo.setEnabled(false);
      cjMateria.setEnabled(false);
   
        
        
        
        
           
         
        
    
        
        
       // this.cargarNotas();
       
    
    
       
       cjCodigo.setText(codigo);
       
     
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btGuardar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        CodigoEs = new javax.swing.JLabel();
        NombreEs = new javax.swing.JLabel();
        cjCodigo = new javax.swing.JTextField();
        cjNombre = new javax.swing.JTextField();
        cjNota1 = new javax.swing.JTextField();
        cjNota2 = new javax.swing.JTextField();
        cjNota3 = new javax.swing.JTextField();
        cjNota4 = new javax.swing.JTextField();
        cjMateria = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CodigoEs1 = new javax.swing.JLabel();
        btGenerarMateria = new javax.swing.JButton();

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        btGuardar.setBackground(new java.awt.Color(204, 204, 255));
        btGuardar.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btSalir.setBackground(new java.awt.Color(204, 204, 255));
        btSalir.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        CodigoEs.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        CodigoEs.setText("Codigo del estudiante");

        NombreEs.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        NombreEs.setText("Nombre del estudiante:");

        cjCodigo.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        cjCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjCodigoActionPerformed(evt);
            }
        });
        cjCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cjCodigoKeyTyped(evt);
            }
        });

        cjNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjNombreActionPerformed(evt);
            }
        });

        cjNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjNota1ActionPerformed(evt);
            }
        });

        cjMateria.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        cjMateria.setForeground(new java.awt.Color(204, 204, 255));
        cjMateria.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cjMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjMateriaActionPerformed(evt);
            }
        });
        cjMateria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cjMateriaKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel7.setText("25%");

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel8.setText("35%");

        jLabel9.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel9.setText("15%");

        jLabel10.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel10.setText("25%");

        jLabel11.setFont(new java.awt.Font("Yu Gothic Medium", 3, 24)); // NOI18N
        jLabel11.setText(" Calculadora de notas finales");

        CodigoEs1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        CodigoEs1.setText("Materia:");

        btGenerarMateria.setBackground(new java.awt.Color(204, 204, 255));
        btGenerarMateria.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        btGenerarMateria.setText("Generar Materia");
        btGenerarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGenerarMateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CodigoEs)
                                    .addComponent(NombreEs)
                                    .addComponent(CodigoEs1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cjNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cjCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 74, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cjMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cjNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btGenerarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(145, 145, 145)
                                        .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cjNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cjNota2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cjNota4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreEs)
                            .addComponent(cjNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(btSalir))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cjNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(cjNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(CodigoEs1)
                            .addComponent(cjMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cjNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CodigoEs)
                            .addComponent(cjCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cjNota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGenerarMateria)
                    .addComponent(btGuardar))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cjNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjNombreActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        // TODO add your handling code here:
        generarNota();
        
        
        
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btSalirActionPerformed

    private void cjNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjNota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjNota1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cjCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjCodigoActionPerformed
        cjCodigo.setVisible(false);// TODO add your handling code here:
        cjCodigo.setEnabled(false);
    }//GEN-LAST:event_cjCodigoActionPerformed

    private void cjMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjMateriaActionPerformed
        // TODO add your handling code here:
        cjMateria.setEnabled(false);
    }//GEN-LAST:event_cjMateriaActionPerformed

    private void btGenerarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGenerarMateriaActionPerformed
       generarMateria(); // TODO add your handling code here:
    }//GEN-LAST:event_btGenerarMateriaActionPerformed

    private void cjMateriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cjMateriaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cjMateriaKeyTyped

    private void cjCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cjCodigoKeyTyped
        {
            
            
        }
       
    }//GEN-LAST:event_cjCodigoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CodigoEs;
    private javax.swing.JLabel CodigoEs1;
    private javax.swing.JLabel NombreEs;
    private javax.swing.JButton btGenerarMateria;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btSalir;
    private javax.swing.JTextField cjCodigo;
    private javax.swing.JTextField cjMateria;
    private javax.swing.JTextField cjNombre;
    private javax.swing.JTextField cjNota1;
    private javax.swing.JTextField cjNota2;
    private javax.swing.JTextField cjNota3;
    private javax.swing.JTextField cjNota4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

public void generarNota(){
    
    
      if(cjNota1.getText().isEmpty() || cjNota2.getText().isEmpty() || 
                cjNota3.getText().isEmpty() || cjNota4.getText().isEmpty() ||
                cjNombre.getText().isEmpty() || cjCodigo.getText().isEmpty() || cjMateria.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "Hay un campo vacio.");
            return ;
        }
            
        double num1= Double.parseDouble(cjNota1.getText());
        double num2= Double.parseDouble(cjNota2.getText());
        double num3= Double.parseDouble(cjNota3.getText());
        double num4= Double.parseDouble(cjNota4.getText());
        if (num1 < 0 || num1  > 5 ){
            JOptionPane.showMessageDialog(this, "Nota 1 no valida.");
            return;
        }
        if (num2 < 0 || num2  > 5 ){
            JOptionPane.showMessageDialog(this, "Nota 2 no valida.");
            return;
        }
        if (num3 < 0 || num3  > 5 ){
            JOptionPane.showMessageDialog(this, "Nota 3 no valida.");
            return;
        }
        if (num4 < 0 || num4  > 5 ){
            JOptionPane.showMessageDialog(this, "Nota 4 no valida.");
            return;
        }
        
          String nombre = cjNombre.getText();
        String codigo = cjCodigo.getText();
        String materia = cjMateria.getText();
      
      /* cjCodigo.setText("Codigo del estudiante:" +codigo); */
           
          
          Calificaciones a = new Calificaciones(num1, num2, num3, num4);
          a.obtenerNotaF();
         JOptionPane.showMessageDialog(this.btGuardar,"  La Nota final del estudiante  "  +nombre+   " de la materia " +materia+ "  con codigo   " +codigo+ "   es:  " + a.obtenerNotaF());
}

    private void generarMateria() {
      
        String materia = "";
         Materias b = new Materias();
         
         
        
        materia = JOptionPane.showInputDialog("Pertenece a la materia de: " );
        cjMateria.setText(materia);
    }

   
}
