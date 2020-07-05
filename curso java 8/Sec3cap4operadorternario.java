import javax.swing.JOptionPane; 
import java.lang.Integer;
public class Sec3cap4operadorternario {

    public static void main(String []args) {
    int valor;
    String npar, nopar,estado;
    
    npar = "Numero Par";
    nopar = "Numero Inpar"; 

    valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Valor", "Validacion de "+ npar +" o "+ nopar, JOptionPane.ERROR_MESSAGE));    
    estado = (valor%2 == 0  ) ? npar : nopar ; //variable = (condicion) ? verdadero : falso
    JOptionPane.showMessageDialog(null, "El "+ valor +" es "+ estado, "Validacion de "+ estado, JOptionPane.ERROR_MESSAGE);
    
    JOptionPane.showMessageDialog(null, estado = (valor%2 == 0  ) ? npar : nopar, "Validacion de "+ estado, JOptionPane.ERROR_MESSAGE);
    }
}