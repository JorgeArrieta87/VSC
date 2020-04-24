import java.util.Scanner;
public class ejercicio7 {

    public static void main(String[]args){
    Scanner entradan = new Scanner(System.in);
    int s, d, h, ch;


    System.out.println("Ingrese la cantidad de horas");
    ch = entradan.nextInt();
    
    s = ch/168;   //calculo semana
    d = ch%168/24; //guardado de residuo
    h = ch%24;   //calculo de dia
    
    
    System.out.println("La cantidad de horas ingresadas representan " + s + " semanas " + d + " dias " + h +" horas");
    }    

}