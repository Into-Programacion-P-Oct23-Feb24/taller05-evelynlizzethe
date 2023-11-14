/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        double costoKilovatio;
        double consumoKilovatio;
        int edad;
        double costoPlanilla;
        double descuento; 
        
        System.out.println("Ingresar el costo por Kilovatio");
        costoKilovatio = entrada.nextDouble();
        System.out.println("Ingresar el consumo mensual por Kilovatio");
        consumoKilovatio = entrada.nextDouble();
        System.out.println("Ingresar su edad");
        edad = entrada.nextInt();
        
        costoPlanilla = costoKilovatio * consumoKilovatio ; 
        if (edad > 65){
            descuento = (costoPlanilla *10) / 100;
            costoPlanilla = (costoPlanilla - descuento);
            System.out.printf("El valor a pagar es: %.2f", costoPlanilla);
        } else {
            PrintStream printf = System.out.printf("El valor a pagar es: %.2f",
                    costoPlanilla);
            
       
        }
    }
    
}
