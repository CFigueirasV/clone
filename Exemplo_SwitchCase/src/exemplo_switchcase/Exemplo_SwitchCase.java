package exemplo_switchcase;

import java.util.Scanner;

/**
 *
 * @author cfigueirasvalverde
 */
public class Exemplo_SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 System.out.println("****MENU****\n 1-> Martes\n 3-> Mer\n" + "4-> Xo\n 5--> ven 6--> sa\n 7-->do \n  ELIXE UNHA");
 Scanner sc = new Scanner(System.in);
    int op = sc.nextInt();
    switch(op){
        case 1: System.out.println("luns");
        break;
        case 2: System.out.println("martes");
        break; 
        case 3: System.out.println("miercoles");
        break;
        case 4: System.out.println("jueves");
        break;
        case 5: System.out.println("viernes");
        break;
        case 6: System.out.println("sabado");
        break;
        case 7: System.out.println("domingo");
        break;
        default: System.out.println("****opncion non valida");
       
    }
    }
    
}
