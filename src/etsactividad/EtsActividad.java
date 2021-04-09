/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package etsactividad;
import etsactividad.cono;

import etsactividad.cono;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author alumnodaw1a
 */
public class EtsActividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //metemos el color y luego randomizamos los demas atributos del cono
        System.out.println("escriba un color");
     Scanner teclado = new Scanner(System.in);
     
     String m = teclado.nextLine();
        float z =  (float) Math.random();
                float  l =  (float) Math.random();
                        float  o =  (float) Math.random();
                                float  u =  (float) Math.random();
   cono cono=new cono();
    cono.set_altura(z);
      cono.set_centroX(l);
        cono.set_centroY(o);
          cono.set_radio(u);
         cono.set_color(m);
         //mostramos los atributos
             System.out.println("se mostraran los atributos del cono en este orden: altura, centroX,centroY,radio y color ");
          System.out.println(cono.get_altura()+"\t  "+ cono.get_centroX()+"\t  "+cono.get_centroY()+"\t  " + cono.get_radio()
          +"\t  "+cono.get_color());
    }
    
}
