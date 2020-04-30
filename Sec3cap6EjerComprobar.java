import javax.swing.JOptionPane; 
import java.lang.Integer;
public class Sec3cap6EjerComprobar {

    public static void main(String []args) {
    int numero1, numero2;
    String mayor, menor, estado;
    mayor = "mayor";
    menor = "menor"; 
    estado = "igual";
    numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Valor", "Validacion de "+ mayor +" o "+ menor, JOptionPane.ERROR_MESSAGE));    
    numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Valor", "Validacion de "+ mayor +" o "+ menor, JOptionPane.ERROR_MESSAGE));    
    if (numero1 == numero2){
        JOptionPane.showMessageDialog(null, "Se determino que son "+ estado, "Validacion de "+ estado, JOptionPane.ERROR_MESSAGE);
    }
    
    if  (numero1 <= numero2)  {
            JOptionPane.showMessageDialog(null, "Se determino que "+ numero1 +" es "+ (estado = (numero1 <= numero2) ? menor : mayor )+ " que "+ numero2, "Validacion de "+ estado, JOptionPane.ERROR_MESSAGE);
            }
    if  (numero1 >= numero2)  {
        JOptionPane.showMessageDialog(null, "Se determino que "+ numero1 +" es "+ (estado = (numero1 >= numero2) ? mayor : menor )+ " que "+ numero2, "Validacion de "+ estado, JOptionPane.ERROR_MESSAGE);
    }
    }
}