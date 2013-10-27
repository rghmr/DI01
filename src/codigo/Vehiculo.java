/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author rodrigo
 */
public class Vehiculo {
    
    // Atributos
    private Propietario propietario; // Propietario del vehículo
    private Date        fechaEntrada; // Fecha de entrada en el garaje  

    /**
     * @return the propietario
     */
    public Propietario getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    /**
     * @return the fechaEntrada
     */
    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    /**
     * @param fechaEntrada the fechaEntrada to set
     */
    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
    
}