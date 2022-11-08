package retos;

import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) throws Exception {
     
         Scanner entrada = new Scanner (System.in);
        System.out.print("Digita el peso de bebe :  \n");
        double peso = Double.parseDouble(entrada.nextLine());
        System.out.print("Digita la edad en meses  del bebe :  \n");
        double edad = Double.parseDouble(entrada.nextLine());

        
        double dosisvacuna=(((peso+10)/(edad*10))*8);
System.out.printf("la dosis por vacuna para un bebe con peso %.2f y  %.2f meses de edad es %.2f",peso,edad,dosisvacuna );
            entrada.close();


    }

    
    
}
