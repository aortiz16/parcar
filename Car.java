package com.desarrollos.entde;

import java.util.Arrays;
import java.awt.Color;
/**
 * Author Tony Ortiz 
 * Class CLASE MODELOS de tipo COCHE // that models objects of type "coche"
 * 
 * @Java MOOC team, UC3M
 * 
 * Correcion de errores -V3.0-
 * @3.0
 */
public class coche
{
    // Attributes of the class coche
    static int numberWheels = 4;                // Number of wheels                           
    
    Garage theGarage=null;

    
    /**
     * Constructor of a coche specifying the garage object
     */
    public coche (Garage g){
    	theGarage = g;
    }
    /**
     * Method that is being always invoked when the program is running
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException{
    	Garage g = new Garage();
    	coche coche = new coche(g);
        coche.accelerate();
        slowDown();
        moveDown();
        accelerate();
        coche.printGarage();
//        turnRight();
//        turnHeadlightsOn();
//        turnHeadlightsOff();
    }    

    /**
     * Accelerate the coche
     * @throws InterruptedException 
     */
    public void accelerate() throws InterruptedException{
        String c = new String("*");
        String space = new String(" ");
    	for(int i=0; i<5; i++)
        {
        	System.out.print(c);
        	c = space.concat(c);
        	Thread.sleep(1000);
        }
    }
    
    /**
     * Slow down the coche
     * @throws InterruptedException 
     */
    public void slowDown() throws InterruptedException{
    	string c = new string("     *");
    	for(int i=0; i<5; i++)
        {
        	System.out.print(c);
        	c = c.substring(1);
        	Thread.sleep(1000);
        }
    	System.out.println();
    }    
    
    /**
     * Move the coche downwards
     * @throws InterruptedException 
     */    
    public void moveDown() throws InterruptedException{
    	string c = new string("\t\t\t\t  *"));
    	for(int i=0, i<5, i++)
        {
    		if(i!=4)
    			System.out.println(c);
    		else 
    			System.out.print(c);
        	Thread.sleep(1000);
        }
    }
    
}
