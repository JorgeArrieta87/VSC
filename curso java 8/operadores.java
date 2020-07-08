import java.util.Scanner;       //libreria que permite capturar los datos
import javax.swing.JOptionPane; //libreria que permite ventanas emergentes JOptionPane
import javax.swing.ImageIcon;   //libreria que permite importar un icono
   
    public class operadores {
    // Cap  2 Operadores Aritmeticos Seccion 2 

        public static void main (String[] args) {
            
            //Captura de entrada de Dato 
            Scanner entradaf = new Scanner(System.in);
            
            //Declaracion de Varible Tipo Float
            float n1f, n2f, suman1n2f, restan1n2f, multin1n2f, divin1n2f, resin1n2f;                           
            double n1d,n2d;
            long   n1l,n2l;
            ImageIcon icon = new ImageIcon("C:/Users/exjaros/Desktop/VSC/icon.png"); 
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

    // Cap  2 Operadores Aritmeticos con Asignaciones Seccion 3
             
            //Operacion Suma usando Variable guardadas en Memoria
             n1f += n2f; //Metodo Alternativo de operacion suma
            // La operacion guarda la suma en la Variable "n1f"
            
            JOptionPane.showMessageDialog(null,     "El valor de la suma es " + n1f,           "Operacion Suma",   JOptionPane.ERROR_MESSAGE); //JOptionPane.ERROR_MESSAGE es la opcion que muestra la ventana con imagen de error
                       //Orden Show    (Object,             variable texto Interior,    Titulo de Ventana texto,          Opcion de JOption,       icon)
            
            //Operacion Resta usando Variable guardadas en Memoria
            n1f -= n2f; //Metodo Alternativo
            // La operacion guarda la Resta en la Variable "n1f"
            
            JOptionPane.showMessageDialog(null,     "El valor de la resta es " + n1f,           "Operacion Resta",   JOptionPane.PLAIN_MESSAGE); //JOptionPane.PLAIN_MESSAGE es la opcion que muestra la ventana con Texto Plano
                       //Orden Show    (Object,             variable texto Interior,      Titulo de Ventana texto,          Opcion de JOption,       icon)
            
            //Operacion Multiplicacion usando Variable guardadas en Memoria
            n1f *= n2f; //Metodo Alternativo
            // La operacion guarda la Multiplicacion en la Variable "n1f"
            
            JOptionPane.showMessageDialog(null,     "El valor de la Multiplicacion es " + n1f,   "Operacion Multiplicacion",   JOptionPane.PLAIN_MESSAGE,  icon); //JOptionPane.PLAIN_MESSAGE es la opcion que muestra la ventana con Texto Plano
                       //Orden Show    (Object,                       variable texto Interior,      Titulo de Ventana texto,          Opcion de JOption,  icon)

            //Operacion Division usando Variable guardadas en Memoria
            n1f /= n2f; //Metodo Alternativo
            // La operacion guarda la Division en la Variable "n1f"
            
            JOptionPane.showMessageDialog(null,     "El valor de la Division es " + n1f,     "Operacion Division",   JOptionPane.ERROR_MESSAGE,  icon); //JOptionPane.ERROR_MESSAGE es la opcion que muestra la ventana con imagen de error
                       //Orden Show    (Object,                  variable texto Interior, Titulo de Ventana texto,          Opcion de JOption,  icon)
       
    // Cap  2 Operadores De Incremente y Decremento Seccion 4

            //Operacion de Incremento como prefijo
            JOptionPane.showMessageDialog(null,     "El valor  de n1f es " + n1f +"    valor variable n2f es  " + n2f,     "Operacion INCREMENTO Sin Adicionar el valor",   JOptionPane.ERROR_MESSAGE,  icon); 
            
            n1f = ++n2f; //De esta forma el contador Antes de asignar el valor

            JOptionPane.showMessageDialog(null,     "El valor  de n1f es " + n1f +"    valor variable  n2f es " + n2f,     "Operacion INCREMENTO Como PREFIJO",   JOptionPane.ERROR_MESSAGE,  icon); 

            //Operacion de Incremento como Sufijo
            JOptionPane.showMessageDialog(null,     "El valor  de n1f es " + n1f +"    valor variable n2f es  " + n2f,     "Operacion INCREMENTO Sin Adicionar el valor",   JOptionPane.ERROR_MESSAGE,  icon); 
            
            n1f = n2f++; //De esta forma el contador Despues de asignar el valor

            JOptionPane.showMessageDialog(null,     "El valor  de n1f es " + n1f +"    valor variable  n2f es " + n2f,     "Operacion INCREMENTO Como SUFIJO",   JOptionPane.ERROR_MESSAGE,  icon); 
    
    
            //Operacion de Decremento como prefijo
            JOptionPane.showMessageDialog(null,     "El valor  de n1f es " + n1f +"    valor variable n2f es  " + n2f,     "Operacion DECREMENTO  Sin Disminuir el valor",   JOptionPane.ERROR_MESSAGE,  icon); 
            
            n1f = --n2f; //De esta forma el contador Disminuye Antes de asignar el valor

            JOptionPane.showMessageDialog(null,     "El valor  de n1f es " + n1f +"    valor variable  n2f es " + n2f,     "Operacion DECREMENTO  Como PREFIJO",   JOptionPane.ERROR_MESSAGE,  icon); 

            //Operacion de Incremento como Sufijo
            JOptionPane.showMessageDialog(null,     "El valor  de n1f es " + n1f +"    valor variable n2f es  " + n2f,     "Operacion DECREMENTO  Sin Disminuir el valor",   JOptionPane.ERROR_MESSAGE,  icon); 
            
            n1f = n2f--; //De esta forma el contador Despues de asignar el valor

            JOptionPane.showMessageDialog(null,     "El valor  de n1f es " + n1f +"    valor variable  n2f es " + n2f,     "Operacion DECREMENTO  Como SUFIJO",   JOptionPane.ERROR_MESSAGE,  icon); 
    
    // Cap  2 Operadores Clase Math 4 
             
            n1d = (float)n1f; //inicia varibale Double  
            n2d = (float)n2f; //Conversion de la varia de Float a Double
           
            //Metodo Raiz Cuadrada
            n1d = Math.sqrt(n1d);     //Math.sqrt (Raiz Cuadrada)
            System.out.println("La raiz cuadra de "+ n1f + " es "+n1d );
            
            //Metodo Elevacion de numero a su potencia
            System.out.println("La base es "+ n1d +" y su exponente "+ n2d );
            n2d = Math.pow(n1d,n2d); //Math.pow (Base,exponente) 
            System.out.println("El resultado es "+ n2d );

            //Metodo Redondeo de Numero
            n1d = Math.round(n1f);     
            n2d = Math.round(n2d);
            System.out.println("El redondeo para la variable  "+ n1d +" y la otra variable  "+ n2d );
        
            //Metodo Randon
            n1d = Math.random();
            System.out.println("El numero randon para la variable  "+ n1d);
        }

}
