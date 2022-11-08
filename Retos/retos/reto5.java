package retos;

import java.util.Scanner;

public class reto5 {
    public static void main(String[] args) {
        
        int cantidadP,precio,total=0;
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese la cantidad de productos ");
        cantidadP=Integer.parseInt(entrada.nextLine());

       for (int i=1 ; i <=cantidadP;i++){
            
            System.out.println("ingrese el precio del producto  "+i);
            precio=Integer.parseInt(entrada.nextLine());

              total=precio+total;

       }
       System.out.println("el precio total a pagar es  : "+total);
       entrada.close();

    }
    
}
