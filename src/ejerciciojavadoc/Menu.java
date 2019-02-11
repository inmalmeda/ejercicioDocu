package ejerciciojavadoc;
/**
 * Clase Menu
 * Contiene las opciones para elegir que tipo de operacion se quiere realizar
 * 
 * @author Inma
 */
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		/**
		 * Opcion elegida para operar
		 */
		int eleccion;
		/**
		 * Numero introducido para hacer operacion
		 */
		int numero;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("1: Factorial de un numero // 2: Calcular de la serie fibonnaci ");
		eleccion = teclado.nextInt();
		
		System.out.println("Ingresa numero para realizar operacion");
		numero=teclado.nextInt();
		
		if (eleccion==1) {
			Factorizacion resultadoFactor=new Factorizacion (numero);
		}else if (eleccion==2) {
			Fibonnaci resultadoFibonnaci=new Fibonnaci (numero);
			
		}else {
			System.out.println("Operacion no valida");
		}
		
		
	}
}

