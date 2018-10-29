
package exemploif_else;

import java.util.Scanner;

/**
 *
 * @author cfigueirasvalverde
 */
public class Condicionaldobre {
     public void maiorMenorEdade(){
        Scanner res = new Scanner(System.in);
        System.out.println("teclea edade :");
        int edade = res.nextInt();
        if(edade<18)
            System.out.println(" e menor de edade");
        
        else
            System.out.println(" e maior de edade");
        System.out.println(" *** remata o programa** ");
    }
}