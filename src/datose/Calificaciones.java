/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datose;

import java.io.Serializable;




/**
 *
 * @author JuanR
 */
public class Calificaciones implements Serializable {

    private  double larespuesta;
    private  double elnum1;
    private  double elnum2;
    private  double elnum3;
    private  double elnum4;
    private String elNombre;
    private String elCodigo;
 


    public Calificaciones(String nombre, String codigo, double num1, double num2, double num3, double num4) {
        this.elNombre = nombre;
        this.elCodigo = codigo;
        this.elnum1 = num1;
        this.elnum2 = num2;
        this.elnum3 = num3;
        this.elnum4 = num4;
        this.larespuesta = ((num1*0.25)+(num2*0.35)+(num3*0.15)+(num4*0.25));
    }

    public Calificaciones() {
        
    }

    public Calificaciones(double num1, double num2, double num3, double num4) {
       this.elnum1 = num1;
        this.elnum2 = num2;
        this.elnum3 = num3;
        this.elnum4 = num4;
        this.larespuesta = ((num1*0.25)+(num2*0.35)+(num3*0.15)+(num4*0.25));
    }
     public String obtenerEstudiante(){
        return this.elNombre;
    }
     public double obtenerNota1(){
        return this.elnum1;
    }
     public  double obtenerNota2(){
        return this.elnum2;
    }
     public  double obtenerNota3(){
        return this.elnum3;
    }
     public double obtenerNota4(){
        return this.elnum4;
    }
     public  double obtenerNotaF(){
        return this.larespuesta;
    }

    public String getCodigo() {
        return elCodigo;
    }
     @Override
    public String toString() {
        return ""+this.elNombre+"\nTiene como nota final:    "+larespuesta;
    }

    

}

 
      


  
