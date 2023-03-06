/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciociodetrabajador;

/**
 *
 * @author kevin
 */
public class Trabajador {
    
    private int horasTrabajadas;
    private double tarifa;

    public Trabajador() {
        this.horasTrabajadas = 0;
        this.tarifa = 0;
    
    }

    Trabajador(int i, double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public double getTarifa(){
    return this.tarifa;
    }
    
    public int getHorasTrabajadas(){
        return this.horasTrabajadas;
    }
    public void setTarifa(){
        this.tarifa = tarifa;
    }
    public void setHorasTrabajadas(){
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public double calcularsueldo(){
        return this.horasTrabajadas*tarifa;
    }

    String calcularSueldo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setTarifa(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
