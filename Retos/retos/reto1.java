package retos;

import java.util.Scanner;

public class reto1 {

    public static void main(String[] args) throws Exception {

         Scanner entrada = new Scanner(System.in);
            System.out.print("Digite la temperatura en grados farenheit que desea convertir  : \n");
            double Gfarenheit = Double.parseDouble(entrada.nextLine());
            System.out.println();
            double centigrados =((Gfarenheit-32)/1.8);
            

            System.out.printf("%.2f Farenheit equivalen a  =   %.2f Centigrados de temperatura\n",Gfarenheit,centigrados);
        
     

            entrada.close();
        }
        

    }

    

       
    

