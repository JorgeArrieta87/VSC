import javax.swing.JOptionPane;
import java.util.Scanner;

public class Sec3cap18Ejer14Transformarmedidas {

    public static void main(String []args) {
    float resultado = 0f, kilos = 0f;
    char o; 
    String h = "Hectogramo", d = "Decagramo", g = "gramo", e = "decigramo", n = "centigramo", m = "miligramo", u ="";

    kilos = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese Cantidad de Kilos a Convertir\n", "Convertidor de Kilos a Otras Unidades", JOptionPane.ERROR_MESSAGE));       
    o = (JOptionPane.showInputDialog(null, "Presione h para Hectogramo\n"+
    "Presione d para Decagramo\n"+
    "Presione g para Gramos\n"+
    "Presione e para Decigramo\n"+
    "Presione n para Centigramo\n"+
    "Presione m para Miligramo\n", "Convertidor de Kilos a Otras Unidades",JOptionPane.ERROR_MESSAGE)).charAt(0);
    
    
    if (o == 'h' || o == 'd' || o == 'g' || o == 'e' || o == 'n' || o == 'm') {
        if (o == 'h'){
            resultado = kilos * 10; 
            u = h;
        }
        else if (o == 'd'){
            resultado = kilos * 100; 
            u = d;
        }
        else if (o == 'g'){
            resultado = kilos * 1000; 
            u = g;
        }
        else if (o == 'e'){
            resultado = kilos * 10000; 
            u = e;
        } 
        else if (o == 'n'){
            resultado = kilos * 100000; 
            u = n;
        }    
        else if (o == 'm'){
            resultado = kilos * 1000000; 
            u = m;
        }  
        JOptionPane.showMessageDialog(null, "La cantidad de "+ kilos +" representa en\n" + u + "  "+ resultado, "Convertidor de Kilos a Otras Unidades", JOptionPane.ERROR_MESSAGE);
    
    }
    else JOptionPane.showMessageDialog(null, "Opcion Invalida\n", "Convertidor de Kilos a Otras Unidades", JOptionPane.ERROR_MESSAGE);
    } 

}