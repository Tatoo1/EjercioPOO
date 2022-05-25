/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datose;

import java.io.Serializable;

/**
 *
 * @author juanr
 */
public class Materias implements Serializable {
    private String nombreMateria;
    private int codigo;
    private int codigo2;
    private int codigo3;
    private String matematicas;
    private String ingles;
    private String español;
    private String ciencias;
    
     
    
    public String obtenerMateria(int codigo, String matematicas, String ingles, String español, String ciencias, int codigo2, int codigo3){
        this.codigo = codigo;
        this.codigo2 =codigo2;
        this.codigo3 =codigo3;
        this.matematicas = matematicas;
        this.ingles = ingles;
        this.español = español;
        this.ciencias = ciencias;
        return this.nombreMateria;
        
       
       
    }

    
    public void modificaMateria(String nombre){
        this.nombreMateria = nombre;
    }
  
    public String getNombre() {
        return nombreMateria ;
    }

    public void setNombre(String nombre) {
        this.nombreMateria = nombre;
    }

  


    @Override
    public String toString() {
        return this.nombreMateria;
    }

    public void obtenerMateria(String materia, String materia0, String materia1, String materia2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}