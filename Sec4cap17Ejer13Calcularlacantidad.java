import javax.swing.JOptionPane;
public class  Sec4cap17Ejer13Calcularlacantidad {
    public static void main (String[]args){
    int numero, positivo, negativo, suma, resta, cero;  
    numero= 0; positivo = 0; negativo = 0; suma = 0; resta = 0; cero = 0; 
    for(int i =0; i == 10; i++ ) { 
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero", "Media Positiva Negativa ", JOptionPane.ERROR_MESSAGE));
            if (numero > 0)
            {
            positivo += numero;
            ++suma;
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
        positivo /= suma;
        negativo /= resta;
        JOptionPane.showMessageDialog(null, "La media de los Numeros Positivos es "+ positivo + "\nLa media de los Numeros Positivos es "+ negativo +"\n   La Cantidad de Ceros es "+ cero,  "Media Positiva Negativa ", JOptionPane.ERROR_MESSAGE);           
    }

}
