/*
Ciclo "For" 
            Sintaxys 
            for (Inicializacion de variable; condicion;  operador incremento o decremento){
                Instrucciones;
            }

            */
import java.util.Scanner; 

public class Sec4cap4Ciclofor {
    public static void main (String []args){
        int contador; 
        Scanner  entrada = new Scanner(System.in);
        System.out.println("Digite el Tope del Conteo");
        contador = entrada.nextInt();

        for (int i = 0; i < contador; i++){
            System.out.println(i);
        }
        for (int i = 0; i > -contador; i--){
            System.out.println(i);
       }
    }
}