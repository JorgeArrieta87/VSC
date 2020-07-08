import javax.swing.JOptionPane;
public class  Sec4cap17Ejer13Calcularlacantidad {
    public static void main (String[]args){
    int numero, positivo, negativo, suma, resta, cero;  
    positivo = 0; negativo = 0; suma = 0; resta = 0; cero = 0; 
    for(int i =0; i <= 9; i++ ) { 
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero", "Media Positiva Negativa ", JOptionPane.ERROR_MESSAGE));
            if (numero > 0)
            {
            positivo += numero;
            suma++;
            }    
            else if (numero < 0)
            {
                negativo += numero;
            ++resta;  
            }
            else
            {
                ++cero;
            }
            
        }
        
       if (suma !=0){
           positivo /= suma;
       }
      if  (resta !=0){
        negativo /= resta;
       }
       JOptionPane.showMessageDialog(null, "La media de los Numeros Positivos es "+ positivo + "\nLa media de los Numeros Negativos es "+ negativo +"\n   La Cantidad de Ceros es "+ cero,  "Media Positiva Negativa ", JOptionPane.ERROR_MESSAGE);           
    }

}
