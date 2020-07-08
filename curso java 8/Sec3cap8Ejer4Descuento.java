import javax.swing.JOptionPane;

public class Sec3cap8Ejer4Descuento {

    public static void main(String []args) {
    double descuento, venta,  pisoventa, montodesc, venfin;

    pisoventa = 300;
    descuento = 0.20;
    venta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese valor de compra", "Verificacion de Descuente del "+ (descuento*100) + " % ", JOptionPane.ERROR_MESSAGE));    
        
    if (venta >= pisoventa){ 
        montodesc = venta * descuento;
        venfin =  venta - montodesc;
        JOptionPane.showMessageDialog(null, "Se determino que su Descuento es "+ montodesc +" del total de "+ venta, " Su total a pagar es  "+ venfin, JOptionPane.ERROR_MESSAGE);
    } 
    else {
        JOptionPane.showMessageDialog(null, "Se determino que su compra de "+ venta +" no aplica el descuento de "+ (descuento*100), "Su total a pagar es"+ venta, JOptionPane.ERROR_MESSAGE);
        }
    
    }
}