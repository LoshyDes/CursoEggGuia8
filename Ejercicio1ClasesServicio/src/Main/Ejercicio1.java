/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;

/**
 *
 * @author LogiC
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Realizar una clase llamada CuentaBancaria en el paquete Entidades con
         * los siguientes atributos: numeroCuenta(entero), dniCliente(entero
         * largo), saldoActual. Agregar constructor vacío, con parámetros,
         * getters y setters. 
         * 
         * Agregar la clase CuentaBancariaServicio en el
         * paquete Servicios que contenga: 
         * 
         * a) Método para crear cuenta pidiéndole los datos al usuario. 
         * 
         * b) Método ingresar(double): recibe una cantidad de dinero a ingresar 
         * y se le sumará al saldo actual. 
         * 
         * c) Método retirar(double): recibe una cantidad de dinero a retirar 
         * y se le restara al saldo actual. Si la cuenta no tiene la cantidad 
         * de dinero a retirar se retirará el máximo posible hasta dejar la 
         * cuenta en 0.
         * 
         * d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
         * Validar que el usuario no saque más del 20%. 
         * 
         * e) Método consultarSaldo: permitirá consultar el saldo disponible 
         * en la cuenta. 
         * 
         * f) Método consultarDatos: permitirá mostrar todos los datos de 
         * la cuenta.
         *
         */
        
        CuentaBancariaServicio scb = new CuentaBancariaServicio();
        double saldoActual, SaldoModificado;
        CuentaBancaria cb = scb.crearCuentaBancaria();
        
        //b)
        //sacar de el objeto CuentaBancaria el valor del saldo actual (mediante un get)
        saldoActual = cb.getSaldoActual();
        //Mandar a la función "ingresar" el saldo actual para modificarlo y obtenemos un saldo modificado
        SaldoModificado = scb.ingresar(saldoActual);
        //Ingresar al objeto "Cuenta Bancaria" el saldo modificado (por medio de un set)
        cb.setSaldoActual(SaldoModificado);
        
        //c)
        //sacar de el objeto CuentaBancaria el valor del saldo actual (mediante un get)
        saldoActual = cb.getSaldoActual();
        //Mandar a la función "retirar" el saldo actual para modificarlo y obtenemos un saldo modificado
        SaldoModificado = scb.retirar(saldoActual);
        //Ingresar al objeto "Cuenta Bancaria" el saldo modificado (por medio de un set)
        cb.setSaldoActual(SaldoModificado);
        
        //d)
        //sacamos del objeto CuentaBancaria el valor del saldo actual (mediante un get)
        saldoActual = cb.getSaldoActual();
        //Mandamos a la función "extraccionRapida" el valor del saldo actual para modificarlo y obtenemos el saldo restado
        SaldoModificado = scb.extraccionRapida(saldoActual);
        //Ingresamos al objeto el saldo modificado (por medio de un set)
        cb.setSaldoActual(SaldoModificado);
        
        //e)
        //Se consulta el saldo por medio de un get
        System.out.println("El saldo actual es de: " + cb.getSaldoActual());
        
        //f)
        //llamamos para obtener todos los datos con la función ToString
        System.out.println(cb.toString());
    }

}
