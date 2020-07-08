
import javax.swing.JOptionPane;

public class Sec4cap5Ejer1Cuadradodenumeros {
    public static void main (String []args){
        int elevacion, contador = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca Un Numero", "Cuadrado de un Numero", JOptionPane.ERROR_MESSAGE));
        if (contador > 0){
            System.out.println("cumple");
            do {
                elevacion = (int)Math.pow(contador,2); //(int) permite leer como entero el valor double, del valor capturado
                JOptionPane.showMessageDialog(null, "El cuadrado de  "+ contador + " es " + elevacion, "Cuadrado de un Numero", JOptionPane.ERROR_MESSAGE);
                contador = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca otro Numero", "Cuadrado de un Numero", JOptionPane.ERROR_MESSAGE));

            }
            
            
            while (contador >= 0); {
                JOptionPane.showMessageDialog(null, "El numero  es negativo", "Cuadrado de un Numero", JOptionPane.ERROR_MESSAGE);
             }
        }
        System.out.println("FIN");
    }
}