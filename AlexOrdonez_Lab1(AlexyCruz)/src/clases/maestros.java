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

    private String nombre, titulo, maestria, Usuario, Contrasena;
    private int Salario, Cantidad_Clases;
    public ArrayList<String> secciones, Nombre, Titulo, Maestria, usuario, contrasena;

    public maestros() {

    }

    public maestros(String nombre, String titulo, String maestria, String Usuario, String Contrasena, int Salario, int Cantidad_Clases) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.Contrasena = Contrasena;
        this.maestria = maestria;
        this.Usuario = Usuario;
        this.Salario = Salario;
        this.Cantidad_Clases = Cantidad_Clases;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnombre() {
        return nombre;
    }

    public void settitulo(String titulo) {
        this.titulo = titulo;
    }
    public String gettitulo(){
        return titulo;
    }

    public void setmaestria(String maestria) {
        this.maestria = maestria;
    }
    public String getmaestria(){
        return maestria;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
    public String getUsuario(){
        return Usuario;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
    public String getContrasena(){
        return Contrasena;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }
    public int getSalario(){
        return Salario;
    }

    public void setCantidad_Clases(int Cantidad_Clases) {
        this.Cantidad_Clases = Cantidad_Clases;
    }
    public int getCantidad_Clases(){
        return Cantidad_Clases;
    }
}
