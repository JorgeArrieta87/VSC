import java.util.Scanner;
public class ejercicio4 {

    public static void main(String[]args){
    Scanner entradaf = new Scanner(System.in);
    float avf,acf,sumaf; 
    final int porcenventaf = 5;
    final int sueldo = 1000;
    final int comisionv = 150;
    System.out.println("Ingrese el valor del Auto");
    avf = entradaf.nextFloat();
    System.out.println("Ingrese la cantidad de los Autos");
    acf = entradaf.nextFloat();
    
    avf = ((avf*acf)*porcenventaf)/100;
    System.out.println("El monto de la comision por volumen de venta  "+ avf);
   
    acf = acf*comisionv;
    System.out.println("El monto de  comision por venta  "+ acf);
    sumaf = (avf+acf+sueldo);
    System.out.println("El sueldo del vendedor es   "+ sumaf);

    }    

}