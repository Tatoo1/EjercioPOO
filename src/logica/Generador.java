/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import datose.Calificaciones;
import datose.Estudiante;
import java.util.HashMap;
import java.util.Map;
import memoria.Memoria;


public class Generador   {
public String ultimaOperacion;
    public double ultimoResultado;
    private Map<String, Calificaciones> listaNotas;
    public Generador(){
        if (listaNotas == null){
           listaNotas = (Map<String, Calificaciones> )Memoria.recuperar();
            if (listaNotas == null){
                listaNotas = new HashMap<>();
            }
        }
    }
   
    
    public Calificaciones generarNota (double num1,double num2,double num3,double num4,String nombre, String codigo){
       
   
           Estudiante elEstudiante = this.crearEstudiante(nombre,codigo);
          Calificaciones n = new Calificaciones(nombre, codigo ,num1,num2,num3,num4);
           
           listaNotas.put(n.getCodigo(),n);
           Memoria.guardar(listaNotas);
           return n;
       
}
    private Estudiante crearGestorE(String nombre, String codigo){
        Estudiante p = new Estudiante();
        p.modificaCodigo(codigo);
        p.modificaNombre(nombre);
        return p;
    }
    public Map<String, Calificaciones> obtenerLista(){
        return this.listaNotas;
    }

    private Estudiante crearEstudiante(String nombre, String codigo) {
        return null;
    }

    public Calificaciones crearNota(double num1, double num2, double num3, double num4) {
        
    
        if (num1 == 1 || num2 == 1 || num3 == 1 || num4 == 1) {
            return null;
        } else {
            Calificaciones n = new Calificaciones (num1, num2, num3, num4);

            return n;
        }
    }

    public Estudiante Estudiante(String nombre, String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}