/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaEquipos;

import dto.equipos;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author jdani
 */
public class logicaEquipos {
    public ArrayList<equipos> listaEquipos = new ArrayList<>();
    public Icon equipo;
    public Icon pais;
    
    public void aniadirEquipo(equipos e){
        listaEquipos.add(e);
    }
    
    public void cargarEquipo(String nombreEquipo){
        if(nombreEquipo == "Barcelona"){
            equipo = new ImageIcon("src/fotosEquipos/Barcelona.png");
            pais = new ImageIcon("src/fotosSelecciones/espana.png");
        }
        if(nombreEquipo == "Sevilla"){
            equipo = new ImageIcon("src/fotosEquipos/Sevilla.png");
            pais = new ImageIcon("src/fotosSelecciones/espana.png");
        }
        if(nombreEquipo == "Juventus"){
            equipo = new ImageIcon("src/fotosEquipos/Juventus.png");
            pais = new ImageIcon("src/fotosSelecciones/Italia.png");
        }
    }
    
    public logicaEquipos(){
        cargarEquipo("Barcelona");
        listaEquipos.add(new equipos("Barcelona", equipo, pais));
        cargarEquipo("Sevilla");
        listaEquipos.add(new equipos("Sevilla", equipo, pais));
        cargarEquipo("Juventus");
        listaEquipos.add(new equipos("Juventus", equipo, pais));
    }
    
}
