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
public class Estudiante implements Serializable {
   
    private String nombreEs;
    private String codigoEs;
     
    
    public String obtenerNombre(){
        return this.nombreEs;
    }
    public String obtenerCodigo(){
        return this.codigoEs;
    }
    
    public void modificaNombre(String nombre){
        this.nombreEs = nombreEs;
    }
    public void modificaCodigo(String codigo){
        this.codigoEs = codigoEs;
    }
    public String getNombre() {
        return nombreEs ;
    }

    public void setNombre(String nombre) {
        this.nombreEs = nombre;
    }

    public String getCodigo() {
        return codigoEs;
    }

    public void setCodigo(String codigo) {
        this.codigoEs = codigo;
    }


    @Override
    public String toString() {
        return "El Estudiante:   "+this.nombreEs+ "\n identificado con codigo:   "+this.codigoEs;
    }
 
    
  
    

    
   
}
