import javax.swing.JOptionPane;
public class  Sec4cap14Ejer10Calcularsumade {
    public static void main (String[]args){
        int suma, numero;
       suma = 0; 
       for (int i = 0; i < 10; i++){
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero", "Validacion de Sumatoria", JOptionPane.ERROR_MESSAGE));
        suma += numero;
        }
        JOptionPane.showMessageDialog(null, "La sumatoria De los Numeros es "+ suma, "Sumatoria de Numeros", JOptionPane.ERROR_MESSAGE);
    }
}