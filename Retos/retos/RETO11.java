package retos;

public class RETO11 {

    Scanner entrada = new Scanner(System.in);
     private String tipoDoc,documento,nombre,apellido,sexo;
   private float peso,estatura,pesoActual;
    private int edad;
   
   
    public void pedirDatods( ){

        System.out.println("---ingrese el tipo de documento del paciente----");
        tipoDoc=entrada.next();
        System.out.println("----ingrese el numero de documento----");
        documento=entrada.next();
        System.out.println("----ingrese el nombre del paciente");
        nombre=entrada.next();
        System.out.println("----ingrese el apellido del paciente----");
        apellido=entrada.next();
        System.out.println("----ingrese el peso del paciente----");
        peso=entrada.nextFloat();
        System.out.println("---- ingrese la estatura del paciente----");
        estatura=entrada.nextFloat();
        System.out.println("----ingresa la edad del paciente");
        edad=entrada.nextInt();
        System.out.println("---- ingrese el sexo del paciente");
        sexo=entrada.next();

    }
    public void mostraPersona(){
        System.out.println("__________________________________");
        System.out.println("tipo de documento :   "+tipoDoc);
        System.out.println("documento numero :  "+documento);
        System.out.println("Nombre del paciente  : "+nombre);
        System.out.println("apellido del paciente  "+apellido);
        System.out.println("peso del paciente  "+peso+"Kg");
        System.out.println("estatura del paciente  :"+estatura);
        System.out.println("edad del paciente  : " +edad);
        System.out.println("sexo del paciente : "+sexo);
        System.out.println("________________________________________");
    
    }
    public String calcularmc(String pesobajo){

        pesoActual=peso/(estatura*2);

        if (pesoActual<=20){
            System.out.println("el peso esta debajo de lo ideal");
            return pesobajo;
        }
        else if(pesoActual>=20&&pesoActual<=25){
            System.out.println("el peso es ideal");
        }else{System.out.println("tiene sobrepeso el paciente");}
        System.out.println("__________________________________________");
    }
    public void mayorEdad(){
        if(edad<18){
            System.out.println("el paciente es menor de edad");
        }else{System.out.println("el paciente es mayor de edad");}
    }
}
