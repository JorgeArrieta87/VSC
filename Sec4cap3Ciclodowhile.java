//do While, ejecuta el ciclo por lo menos una vez, y posterior evalua la condicion
import java.util.Scanner; 

public class Sec4cap3Ciclodowhile {
    public static void main (String []args){
        int i = 0;
        do {            //do "hacer" 
            ++i;
        }
        while (i < 9); //while "mientras"
        {
            
            System.out.println(i);
        }
       
       // segundo ejercisio dentro de la misma clase
        int contador;
        i =0;
        Scanner  entrada = new Scanner(System.in);
        System.out.print("Digite el Tope del Conteo");
        contador = entrada.nextInt();

        do {
            System.out.println(i);
            i+=3; // permite saltos de 3 en 3
        } while (i < contador);
    }
}