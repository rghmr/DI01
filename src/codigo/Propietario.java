/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author rodrigo
 */
public class Propietario {
    
    // Atributos de la clase Propietario
    
    private String nombre; // Nombre del propietario
    private String apellidos; // Apellidos del propietario
    private String dni; // dni del propietario
    private String tlf; // Teléfono del propietario

    // Métodos (setter & getter) para la clase Propietario
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the tlf
     */
    public String getTlf() {
        return tlf;
    }

    /**
     * @param tlf the tlf to set
     */
    public void setTlf(String tlf) {
        this.tlf = tlf;
    }
}
