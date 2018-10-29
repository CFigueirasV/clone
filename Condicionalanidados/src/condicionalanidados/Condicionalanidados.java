
package condicionalanidados;

/**
 *
 * @author cfigueirasvalverde
 */
import javax.swing.JOptionPane;

public class Condicionalanidados {
    public void avaliarConAnidados(){
          int num1,num2;
        String numero1=JOptionPane.showInputDialog("teclea numero1 : ");
        num1=Integer.parseInt(numero1);
       num2 = Integer.parseInt(JOptionPane.showInputDialog("numero 2"));
       if(num1>num2)
           System.out.println(num1 +"e maior");
       else{
           if(num1<num2)
               System.out.println(num1 +"e menor");
               else 
               System.out.println("son iguais");
               
           }
    }
}