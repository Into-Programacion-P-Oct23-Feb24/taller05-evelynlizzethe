/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programa04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Programa04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double cpu;
        double teclado;
        double pantalla;
        double raton;
        double costoTotal;
        
        System.out.println("Ingresar el costo del cpu");
        cpu = entrada.nextDouble();
        System.out.println("Ingresar el costo del teclado");
        teclado= entrada.nextDouble();
        System.out.println("Ingresar el costo de la pantalla");
        pantalla = entrada.nextDouble();
        System.out.println("Ingresar el costo del raton");
        raton= entrada.nextDouble();
        
        costoTotal = cpu + teclado + pantalla + raton;
        
        System.out.printf("El valor del cpu es: %.2f\n" 
                    + "El valor del teclado es:%.2f\n" 
                    + "El valor de la pantalla es: %.2f\n" 
                    + "El valor del raton es: %.2f\n", cpu, teclado,
                    pantalla,raton, costoTotal);
        
    }
}
