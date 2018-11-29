package ej_ordenador;

/**
 *
 * @author cfigueirasvalverde
 */
public class Ej_ordenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ordenador unOrdenador = new Ordenador();
        unOrdenador.pedirDatos();
        unOrdenador.visualizarAtributros();
        unOrdenador.calcularPrecio();
    }

}