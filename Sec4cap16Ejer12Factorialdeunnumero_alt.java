import javax.swing.JOptionPane;
public class  Sec4cap16Ejer12Factorialdeunnumero_alt {
    public static void main (String[]args){
    int numero, veces = 1;
       long suma = 1; 
       numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero", "Validacion de Sumatoria", JOptionPane.ERROR_MESSAGE));
      do {  
            if (numero > 0)
            {
            suma *= veces++;
            System.out.println(suma+"    "+veces);    
            }    
            else 
            {
                JOptionPane.showMessageDialog(null, "El valor de el Numero es menor que 0", "Producto Iterativo", JOptionPane.ERROR_MESSAGE);
            }
         }
      while (veces < numero);
            {
                JOptionPane.showMessageDialog(null, "El valor del Producto Iterativo es  "+ suma, "Producto Iterativo", JOptionPane.ERROR_MESSAGE);               
            }     
    }

}
