import javax.swing.JOptionPane;
import java.util.Scanner;

public class Sec3cap16Ejer12Mostrarmensajes  {

    public static void main(String []args) {
    int numero1;
    String s = "Suficiente", i = "Insufiente", n = "Notable", b = "Bien", x = "Sobresaliente";

    numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Nota", "Resultado en Base a Nota", JOptionPane.ERROR_MESSAGE));    
    
    
    
    if ((numero1 >= 0) && (numero1 <= 10)) {
        switch (numero1) {
            case 0:System.out.println("Su resultado es " + i);
            break;
            case 1:System.out.println("Su resultado es " + i);
            break;
            case 2:System.out.println("Su resultado es " + i);
            break;
            case 3:System.out.println("Su resultado es " + s);
            break;
            case 4:System.out.println("Su resultado es " + s);
            break;
            case 5:System.out.println("Su resultado es " + b);
            break;
            case 6:System.out.println("Su resultado es " + b);
            break;
            case 7:System.out.println("Su resultado es " + b);
            break;
            case 8:System.out.println("Su resultado es " + n);
            break;
            case 9:System.out.println("Su resultado es " + n);
            break;
            case 10:System.out.println("Su resultado es " + x);
            break;
        }
        
    }
    else System.out.println("Nota Invalida, Ingrese Valor de 0 a 10");
    } 
}