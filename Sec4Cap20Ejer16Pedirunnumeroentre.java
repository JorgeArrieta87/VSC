
import javax.swing.JOptionPane;
public class  Sec4Cap20Ejer16Pedirunnumeroentre {
    public static void main (String[]args){
    int i = 0, numero, multiplicacion;
    boolean  aplica = false;
     do {
        numero= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Un Numero", "Tabla de Multiplicar", JOptionPane.ERROR_MESSAGE));
       if ((numero > 0) && (numero <= 10)){
        aplica = true;
       }
       else {
        aplica = false;
        System.out.println("Numero Equivocado");
       }
        }
        while (aplica == false);{
            while (i < 10){
            multiplicacion = numero*(++i);
            System.out.println(i+"           "+multiplicacion);
            }
        }
    }
}
