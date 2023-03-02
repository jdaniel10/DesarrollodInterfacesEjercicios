/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import javax.swing.Icon;

/**
 *
 * @author jdani
 */
public class equipos {
    public String nombreEquipo;
    public Icon pais;
    public Icon equipo;

    public equipos(String nombreEquipo, Icon pais, Icon equipo) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.equipo = equipo;
    }
    
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Icon getPais() {
        return pais;
    }

    public void setPais(Icon pais) {
        this.pais = pais;
    }

    public Icon getEquipo() {
        return equipo;
    }

    public void setEquipo(Icon equipo) {
        this.equipo = equipo;
    }
    
    
    
}
