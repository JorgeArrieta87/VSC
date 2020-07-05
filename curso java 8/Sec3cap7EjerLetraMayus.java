import javax.swing.JOptionPane;

public class Sec3cap7EjerLetraMayus {

    public static void main(String []args) {
    String minus, mayus;
    char letra;
    mayus = "Mayuscula";
    minus = "Minuscula"; 
    
    letra = JOptionPane.showInputDialog(null, "Ingrese un Letra", "Validacion de Tipo de Letra", JOptionPane.ERROR_MESSAGE).charAt(0);    
        
    if (Character.isUpperCase(letra)){ //Character.isUpperCase(letra) valida si la el caracter es una mayuscula
        JOptionPane.showMessageDialog(null, "Se determino que la "+ letra +" es "+ mayus, "Validacion de "+ mayus, JOptionPane.ERROR_MESSAGE);
    } 
    else {
        JOptionPane.showMessageDialog(null, "Se determino que la "+ letra +" es "+ minus, "Validacion de "+ minus, JOptionPane.ERROR_MESSAGE);
        }
    
    }
}