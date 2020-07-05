import javax.swing.JOptionPane;
public class  Sec4cap12Ejer8Mostrartodoslosnumeros {
    public static void main (String[]args){
        int i, dato;
        i = 0;
        dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Numero", "Validacion Par o Inpar", JOptionPane.ERROR_MESSAGE));
        do {
           if (dato > 0){
                ++i;
                System.out.println(i +"             "+dato);
            }
            else {
                --i;
                System.out.println(i +"             "+dato);
            }
        }
        
        while (dato != i); 
        {
            JOptionPane.showMessageDialog(null, i + "Se crea la secuencia hasta  "+dato, "Genera Secuencia", JOptionPane.ERROR_MESSAGE); 
        }    
    }
}

