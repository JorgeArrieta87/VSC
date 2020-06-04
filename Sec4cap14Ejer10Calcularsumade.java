import javax.swing.JOptionPane;
public class  Sec4cap14Ejer10Calcularsumade {
    public static void main (String[]args){
        int i, suma, numero;
       suma = 1; i = 0; 
       do {
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero", "Validacion de Sumatoria", JOptionPane.ERROR_MESSAGE));
        if (numero > 0){
            if (numero%2 != 0){
                suma *= numero;
                i++;
            }
            else {
                JOptionPane.showMessageDialog(null, "Numero no Sumara (PAR)", "Numero Invalido para suma", JOptionPane.ERROR_MESSAGE);
                }
        }
        else {
            JOptionPane.showMessageDialog(null, "Introduzca Numero Mayor que 0", "Numero Invalido", JOptionPane.ERROR_MESSAGE);
            }
        }
        while (i < 10); {
        JOptionPane.showMessageDialog(null, "La sumatoria De los Numeros es "+ suma, "Sumatoria de Numeros", JOptionPane.ERROR_MESSAGE);
        }
    }
}

