import javax.swing.JOptionPane;

public class Sec3cap11EjerOrdenanumero {

    public static void main(String []args) {
    int numero1, numero2, numero3, nummay, nummen, nummed;
    nummay = 0;
    nummen = 0; 
    nummed = 0;
    numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero1", "Validacion de Orden de Numero", JOptionPane.ERROR_MESSAGE));    
    numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero2", "Validacion de Orden de Numero", JOptionPane.ERROR_MESSAGE));    
    numero3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero3", "Validacion de Orden de Numero", JOptionPane.ERROR_MESSAGE));    
  
    //Validacion Numero Mayor
    if ((numero1>numero2 ) && (numero1>numero3 )){
        nummay = numero1;
        System.out.println(nummay);
    }
     if ((numero2>numero1 ) && (numero2>numero3 )){
        nummay = numero2;
        System.out.println(nummay);
    }
    
    if  ((numero3>numero1 ) && (numero3>numero2 )){
        nummay = numero3 ;
        System.out.println(nummay);
    }
    
    //Validacion Numero Medio
    if ((numero1<numero2 ) && (numero1>numero3 )){
        nummed = numero1;
        System.out.println(nummed);
    }
    
    if ((numero2<numero1 ) && (numero2>numero3 )){
        nummed = numero2;
        System.out.println(nummed);
    }
    
    if ((numero3<numero1 ) && (numero3>numero2 )){
       nummed = numero3;
       System.out.println(nummed);
   }
    
    //Validacion Numero Menor
    if ((numero1<numero2 ) && (numero1<numero3 )){
        nummen = numero1;
        System.out.println(nummen);
    }
    else if ((numero2<numero1 ) && (numero2<numero3 )){
        nummen = numero2;
        System.out.println(nummen);
    }
    if ((numero3<numero1 ) && (numero3<numero2 )){
        nummen = numero3;
        System.out.println(nummen);
    }
 

    String mayor = Integer.toString(nummay); 
    String medio = Integer.toString(nummed); 
    String menor = Integer.toString(nummen);

    JOptionPane.showMessageDialog(null, "Mayor "+ mayor + " Medio "+ medio +" Menor "+ menor, "Ordenar de Mayor a Menor", JOptionPane.ERROR_MESSAGE);


    }
}