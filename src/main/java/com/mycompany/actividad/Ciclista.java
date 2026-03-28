/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad;

/**
 *
 * @author gelia
 */
public class Ciclista {

    private String nombre;
    private int edad;
    private String equipo;
    private double velocidadPromedio;
    private int kilometrosRecorridos;

    public Ciclista(String nombre, int edad, String equipo, double velocidadPromedio, int kilometrosRecorridos) {
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
        this.velocidadPromedio = velocidadPromedio;
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    // Métodos adicionales (5)
    public void acelerar(double incremento) {
        velocidadPromedio += incremento;
    }

    public void frenar(double decremento) {
        velocidadPromedio -= decremento;
    }

    public void recorrer(int km) {
        kilometrosRecorridos += km;
    }

    public String mostrarInfo() {
        return "Nombre: " + nombre + ", Equipo: " + equipo;
    }

    public boolean esMayorEdad() {
        return edad >= 18;
    }
}