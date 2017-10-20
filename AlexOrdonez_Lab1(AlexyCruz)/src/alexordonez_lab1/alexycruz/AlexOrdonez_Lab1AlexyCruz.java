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
    static ArrayList<Clase> clases;
    static ArrayList<alumnos> alumno;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    public static void opcion_in() {
        int opt = Integer.parseInt(JOptionPane.showInputDialog("1 Administracion\n" + "2 Matricula\n" + "3 Log in"));
        switch (opt) {
            case 1:
                String nombre = JOptionPane.showInputDialog("Ingrese datos de la clase y maestro\n" + "Ingrese el nombre de la clase:");
                String Seccion = JOptionPane.showInputDialog("Ingrese datos de la clase y maestro\n" + "Ingrese la seccion de la clase:");
                int cant_alum = Integer.parseInt(JOptionPane.showInputDialog("Ingrese datos de la clase y maestro\n" + "Ingrese la cantidad de alumnos de la clase:"));
                String maestro = JOptionPane.showInputDialog("Ingrese datos de la clase y maestro\n" + "Ingrese el nombre del maestro de la clase:");
                while (maestro(maestro) == true) {
                    maestro = JOptionPane.showInputDialog("nombre ya ingresado" + "Ingrese el nombre del maestro de la clase:");
                }
                int unid = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las unidades valorativas"));
                int value = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la clase"));
                clases.add(new Clase(nombre, Seccion, null, cant_alum, unid, value));
                String titulo = JOptionPane.showInputDialog("Ingrese el titulo del maestro");
                String usuario = JOptionPane.showInputDialog("Ingrese el usuario del maestro");
                while (usuario(usuario) == true) {
                    maestro = JOptionPane.showInputDialog("usuario ya ingresado" + "Ingrese el usuario del maestro de la clase:");
                }
                String maestria = JOptionPane.showInputDialog("Ingrese la maestria del maestro");
                String contrasena = JOptionPane.showInputDialog("Ingrese la contrasena del maestro");
                double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del maestro"));
                int cant_clases = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de clases que el maestro da"));
                maest.add(new maestros(maestro, titulo, maestria, usuario, contrasena, salario, cant_clases));
                JOptionPane.showMessageDialog(null, "Clase y maestro agrgados correctamente");
                break;
            case 2:
                char resp = 's';
                while (resp != 's') {
                    alumnos alun=new alumnos();
                    String alum = JOptionPane.showInputDialog("Ingrese su nombre");
                    String cuenta = JOptionPane.showInputDialog("Ingrese su numero de cuenta");
                    String user = JOptionPane.showInputDialog("Ingrese el usuario");
                    String contra = JOptionPane.showInputDialog("Ingrese su contrasena");
                    String carrera = JOptionPane.showInputDialog("Ingrese la carrera");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
                    double dinero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el dinero disponible"));
                    String clase = JOptionPane.showInputDialog("Ingrese la clase");
                    while(dinero(dinero,clase,alum)==true){
                        clase = JOptionPane.showInputDialog("Ingrese la clase");
                    }
                    resp = JOptionPane.showInputDialog("Desea salir [s]").charAt(0);
                    if(!alumno.contains(new alumnos(clase,edad,dinero,alum,cuenta,carrera,user,contra))){
                        alumno.add(new alumnos(clase,edad,dinero,alum,cuenta,carrera,user,contra));
                    }
                    alun.clases_cursa.add(clase);
                }
        }
    }

    public static boolean maestro(String maestro) {
        boolean g = false;
        for (maestros object : maest) {
            if (maestro.equals(object.getnombre())) {
                g = true;
                break;
            }
        }
        return g;
    }

    public static boolean usuario(String usuario) {
        boolean g = false;
        for (maestros object : maest) {
            if (usuario.equals(object.getUsuario())) {
                g = true;
                break;
            }
        }
        return g;
    }

    public static boolean dinero(double dinero, String clase,String alum) {
        boolean d = false;
        int c=0;
        for (Clase object : clases) {
            if (clase.equals(object.getnombre())) {
                c=1;
                double cont1 = object.getvalue() + (object.getvalue() + object.getvalue() * 0.2) + (object.getvalue() + object.getvalue() * 0.4);
                if(cont1>dinero){
                    JOptionPane.showMessageDialog(null, "No tiene sufuciente dinero");
                    d=true;
                    break;
                }else{
                    object.Alumnos.add(alum);
                }
            }
        }
        if(c==0){
            JOptionPane.showMessageDialog(null, "No ingreso una clase valida");
            d=true;
        }
        return d;
    }
}
