/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double costoMinutos;
        double consumoMinutos;
        double totalConsumido;
        
        System.out.println("Ingresar el costo por minutos de la operadora");
        costoMinutos = entrada.nextDouble();
        System.out.println("Ingresar el consumo mensual");
        consumoMinutos= entrada.nextDouble();
        
        totalConsumido = costoMinutos * consumoMinutos;
        
        System.out.printf("El total a pagar es de: %.2f", totalConsumido);
    }
    
}
