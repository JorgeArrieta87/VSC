import javax.swing.JOptionPane;

public class Sec3cap12Ejer8Calcularcifra {

    public static void main(String []args) {
    int numero1,nummay, nummen, unidad, decena, centena, unidademil ;
    nummay = 99999;
    nummen = 0;
    unidad = 9;
    decena = 99; 
    centena = 999;
    unidademil = 9999;

    numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero1", "Validacion de Orden de Numero", JOptionPane.ERROR_MESSAGE));    
    
    if ((numero1 >= nummen) && (numero1 <= nummay)) {
        System.out.println(numero1);

        if (numero1 <= unidad){
            JOptionPane.showMessageDialog(null, "Numero Tiene UNA Cifra", "Cantidad de Cifras", JOptionPane.ERROR_MESSAGE);
        }
        else if (numero1 <= decena){
            JOptionPane.showMessageDialog(null, "Numero Tiene DOS Cifra", "Cantidad de Cifras", JOptionPane.ERROR_MESSAGE);
        }
        else if (numero1 <= centena){
            JOptionPane.showMessageDialog(null, "Numero Tiene TRES Cifra", "Cantidad de Cifras", JOptionPane.ERROR_MESSAGE);
        }
        else if (numero1 <= unidademil){
            JOptionPane.showMessageDialog(null, "Numero Tiene CUATRO Cifra", "Cantidad de Cifras", JOptionPane.ERROR_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Numero Tiene CINCO Cifra", "Cantidad de Cifras", JOptionPane.ERROR_MESSAGE);
        }
    }
    else {
        JOptionPane.showMessageDialog(null, "Numero Introducido Invalido", "Introduzca un numero Valido", JOptionPane.ERROR_MESSAGE);
    } 


    }
}