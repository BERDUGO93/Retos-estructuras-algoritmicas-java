package retos;



public class reto9 {
    public static void main(String[] args) {
       
        String [][]productos=new String[4][4];
        productos[0][0]="coca-cola\n$1000";
        productos[0][1]="pepsi\n$1500";
        productos[0][2]="colombiana\t$1500";
        productos[0][3]="poker\n$2100";
        productos[1][0]="chocolatina\tjet\n$1000";
        productos[1][1]="mentas\t$500";
        productos[1][2]="papas\t limon\n$1000";
        productos[1][3]="trident\tchicles\n$1000";
        productos[2][0]="supercoco\n$500";
        productos[2][1]="huevo\tkinder\n$3000";
        productos[2][2]="papas\t pollo\n$1000";
        productos[2][3]="doritos\t \n$2500";
        productos[3][0]="arequipe\t \n$2500";
        productos[3][1]="bocadillo\t \n$1500";
        productos[3][2]="chomelos\t \n$2500";
        productos[3][3]="galletas\t \n$2500";

        for(int fila=0;fila<productos.length;fila++)
        {

            for (int columna=0;columna<productos.length;columna++){
                System.out.println("producto la posicion  :"+fila+columna+"\t"+productos[fila][columna]);
              
            }

        }
        
       
    }
}
