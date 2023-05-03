/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class RaicesServicio {

    Scanner leer = new Scanner(System.in);
    Raices raiz = new Raices();
    
    public void crearRaices() {
        System.out.print("Ingrese a: ");
        raiz.setA(leer.nextDouble());
        System.out.println("");
        System.out.print("Ingrese b: ");
        raiz.setB(leer.nextDouble());
        System.out.println("");
        System.out.print("Ingrese c: ");
        raiz.setC(leer.nextDouble());
        System.out.println("");
    }
    
    public double getDiscriminante() {
        double discriminante = ((Math.pow(raiz.getB(), 2)) - (4 * raiz.getA() * raiz.getC()));
        return discriminante;
    }
    
    public boolean tieneRaices() {
        boolean tieneRaices = false;
        if (getDiscriminante() >= 0) {
            tieneRaices = true;
        }
        return tieneRaices;
    }
    
    public boolean tieneRaiz() {
        boolean tieneRaiz = false;
        if (getDiscriminante() == 0) {
            tieneRaiz = true;
        }
        return tieneRaiz;
    }
    
    public void obtenerRaices() {
        
        if (tieneRaices() == true) {
            
            System.out.println( "la primera raiz: " + ((-raiz.getB()) 
                    + Math.sqrt((Math.pow(raiz.getB(), 2)) 
                            - (4 * raiz.getA() * raiz.getC())))/( 2 * raiz.getA()) );
            
//            System.out.println( "la primera raiz: " + ((raiz.getB()*-1) 
//                + ( ( Math.sqrt  ( Math.pow(raiz.getB(),2) 
//                        - (4*raiz.getA()*raiz.getC()) )) )) /(2*raiz.getA()) );
            
            System.out.println( "la segunda raiz: " + ((-raiz.getB()) 
                    - Math.sqrt((Math.pow(raiz.getB(), 2)) 
                            - (4 * raiz.getA() * raiz.getC())))/( 2 * raiz.getA()) );
            
            
        }
    }
    
    public void obtenerRaiz() {
        
        if (tieneRaiz() == true) {
            System.out.println( "la raiz es: " + ((-raiz.getB()) 
                    + Math.sqrt((Math.pow(raiz.getB(), 2)) 
                            - (4 * raiz.getA() * raiz.getC())))/( 2 * raiz.getA()) );
        }
    }
    
    public void calcular() {
        crearRaices();
        if (tieneRaiz() == true) {
            obtenerRaiz();
        } else if (tieneRaices() == true) {
            obtenerRaices();
        } else {
            System.out.println("No tiene raíz");
            System.out.println((-raiz.getA())+ 2);
        }
    }
}
