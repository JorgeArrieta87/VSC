import javax.swing.JOptionPane;
public class cap3sec2sentifelse {

    public static void main(String[]args){
    int valor1, valor2;
    
    valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Valor", "Entrada N-1", JOptionPane.ERROR_MESSAGE));
    valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Valor", "Entrada N-2", JOptionPane.ERROR_MESSAGE));
    if (valor1 != valor2){
        System.out.println("(!=) El "+ valor1+" es diferente de "+ valor2);
    }
    if (valor1 < valor2 || valor1 > valor2){
        System.out.println("(||) El "+ valor1+" es  diferente que "+ valor2);
    }
    if (valor1 < valor2){
        System.out.println("El "+ valor1+"  es menor que "+ valor2); 
    }
    if (valor1 > valor2){
        System.out.println("El "+ valor1+"  es mayor que "+ valor2);
    }
    if (valor1 <= valor2 && valor1 >= valor2){
        System.out.println("(&&) El "+ valor1+"  es  igual que "+ valor2); 
    }
    if (valor1 == valor2){
        System.out.println("(==) El "+ valor1+" es  igual que "+ valor2);
    }

    }    

}