/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
         System.out.println("Ingresar el número de dias de hospedaje");
         int dias = scanner.nextInt();
         System.out.println("Ingresar el precio de la habitación por dia");
         double precioDiario = scanner.nextDouble();
         double subtotal = calcularSubtotal(dias, precioDiario);
         double descuento = calcularDescuento(dias, subtotal);
         double total = subtotal - descuento;
         System.out.println("\n Resumen del hospedaje");
         System.out.println("Número de dias: " + dias);
         System.out.println("Precio diario de la habitación: " + precioDiario);
         System.out.printf("Subtotal a pagar: %.2f%n", + subtotal);
         System.out.printf("Descuento: %.2f%n", descuento);
         System.out.printf("Total a pagar: %.2f%n", total);
    }
    public static double calcularSubtotal(int dias, double precioDiario) {
        return dias * precioDiario;
    }
    public static double calcularDescuento(int dias, double subtotal) {
        if (dias > 15){
            return 0.20 * subtotal;
        } else if (dias > 10) { 
            return 0.15 * subtotal;
        } else if (dias > 5) {
            return 0.10 * subtotal;
        }
    }
    
}
