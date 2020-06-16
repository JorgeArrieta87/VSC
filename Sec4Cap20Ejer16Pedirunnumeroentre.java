
import javax.swing.JOptionPane;
public class  Sec4Cap20Ejer16Pedirunnumeroentre {
    public static void main (String[]args){
    int x = 0, numero= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Un Numero", "Tabla de Multiplicar", JOptionPane.ERROR_MESSAGE));
   if (numero > 0 && numero <= 10) {
    for (int i = 0; x > 10; i++); {
        System.out.println("entro ciclo for");
        System.out.println(numero*(++x));
        }

       
    }
    else 
    { 
        JOptionPane.showInputDialog(null, "Ingrese Un Numero Valido", "Tabla de Multiplicar", JOptionPane.ERROR_MESSAGE);
    }
    }
}
