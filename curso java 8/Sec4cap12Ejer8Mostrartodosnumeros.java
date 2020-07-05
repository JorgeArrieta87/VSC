import javax.swing.JOptionPane;
public class Sec4cap12Ejer8Mostrartodosnumeros {
    public static void main (String[]args){
        int i, itera, dato;
        itera = 0; i = 0;
        double pro = 0;
        do {
        dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Numero", "Validacion Par o Inpar", JOptionPane.ERROR_MESSAGE));
        if (dato > 0) {
            itera += dato;
            pro =  itera / (++i);
            System.out.println(itera +"    "+ dato+"    "+pro+"    "+i);
            }
        else JOptionPane.showMessageDialog(null, "Error" , "Error", JOptionPane.ERROR_MESSAGE); 
        }
    
        
        while (dato > 0); 
        {
            JOptionPane.showMessageDialog(null, i + "La sumatoria Total es "+itera, "El Promedio  "+ pro, JOptionPane.ERROR_MESSAGE); 
        }    
    }
}