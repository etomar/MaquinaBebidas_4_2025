package entornopractica;

/**
 * Autora: Sara Gómez
 * Fecha: 09/04/2025
 */

 /**
 * Clase que gestiona el dinero introducido por el usuario y el cambio disponible en la máquina.
 */

public class xs {
    /**
     * Dinero introducido actualmente por el usuario.
     */
    private float cantidad;    

    /**
     * Dinero disponible en la máquina para dar cambio.
     */
    private float disponible;   
    

     /**
     * Inicializa el objeto y fija el cambio inicialmente disponible.
     *
     * @param i Saldo inicialmente disponible para cambios.
     */
    public ContadorDeMonedas(float i) {
        this.disponible = i;
        this.cantidad = 0;
    }


    /**
     * Informa sobre el saldo actual del cliente.
     *
     * @return El saldo del cliente.
     */
    public float saldo() {
        return cantidad;
    }


   /**
     * Inserta la moneda introducida por el usuario.
     *
     * @param m Cantidad de dinero introducida.
     */
    public void insertarMoneda(float m) {
        if (m > 0) {
            cantidad += m;
        }
    }


   /**
     * Devuelve el cambio si es posible. Si no hay suficiente dinero, devuelve un valor negativo.
     * Una vez entregado el cambio, el dinero introducido por el cliente
     * pasa a engrosar el disponible de la máquina.
     *
     * @param c Precio del producto.
     * @return El cambio a devolver. Negativo si falta dinero o -1 si no hay suficiente cambio disponible.
     */
    public float darCambioDe(float c) {
        float cambio = cantidad - c;
        float resultado;
    
        if (cambio < 0) {
            resultado = cambio;
        } else if (cambio > disponible) {
            resultado = -1;
        } else {
            disponible += c;
            disponible -= cambio;
            cantidad = 0;
            resultado = cambio;
        }
    
        return resultado;
    }

   

    /**
     * El cliente recupera el dinero introducido si todavía no se ha realizado la venta.
     *
     * @return La cantidad devuelta al cliente.
     */
    public float retornar() {
        float devuelto = cantidad;
        cantidad = 0;
        return devuelto;
    }
}
