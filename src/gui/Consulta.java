/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import codigo.Propietario;
import codigo.Vehiculo;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rodrigo
 */
public class Consulta extends javax.swing.JFrame {
    
    // Diálogo modal para dar de alta vehículos
    Registro altaVehiculo;
    
    /**
     * Creates new form Consulta
     */
    public Consulta() {
        initComponents();
        
        // Instanciar el formulario de registro. En principio no es visible.
        this.altaVehiculo = new Registro(this, true);
        
        // Cambiar la anchura de las columnas de la tabla, ya que por defecto hacía las 3 iguales. 
        // No he logrado hacerlo gráficamente con el Swing builder de NetBeans
        jTablaVehiculos.getColumnModel().getColumn(0).setPreferredWidth(150);
        jTablaVehiculos.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTablaVehiculos.getColumnModel().getColumn(2).setPreferredWidth(250);
        
        // Hacer visibles los bordes en las celdas de la tabla
        jTablaVehiculos.setShowVerticalLines(true);
        jTablaVehiculos.setShowHorizontalLines(true);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaVehiculos = new javax.swing.JTable();
        jExitButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jMostrarButton = new javax.swing.JButton();
        jRegistrarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTablaVehiculos.setBorder(new javax.swing.border.MatteBorder(null));
        jTablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Modelo", "Fecha entrada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablaVehiculos);

        jExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/shutdown.gif"))); // NOI18N
        jExitButton.setToolTipText("Salir de la aplicación");
        jExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitButtonActionPerformed(evt);
            }
        });

        jMostrarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/show-data.gif"))); // NOI18N
        jMostrarButton.setToolTipText("Mostrar vehículos dados de alta");
        jMostrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMostrarButtonActionPerformed(evt);
            }
        });

        jRegistrarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icon-garage.gif"))); // NOI18N
        jRegistrarButton.setToolTipText("Dar de alta nuevo vehículo");
        jRegistrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegistrarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jMostrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRegistrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jMostrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRegistrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jExitButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0); // Salimos de la aplicación
    }//GEN-LAST:event_jExitButtonActionPerformed

    private void jRegistrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegistrarButtonActionPerformed
        // TODO add your handling code here:
        // Al pulsar este botón se hará visible el diálogo modal para registrar el nuevo vehículo
        this.altaVehiculo.limpiarControles();
        this.altaVehiculo.setVisible(true);
    }//GEN-LAST:event_jRegistrarButtonActionPerformed

    private void jMostrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMostrarButtonActionPerformed
        // TODO add your handling code here:
        Propietario propietario; // Variable intermedia para el propietario de cada vehículo
        
        // Utilizamos un objeto de clase SimpleDateFormat para poner la fecha en español
        SimpleDateFormat formatoFecha = new SimpleDateFormat("EEEE d MMMM yyyy", new Locale("es", "ES"));
        String fecha;
        
        // Comprobar si existen vehículos en la lista del diálogo de registro
        if (this.altaVehiculo.getListaVehiculos().size() > 0) {
            DefaultTableModel model = (DefaultTableModel) this.jTablaVehiculos.getModel();
            model.setRowCount(0); // Con esto limpiamos la tabla antes de mostrar las filas
            
            // Mostrar tantas filas como objetos tiene la lista.
            for(Vehiculo vehiculo : this.altaVehiculo.getListaVehiculos()) {
                //propietario = vehiculo.getPropietario();
                fecha = formatoFecha.format(vehiculo.getFechaEntrada());
                //this.jTablaVehiculos.getModel().setValueAt(propietario.getNombre(), 1, 1);
                model.addRow(new Object[]{vehiculo.getMatricula(), vehiculo.getModelo(), fecha});
            }
            
         
        }
    }//GEN-LAST:event_jMostrarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Consulta consulta = new Consulta();
                consulta.setVisible(true);
                consulta.setLocationRelativeTo(null); // Para centrar en pantalla el JFrame
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jExitButton;
    private javax.swing.JButton jMostrarButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jRegistrarButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTablaVehiculos;
    // End of variables declaration//GEN-END:variables
}
