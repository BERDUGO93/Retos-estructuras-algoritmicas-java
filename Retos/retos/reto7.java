package retos;

import java.util.Scanner;

public class reto7 {

    public static void main(String[] args) {
        
        Scanner entrada =new Scanner(System.in);
        float []notas = new float [5];
        float promedio=0;
        float suma=0;
        System.out.println("----ingrese las notas del estudiante----");

        for(int i=0;i<notas.length;i++ ){

            System.out.println("----nota----"+i);
            notas[i]=entrada.nextFloat();

        };
        
          for(int i=0;i<notas.length;i++ ){
            suma=suma+notas[i];
                      }
          
          promedio=suma/notas.length;

          if(promedio>4){
            System.out.println("aprobaste con buenos resultados tu nota final es : " +promedio);
          }else if(promedio>3&&promedio<=4){
            System.out.println("pasaste raspando tu notas final es : "+promedio);
          }else{System.out.println("reprobaste tu nota final es : "+promedio);}

          entrada.close();
    }
    
}
