import java.util.Scanner;
public class ejercicio2 {

    public static void main(String[]args){
    Scanner entradaf = new Scanner(System.in);
    float n1f,n2f,n3f,sumaf; 
    
    System.out.println("Digite Tres Notas");
    n1f = entradaf.nextFloat();
    n2f = entradaf.nextFloat();
    n3f = entradaf.nextFloat();
    sumaf = n1f + n2f + n3f;
    System.out.println("La nota es  "+ sumaf);

    }    

}