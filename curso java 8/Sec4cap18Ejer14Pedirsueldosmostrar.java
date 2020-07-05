import javax.swing.JOptionPane;
public class  Sec4cap18Ejer14Pedirsueldosmostrar {
    public static void main (String[]args){
    int edades, proedades,  suma, sumaalt; 
    float alturas, proalturas;
    proedades = 0;  suma = 0; alturas = 0; proalturas = 0;  sumaalt = 0;
    for(int i =0; i <=4; i++ ) { 
        edades = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Edad de Alumno "+(i+1), "Recoleccion de Edades ", JOptionPane.ERROR_MESSAGE));
            if (edades > 0)
            {
            proedades += edades;
            if (edades > 18)
                {
                suma++;  
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Edad Invalida\n Ingrese un valor Mayor a 0\n",  "Recoleccion de Edades ", JOptionPane.ERROR_MESSAGE);;
            i--;
            }
            
        } 

        for(int i =0; i <=4; i++ ) { 
            alturas = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese Altura de Alumno "+(i+1), "Recoleccion de Altura ", JOptionPane.ERROR_MESSAGE));
                if (alturas > 0)
                {
                proalturas += alturas;

                if (alturas > 1.75)
                    {
                    sumaalt++;  
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Altura Invalida\n Ingrese un valor Mayor a 0\n",  "Recoleccion de Alturas", JOptionPane.ERROR_MESSAGE);;
                i--;
                }    
                System.out.println(i);
        if (i >= 4){
        proalturas /=5; proedades/=5;     
        JOptionPane.showMessageDialog(null, "Altura Promedio\n  "+proalturas+"\n Mayores de 1,75\n "+sumaalt+"\n  Edad Promedio\n "+proedades+"\n Mayores de 18 Anos\n "+suma,  "Resultados Edades / Alturas", JOptionPane.ERROR_MESSAGE);;
    }
        
    
    }

}

}
