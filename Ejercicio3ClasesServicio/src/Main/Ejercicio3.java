/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author LogiC
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Realizar una clase llamada Persona en el paquete de entidades que
         * tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre,
         * ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún
         * otro atributo, puede hacerlo. Agregar constructores, getters y
         * setters. En el paquete Servicios crear PersonaServicio con los
         * siguientes 3 métodos:
         *
         * a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
         * función devuelve un booleano.
         *
         * b) Metodo crearPersona(): el método crear persona, le pide los
         * valores de los atributos al usuario y después se le asignan a sus
         * respectivos atributos para llenar el objeto Persona. Además,
         * comprueba que el sexo introducido sea correcto, es decir, H, M o O.
         * Si no es correcto se deberá mostrar un mensaje.
         *
         * c) Método calcularIMC(): calculara si la persona está en su peso
         * ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula da por
         * resultado un valor menor que 20, significa que la persona está por
         * debajo de su peso ideal y la función devuelve un -1. Si la fórmula da
         * por resultado un número entre 20 y 25 (incluidos), significa que la
         * persona está en su peso ideal y la función devuelve un 0. Finalmente,
         * si el resultado de la fórmula es un valor mayor que 25 significa que
         * la persona tiene sobrepeso, y la función devuelve un 1.
         *
         * A continuación, en la clase main hacer lo siguiente:
         *
         * - Crear 4 objetos de tipo Persona con distintos valores, a
         * continuación, llamaremos todos los métodos para cada objeto, deberá
         * comprobar si la persona está en su peso ideal, tiene sobrepeso o está
         * por debajo de su peso ideal e indicar para cada objeto si la persona
         * es mayor de edad.
         *
         * - Por último, guardaremos los resultados de los métodos calcularIMC y
         * esMayorDeEdad en distintas variables(arrays), para después calcular
         * un porcentaje de esas 4 personas cuantas están por debajo de su peso,
         * cuantas en su peso ideal y cuantos, por encima, y también
         * calcularemos un porcentaje de cuantos son mayores de edad y cuantos
         * menores. Para esto, podemos crear unos métodos adicionales.
         *
         */

        PersonaServicio ps = new PersonaServicio();

        Persona[] Personas = new Persona[4];
        int VectorPeso[];
        VectorPeso = new int[4];
        boolean[] VectorMayorEdad;
        VectorMayorEdad = new boolean[4];
        double bajoPeso = 0, pesoIdeal = 0, sobrePeso = 0, mayorEdad = 0, menorEdad = 0;
        
        for (int i = 0; i < 4; i++) {
            
            //Creamos las 4 entidades "Persona"
            Personas[i] = ps.crearPersona();
            //Sacamos los valores del peso IMC
            VectorPeso[i] = ps.calcularIMC(Personas[i].getPeso(), Personas[i].getAltura());
            //Los contabilizamos al IMC
            switch (VectorPeso[i]) {
                case -1:
                    bajoPeso++;
                    break;
                case 0:
                    pesoIdeal++;
                    break;
                case 1:
                    sobrePeso++;
                    break;
            }

            //Contabilizar la mayoría/minoría de edad
            VectorMayorEdad[i] = ps.esMayorDeEdad(Personas[i].getEdad());
            if (VectorMayorEdad[i] == true) {
                mayorEdad++;
            } else if (VectorMayorEdad[i] == false) {
                menorEdad++;
            }
            
        }
        
        System.out.println("Porcentaje: " 
                    + "\n- Personas con sobrepeso: " +  ((sobrePeso/4)*100) + "%"
                    + "\n- Personas con peso ideal: " + ((pesoIdeal/4)*100) + "%"
                    + "\n- Personas con bajo peso: " +  ((bajoPeso/4)*100) + "%"
                    + "\n- Personas mayores: " +  ((mayorEdad/4)*100) + "%"
                    + "\n- Personas menores: " + ((menorEdad/4)*100)+ "%");

    }

}
