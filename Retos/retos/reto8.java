package retos;

import java.util.Scanner;

public class reto8 {
    public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in); 
            int cantidad=0;
            float time=0;
         
            System.out.println("cantidad de nadadores ");
            cantidad=entrada.nextInt();
            String[] nadadores =new String[cantidad];
            Float [] tiempos = new Float[cantidad];


            for(int i=0;i<cantidad;i++){
                System.out.println("ingrese el nombre del nadador"+i);
                nadadores[i]=entrada.next();
                
            }
            for (int i=0;i<tiempos.length;i++){
                System.out.println("ingrese el tiempo del nadador"+i);
                tiempos[i]=entrada.nextFloat();
                
            }
            for (int i=0;i<cantidad;i++)
                {
                System.out.println("el nadador "+nadadores[i]+"   hizo un tiempo de   "+tiempos[i]);
                   
                }

             for (int i=1;i<tiempos.length;i++){
                time=tiempos[0];
                if (tiempos[i]<time)
                {time=tiempos[i];}
                else{   System.out.println("el nadador ganador hizo "+time);}
               
             }   
             entrada.close();

            }
         
         }
        
        
    
    
