import javax.swing.JOptionPane;

public class Sec3Cap13Ejer9Determinarfecha {

    public static void main(String []args) {
    int dia, mes, ano;
    
    dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Dia", "Validacion de Fecha", JOptionPane.ERROR_MESSAGE));    
    mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un mes", "Validacion de Fecha", JOptionPane.ERROR_MESSAGE));    
    ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Ano", "Validacion de Fecha", JOptionPane.ERROR_MESSAGE));    
  
    //Validacion Dia
    if ((dia >= 1 ) && (dia <=30)){
        System.out.println(dia);
    }

    else JOptionPane.showMessageDialog(null,     "Dia Invalido  " + dia,   "Introduzca valor correcto entre 1 y 30",   JOptionPane.PLAIN_MESSAGE);
    
    //Validacion Mes
    if ((mes >= 1 ) && (mes <= 12 )){
        
        switch (mes){

            case 1 : JOptionPane.showMessageDialog(null,     "El mes ingresado corresponde a Enero ",   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
            break;
            case 2 : JOptionPane.showMessageDialog(null,     "El mes ingresado corresponde a Febrero ",   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
            break;
            case 3 : JOptionPane.showMessageDialog(null,     "El mes ingresado corresponde a Marzo ",   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
            break;
            case 4 : JOptionPane.showMessageDialog(null,     "El mes ingresado corresponde a Abril ",   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
            break;
            case 5 : JOptionPane.showMessageDialog(null,     "El mes ingresado corresponde a Mayo ",   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
            break;
            case 6 : JOptionPane.showMessageDialog(null,     "El mes ingresado corresponde a Junio ",   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
            break;
            case 7 : JOptionPane.showMessageDialog(null,     "El mes ingresado corresponde a Julio ",   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
            break;
            case 8 : JOptionPane.showMessageDialog(null,     "El mes ingresado corresponde a Agosto ",   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
            break;
            case 9 : JOptionPane.showMessageDialog(null,     "El mes ingresado corresponde a Septiembre ",   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
            break;
            case 10 : JOptionPane.showMessageDialog(null,     "El mes ingresado corresponde a Octubre",   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
            break;
            case 11 : JOptionPane.showMessageDialog(null,     "El mes ingresado corresponde a Noviembre ",   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
            break;
            case 12 : JOptionPane.showMessageDialog(null,     "El mes ingresado corresponde a Diciembre",   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
            break;
        }
        
        System.out.println(mes);
    }

    else JOptionPane.showMessageDialog(null,     "Mes Invalido  " + mes,   "Introduzca valor correcto entre 1 y 12",   JOptionPane.PLAIN_MESSAGE);
    
    if  ((ano >= 0 ) && (ano <= 2020 )){
        System.out.println(ano);
    }

    else JOptionPane.showMessageDialog(null,     "Ano Invalido  " + ano,   "Introduzca valor correcto entre 0 y 2020",   JOptionPane.PLAIN_MESSAGE);
    
    if (((mes >= 1 ) && (mes <= 12 )) &&  ((mes >= 1 ) && (mes <= 12 )) && ((ano >= 0 ) && (mes <= 2020 ))) {
        JOptionPane.showMessageDialog(null,     "Fecha Correcta  " + dia +" - "+ mes + " - "+ ano ,   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
    
    }
    else  JOptionPane.showMessageDialog(null,     "Fecha InCorrecta, Verifique Valores  " + dia +" - "+ mes + " - "+ ano ,   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
    
    
    }
}