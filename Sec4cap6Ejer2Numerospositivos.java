
import javax.swing.JOptionPane;

public class Sec4cap6Ejer2Numerospositivos {
    public static void main (final String []args){
    int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un Numero", "Numero Par o Impar", JOptionPane.ERROR_MESSAGE)); 
        while (numero == 0); {
            if (numero%2 == 0){
                JOptionPane.showMessageDialog(null, "Numero Par", "Numero Par o Impar", JOptionPane.ERROR_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null, "Numero InPar", "Numero Par o Impar", JOptionPane.ERROR_MESSAGE);
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un Numero", "Numero Par o Impar", JOptionPane.ERROR_MESSAGE)); 

            }
        }
        
    }
}
