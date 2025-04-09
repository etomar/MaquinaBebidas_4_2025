
/**
 * @author David Llorens
 * Desc: clase maquina de bebidas de la práctica de EDE
 * Fecha: 09/04/2025
 */

import java.util.*;

public class MaquinaDeBebidas {

    /**
     * contador de monedas de la máquina
     */
    private ContadorDeMonedas contador;
    /**
     * cinco dispensadores de botes
     */
    private DispensadorDeBotes cola;
    private DispensadorDeBotes limon;
    private DispensadorDeBotes naranja;
    private DispensadorDeBotes tonica;
    private DispensadorDeBotes agua;
    /**
     * precio de las bebidas, común a todos los botes
     */
    private float precio;

    /**
     * Constructor inicializa la maquina y todos los elementos asociados
     * 
     * @param m
     * @param b
     * @param pvp
     */
    public MaquinaDeBebidas(float m, int b, float precio) {
        this.contador = new ContadorDeMonedas(m);
        this.precio = precio;
        this.cola = new DispensadorDeBotes(b);
        this.limon = new DispensadorDeBotes(b);
        this.naranja = new DispensadorDeBotes(b);
        this.tonica = new DispensadorDeBotes(b);
        this.agua = new DispensadorDeBotes(b);
    }

    /**
     * Responder a una acción del usuario. Discrimina el tipo de
     * accion y utiliza las acciones privadas
     * 
     * @param o la orden del usuario
     *          Salidas: Ninguna
     */
    public void darOrden(char o) { // ha de llamar a ordenmonedas u ordenbotes, luego las monedas se gestionan desde las monedas y los botes desde los botes
        switch (o) {
            case 1:
                System.out.println(cola.pulsarBoton);
                break;
            case 2:
                System.out.println(limon.pulsarBoton);

                break;
            case 3:
                System.out.println(naranja.pulsarBoton);

                break;
            case 4:
                System.out.println(tonica.pulsarBoton);

                break;
            case 5:
                System.out.println(agua.pulsarBoton);

                break;
            case 6:
                System.out.println(contador.retornar);

                break;

            default:
            System.out.println("¡Hasta la próxima!");
                break;
        }
    }

    /**
     * Visualiza la informacion de interes sobre la maquina
     * Botes en cada dispensador, precio de las bebidas, saldo
     * del cliente
     * Entradas: Ninguna
     * Salidas: Ninguna
     */
    public void visualizarMaquina() {
        System.out.println("Botes en cada dispensador: ");
        System.out.println(cola.botesDisponibles);
        System.out.println(limon.botesDisponibles);
        System.out.println(naranja.botesDisponibles);
        System.out.println(tonica.botesDisponibles);
        System.out.println(agua.botesDisponibles);
        System.out.println("\n");
        System.out.println("Precio de las bebidas: ");
        System.out.println(precio);
        System.out.println("\n");
        System.out.println("Saldo del cliente");
        System.out.println(contador.disponible); // revisar
    }

    private void ordenMonedas (char o) {
        switch (o) {
            case 1:
                System.out.println("Saldo actual: ");
                System.out.println(contador.saldo);
                break;
                case 2:
                System.out.println("Cambio: ");
                System.out.println(contador.darCambioDe);
                break;
            default:
                break;
        }
    }

}