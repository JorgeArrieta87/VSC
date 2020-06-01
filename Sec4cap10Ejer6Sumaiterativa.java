import javax.swing.JOptionPane;
public class Sec4cap10Ejer6Sumaiterativa {
    public static void main (String[]args){
        int suma, itera;
        itera = 0;
        do {
        suma = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Numero", "Validacion Par o Inpar", JOptionPane.ERROR_MESSAGE));
        itera = suma + itera;
        System.out.println(itera +"    "+ suma);
        }
        
        while (suma != 0); 
        {
            JOptionPane.showMessageDialog(null, "La sumatoria Total es "+itera, "Suma Iterativa"+ suma, JOptionPane.ERROR_MESSAGE); 
        }    
    }
}