/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexordonez_lab1.alexycruz;

import clases.Clase;
import clases.alumnos;
import clases.maestros;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex Ordonez
 */
public class AlexOrdonez_Lab1AlexyCruz {
static ArrayList<maestros> maest;
static ArrayList<Clase> clases ;
static ArrayList<alumnos> alumno ;

/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    public static void opcion_in(){
        int opt=Integer.parseInt(JOptionPane.showInputDialog("1 Administracion\n"+"2 Matricula\n"+"3 Log in"));
        switch(opt){
            case 1:
                String nombre=JOptionPane.showInputDialog("Ingrese datos de la clase y maestro\n"+"Ingrese el nombre de la clase:");
                String Seccion=JOptionPane.showInputDialog("Ingrese datos de la clase y maestro\n"+"Ingrese la seccion de la clase:");
                int cant_alum=Integer.parseInt(JOptionPane.showInputDialog("Ingrese datos de la clase y maestro\n"+"Ingrese la cantidad de alumnos de la clase:"));
                String maestro=JOptionPane.showInputDialog("Ingrese datos de la clase y maestro\n"+"Ingrese el nombre del maestro de la clase:");
                while(maestro(maestro)==true){
                    maestro=JOptionPane.showInputDialog("nombre ya ingresado"+"Ingrese el nombre del maestro de la clase:");
                }
                int unid=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las unidades valorativas"));
                clases.add(new Clase(nombre,Seccion,null,cant_alum,unid));
                String titulo=JOptionPane.showInputDialog("Ingrese el titulo del maestro");
                String usuario=JOptionPane.showInputDialog("Ingrese el usuario del maestro");
                while(usuario(usuario)==true){
                    maestro=JOptionPane.showInputDialog("usuario ya ingresado"+"Ingrese el usuario del maestro de la clase:");
                }
                String maestria=JOptionPane.showInputDialog("Ingrese la maestria del maestro");
                String contrasena=JOptionPane.showInputDialog("Ingrese la contrasena del maestro");
                int salario=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario del maestro"));
                int cant_clases=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de clases que el maestro da"));
                maest.add(new maestros(maestro,titulo,maestria,usuario,contrasena,salario,cant_clases));
                JOptionPane.showMessageDialog(null, "Clase y maestro agrgados correctamente");
                break;
            case 2:
                
        }
    } 
    public static boolean maestro(String maestro){
        boolean g=false;
        for (maestros object : maest) {
            if(maestro.equals(object.getnombre())){
                g=true;
                break;
            }
        }
        return g;
    }
    public static boolean usuario(String usuario){
        boolean g=false;
        for (maestros object : maest) {
            if(usuario.equals(object.getUsuario())){
                g=true;
                break;
            }
        }
        return g;
    }
}
