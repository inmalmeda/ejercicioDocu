package ejerciciojavadoc;
/**
 * Clase Fibanacci
 * 
 * Contiene las operaciones necesarias para calcular la serie Fibonacci
 * 
 * @author Inma
 *
 */

public class Fibonnaci {
	/**
	 * Constructor con un parametro
	 * 
	 * @param numero numero introducido para hacer calculos
	 */
	public Fibonnaci (int numero) {
		
		
		int numero1=0;
		int numero2=1;
		int numeroAux;
		
		
		System.out.println(numero1);
		System.out.println(numero2);
		for(int i=0;i<numero-2;i++) {
			numeroAux=numero1;
			numero1=numero2;
			numero2=numeroAux+numero1;
			System.out.println(numero2);
		}
	

	}
	
	
}
