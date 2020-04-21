import java.util.Scanner;
public class ejercicio3 {

    public static void main(String[]args){
    Scanner entradaf = new Scanner(System.in);
    float gf,lf,jf,sumaf; 
    
    System.out.println("Cuanto Dinero tiene Guillermo");
    gf = entradaf.nextFloat();
    
    lf = gf/2;
    System.out.println("Luis tiene "+ lf);
   
    jf = (gf+lf)/2;
    System.out.println("Juan tiene "+ jf);
    sumaf = (gf+lf+jf);
    System.out.println("La cantidad sumada entre los tres es   "+ sumaf);

    }    

}