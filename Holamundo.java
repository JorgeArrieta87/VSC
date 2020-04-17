import java.util.Scanner;       //libreria que permite capturar los datos
import javax.swing.JOptionPane; //libreria que permite ventanas emergentes JOptionPane

public class Holamundo {
   public static void main (String[] args){
       System.out.println("Hola Mundo");               // con salto de linea (comentario "//")
       System.out.println("linea sin salto de linea"); // sin salto de linea
   /* Este conjunto de variables se consideran con datos primitivos
      es decir no aceptan el valor null
    */
    byte   b = 127;        //declaracion de variable byte -128 a 127
    short  s = 32767;      //declaracion de variable short -32768 a 32767  
    int    i = 2147483647; //declaracion de variable int -2147483648 a 2147483647  
    long   l = 1999999999; //declaracion de variable long -9223372854775808 a 9223372854775807
    float  f = 1.4f;       //declaracion de variable float 1.4e-045 a 3.4e+038
    double d = 4.9d;       //declaracion de variable double 4.9e-324 a 1.8e+308 
    char   c; c = 'c';     //declaracion de variable tipo Char, almacenda solo un caracter, debe declararse, e inicializarce 
    boolean boo = true;     //declaracion de variable Booleana
    
    /*
    Declaracion de Variables no Primitivas
    */
    Integer variablenula = null;                 //declaracion de variable no primitiva (acepta el valor "null")
    String cadena = "--Cadena de caracteres--"; //declaracion de variable no primitiva  (cadena de caracteres)
    
    /*
    Declaracion de Constantes
    */
    final int constante = 2020;
    /*
    Impresion de variables en consola
    */

    System.out.println("Valor de Variable Entera tipo "+ b);    
    System.out.println("Valor de Variable Entera tipo Short "+ s);
    System.out.println("Valor de Variable Entera tipo int "+ i);
    System.out.println("Valor de Variable Entera tipo long "+ l);
    System.out.println("Valor de Variable Decimal tipo float "+ f);
    System.out.println("Valor de Variable Decimal tipo double "+ d);
    System.out.println("Valor de Variable tipo char "+ c);
    System.out.println("Valor de Variable tipo Booleana "+ boo);
    System.out.println("Valor de Variable tipo No Primitiva "+ variablenula);
    System.out.println("Valor de Variable tipo No Primitiva "+ cadena);
    System.out.println("Valor de Constante "+ constante);
    
    //Seccion 1 Capitulo 9 Entrada y Salida de datos
    
    //Declaracion de entrada de Dato Entero
    Scanner entradai = new Scanner(System.in);
    System.out.println("Digite Numero");
    i = entradai.nextInt();
    System.out.println("el Numero es  "+ i);

    //Declaracion de entrada de Dato float
    Scanner entradaf = new Scanner(System.in);
    System.out.println("Digite Numero decimal");
    f = entradaf.nextFloat();
    System.out.println("el Numero es  "+ f);

    //Declaracion de entrada de Dato double
    Scanner entradad = new Scanner(System.in);
    System.out.println("Digite Numero decimal");
    d = entradad.nextFloat();
    System.out.println("el Numero es  "+ d);

    //Declaracion de entrada de Dato String
    Scanner entradas = new Scanner(System.in);
    System.out.println("Digite una cadena");
    cadena = entradas.next();
    System.out.println("La cadena es  "+ cadena);

    //Declaracion de entrada de Dato String linea completa
    Scanner entradal = new Scanner(System.in);
    System.out.println("Digite una cadena");
    cadena = entradal.nextLine();
    System.out.println("La cadena es  "+ cadena);

    //Declaracion de entrada de Caracter
    Scanner entradac = new Scanner(System.in);
    System.out.println("Digite un caracter");
    c = entradac.next().charAt(0); //el comando .charAt(0); el valor del numero indica la posicion a guardar dentro de la cadena
    System.out.println("La cadena es  "+ c);
    
    
    //Seccion 1 Capitulo 10 Entrada y Salida de datos con JOptionPane
    cadena = JOptionPane.showInputDialog("Digite una Cadena");                       //Genera ventana emergente con el string indicado
    i = Integer.parseInt(JOptionPane.showInputDialog("Digite Un numero entero ")); //Integer.parseInt convierte de formato texto a Intero
    c = JOptionPane.showInputDialog("Digite un Caracter").charAt(0);                //.charAt(0) indica la posicion a leer en base a la cadena de caracteres, de izquierda a derecha
    d = Double.parseDouble(JOptionPane.showInputDialog("Digite un Decimal"));       //Double.parseDouble permite convertir texto a decimal 
    f = Float.parseFloat(JOptionPane.showInputDialog("Digite un decimal extenso"));         //Float.parseFloat permite convertir texto a decimal 

    /* este conjunto de lineas permiten entregar los datos almacenados en las variables antes guardadas
       en memoria, atraves de la JOptionPane.showMessageDialog    */
    JOptionPane.showMessageDialog(null, "La cadena es "+ cadena);               
    JOptionPane.showMessageDialog(null, "El numero es  "+ i);
    JOptionPane.showMessageDialog(null, "El caracter es  "+ c);
    JOptionPane.showMessageDialog(null, "El valor decimal  es  "+ d);
    JOptionPane.showMessageDialog(null, "El valor decimal extenso  es  "+ f);
}

}
