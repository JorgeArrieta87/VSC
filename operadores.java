import java.util.Scanner;       //libreria que permite capturar los datos
import javax.swing.JOptionPane; //libreria que permite ventanas emergentes JOptionPane
import javax.swing.ImageIcon;
   
    public class operadores {
    // Cap  2 Operadores Aritmeticos Seccion 2 

        public static void main (String[] args) {
            
            //Captura de entrada de Dato 
            Scanner entradaf = new Scanner(System.in);
            
            //Declaracion de Varible Tipo Float
            float n1f, n2f, suman1n2f, restan1n2f, multin1n2f, divin1n2f, resin1n2f;                           
            
            //Declaracion de Variable y Ruta de Imagen
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
            JOptionPane.showMessageDialog(null,     "El valor  de n1f es " + n1f +"    valor variable n2f es  " + n2f,     "Operacion Contador Sin Adicionar el valor",   JOptionPane.ERROR_MESSAGE,  icon); 
            
            n1f = ++n2f; //De esta forma el contador Antes de asignar el valor

            JOptionPane.showMessageDialog(null,     "El valor  de n1f es " + n1f +"    valor variable  n2f es " + n2f,     "Operacion Contador Como PREFIJO",   JOptionPane.ERROR_MESSAGE,  icon); 

            //Operacion de Incremento como Sufijo
            JOptionPane.showMessageDialog(null,     "El valor  de n1f es " + n1f +"    valor variable n2f es  " + n2f,     "Operacion Contador Sin Adicionar el valor",   JOptionPane.ERROR_MESSAGE,  icon); 
            
            n1f = n2f++; //De esta forma el contador Despues de asignar el valor

            JOptionPane.showMessageDialog(null,     "El valor  de n1f es " + n1f +"    valor variable  n2f es " + n2f,     "Operacion Contador Como SUFIJO",   JOptionPane.ERROR_MESSAGE,  icon); 
    }

}
