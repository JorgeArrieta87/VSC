import java.util.Scanner;
import javax.swing.JOptionPane;

public class  Sec4cap21Ejer17Resumenventas {
<<<<<<< HEAD
    public static void main  (String[] args) {
        int codart;
         int cantlitrs, prelitrs, factotal, cod1art, i = 0, numero, multiplicacion;
        boolean codartvalido = false;
        boolean cantlitrsvalido = false;
        boolean prelitrsvalido = false;
        Scanner entradacod = new Scanner(System.in);
        Scanner entradacan = new Scanner(System.in);
        Scanner entradapre = new Scanner(System.in);
=======
    public static void main (final String[] args) {
        int codart;
        final int cantlitrs, prelitrs, factotal, cod1art, i = 0, numero, multiplicacion;
        boolean codartvalido = false;
        final boolean cantlitrsvalido = false;
        final boolean prelitrsvalido = false;
        final Scanner entradacod = new Scanner(System.in);
        final Scanner entradacan = new Scanner(System.in);
        final Scanner entradapre = new Scanner(System.in);
>>>>>>> origin/desarrollo
    while (i > 5);{
                     do {
                             System.out.println("Digite Codigo del Articulo");
                             codart = entradacod.nextInt();
                             if ((codart > 0 )  && (codart <= 5))
                            {
                                    codartvalido = true;
                            }    
                            else 
                            {
                                    System.out.println("====--- Error ----===");
                                    System.out.println("Digite Codigo del Articulo CORRECTO");  
                            }
                        }
                    while (codartvalido == false); {
                             System.out.println("Codigo Guardado");     
                            }
                    

                        }
   
//###############################################################################   
    }    
    
}
    
