public class Holamundo {
   public static void main (String[] args){
       System.out.println("Hola Mundo"); // con salto de linea (comentario "//")
       System.out.println("linea sin salto de linea"); // sin salto de linea
   /* esto es un ejemplo 
      de  comentario de 
      varias lineas
    */
    byte  b = 127; //declaracion de variable byte -128 a 127
    short s = 32767; //declaracion de variable short -32768 a 32767  
    int   i = 2147483647; //declaracion de variable short -2147483648 a 2147483647  
    long  l = 1999999999; //declaracion de variable short -9223372854775808 a 9223372854775807
    System.out.println("Valor de Variable Entera tipo byte "+ b);    
    System.out.println("Valor de Variable Entera tipo Short "+ s);
    System.out.println("Valor de Variable Entera tipo int "+ i);
    System.out.println("Valor de Variable Entera tipo int "+ l);

    }
}