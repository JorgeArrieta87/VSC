import javax.swing.JOptionPane;

public class Sec3cap9EjerSalariosemanal {

    public static void main(String []args) {
    int vhora, vhoraextra, canthorasemana, canthora, canthoraextra, pagoextra, pagosemana, horastotales, pagototal;
    vhora = 16;
    vhoraextra = 20;
    canthorasemana = 40;
    canthoraextra = 0;
    pagoextra = 0;
    pagototal = 0;
    
    canthora = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cantidad de Horas", "Validacion de Horas Totales Trabajadas", JOptionPane.ERROR_MESSAGE));    
        
    if (canthora >= canthorasemana){ 
        canthoraextra = canthora - canthorasemana;
        pagoextra = canthoraextra * vhoraextra;
        canthora -= canthoraextra;
        pagosemana = canthora * vhora;
        pagototal = pagosemana + pagoextra;
       
        JOptionPane.showMessageDialog(null, "Horas Extras son  "+ canthoraextra +" Pago horas Extras "+ pagoextra + " horas de semana "+ canthora +" Pago horas semana "+ pagosemana, "Su pago total es "+ pagototal , JOptionPane.ERROR_MESSAGE);
    } 
    else {
        pagosemana = canthora * vhora;
        JOptionPane.showMessageDialog(null, "Horas Extras son  "+ canthoraextra +" Pago horas Extras "+ pagoextra + " horas de semana "+ canthora +" Pago horas semana "+ pagosemana, "Su pago total es "+ pagototal , JOptionPane.ERROR_MESSAGE);
        }
    
    }
}