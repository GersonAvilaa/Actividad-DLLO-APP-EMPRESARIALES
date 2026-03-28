/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad;

/**
 *
 * @author gelia
 */
public class Actividad {
    public static void main(String[] args) {

        // Crear 3 objetos
        Ciclista ciclista1 = new Ciclista("Carlos", 25, "Team A", 35.5, 100);
        Ciclista ciclista2 = new Ciclista("Luis", 17, "Team B", 30.2, 80);
        Ciclista ciclista3 = new Ciclista("Ana", 22, "Team C", 32.8, 120);

        // Imprimir 1 atributo de cada objeto
        System.out.println("Nombre ciclista 1: " + ciclista1.getNombre());
        System.out.println("Edad ciclista 2: " + ciclista2.getEdad());
        System.out.println("Equipo ciclista 3: " + ciclista3.getEquipo());
    }
}