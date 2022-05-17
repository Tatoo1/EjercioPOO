/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import memoria.Memoria;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JuanR
 */
public class TestGestorArc {
    @Test
    public void guardarNull(){
        String abc ="Juan David";
        boolean rta = Memoria.guardar(abc);
        System.out.println(rta);
        Assert.assertEquals(rta,true);
    }
    @Test
    public void guardarNull2(){
        boolean rta = Memoria.guardar(null);
        System.out.println(rta);
        Assert.assertEquals(rta,true);
    }
    @Test
    public void guardarOk (){
        boolean rta = Memoria.guardar(this);
        Assert.assertEquals(rta,false);
                }
    @Test
    public void recuperarNotNull (){
        Object rta = (Object)Memoria.recuperar();
        Assert.assertNotNull(rta);
                }

    @Test
    public void recuperarVacio(){
        Object rta = (Object)Memoria.guardar(this);
        Assert.assertEquals(rta,false);
                }
}

    