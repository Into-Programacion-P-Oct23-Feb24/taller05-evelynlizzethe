/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        double gastosHijo1;
        double gastosHijo2;
        double gastosHijo3;
        double gastoTotal;
        
        System.out.println("Ingresar los gastos del hijo 1");
        gastosHijo1 = entrada.nextDouble();
        System.out.println("Ingresar los gastos del hijo 2");
        gastosHijo2 = entrada.nextDouble();
        System.out.println("IIngresar los gastos del hijo 3");
        gastosHijo3 = entrada.nextInt();
        
        gastoTotal = gastosHijo1 + gastosHijo2 + gastosHijo3;
        
        System.out.printf("El gasto mensual es de: %.2f", gastoTotal);
    }
    
}
