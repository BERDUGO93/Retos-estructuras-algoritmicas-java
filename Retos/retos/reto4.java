package retos;

import java.util.Random;
import java.util.Scanner;

public class reto4 {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        Scanner seleccion = new Scanner(System.in);
        boolean lado;
        boolean moneda = aleatorio.nextBoolean();

        System.out.println("el juego de  lanzamiento de la moneda elige cara o sello  : \n   " + "    1: cara \n" + " 2:sello");
        lado=Boolean.parseBoolean(seleccion.nextLine());
        if (moneda==lado){
            System.out.println(" ganador cara");

        }else {
            System.out.println("ganador sello");
        }
        seleccion.close();
    }
    
}


