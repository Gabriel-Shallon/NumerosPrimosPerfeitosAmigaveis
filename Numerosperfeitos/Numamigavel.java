package Numerosperfeitos;
import javax.swing.JOptionPane;
public class Numamigavel {
    
    private int num;
    private int amig;


    public Numamigavel(int num, int amig){
      this.num = num;

       int soma =0;

       

        for (int i = 1; i <= num/2; i++){
            if (num%i == 0){
                soma += i;  
            }
        }


        if (soma == amig){
            JOptionPane.showMessageDialog(null, amig+" é o número amigável de "+num+".");
        }else{
            JOptionPane.showMessageDialog(null, amig+" não é o número amigável de "+num+".");
        }
    }

  
    


}
