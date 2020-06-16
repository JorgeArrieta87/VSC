import javax.swing.JOptionPane;
public class  Sec4cap18Ejer14Pedirsueldosmostrar {
    public static void main (String[]args){
    int numero, positivo,  suma;  
    positivo = 0;  suma = 0;  
    for(int i =0; i <= 9; i++ ) { 
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero", "Media Positiva Negativa ", JOptionPane.ERROR_MESSAGE));
            if (numero > 0)
            {
            positivo += numero;
            if (numero > 1000)
                {
                suma++;  
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error Numero Invalido\n La media de los Sueldos deben ser Positivos\n",  "Media Sueldos", JOptionPane.ERROR_MESSAGE);;
            i--;
            }
            
        } 
       
       JOptionPane.showMessageDialog(null, "La suma de los Sueldos es "+ positivo + "\n Los que superan los 1000 son \n"+ suma,  "Media Sueldos   ", JOptionPane.ERROR_MESSAGE);           
    }

}
