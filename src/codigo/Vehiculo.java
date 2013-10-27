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
    private Propietario propietario;        // Propietario del vehículo
    private Date        fechaEntrada;       // Fecha de entrada en el garaje  
    private String      matricula;          // Matrícula del vehículo
    private String      modelo;             // Modelo del vehículo
    private Boolean     mercanciaPeligrosa; // Sólo para camiones
    private Double      longitud;           // Sólo para camiones

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

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the mercanciaPeligrosa
     */
    public Boolean getMercanciaPeligrosa() {
        return mercanciaPeligrosa;
    }

    /**
     * @param mercanciaPeligrosa the mercanciaPeligrosa to set
     */
    public void setMercanciaPeligrosa(Boolean mercanciaPeligrosa) {
        this.mercanciaPeligrosa = mercanciaPeligrosa;
    }

    /**
     * @return the longitud
     */
    public Double getLongitud() {
        return longitud;
    }

    /**
     * @param longitud the longitud to set
     */
    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

}