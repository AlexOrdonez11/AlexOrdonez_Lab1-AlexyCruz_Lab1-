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
    public alumnos(int edad,int dinero_dis,String nombre,String num_cuenta,String carrera,String usuario,String contrasena){
        this.nombre=nombre;
        this.num_cuenta=num_cuenta;
        this.contrasena=contrasena;
        this.carrera=carrera;
        this.usuario=usuario;
        this.dinero_dis=dinero_dis;
        this.edad=edad;
    }
}
