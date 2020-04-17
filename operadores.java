import java.util.Scanner; //libreria que permite capturar los datos

    public class operadores {
    // Cap  2 Operadores Aritmeticos Seccion 2 

        public static void main (String[] args) {
            
            //Captura de entrada de Dato 
            Scanner entradaf = new Scanner(System.in);
            
            //Declaracion de Varible Tipo Float
            float n1f, n2f, suman1n2f, restan1n2f, multin1n2f, divin1n2f, resin1n2f;                           
            
            //Impresion de Mensaje en consola
            System.out.println("Digite dos Numeros decimales");
            
            //Almacenamiento de Varible en Memoria
            n1f = entradaf.nextFloat();
            n2f = entradaf.nextFloat();
            
            //Operacion Suma usando Variable guardadas en Memoria
            suman1n2f = (n1f + n2f);
            System.out.println("La suma de los dos Numeros decimales es  "+ suman1n2f);

            //Operacion Resta usando Variable guardadas en Memoria
            restan1n2f = (n1f - n2f);
            System.out.println("La Resta de los dos Numeros decimales es  "+ restan1n2f);

            //Operacion Multiplicacion usando Variable guardadas en Memoria
            multin1n2f = (n1f * n2f);
            System.out.println("La Multiplicacion de los dos Numeros decimales es  "+ multin1n2f);

            //Operacion Division usando Variable guardadas en Memoria
            divin1n2f = (n1f / n2f);
            System.out.println("La division de los dos Numeros decimales es  "+ divin1n2f);

            //Operacion Residuo usando Variable guardadas en Memoria
            resin1n2f = (n1f % n2f);
            System.out.println("El residuo de la division es  "+ resin1n2f);


        }


}