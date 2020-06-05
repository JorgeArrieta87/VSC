import javax.swing.JOptionPane;
public class  Sec4cap16Ejer12Factorialdeunnumero {
    public static void main (String[]args){
    int numero, veces = 1;
       long suma = 1; 
       numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero", "Validacion de Sumatoria", JOptionPane.ERROR_MESSAGE));
      for (int i =1; i<numero ; i++){
            suma *= veces++;
            System.out.println(suma+"    "+veces);    
      }
    }
}