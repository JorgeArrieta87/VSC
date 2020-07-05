
import javax.swing.JOptionPane;

public class Sec4cap7Ejer3Indicarparinpar {
    public static void main (final String []args){
    int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Numero", "Validacion Par o Inpar", JOptionPane.ERROR_MESSAGE));  
    while (numero%2 == 0 ); 
        {
        JOptionPane.showMessageDialog(null, "El numero  es " + numero, "Determinar signo de Numero", JOptionPane.ERROR_MESSAGE); 
        }
    }
}
