import java.util.Scanner;
public class Sec4cap9Ejer5Adivinaraleatorio {
    public static void main (String[]args){
        int numing;
        double aleatorio;
        numing = 0;
        aleatorio = Math.random();
        aleatorio *= 100;
        aleatorio = Math.round(aleatorio);
        if ((aleatorio > 1) && (aleatorio < 100)){
            System.out.println("Numero Dentro del rango ");
            do  {
                    Scanner entrada = new Scanner(System.in);
                    System.out.println("Ingrese un Numero  "); 
                    numing = entrada.nextInt();  
                    if ((numing > 1) && (numing < 100)){
                        System.out.println("Numero Introducido Permitido " + numing );
                        if  (numing > aleatorio) {
                            System.out.println("Numero Ingresado es mayor que el Aleatorio");
                            }
                         if (numing < aleatorio)  {
                            System.out.println("Numero Ingresado es menor que el Aleatorio");
                            }
                    } 
                    else {
                        System.out.println("ERROR en Numero Numero Ingresado");
                        System.out.println("                                       ");
                      }
                }
                

                
           while (aleatorio != numing);
                {
                System.out.println("ADIVINO el Numero "+ aleatorio + " = "+ numing );
                } 
            
            
        
        }
    }
}