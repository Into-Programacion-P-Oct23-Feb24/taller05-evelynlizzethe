/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String articulo;
        int cantidad;
        double precio;
        double costoPedido;
        double descuento;
        
        System.out.println("Ingresar el nombre del articulo");
        articulo= entrada.nextLine();
        System.out.println("Ingresar la cantidad de articulos requeridos");
        cantidad = entrada.nextInt();
        System.out.println("Ingresar el costo del articulo requerido");
        precio= entrada.nextDouble();
        
        costoPedido = cantidad * precio; 
        
        if (cantidad > 50) {
            descuento = (costoPedido *15) / 100;
            costoPedido = (costoPedido - descuento);
            System.out.printf("El costo del pedido: %.2f", costoPedido);
        } else { 
            System.out.printf("El costo del pedido: %.2f", costoPedido);
        }
    }
    
}
