/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String marca;
        String origen;
        double costo;
        double impuesto;
        double precioVenta;
        
        System.out.println("Ingrese la marca del automovil");
        marca = entrada.nextLine();
        System.out.println("Ingrese el origen");
        origen = entrada.nextLine();
        System.out.println("Ingrese el costo del automovil");
        costo = entrada.nextDouble();
        
        precioVenta = costo;
        
        if (origen.equals("Alemania")){
            impuesto = (costo * 20) / 100;
            precioVenta =  costo + impuesto;
            System.out.printf("El total a pagar es: %.2f\n"  
                    + "El costo del automovil es:%.2f\n"  
                    + "El origen del automovil es: %.2f\n"  
                    + "Su impuesto es: %.2f\n", precioVenta, costo, 
                    marca, origen, impuesto);
        } else {
            if (origen.equals("Japon")){
                impuesto = (costo * 30) / 100;
                precioVenta = costo + impuesto;
                System.out.printf("Marca del automovil: %.2f\n" 
                    + "El costo del automovil es:%.2f\n" 
                    + "El origen del automovil es: %.2f\n" 
                    + "Su impuesto es: %.2f\n", precioVenta, costo, 
                    marca, origen, impuesto);
            } else {
                if (origen.equals("Italia")){
                impuesto = (costo * 15) / 100;
                precioVenta = costo + impuesto;
                System.out.printf("Marca del automovil: %.2f\n" 
                    + "El costo del automovil es:%.2f\n" 
                    + "El origen del automovil es: %.2f\n" 
                    + "Su impuesto es: %.2f\n", precioVenta, costo, 
                    marca, origen, impuesto);
                } else {
                  if (origen.equals("USA")){
                impuesto = (costo * 15) / 100;
                precioVenta = costo + impuesto;
                System.out.printf("Marca del automovil: %.2f\n" 
                    + "El costo del automovil es:%.2f\n" 
                    + "El origen del automovil es: %.2f\n" 
                    + "Su impuesto es: %.2f\n", precioVenta, costo, 
                    marca, origen, impuesto);  
            }
            }
        }
        
        
        
    }
    
}

