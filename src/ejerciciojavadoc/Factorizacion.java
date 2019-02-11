package ejerciciojavadoc;
/**
 * Clase Factorizacion
 * 
 * Contiene las operaciones necesarias para hacer la factorizacion de un numero
 * 
 * @author Inma
 *
 */
public class Factorizacion {
	/**
	 * Constructor con un parametro
	 * 
	 * @param numero numero introducido para hacer calculos
	 */
	public Factorizacion(int numero) {
		int divisor=2;
		
		System.out.println("El resultado es:");
		
		while(numero != 1) {

            if(numero % divisor == 0){
            	System.out.print(divisor + " ");
                numero = numero / divisor;
            }else {
                divisor++;
            }
		}
	}

}
