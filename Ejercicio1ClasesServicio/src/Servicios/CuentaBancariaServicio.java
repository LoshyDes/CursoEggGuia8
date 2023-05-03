/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class CuentaBancariaServicio {
    
    
    private Scanner leer = new Scanner(System.in);
    
    public CuentaBancaria crearCuentaBancaria() {
        
        System.out.println("Ingrese el número de la cuenta: ");
        int numeroCuenta = leer.nextInt();
        
        System.out.println("Ingrese el dni del cliente: ");
        long dniCliente = leer.nextLong();
        
        System.out.println("Ingrese el saldo actual: ");
        double saldoActual = leer.nextDouble();
        
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }
    
    public double ingresar(double saldoActual) {
        System.out.println("Ingrese la cantidad de dinero a depositar: ");
        double saldoNuevo = leer.nextDouble();
        saldoActual += saldoNuevo;
        return saldoActual;
    }
    
    public double retirar(double saldoActual) {
        System.out.println("Ingrese la cantidad de dinero a retirar: ");
        double saldoRetirar = leer.nextDouble();
        saldoActual += saldoRetirar;
        return saldoActual;
    }
    
    public double extraccionRapida(double saldoActual) {
        System.out.println("Extracción rápida: \nUsted sólo puede retirar hasta un 20% de su saldo actual");
        System.out.println("Saldo actual: " + saldoActual);
        System.out.println("Un 20% de su saldo actual es de: " + (saldoActual * 0.2));
        System.out.println("Ingrese el monto a retirar: ");
        double montoRetirar = leer.nextDouble();
        if (montoRetirar > (0.2 * saldoActual)) {
            System.out.println("El monto a retirar es superior al 20% del saldo");
            System.out.println("No se retirará nada de plata");
        } else {
            System.out.println("Se retirarán " + montoRetirar + " pesos de sus " + saldoActual + " pesos");
            saldoActual -= montoRetirar;
        }
        return saldoActual;
    }
}
