import javax.swing.JOptionPane; 
import java.lang.Integer;
public class Sec3cap5Ejer1Determinar {

    public static void main(String []args) {
    int valor, multiplo;
    String npar, nopar,estado;
    multiplo = 10;
    npar = "Numero Multiplo de 10";
    nopar = "Numero no es multiplo de 10"; 

    valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Valor", "Validacion de "+ npar +" o "+ nopar, JOptionPane.ERROR_MESSAGE));    
    estado = (valor%multiplo == 0  ) ? npar : nopar ; //variable = (condicion) ? verdadero : falso
    JOptionPane.showMessageDialog(null, "El "+ valor +" es "+ estado, "Validacion de "+ estado, JOptionPane.ERROR_MESSAGE);
    
    JOptionPane.showMessageDialog(null, estado = (valor%multiplo == 0  ) ? npar : nopar, "Validacion de "+ estado, JOptionPane.ERROR_MESSAGE);
    }
}