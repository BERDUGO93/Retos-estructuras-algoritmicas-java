package retos;


import java.util.Scanner;

public class reto6 {
    public static void main(String[] args) {
        int apuesta,Njuegos=0,select,aleatorio,winner=0,lose=0,acumulado=0,ganancia=0;
     int stop = 1;
        
        Scanner entrada = new Scanner(System.in);
        aleatorio=(int)(Math.random()*2);
      
       do {

        System.out.println("el juego de  lanzamiento de la moneda elige cara o sello  : \n" + "  0: cara \n" + " 1:sello");
        select=Integer.parseInt(entrada.nextLine());
        System.out.println("ingrese la cantidad que desea apostar");
        apuesta=Integer.parseInt(entrada.nextLine());
        
        if (select==0 &&aleatorio==0 ){
            winner=winner+1;
            System.out.println(" jugador gana salio cara y la maquina saco cara");
            ganancia=apuesta*2;
            acumulado=acumulado+ganancia;
        }else if (select==1 && aleatorio==1){
            winner=winner+1;
            System.out.println("jugador gana salio sello y la maquina saco sello");
            ganancia=apuesta*2;
            acumulado=acumulado+ganancia;
        } else if (select==0&& aleatorio==1) {
            lose=lose+1;
            System.out.println("ha perdido jugador selecciono cara , la maquina saco sello");
            
            acumulado=acumulado-apuesta;
        } else if(select==1&&aleatorio==0){
            lose=lose+1;
            System.out.println("ha perdido jugador selecciono sello , la maquina saco cara");
           
            acumulado=acumulado-apuesta;
        }
            Njuegos=Njuegos+1;
        System.out.println("-----marcador-----");
        System.out.println("-----Total partidas jugadas-----:  " +Njuegos);
        System.out.println("-----Rondas ganadas-----:"+winner);
        System.out.println("-----Rondas Perdidas-----:"+lose);
        System.out.println("-----Valor apostador-----"+apuesta);
        System.out.println("-----Total acumulado----- :"+acumulado);
        System.out.println("----- Desear seguir jugando------ ; \n 1:si  \n 2:no");
        stop=Integer.parseInt(entrada.nextLine());

        

    }while(stop==1);

        entrada.close();

    }
}

