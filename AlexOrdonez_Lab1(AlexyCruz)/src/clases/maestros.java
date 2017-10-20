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
public class maestros {
    private String nombre,titulo,maestria,Usuario,Contrasena;
    private int Salario,Cantidad_Clases;
    public ArrayList<String> secciones,Nombre,Titulo,Maestria,usuario,contrasena;
    public maestros(String nombre,String titulo,String maestria,String Usuario,String Contrasena,int Salario,int Cantidad_Clases){
        this.nombre=nombre;
        this.titulo=titulo;
        this.Contrasena=Contrasena;
        this.maestria=maestria;
        this.Usuario=Usuario;
        this.Salario=Salario;
        this.Cantidad_Clases=Cantidad_Clases;
    }
    public void addnombre(String nombre){
        if(!nombre.equals(this.nombre)){
            this.nombre=nombre;
        }
        else{
            JOptionPane.showMessageDialog(null, nombre+" ya registrado");
        }
    }
    public void addtitulo(String titulo){
        this.titulo=titulo;
    }
    public void addmaestria(String maestria){
        this.maestria=maestria;
    }
    public void addUsuario(String Usuuario){
        if(!Usuario.equals(this.Usuario)){
        this.Usuario=Usuario;
        }else{
            JOptionPane.showMessageDialog(null, Usuario+" ya registrado");
        }
    }
    public void addContrasena(String Contrasena){
        this.Contrasena=Contrasena;
    }
    public void addsalario(int Salario){
        this.Salario=Salario;
    }
    public void addCantidad_Clases(int Cantidad_Clases){
        this.Cantidad_Clases=Cantidad_Clases;
    }
}
