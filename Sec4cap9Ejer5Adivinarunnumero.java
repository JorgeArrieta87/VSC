import javax.swing.JOptionPane;
import javax.swing.ImageIcon;   //libreria que permite importar un icono
public class Sec4cap9Ejer5Adivinarunnumero {

    public static void main(String[]args){
    int valor1, valor2;
    ImageIcon icon = new ImageIcon("C:/Users/exjaros/Desktop/VSC/icon.png");
    //A continuacion se captura los datos desde una ventana emergente
    valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Numero", "Adivine el Numero Aleatorio Generado", JOptionPane.ERROR_MESSAGE));
    valor2 = 100;
    //valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Numero", "Adivine el Numero Aleatorio Generado", JOptionPane.ERROR_MESSAGE));  
    if (valor1 > valor2); //&& numero >= max 
        {
        JOptionPane.showMessageDialog(null, "El numero  es " + valor1, "Determinar signo de Numero", JOptionPane.ERROR_MESSAGE, icon); 
        }
    }
}
