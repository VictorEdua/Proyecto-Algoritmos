/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;



/**
 *
 * @author Victor 
 */
public class ProyectoFinal {   
    
    public static void proyecto(){
        
        
        Scanner sc = new Scanner(System.in);
    
     int opcion, numproductos, cantidad = 0, formadepago, totalproductos = 0, ventasrealizadas = 0,  ventasefectivo = 0, ventastarjeta = 0, ventastransferencia = 0, productosventa = 0;
     String nombre, numerotarjet, codigoseguridadtarjet, codigo;
     double precio = 0, subtotal = 0, montodesc , descuento = 0, IVA, total = 0, efectivo = 0, cambio = 0, totalvendido = 0, promedioventas = 0, ventaMenor = 0 , ventaMayor = 0;
     
    
        do {
            System.out.println("================================\n");
            System.out.println("          MENU PRINCIPAL           \n");
            System.out.println("================================\n");
            System.out.println("1. Resgistrar una venta\n");
            System.out.println("2. Consultar caja\n");
            System.out.println("3. Mostrar estadisticas\n");
            System.out.println("4. Salir\n");
            System.out.println("=================================");
            opcion = sc.nextInt();
            
            if (opcion == 4) {
                System.out.println("Muchas Gracias");
                
            }else if (opcion < 1 || opcion > 4) {
                System.out.println("Opcion Invalida");
                System.out.println("Ingrese una opcion valida");
                
                
            }
            
           switch(opcion){
           
               case 1:
                   
                   subtotal = 0;
                   descuento = 0;
                   efectivo = 0;
                   cambio = 0;
                   productosventa = 0;
                                                     
                   
                   System.out.println("¿Cuantos productos tendrá la compra?");
                   numproductos = sc.nextInt();
                   while (numproductos <= 0) {
                       System.out.println("Debe ingresar al menos 1 producto. Intente nuevamente:");
                       numproductos = sc.nextInt();
                   }
                     sc.nextLine();
                   for (int i = 0; i < numproductos; i++) {
                       
                       System.out.println("Ingrese el codigo del producto: ");
                       codigo = sc.nextLine();
                       
                       
                       
                       System.out.println("Ingrese el nombre del producto: ");
                       nombre = sc.nextLine();
                       System.out.println("Ingrese el precio del producto: ");
                       precio = sc.nextDouble();
                       while (precio <= 0) {
                            System.out.println("El precio debe ser mayor que 0. Ingrese nuevamente:");
                            precio = sc.nextDouble();
                       }
                       System.out.println("Ingrese la cantidad del producto: ");
                       cantidad = sc.nextInt();
                       while (cantidad <= 0) {
                          System.out.println("La cantidad debe ser mayor que 0. Ingrese nuevamente:");
                          cantidad = sc.nextInt();
                       }
                       productosventa += cantidad;
                       totalproductos += cantidad;
                       
                       subtotal += precio * cantidad;
                   
                   
                       
                   }
                   
                   
                  if (subtotal < 200) {
                        System.out.println("No aplica descuento");
                        descuento = 0;
                       
                   }else if (subtotal >= 200 && subtotal <=499.99) {
                       System.out.println("Aplica un descuento del  5%");
                       descuento = subtotal * 0.05; 
                       
                   }else if (subtotal>= 500 && subtotal <= 999.99) {
                       System.out.println("Aplica un descuento del 8%");
                       descuento = subtotal * 0.08;
                       
                   }else{
                   System.out.println("Aplica un descuento del 10%");
                   descuento = subtotal *  0.10;
                   }
                  montodesc = subtotal - descuento;
                    IVA = montodesc * 0.12;
                    total = montodesc + IVA;
                        
                   System.out.println("Su total a pagar es de : " + total);
                   
                   System.out.println("Eliga su forma de pago: \n"+
                           "1. Efectivo\n"+
                           "2. Tarjeta\n"+
                           "3. Transferencia");
                   formadepago = sc.nextInt();
                   
                   while (formadepago < 1 || formadepago > 3) {
                   System.out.println("Opcion invalida. Ingrese 1, 2 o 3:");
                   formadepago = sc.nextInt();
                   }
                   
                   if (ventasrealizadas == 0) {
                       ventaMenor = total;
                       ventaMayor = total;
                   }else {
                    if (total > ventaMayor) {
                       ventaMayor = total;
                    }
                     if (total < ventaMenor) {
                          ventaMenor = total;
                       }
                         } 
                   
                   
                   switch(formadepago){
                     
                       case 1:
                           
                           System.out.println("Ingrese el efectivo: ");
                           efectivo = sc.nextDouble();
                           
                           ventasefectivo++;
                           
                           
                           
                           while (efectivo < total){
                           
                               System.out.println("El efectivo es insuficiente");
                               System.out.println("Ingrese nuevamente el efectivo, por favor");
                               efectivo = sc.nextDouble();
                           
                                
                           }
                           cambio = efectivo - total;   
                          
                           
                           
                           break;
                           
                       case 2:
                           sc.nextLine();
                           System.out.println("Ingrese el numero de su tarjeta: ");
                           numerotarjet = sc.nextLine();
                           
                           System.out.println("Ingrese el codigo de seguridad de su tarjeta: ");
                           codigoseguridadtarjet = sc.nextLine();
                           
                           System.out.println("La compra se a realizado con exito!!!");
                           ventastarjeta++;
                     
                           break;
                           
                           
                       case 3:
                           
                           System.out.println("Realice la tranferencia a este numero de cuenta: 3180068458 VICTOR EDUARDO GOMEZ PAZ, Tipo de cuenta: Monetaria");
                           ventastransferencia++;
                           
                           break;
                           
                       default:
                           System.out.println("No ingreso una opcion valida");
                           
                           break;
                   
                   
                   }
                   ventasrealizadas++;
                   totalvendido += total;
                   promedioventas = (totalvendido/ventasrealizadas); 
                   
                   
                   
                   
                    System.out.println("============0RESUMEN DE SU COMPRA==================");
                    
                    System.out.println("La cantidad de productos que lleva son: " + productosventa);
                    System.out.println("El subtotal es: Q" + subtotal);
                    System.out.println("El monto es: Q" + montodesc);
                    System.out.println("EL descuento es: Q" + descuento);
                    System.out.println("El total del IVA es: " + IVA);
                   System.out.println("El total de la compra es: Q" + total);
                   System.out.println("===================================================");
                   
                   switch(formadepago){

    case 1:
        System.out.println("Forma de pago: Efectivo");
        System.out.println("Efectivo recibido: Q" + efectivo);
        System.out.println("Su cambio es: Q" + cambio);
        break;

    case 2:
        System.out.println("Forma de pago: Tarjeta");
        break;

    case 3:
        System.out.println("Forma de pago: Transferencia");
        break;
        
   
        
    
}
                   
                   
                   
              break;     
                  
                   
               case 2:
                   
                        System.out.println("======================CONSULTAR CAJA========================");
                        System.out.println("El total de ventas realizadas es: " + ventasrealizadas  );
                        System.out.println("El total de productos vendidos son: " + totalproductos);
                        System.out.println("El valor total de lo vendido es: " + totalvendido);
                        System.out.println("El total de ventas en efectivo es. " + ventasefectivo);
                        System.out.println("El total de ventas con tarjeta es: " + ventastarjeta);
                        System.out.println("El total de ventas con transferencia es: " + ventastransferencia);
                        System.out.println("=============================================================");
                   
                   
                   break;
                   
                   
               case 3:
                   if (ventasrealizadas == 0) {
                       System.out.println("No existen ventas realizadas");
                       break;
                   }
                   
                   System.out.println("===================ESTADISTICAS======================");
                   System.out.println("El número total de ventas es: " + ventasrealizadas);
                   System.out.println("La cantidad total de productos vendidos es: " + totalproductos);
                   System.out.println("El total de dinero vendido es: " + totalvendido);
                   System.out.println("El promedio de dinero por venta es: " + promedioventas);
                   System.out.println("Cantidad de ventas por efectivo: " + ventasefectivo);
                   System.out.println("Cantidad de ventas por tarjeta: " + ventastarjeta);
                   System.out.println("Cantidad de ventas por tranferencia:" + ventastransferencia);
                   System.out.println("La venta Mayor es " + ventaMayor);
                   System.out.println("La venta menor es: " + ventaMenor);
                   System.out.println("=====================================================");
                   break;
                   
                   
               default:
           
           
           }
            
            
            
            
            
            
            
        } while (opcion != 4);
        
        
        
                
            
       
                
            }
    
    }

