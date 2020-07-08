import java.util.Scanner;
public class Sec3Cap17Ejer13Cajeroautomatico  {

    public static void main(String []args) {
    int opcion, disponible = 1000;
    String r = "Presiona 1 ||Retiro  de Dinero de Cuenta||", i = "Presione 2 ||Ingreso de Dinero de Cuenta||", s = "Presione 3 ||            Salir          ||";
    char x; x = ' ';
    System.out.println(r);    
    System.out.println(i);
    System.out.println(s);
    
    Scanner o = new Scanner(System.in);
    opcion = o.nextInt();
        
    if ((opcion > 0) && (opcion <= 2)) {
        if (opcion == 1 ){
            System.out.println("|Cantidades   disponibles a Retirar |");
            System.out.println("|Presiones A [5]  Presiones  B [10] |");
            System.out.println("|Presiones C [15] Presiones  D [20] |");
            System.out.println("|Presiones E [50] Presiones  F [100]|");
            System.out.println("|Presione X Para indicar la Cantidad a Retirar|");
            Scanner ingresado = new Scanner(System.in);
            x = ingresado.next().charAt(0);
            if ((x == 'A') || (x == 'B') || (x == 'C') || (x == 'D') ||(x == 'E') || (x == 'F') ||(x == 'X')){
                System.out.println("|Presiono   "+x+"  Procesando Retiro    |");
                switch (x) {
                    case 'A': disponible -= 5;
                    System.out.println("|   Saldo       Disponible  "+ disponible +"     |");
                    break;
                    case 'B': disponible -= 10;
                    System.out.println("|   Saldo       Disponible  "+ disponible +"     |");
                    break;
                    case 'C': disponible -= 15;
                    System.out.println("|   Saldo       Disponible  "+ disponible +"     |");
                    break;
                    case 'D': disponible -= 20;
                    System.out.println("|   Saldo       Disponible  "+ disponible +"     |");
                    break;
                    case 'E': disponible -= 50;
                    System.out.println("|   Saldo       Disponible  "+ disponible +"     |");
                    break;
                    case 'F': disponible -= 100;
                    System.out.println("|   Saldo       Disponible  "+ disponible +"     |");
                    break;
                    case 'X': System.out.println("|Indique la Cantidad a Retirar|");
                    Scanner p = new Scanner(System.in);
                    opcion = p.nextInt();
                    if ((opcion > 0) && (opcion <= disponible)){
                        disponible -= opcion;
                        System.out.println("|   Saldo       Disponible  "+ disponible +"     |");
                        System.out.println("|   Saldo       Retirado    "+ opcion +"     |");    
                    }
                    else {System.out.println("|   Saldo       Insuficiente     |");
                          System.out.println("|   Monto         Invalido       |");}
                    break;
                }
            } 
    
            else System.out.println("Presiono   Opcion Invalida ||    Hasta         Luego    ||");
        } if (opcion == 2 ){
            System.out.println("|Cantidades disponibles a Depositar |");
            System.out.println("|Presiones A [5]  Presiones  B [10] |");
            System.out.println("|Presiones C [15] Presiones  D [20] |");
            System.out.println("|Presiones E [50] Presiones  F [100]|");
            System.out.println("|Presione X Para indicar la Cantidad a Depositar|");
            Scanner ingresado = new Scanner(System.in);
            x = ingresado.next().charAt(0);
            if ((x == 'A') || (x == 'B') || (x == 'C') || (x == 'D') ||(x == 'E') || (x == 'F') ||(x == 'X')){
                System.out.println("|Presiono   "+x+"  Procesando Retiro    |");
                switch (x) {
                    case 'A': disponible += 5;
                    System.out.println("|   Saldo       Disponible  "+ disponible +"     |");
                    break;
                    case 'B': disponible += 10;
                    System.out.println("|   Saldo       Disponible  "+ disponible +"     |");
                    break;
                    case 'C': disponible += 15;
                    System.out.println("|   Saldo       Disponible  "+ disponible +"     |");
                    break;
                    case 'D': disponible += 20;
                    System.out.println("|   Saldo       Disponible  "+ disponible +"     |");
                    break;
                    case 'E': disponible += 50;
                    System.out.println("|   Saldo       Disponible  "+ disponible +"     |");
                    break;
                    case 'F': disponible += 100;
                    System.out.println("|   Saldo       Disponible  "+ disponible +"     |");
                    break;
                    case 'X': System.out.println("|Indique la Cantidad a Depositar|");
                    Scanner p = new Scanner(System.in);
                    opcion = p.nextInt();
                    disponible += opcion;
                        System.out.println("|   Saldo       Disponible  "+ disponible +"     |");
                        System.out.println("|   Saldo       Depositado  "+ opcion +"     |");    
                        break;
                       
                }
            } 
            else System.out.println("Presiono   Opcion Invalida ||    Hasta         Luego    ||");
        }
    }
    else System.out.println("Presiono "+ opcion +"                  ||    Hasta         Luego    ||");
    } 
}