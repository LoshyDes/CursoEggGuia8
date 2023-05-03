/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;

/**
 *
 * @author LogiC
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /**
     * Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades 
     * con los atributos capacidadMáxima (la cantidad máxima de café que puede 
     * contener la cafetera) y cantidadActual (la cantidad actual de café que 
     * hay en la cafetera). Agregar constructor vacío y con parámetros así como 
     * setters y getters. Crear clase CafeteraServicio en el paquete Servicios 
     * con los siguiente:
     * 
     * A) Método llenarCafetera(): hace que la cantidad actual sea igual a la 
     * capacidad máxima. 
     * 
     * B) Método servirTaza(int): se pide el tamaño de una taza vacía, 
     * el método recibe el tamaño de la taza y simula la acción de servir 
     * la taza con la capacidad indicada. Si la cantidad actual de café 
     * “no alcanza” para llenar la taza, se sirve lo que quede. El método le 
     * informará al usuario si se llenó o no la taza, y de no haberse llenado 
     * en cuanto quedó la taza.
     * 
     * C) Método vaciarCafetera(): pone la cantidad de café actual en cero.
     * 
     * D) Método agregarCafe(int): se le pide al usuario una cantidad de café, 
     * el método lo recibe y se añade a la cafetera la cantidad de café indicada.

     */
    //A)
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera c = cs.llenarCafetera();
    //B)
       c.setCantidadActual(cs.servirTaza(c.getCantidadActual()));
    //C)
       c.setCantidadActual(cs.vaciarCafetera(c.getCantidadActual()));
    //D)
       c.setCantidadActual(cs.agregarCafe(c.getCantidadActual(), c.getCapacidadMaxima()));
    }
    
}
