import java.util.Scanner;
public class ejercicio5 {

    public static void main(String[]args){
    Scanner entradan = new Scanner(System.in);
    float notap1f, notap2f, notap3f, notap4f, sumanotaf; 
    int   valorp1, valorp2, valorp3, valorp4;
    System.out.println("Ingrese la nota del primera evaluacion 10%");
    notap1f = entradan.nextFloat();
    System.out.println("Ingrese la nota del Segunda evaluacion 25%");
    notap2f = entradan.nextFloat();
    System.out.println("Ingrese la nota del Tercera evaluacion 25%");
    notap3f = entradan.nextFloat();
    System.out.println("Ingrese la nota del primera evaluacion 40%");
    notap4f = entradan.nextFloat();
    
    valorp1 = 10;
    valorp2 = 25;
    valorp3 = 25;
    valorp4 = 40;

    notap1f = ((notap1f*valorp1)/100);
    System.out.println("La nota en el Parcial es " +valorp1+  " y la nota del alumno es "+ notap1f);
   
    notap2f = ((notap2f*valorp2)/100);
    System.out.println("La nota en el Parcial es " +valorp2+  " y la nota del alumno es "+ notap2f);
    
    notap3f = ((notap3f*valorp3)/100);
    System.out.println("La nota en el Parcial es " +valorp3+  " y la nota del alumno es "+ notap3f);
    
    notap4f = ((notap4f*valorp4)/100);
    System.out.println("La nota en el Parcial es " +valorp4+  " y la nota del alumno es "+ notap4f);
    
    sumanotaf = (notap1f+notap2f+notap3f+notap4f);
    System.out.println("La Nota Final del Estudian es   "+ sumanotaf);

    }    

}