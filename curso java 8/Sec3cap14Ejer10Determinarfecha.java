import javax.swing.JOptionPane;

public class Sec3cap14Ejer10Determinarfecha {

    public static void main(String []args) {
    int dia, mes, ano;
    boolean fechacorrecta = false;
    dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Dia", "Validacion de Fecha", JOptionPane.ERROR_MESSAGE));    
    mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un mes", "Validacion de Fecha", JOptionPane.ERROR_MESSAGE));    
    ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Ano", "Validacion de Fecha", JOptionPane.ERROR_MESSAGE));    
  
    //Validacion Dia
    if ((dia >= 1 ) && (dia <=31)){
        System.out.println(dia);
        if ((mes >= 1 ) && (mes <= 12 )){ //Validacion Mes
        
            switch (mes){
    
                case 1 : JOptionPane.showMessageDialog(null,     "El mes ingresado corresponde a Enero ",   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
                fechacorrecta = true;
                break;
                
                case 2 : if ((dia >= 1 ) && (dia <=28)){
                 JOptionPane.showMessageDialog(null,     "El mes ingresado corresponde a Febrero ",   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
                 fechacorrecta = true;
                }
                else  fechacorrecta = false;
                JOptionPane.showMessageDialog(null,     "Dia Invalido  " + dia,   "Introduzca valor correcto entre 1 y 28",   JOptionPane.PLAIN_MESSAGE);
                break;
                
                case 3 : JOptionPane.showMessageDialog(null,     "El mes ingresado corresponde a Marzo ",   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);    
                fechacorrecta = true;
                break;
                
                case 4 : if ((dia >= 1 ) && (dia <=30)){
                    JOptionPane.showMessageDialog(null,     "El mes ingresado corresponde a Abril ",   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
                    fechacorrecta = true;
                } 
                else fechacorrecta = false;
                JOptionPane.showMessageDialog(null,     "Dia Invalido  " + dia,   "Introduzca valor correcto entre 1 y 30",   JOptionPane.PLAIN_MESSAGE);
                break;
                
                case 5 : JOptionPane.showMessageDialog(null,     "El mes ingresado corresponde a Mayo ",   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
                fechacorrecta = true;
                break;
                
                case 6 : if ((dia >= 1 ) && (dia <=30)){
                    JOptionPane.showMessageDialog(null,     "El mes ingresado corresponde a Junio ",   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
                    fechacorrecta = true;
                }
                else fechacorrecta = false;
                JOptionPane.showMessageDialog(null,     "Dia Invalido  " + dia,   "Introduzca valor correcto entre 1 y 30",   JOptionPane.PLAIN_MESSAGE);
                break;
                
                case 7 : JOptionPane.showMessageDialog(null,     "El mes ingresado corresponde a Julio ",   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
                fechacorrecta = true;
                break;
                
                case 8 :JOptionPane.showMessageDialog(null,     "El mes ingresado corresponde a Agosto ",   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
                fechacorrecta = true;
                break;
                
                case 9 : if ((dia >= 1 ) && (dia <=30)){
                    JOptionPane.showMessageDialog(null,     "El mes ingresado corresponde a Septiembre ",   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
                    fechacorrecta = true;
                }
                else fechacorrecta = false;
                JOptionPane.showMessageDialog(null,     "Dia Invalido  " + dia,   "Introduzca valor correcto entre 1 y 30",   JOptionPane.PLAIN_MESSAGE);
                break;
                
                case 10 : JOptionPane.showMessageDialog(null,     "El mes ingresado corresponde a Octubre",   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
                fechacorrecta = true;
                break;
                
                case 11 : if ((dia >= 1 ) && (dia <=30)){
                    JOptionPane.showMessageDialog(null,     "El mes ingresado corresponde a Noviembre ",   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
                    fechacorrecta = true;
                }
                else fechacorrecta = false; 
                JOptionPane.showMessageDialog(null,     "Dia Invalido  " + dia,   "Introduzca valor correcto entre 1 y 30",   JOptionPane.PLAIN_MESSAGE);
                break;
                
                case 12 : JOptionPane.showMessageDialog(null,     "El mes ingresado corresponde a Diciembre",   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
                fechacorrecta = true;
                break;
            }
            
            System.out.println(mes);
        }
    
        else JOptionPane.showMessageDialog(null,     "Mes Invalido  " + mes,   "Introduzca valor correcto entre 1 y 12",   JOptionPane.PLAIN_MESSAGE);
        
    
    
    }

    else JOptionPane.showMessageDialog(null,     "Dia Invalido  " + dia,   "Introduzca valor correcto entre 1 y 30",   JOptionPane.PLAIN_MESSAGE);
    
    
   
    if  ((ano >= 1 ) && (ano <= 2020 )){
        System.out.println(ano);
    }

    else JOptionPane.showMessageDialog(null,     "Ano Invalido  " + ano,   "Introduzca valor correcto entre 0 y 2020",   JOptionPane.PLAIN_MESSAGE);
    
    if (((mes >= 1 ) && (mes <= 12 )) &&  ((mes >= 1 ) && (mes <= 12 )) && ((ano >= 1 ) && (mes <= 2020 )) && (fechacorrecta = true)) {
        JOptionPane.showMessageDialog(null,     "Fecha Correcta  " + dia +"  "+ mes + "  "+ ano ,   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
    
    }
    else  JOptionPane.showMessageDialog(null,     "Fecha InCorrecta, Verifique Valores  " + dia +" - "+ mes + " - "+ ano ,   "Validacion de Fecha",   JOptionPane.PLAIN_MESSAGE);
    
    
    }
}