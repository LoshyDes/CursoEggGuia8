/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class PersonaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //a)
    public boolean esMayorDeEdad(int edad) {
        boolean MayorDeEdad = false;
        if (edad >= 18) {
            MayorDeEdad = true;
            System.out.println("Es mayor de edad");
        }

        return MayorDeEdad;
    }

    //b)
    public Persona crearPersona() {
        System.out.println("Ingrese el nombre del usuario: ");
        String nombre = leer.next();
        System.out.println("Ingrese la edad del usuario: ");
        int edad = leer.nextInt();
        char prueba;
        do {
            System.out.println("Ingrese el sexo (H para hombre, M para mujer, O para otros");
            prueba = leer.next().charAt(0);
            if (prueba != 'M' && prueba != 'H' && prueba != 'O') {
                System.out.println("Error, coloque un caracter válido");
            }
        } while (prueba != 'M' && prueba != 'H' && prueba != 'O');

        char sexo = prueba;
        System.out.println("Ingrese el peso del usuario (en Kilogramos): ");
        double peso = leer.nextDouble();
        System.out.println("Ingrese la altura del usuario (en Metros): ");
        double altura = leer.nextDouble();
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
    //c)
    public int calcularIMC(double peso, double altura) {
        double IMC = (peso/Math.pow(altura, 2));
        int retorno;
        
        if (IMC < 20) {
            System.out.println("La persona está por debajo de su peso ideal.");
            retorno = -1;
        } else if (IMC >= 20 && IMC <= 25) {
            System.out.println("La persona está en su peso ideal");
            retorno = 0;
        } else {
            System.out.println("La persona está por encima de su peso ideal.");
            retorno = 1;
        }
      return retorno;
    }
    
}
