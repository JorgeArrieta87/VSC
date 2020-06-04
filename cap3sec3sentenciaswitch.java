import javax.swing.JOptionPane;
import javax.swing.ImageIcon;   //libreria que permite importar un icono
public class cap3sec3sentenciaswitch {

    public static void main(String[]args){
    int valor1, valor2;
    ImageIcon icon = new ImageIcon("C:/Users/exjaros/Desktop/VSC/icon.png");
    //A continuacion se captura los datos desde una ventana emergente
    valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Valor menor que 5 ", "Entrada N-1", JOptionPane.ERROR_MESSAGE));
    valor2 = 5;

    //Operacion && Operador and (y)
    if (valor1 <= valor2){
        switch (valor1) {
            case 1 : JOptionPane.showMessageDialog(null,     "El valor Ingresado es " + valor1,   "Muestra de Valor Caso "+ valor1,   JOptionPane.PLAIN_MESSAGE,  icon);
            break;
            case 2 : JOptionPane.showMessageDialog(null,     "El valor Ingresado es " + valor1,   "Muestra de Valor Caso "+ valor1,   JOptionPane.PLAIN_MESSAGE,  icon);
            break;
            case 3 : JOptionPane.showMessageDialog(null,     "El valor Ingresado es " + valor1,   "Muestra de Valor Caso "+ valor1,   JOptionPane.PLAIN_MESSAGE,  icon);
            
            case 4 : JOptionPane.showMessageDialog(null,     "El valor Ingresado es " + valor1,   "Muestra de Valor Caso "+ valor1,   JOptionPane.PLAIN_MESSAGE,  icon);
            break;
            case 5 : JOptionPane.showMessageDialog(null,     "El valor Ingresado es " + valor1,   "Muestra de Valor Caso "+ valor1,   JOptionPane.PLAIN_MESSAGE,  icon);
            break;
            default: JOptionPane.showMessageDialog(null,     "El valor Ingresado es " + valor1,   "Muestra de Valor Caso Errado",   JOptionPane.PLAIN_MESSAGE,  icon);
            break;
        }
        }
    else
    {
        JOptionPane.showMessageDialog(null,     "(else) El valor no es una opcion valida " + valor1,   "Muestra de Valor Caso Errado",   JOptionPane.PLAIN_MESSAGE,  icon);
    }    
  }
}