/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciociodetrabajador;

/**
 *
 * @author kevin
 */
public class Principal {

    public static void main(String[] args) {
        Trabajador trabajador1  =  new Trabajador(40, 8.50);
        Trabajador trabajador2 = new Trabajador(35, 7.75);
        
        
       System.out.println("El sueldo del trabajador 1 es: " + trabajador1.calcularSueldo());
        System.out.println("El sueldo del trabajador 2 es: " + trabajador2.calcularSueldo());

        
        
        trabajador1.setTarifa(9.00);
        trabajador2.setTarifa(8.25);

        System.out.println("El nuevo sueldo del trabajador 1 es: " + trabajador1.calcularSueldo());
        System.out.println("El nuevo sueldo del trabajador 2 es: " + trabajador2.calcularSueldo());
    }
}
