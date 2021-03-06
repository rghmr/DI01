/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import codigo.Propietario;
import codigo.Vehiculo;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 *
 * @author rodrigo
 */
public class Registro extends javax.swing.JDialog {

    // Atributo de la clase Consulta: lista de vehículos
    private ArrayList<Vehiculo> listaVehiculos;

    /**
     *
     * @return the listaVehiculo
     */
    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }
    
    /**
     * Creates new form Registro
     * Este es el constructor del diálogo de registro.
     * Dentro del constructor instanciamos el atributo listaVehiculos.
     */
    public Registro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        super.setLocationRelativeTo(parent); // Para centrar el JDialog respecto al padre (JFrame)
        initComponents();
        
        // Instanciar la lista de vehículos
        this.listaVehiculos = new ArrayList<>();
    }

    Registro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPropietarioPanel = new javax.swing.JPanel();
        jNombreTextField = new javax.swing.JTextField();
        jNombreLabel = new javax.swing.JLabel();
        jApellidosLabel = new javax.swing.JLabel();
        jDNILabel = new javax.swing.JLabel();
        jApellidosTextField = new javax.swing.JTextField();
        jDNITextField = new javax.swing.JTextField();
        jTelefonoLabel = new javax.swing.JLabel();
        jTelefonoTextField = new javax.swing.JTextField();
        jFechaPanel = new javax.swing.JPanel();
        jDiaSpinner = new javax.swing.JSpinner();
        jBotonesPanel = new javax.swing.JPanel();
        jGuardarButton = new javax.swing.JButton();
        jCancelarButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jVehiculoPanel = new javax.swing.JPanel();
        jTipoVehiculoComboBox = new javax.swing.JComboBox();
        jTipoVehiculoLabel = new javax.swing.JLabel();
        jModeloLabel = new javax.swing.JLabel();
        jModeloTextField = new javax.swing.JTextField();
        jMatriculaLabel = new javax.swing.JLabel();
        jMatriculaTextField = new javax.swing.JTextField();
        jCamionPanel = new javax.swing.JPanel();
        jMercanciaCheckBox = new javax.swing.JCheckBox();
        jLongitudLabel = new javax.swing.JLabel();
        jLongitudTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPropietarioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Propietario"));
        jPropietarioPanel.setName(""); // NOI18N

        jNombreTextField.setColumns(10);
        jNombreTextField.setToolTipText("");

        jNombreLabel.setText("Nombre:");

        jApellidosLabel.setText("Apellidos:");

        jDNILabel.setText("DNI:");

        jApellidosTextField.setColumns(15);

        jDNITextField.setColumns(10);

        jTelefonoLabel.setText("Teléfono:");

        jTelefonoTextField.setColumns(10);

        javax.swing.GroupLayout jPropietarioPanelLayout = new javax.swing.GroupLayout(jPropietarioPanel);
        jPropietarioPanel.setLayout(jPropietarioPanelLayout);
        jPropietarioPanelLayout.setHorizontalGroup(
            jPropietarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPropietarioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPropietarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPropietarioPanelLayout.createSequentialGroup()
                        .addGroup(jPropietarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jApellidosLabel)
                            .addComponent(jNombreLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPropietarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jNombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jApellidosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPropietarioPanelLayout.createSequentialGroup()
                        .addGroup(jPropietarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTelefonoLabel)
                            .addComponent(jDNILabel))
                        .addGap(21, 21, 21)
                        .addGroup(jPropietarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDNITextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTelefonoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPropietarioPanelLayout.setVerticalGroup(
            jPropietarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPropietarioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPropietarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNombreLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPropietarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jApellidosLabel)
                    .addComponent(jApellidosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPropietarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDNILabel)
                    .addComponent(jDNITextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPropietarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTelefonoLabel)
                    .addComponent(jTelefonoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jFechaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Fecha entrada"));

        jDiaSpinner.setModel(new javax.swing.SpinnerDateModel());

        javax.swing.GroupLayout jFechaPanelLayout = new javax.swing.GroupLayout(jFechaPanel);
        jFechaPanel.setLayout(jFechaPanelLayout);
        jFechaPanelLayout.setHorizontalGroup(
            jFechaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFechaPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDiaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jFechaPanelLayout.setVerticalGroup(
            jFechaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFechaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDiaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jGuardarButton.setText("Guardar");
        jGuardarButton.setToolTipText("Guardar los datos");
        jGuardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarButtonActionPerformed(evt);
            }
        });

        jCancelarButton.setToolTipText("Salir sin guardar los datos");
        jCancelarButton.setLabel("Cancelar");
        jCancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jBotonesPanelLayout = new javax.swing.GroupLayout(jBotonesPanel);
        jBotonesPanel.setLayout(jBotonesPanelLayout);
        jBotonesPanelLayout.setHorizontalGroup(
            jBotonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBotonesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jGuardarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCancelarButton)
                .addContainerGap())
        );
        jBotonesPanelLayout.setVerticalGroup(
            jBotonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBotonesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jBotonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGuardarButton)
                    .addComponent(jCancelarButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jVehiculoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Vehículo"));

        jTipoVehiculoComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Coche", "Furgoneta", "Camión" }));
        jTipoVehiculoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTipoVehiculoComboBoxActionPerformed(evt);
            }
        });

        jTipoVehiculoLabel.setText("Tipo:");

        jModeloLabel.setText("Modelo:");

        jModeloTextField.setColumns(10);

        jMatriculaLabel.setText("Matrícula:");

        jMatriculaTextField.setColumns(10);

        jCamionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "Sólo para camiones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.lightGray));

        jMercanciaCheckBox.setText("Mercancía peligrosa");
        jMercanciaCheckBox.setEnabled(false);

        jLongitudLabel.setText("Longitud:");
        jLongitudLabel.setEnabled(false);

        jLongitudTextField.setColumns(6);
        jLongitudTextField.setEnabled(false);

        javax.swing.GroupLayout jCamionPanelLayout = new javax.swing.GroupLayout(jCamionPanel);
        jCamionPanel.setLayout(jCamionPanelLayout);
        jCamionPanelLayout.setHorizontalGroup(
            jCamionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCamionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCamionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCamionPanelLayout.createSequentialGroup()
                        .addComponent(jLongitudLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLongitudTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jMercanciaCheckBox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jCamionPanelLayout.setVerticalGroup(
            jCamionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCamionPanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jCamionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLongitudLabel)
                    .addComponent(jLongitudTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jMercanciaCheckBox)
                .addContainerGap())
        );

        javax.swing.GroupLayout jVehiculoPanelLayout = new javax.swing.GroupLayout(jVehiculoPanel);
        jVehiculoPanel.setLayout(jVehiculoPanelLayout);
        jVehiculoPanelLayout.setHorizontalGroup(
            jVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jVehiculoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCamionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jVehiculoPanelLayout.createSequentialGroup()
                        .addComponent(jTipoVehiculoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTipoVehiculoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jVehiculoPanelLayout.createSequentialGroup()
                        .addGroup(jVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jModeloLabel)
                            .addComponent(jMatriculaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jModeloTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(jMatriculaTextField))))
                .addContainerGap())
        );
        jVehiculoPanelLayout.setVerticalGroup(
            jVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jVehiculoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTipoVehiculoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTipoVehiculoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jModeloLabel)
                    .addComponent(jModeloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jVehiculoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMatriculaLabel)
                    .addComponent(jMatriculaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCamionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBotonesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPropietarioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFechaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jVehiculoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPropietarioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFechaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jVehiculoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBotonesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método de acción del botón guardar
     * Aquí se recoge la información de todos los controles y se guarda en un objeto Vehículo
     * Finalmente el vehículo se añade al array list de vehículos
     * @param evt 
     */
    private void jGuardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarButtonActionPerformed
        // TODO add your handling code here:
       
        // Instanciamos un objeto Vehiculo y le pasamos los datos de los controles del formulario
        Vehiculo vehiculo = new Vehiculo(); 
        
        vehiculo.setFechaEntrada((Date) this.jDiaSpinner.getValue()); // Le asignamos la fecha de entrada recogida del spinner
        vehiculo.setModelo(this.jModeloTextField.getText());               // Le asignamos el modelo recogido del text field
        vehiculo.setMatricula(this.jMatriculaTextField.getText());            // Le asignamos la matrícula recogida del text field
        
        try {  // Es importante que el try envuelva al this.setVisible para que no se cierre el diálogo
            
            // Si es un camión, guardaremos también la longitud y el tipo de mercancía
            if("Camión".equals((String) this.jTipoVehiculoComboBox.getSelectedItem())) {
           
                vehiculo.setMercanciaPeligrosa(this.jMercanciaCheckBox.isSelected());  // True si el checkbox está marcado
                
                // Puede lanzar una excepción de tipo NumberFormatException
                vehiculo.setLongitud(Double.parseDouble(this.jLongitudTextField.getText()));                
            }
        
            // Instanciamos un objeto propietario y le pasamos los datos de los controles del formulario
            Propietario propietario = new Propietario();
        
            propietario.setNombre(jNombreTextField.getText());
            propietario.setApellidos(jApellidosTextField.getText());
            propietario.setDni(jDNITextField.getText());
        
            // Añadimos al vehículo su propietario
            vehiculo.setPropietario(propietario);
        
            // Por último, añadimos el vehículo a la lista
            this.listaVehiculos.add(vehiculo);
               
            // Ocultamos el JDialog para volver al formulario principal (Consulta)   
            this.setVisible(false);    
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Campo longitud de camión no válido");
        }
    }//GEN-LAST:event_jGuardarButtonActionPerformed

    /**
     * Método de acción para el botón Cancelar
     * No se guardará ningún vehículo en la lista y volvemos al formulario principal (Consulta)
     * @param evt 
     */
    private void jCancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelarButtonActionPerformed
        // TODO add your handling code here:
        // Al pulsar el botón cancelar no se guardará ningún dato en la lista
        this.setVisible(false); // Ocultamos el JDialog y volvemos al formulario pral (Consulta)
    }//GEN-LAST:event_jCancelarButtonActionPerformed

    private void jTipoVehiculoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTipoVehiculoComboBoxActionPerformed
        // TODO add your handling code here:
        // Ver que tipo de vehículo se ha seleccionado en el combobox
        String tipoVehiculo = (String) this.jTipoVehiculoComboBox.getSelectedItem();
                
        // Si es un camión, habilitamos los controles de longitud y mercancía peligrosa
        if ("Camión".equals(tipoVehiculo)) {
            //jPanel4.setBorder(bordePanelCamion);
            habilitarPanelCamion(true, Color.BLACK);
        }
        else { // Si se ha elegido otro tipo de vehículo, volvemos a deshabilitar los componentes del panel del camión
            habilitarPanelCamion(false, Color.LIGHT_GRAY);
        }
        
    }//GEN-LAST:event_jTipoVehiculoComboBoxActionPerformed

    /**
     * Este método sirve para habilitar/deshabilitar los controles del panel para camiones
     * No sólo habilita/deshabilita los controles, sino que también cambia el color del borde 
     * y del título del borde del panel, lo cual tiene su historia.
     * @param habilitar true (habilitar controles dle panel), false (deshabilitar controles del panel)
     * @color El color para el borde del panel (gris claro para deshabilitar y negro para habilitar)
     */
    private void habilitarPanelCamion(Boolean habilitar, Color color) {
        
        // Crear un borde de grosor 1, esquinas redondeadas y de color el pasado como parámetro
        Border borde = BorderFactory.createLineBorder(color, 1, true);

        this.jCamionPanel.setBorder(BorderFactory.createTitledBorder(borde, "Sólo para camiones", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, color));
        this.jLongitudLabel.setEnabled(habilitar);
        this.jLongitudTextField.setEnabled(habilitar);
        this.jMercanciaCheckBox.setEnabled(habilitar);
    }
    
    /**
     * Método para limpiar todos los controles cada vez que se muestra el jDialog (Registro)
     * Es protected porque tiene que poder llamarse desde el JFrame (Consulta)
     */
    protected void limpiarControles() {
        
        this.jTipoVehiculoComboBox.setSelectedIndex(0);   // Inicializar el combo box  con el valor "coche"
        this.jDiaSpinner.setValue(new Date()); // Inicializar el spinner con la fecha actual
        this.jNombreTextField.setText("");
        this.jApellidosTextField.setText("");
        this.jDNITextField.setText("");
        this.jTelefonoTextField.setText("");
        this.jModeloTextField.setText("");
        this.jMatriculaTextField.setText("");
        this.jLongitudTextField.setText("");
        this.jMercanciaCheckBox.setSelected(false);
    }

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Registro dialog = new Registro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jApellidosLabel;
    private javax.swing.JTextField jApellidosTextField;
    private javax.swing.JPanel jBotonesPanel;
    private javax.swing.JPanel jCamionPanel;
    private javax.swing.JButton jCancelarButton;
    private javax.swing.JLabel jDNILabel;
    private javax.swing.JTextField jDNITextField;
    private javax.swing.JSpinner jDiaSpinner;
    private javax.swing.JPanel jFechaPanel;
    private javax.swing.JButton jGuardarButton;
    private javax.swing.JLabel jLongitudLabel;
    private javax.swing.JTextField jLongitudTextField;
    private javax.swing.JLabel jMatriculaLabel;
    private javax.swing.JTextField jMatriculaTextField;
    private javax.swing.JCheckBox jMercanciaCheckBox;
    private javax.swing.JLabel jModeloLabel;
    private javax.swing.JTextField jModeloTextField;
    private javax.swing.JLabel jNombreLabel;
    private javax.swing.JTextField jNombreTextField;
    private javax.swing.JPanel jPropietarioPanel;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jTelefonoLabel;
    private javax.swing.JTextField jTelefonoTextField;
    private javax.swing.JComboBox jTipoVehiculoComboBox;
    private javax.swing.JLabel jTipoVehiculoLabel;
    private javax.swing.JPanel jVehiculoPanel;
    // End of variables declaration//GEN-END:variables

}
