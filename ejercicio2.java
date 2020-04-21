import java.util.Scanner;
public class ejercicio2 {

    public static void main(String[]args){
    Scanner entradaf = new Scanner(System.in);
    float vhf,d1f,d2f,d3f,d4f, d5f,d6f,d7f,sumaf; 
    
    System.out.println("Digite cantidad de horas trabajadas por dia, del dia 1 al 7");
    d1f = entradaf.nextFloat();
    d2f = entradaf.nextFloat();
    d3f = entradaf.nextFloat();
    d4f = entradaf.nextFloat();
    d5f = entradaf.nextFloat();
    d6f = entradaf.nextFloat();
    d7f = entradaf.nextFloat();
    
    System.out.println("Indique el valor de la hora, para el empleado");
    vhf = entradaf.nextFloat();
    
    sumaf = (d1f + d2f + d3f + d4f + d5f + d6f + d7f)*vhf;
    System.out.println("La cantidad a pagar es  "+ sumaf);

    }    

}