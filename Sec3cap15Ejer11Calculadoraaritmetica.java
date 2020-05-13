import javax.swing.JOptionPane;
import java.util.Scanner;

public class Sec3cap15Ejer11Calculadoraaritmetica {

    public static void main(String []args) {
    int numero1, numero2, resultado;
    char o; o = ' ';
    String s = "Suma", r = "Resta", m = "Multiplicacion", d = "Division";

    numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Numero 1", "Calculadora", JOptionPane.ERROR_MESSAGE));    
    numero2= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Numero 2", "Calculadora", JOptionPane.ERROR_MESSAGE));    
    System.out.println("Escoja Operacion, Indique en Mayuscula la primera letra de Operacion");
    Scanner entradaoperacion = new Scanner(System.in);
    o = entradaoperacion.next().charAt(0);
    
    if (o == 'S' || o == 'R' || o == 'M' || o == 'D') {
        if (o == 'S'){
            resultado = numero1 + numero2; 
            System.out.println("Operacion "+ s +" "+ resultado );
        }
        else if (o == 'R'){
            resultado = numero1 - numero2; 
            System.out.println("Operacion "+ r +" "+ resultado );
        }
        else if (o == 'M'){
            resultado = numero1 * numero2; 
            System.out.println("Operacion "+ m +" "+ resultado );
        }
        else if (o == 'D'){
            resultado = numero1 / numero2; 
            System.out.println("Operacion "+ d +" "+ resultado );
        }    
        
    }
    else System.out.println("Operacion no Reconocida");
    } 
}