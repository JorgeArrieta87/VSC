import javax.swing.JOptionPane;
public class Sec4cap11Ejer7Calcularelpromedio {
    public static void main (String[]args){
        int i, itera, pro, dato;
        itera = 0; 
        i = 0;
        
        do {
        dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Numero", "Validacion Par o Inpar", JOptionPane.ERROR_MESSAGE));
        itera = dato + itera;
        pro =  itera / i++;
        System.out.println(itera +"    "+ dato);
        }
        
        while (dato < 1); 
        {
            JOptionPane.showMessageDialog(null, "La sumatoria Total es "+itera, "El Promedio"+ pro, JOptionPane.ERROR_MESSAGE); 
        }    
    }
}