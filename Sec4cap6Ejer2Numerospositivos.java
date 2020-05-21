
import javax.swing.JOptionPane;

public class Sec4cap6Ejer2Numerospositivos {
    public static void main (final String []args){
    int contador;  
    String positivo ="POSITIVO", negativo = "NEGATIVO", estado = "";
            do { //en este caso "do" se comporta como un if
             contador = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca Un Numero", "Determinar signo de Numero", JOptionPane.ERROR_MESSAGE));
             estado = (contador > 0) ? positivo : negativo;
             JOptionPane.showMessageDialog(null, "El numero  es " + estado, "Determinar signo de Numero", JOptionPane.ERROR_MESSAGE);
             
           /*  if (contador > 0); {
                    JOptionPane.showMessageDialog(null, "El numero  es POSITIVO", "Determinar signo de Numero", JOptionPane.ERROR_MESSAGE);
                } 
            if (contador > 0);{   
                    JOptionPane.showMessageDialog(null, "El numero  es NEGATIVO", "Determinar signo de Numero", JOptionPane.ERROR_MESSAGE); 
                }
            */ }
            while (contador != 0 ); {
                JOptionPane.showMessageDialog(null, "El numero  es " + contador, "Determinar signo de Numero", JOptionPane.ERROR_MESSAGE); 

        }
    }
}

// estado = (valor%multiplo == 0  ) ? npar : nopar ; //variable = (condicion) ? verdadero : falso