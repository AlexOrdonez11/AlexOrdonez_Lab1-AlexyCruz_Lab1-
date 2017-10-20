/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex Ordonez
 */
public class Clase {

    private String nombre, seccion,  maestro;
    private int cant_alumnos, Unidades_va;
    public ArrayList<String> Alumnos;
    public Clase(String nombre,String seccion,String maestro,String alumnos,int cant_alumnos,int Unidades_va){
        this.nombre = nombre;
        this.seccion = seccion;
        this.cant_alumnos = cant_alumnos;
        this.maestro=maestro;
        Alumnos.add(alumnos);
    }
    public void setnombre(String nombre) {
        this.nombre = nombre;
    
    }
    public String getnombre(){
        return nombre;
    }
    public void setseccion (String seccion) {
        this.seccion = seccion;
    }
    public String setseccion(){
        return seccion;
    }
    public void setcant_alumnos(int cant_alumnos) {
        this.cant_alumnos = cant_alumnos;
    }
    public int getcant_alumnos(){
        return cant_alumnos;
    }

    public void setmaestro(String maestro) {
        this.maestro=maestro;
    }
    public String getmaestro(){
        return maestro;
    }

    public void setalumnos(String alumnos) {
        Alumnos.add(alumnos);
    }
    public String getalumnos(int pos){
        return Alumnos.get(pos);
    }

    public void setUnidades_va(int Unidades_va) {
        this.Unidades_va = Unidades_va;
    }
    public int getUnidades(){
        return Unidades_va;
    }
}
