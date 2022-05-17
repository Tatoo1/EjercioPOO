/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import datose.GestorE;
import datose.GestorC;
import java.util.HashMap;
import java.util.Map;
import memoria.Memoria;


public class Generador   {
public String ultimaOperacion;
    public double ultimoResultado;
    private Map<String, GestorC> listaNotas;
    public Generador(){
        if (listaNotas == null){
           listaNotas = (Map<String, GestorC> )Memoria.recuperar();
            if (listaNotas == null){
                listaNotas = new HashMap<>();
            }
        }
    }
   
    
    public GestorC generarNota (double num1,double num2,double num3,double num4,String nombre, String codigo){
       
   
           GestorE elEstudiante = this.crearEstudiante(nombre,codigo);
           GestorC n = new GestorC(elEstudiante,num1,num2,num3,num4);
           //c.modificaElPaciente(elPaciente);
           //c.modificaFecha(fecha);
           //c.modificaOpcion(opcion);
           listaNotas.put(n.getCodigo(),n);
           Memoria.guardar(listaNotas);
           return n;
       
}
    private GestorE crearGestorE(String nombre, String codigo){
        GestorE p = new GestorE();
        p.modificaCodigo(codigo);
        p.modificaNombre(nombre);
        return p;
    }
    public Map<String, GestorC> obtenerLista(){
        return this.listaNotas;
    }

    private GestorE crearEstudiante(String nombre, String codigo) {
        
    return null;
        
    }

    public GestorC crearNota(double num1, double num2, double num3, double num4) {
        
    
        if (num1 == 1 || num2 == 1 || num3 == 1 || num4 == 1) {
            return null;
        } else {
            GestorC n = new GestorC(num1, num2, num3, num4);

            return n;
        }
    }

   
}