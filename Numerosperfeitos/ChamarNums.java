package Numerosperfeitos;

import javax.swing.JOptionPane;

public class ChamarNums {
    public static int num;
    public static int amig;

    
       
    
    public static void main(String[]args){

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o número?"));
        amig = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o número que irá testar se é o número amigável do número anterior?"));   

        Numamigavel numero1 = new Numamigavel(num, amig);
            
            
    }


}


