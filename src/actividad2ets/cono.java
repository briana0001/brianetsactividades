package actividad2ets;


    import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Brian
 */
public class cono extends circulo {

    private float altura;

    private String color;
    private String cono;
    private float centroX;
    private float centroY;


    /**
     constructor 
     */
    public cono(){

                        }
//setters
    /**
     *
     * @param altura
     */
    public void set_altura(float altura){
 this.altura= altura;
		
  } 

    /**
     *
     * @param color
     */
    public void set_color(String color){
 this.color= color;
		
  } 
       
    /**
     *
     * @param centroX
     */
    public void set_centroX(float centroX){
 this.centroX= centroX;
		
  } 

    /**
     *
     * @param centroY
     */
    public void set_centroY(float centroY){
 this.centroY= centroY;
		
             }

    /**
     *
     * @param radio
     */
   
    public void set_radio(float radio){
 this.radio= radio;
	//getters	
  } 
         String get_color(){
        return color; 
         }
         float get_altura(){
             return altura;
         }
          float get_centroX(){
             return centroX;
         }
                float get_centroY(){
             return centroY;
         }
                      float get_radio(){
             return radio;
         }

    /**
     *
     * @param centroX
     * @param centroY
     * @param radio
     * @param altura
     * @param color
     */
   
}




