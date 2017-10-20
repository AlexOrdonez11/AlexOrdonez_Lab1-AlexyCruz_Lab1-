/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author Alex Ordonez
 */
public class alumnos {
    private String nombre,num_cuenta,carrera,usuario,contrasena;
    private int edad,dinero_dis;
    public ArrayList<String> clases_cursa;
    public alumnos(){
        
    }
    public alumnos(String Clase,int edad,int dinero_dis,String nombre,String num_cuenta,String carrera,String usuario,String contrasena){
        this.nombre=nombre;
        this.num_cuenta=num_cuenta;
        this.contrasena=contrasena;
        this.carrera=carrera;
        this.usuario=usuario;
        this.dinero_dis=dinero_dis;
        this.edad=edad;
        clases_cursa.add(Clase);
    }
    public void setnombre(String nombre) {
        this.nombre = nombre;
    
    }
    public String getnombre(){
        return nombre;
    }
    public void setnum_cuenta (String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }
    public String getnum_cuenta(){
        return num_cuenta;
    }
    public void edad(int edad) {
        this.edad = edad;
    }
    public int getedad(){
        return edad;
    }

    public void setacrrera(String carrera) {
        this.carrera=carrera;
    }
    public String getcarrera(){
        return carrera;
    }

    public void contrasena(String contrasena) {
        this.contrasena=contrasena;
    }
    public String getcontrasena(){
        return contrasena;
    }

    public void setdinero_dis(int dinero_dis) {
        this.dinero_dis = dinero_dis;
    }
    public int getdinero_dis(){
        return dinero_dis;
    }
    public void setclase(String Clase){
        clases_cursa.add(Clase);
    }
    public String getclase(int pos){
        return clases_cursa.get(pos);
    }
}
