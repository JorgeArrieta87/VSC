import javax.swing.JOptionPane;

public class Sec3cap10Ejer6Determinar {

    public static void main(String []args) {
    int numero1, numero2;


    numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero1", "Validacion de Numero1 Par/inpar", JOptionPane.ERROR_MESSAGE));    
    numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero2", "Validacion de Numero2 Par/inpar", JOptionPane.ERROR_MESSAGE));    
    
    
    if (numero1  == 0 ){ 
        
        JOptionPane.showMessageDialog(null, "El numero "+ numero1 + "no es posible categorizarlo ", "Validacion de Numero Invalido", JOptionPane.ERROR_MESSAGE);
    } 
    else if (numero1%2 == 0 ){ 
        
        JOptionPane.showMessageDialog(null, "El numero "+ numero1 + " es par", "Validacion de Numero Par", JOptionPane.ERROR_MESSAGE);
    } 
    else {
        JOptionPane.showMessageDialog(null, "El numero "+ numero1 + " es inpar", "Validacion de Numero InPar", JOptionPane.ERROR_MESSAGE);
        }
    
        if (numero2  == 0 ){ 
        
            JOptionPane.showMessageDialog(null, "El numero "+ numero2 + "no es posible categorizarlo ", "Validacion de Numero Invalido", JOptionPane.ERROR_MESSAGE);
        } 
        else if (numero2%2 == 0 ){ 
            
            JOptionPane.showMessageDialog(null, "El numero "+ numero2 + " es par", "Validacion de Numero Par", JOptionPane.ERROR_MESSAGE);
        } 
        else {
            JOptionPane.showMessageDialog(null, "El numero "+ numero2 + " es inpar", "Validacion de Numero InPar", JOptionPane.ERROR_MESSAGE);
            }
    
        if ((numero1  == 0 ) && (numero2 == 0 )){ 
        
                JOptionPane.showMessageDialog(null, "El numero "+ numero1 + " y "+ numero2 +"no son posible categorizarlo ", "Validacion de Numero Invalido", JOptionPane.ERROR_MESSAGE);
            }    
        if ((numero1%2 == 0 ) && (numero2%2 == 0 )){
            JOptionPane.showMessageDialog(null, "El numero "+ numero1 + " y "+ numero2 +"  son numero Pares ", "Validacion de Numero Par - Inpar", JOptionPane.ERROR_MESSAGE);
        }
        if ((numero1%2 != 0 ) && (numero2%2 != 0 )){
            JOptionPane.showMessageDialog(null, "El numero "+ numero1 + " y "+ numero2 +"  son numero INPares ", "Validacion de Numero InPar", JOptionPane.ERROR_MESSAGE);
        }
        if (((numero1%2 == 0 ) && (numero2%2 != 0 )) || ((numero1%2 != 0 ) && (numero2%2 == 0 ))) {
            JOptionPane.showMessageDialog(null, "El numero "+ numero1 + " y "+ numero2 +"  no son numero del mismo tipo INPares ", "Validacion de Numero InPar", JOptionPane.ERROR_MESSAGE);
        }

    }
}