package retos;
import java.util.Scanner;
public class reto3 {
    public static void main(String[] args) {
        int jugador;
        int maquina=(int)(Math.random()*4);
        Scanner seleccion = new Scanner(System.in);

        System.out.println("el juego de piedra papel o tijera");
        System.out.println("selecione la opcion que desee  :   \n"+  "  1 :  piedra  \n" + " 2 :  papel   \n" + " 3 : tijera  \n" );
        jugador=Integer.parseInt(seleccion.nextLine());

        if ((jugador==1)&&(maquina==3)){
            System.out.println("el jugador gana : piedra gana al papel ");
        }else if ((jugador==2)&&(maquina==1)){
            System.out.println("el jugador gana : papel gana a la piedra ");
        }else if((jugador==3)&&(maquina==2)){
            System.out.println("el jugador gana : tijera gana al papel ");
        }else if ((maquina==1)&&(jugador==3)){
            System.out.println("la maquina gana : piedra gana al papel ");
        }else if ((maquina==2)&&(jugador==1)){
            System.out.println("la maquina gana : papel gana a la piedra ");
        }else if ((maquina==3)&&(jugador==2)){
            System.out.println("la maquina gana : tijera  gana al papel ");
        }else {
            System.out.println("partida empatada , no hay ganador");
        }
        seleccion.close();

    }

    }
    

