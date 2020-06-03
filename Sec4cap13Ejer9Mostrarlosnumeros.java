import javax.swing.JOptionPane;
public class  Sec4cap13Ejer9Mostrarlosnumeros {
    public static void main (String[]args){
        int i = 100;
        
        do {
           if (101 > i){
                i-=7;
                System.out.println(i);
            }
            else {
                System.out.println(i +"  else   ");
            }
        }
        
        while (i > 7); 
        {
            JOptionPane.showMessageDialog(null, i + "Se crea la secuencia hasta  " + i, "Genera Secuencia en Reversa", JOptionPane.ERROR_MESSAGE); 
        }    
    }
}

