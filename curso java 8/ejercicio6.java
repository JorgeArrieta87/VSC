import java.util.Scanner;
public class ejercicio6 {

    public static void main(String[]args){
    Scanner entradan = new Scanner(System.in);
    double a, b, c, ex;

    System.out.println("Ingrese El valor de A");
    a = entradan.nextFloat();
    System.out.println("Ingrese El valor de B");
    b = entradan.nextFloat();
    
    ex = 2;

    c =  ((Math.pow(a,ex))+ (Math.pow(b,ex))+ ex*a*b);
    
    System.out.println("El cuadrado de una suma es "+ c );
    }    

}