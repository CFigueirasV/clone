
package exemploif;

import java.util.Scanner;

/**
 *
 * @author cfigueirasvalverde
 */
class Condicionalsimple {
 public void maiorEdade(){
        Scanner res = new Scanner (System.in);
        System.out.println("teclea edade :");
        int edade =res.nextInt();
        if (edade <18){
            System.out.println(" e menor de edade");
        }
        System.out.println("remata o programa ");
    }
}
