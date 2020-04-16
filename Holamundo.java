public class Holamundo {
   public static void main (String[] args){
       System.out.println("Hola Mundo"); // con salto de linea (comentario "//")
       System.out.println("linea sin salto de linea"); // sin salto de linea
   /* esto es un ejemplo 
      de  comentario de 
      varias lineas
    */
    byte   b = 127;        //declaracion de variable byte -128 a 127
    short  s = 32767;      //declaracion de variable short -32768 a 32767  
    int    i = 2147483647; //declaracion de variable int -2147483648 a 2147483647  
    long   l = 1999999999; //declaracion de variable long -9223372854775808 a 9223372854775807
    float  f = 1.4f;       //declaracion de variable float 1.4e-045 a 3.4e+038
    double d = 4.9d;       //declaracion de variable double 4.9e-324 a 1.8e+308 
    char   u; u = 'u';     //declaracion de variable tipo Char, almacenda solo un caracter, debe declararse, e inicializarce 
    boolean boo = true;     //declaracion de variable Booleana
    
    System.out.println("Valor de Variable Entera tipo" + b);    
    System.out.println("Valor de Variable Entera tipo Short "+ s);
    System.out.println("Valor de Variable Entera tipo int "+ i);
    System.out.println("Valor de Variable Entera tipo long "+ l);
    System.out.println("Valor de Variable Decimal tipo float "+ f);
    System.out.println("Valor de Variable Decimal tipo double "+ d);
    System.out.println("Valor de Variable tipo char "+ u);
    System.out.println("Valor de Variable tipo Booleana "+ boo);
    }
}