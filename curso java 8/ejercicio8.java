import java.util.Scanner;
public class ejercicio8 {

    public static void main(String[]args){
    Scanner entradan = new Scanner(System.in);
    double a, b, c, resultadop, resultadon;


    System.out.println("Ingrese el valor de A");
    a = entradan.nextDouble();
    System.out.println("Ingrese el valor de B");
    b = entradan.nextDouble();
    System.out.println("Ingrese el valor de C");
    c = entradan.nextDouble();
    
    resultadop = -b +Math.sqrt(Math.pow(b,2)) - (4*a*c)/(2*a);
    resultadon = -b -Math.sqrt(Math.pow(b,2)) - (4*a*c)/(2*a);
    
    System.out.println("El valor de  a es " +a);
    System.out.println("El valor de  b es " +b);
    System.out.println("El valor de  c es " +c);
    System.out.println("El valor positivo es " +resultadop);
    System.out.println("El valor negativo es " +resultadon);
    }    

}