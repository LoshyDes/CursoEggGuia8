/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class CafeteraServicio {

    private Scanner leer = new Scanner(System.in);
    
    public Cafetera llenarCafetera() {
        //System.out.println("Ingrese el tamaño de la cafetera (en mililitros)");
        //int capacidadMaxima = leer.nextInt();
        int capacidadMaxima = 1500;
        int cantidadActual = capacidadMaxima;
        System.out.println("La cafetera está llena, tiene " + cantidadActual 
                + " mililitros de café");
        return new Cafetera(capacidadMaxima, cantidadActual);
    }

    public int servirTaza(int cantidadActual) {
        System.out.println("Ingrese el tamaño de una taza vacía (en mililitros): ");
        int tazaVacia = leer.nextInt();
        if (tazaVacia > cantidadActual) {
            System.out.println("No alzanca para llenar la taza, se servirán sólo " 
                    + cantidadActual + " mililitros");
            cantidadActual = 0;
        } else {
            System.out.println("La taza será llenada por completo");
            cantidadActual -= tazaVacia;
        }
        
        return cantidadActual;
    }
    
    public int vaciarCafetera(int cantidadActual) {
        System.out.println("La cafetera que tenía " + cantidadActual 
                + "mililitros de café se vació por completo");
        cantidadActual = 0;
        return cantidadActual;
    }
    
    public int agregarCafe(int cantidadActual, int capacidadMaxima) {
        System.out.println("Ingrese la cantidad de café que quiere agregar "
                + "a la cafetera (La cafetera actualmente tiene: " 
                + cantidadActual + " mililitros");
        int cafeNuevo = leer.nextInt();
        if (cafeNuevo + cantidadActual > capacidadMaxima) {
            System.out.println("No se puede agregar esa cantidad de café. "
                    + "\nSe superará la capacidad máxima de la cafetera");
        } else {
            System.out.println("Se le agregaron " + cafeNuevo + " mililitros de café a la cafetera");
            cantidadActual += cafeNuevo;
        }
        return cantidadActual;
    }
    
}
