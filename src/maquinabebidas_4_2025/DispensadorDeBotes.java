package maquinabebidas_4_2025;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
/**
 * @author Rubén Sánchez Anguix e Irma Wendolin Domínguez Morales
 * @version 1.0
 * @date : 09/04/2025
 * Descripción: Parte del programa de Máquina de bebidas, cuenta la cantidad de botes que hay y en el caso de que no haya avisa al cliente, cada vez que se compra un nuevo bote, se reduce el contador de botes
*/
class DispensadorDeBotes{

    //Atributos
    /**
     * @param: botes cantidad de botes que hay en la máquina
     */
private int botes; 

//Constructor que inicializa la cantidad de botes
/** Inicializa el dispensador y pone i botes en él
* @param: int i, numero de botes en el dispensador
* @return: Ninguna 
*/
public DispensadorDeBotes (int i){
    botes = i;
}
/**Intenta dar un bote, devuelve true si es posible y falso
si no hay botes 
 @param: Ninguna 
 @return: boolean, true si entrega el bote, en el caso de que no queden botes devuelve false
  */
public boolean pulsarBoton (){
    boolean resultado = false;
    if(botes>0){
        resultado = true;
        botes = botes-1;
    }
    return resultado;
}
/**Muestra el numero de botes disponibles en el dispensador
* @param: Ninguna 
* @return: int, el numero de botes que quedan
 */
public int botesDisponibles (){
    return botes;
}
}