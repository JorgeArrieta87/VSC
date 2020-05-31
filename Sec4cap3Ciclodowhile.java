//do While, ejecuta el ciclo por lo menos una vez, y posterior evalua la condicion
import java.util.Scanner; 

public class Sec4cap3Ciclodowhile {
    public static void main (String []args){
        int i = 0;
        do {            //do "hacer" 
            ++i;
            System.out.println(i);
        }
        while (i < 9); //while "mientras"
        {
            
            System.out.println("cuando el valor sea  --" + i + "  se dejara de repetir el ciclo");
        }
       
       // segundo ejercisio dentro de la misma clase
        int contador;
        i =0; // Se lleva la variable a "0", para poder continuar con el programa
        Scanner  entrada = new Scanner(System.in);
        System.out.println("Digite el Tope del Conteo");
        contador = entrada.nextInt();

        do {
            System.out.println(i);
            i+=3; // permite saltos de 3 en 3
        } while (i < contador);
    }
}