package unidad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase nos permite mostrar el menu de operaciones y 
 * realizar diferentes operaciones como ingresar y retirar dinero.
 * @author Antonio Sanchez
 *
 */
public class Main {
	static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * Este metodo nos permite elegir entre las diferentes opciones del menu de operaciones.
	 * @param args es un array intruducido como argumento mediante la linea de comandos
	 */
	public static void main(String[] args) {
		CCuenta cuenta1;
		double saldoActual;
		int opcion = 0;
		cuenta1 = new CCuenta("Juan López", "1000-2365-85-123456789", 2500, 0);
		do {
			try {
				System.out.println("MENÚ DE OPERACIONES");
				System.out.println("-------------------");
				System.out.println("1 - Ingresar");
				System.out.println("2 - Retirar");
				System.out.println("3 - Finalizar");
				opcion = Integer.parseInt(dato.readLine());
				if (opcion == 1) {
					System.out.println("¿Cuánto desea ingresar?: ");
					float ingresar = Integer.parseInt(dato.readLine());
					operativa_cuenta(cuenta1, ingresar, opcion);
				} else if (opcion == 2) {
					System.out.println("¿Cuánto desea retirar?: ");
					float retirar = Integer.parseInt(dato.readLine());
					operativa_cuenta(cuenta1, retirar, opcion);
				} else if (opcion == 3) {
					System.out.println("Finalizamos la ejecución");
				} else {
					System.err.println("Opción errónea");
				}

			} catch (IOException ex) {
				Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
			}
		} while (opcion != 3);
		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es: " + saldoActual);
	}

	/**
	 * 
	 * @param cuenta1 - cuenta en la que estamos realizando las operaciones
	 * @param cantidad - saldo a retirar o ingresar
	 * @param opcion - opcion elegida en el menu de operaciones
	 */
	public static void operativa_cuenta(CCuenta cuenta1, float cantidad, int opcion) {
		if (opcion == 2) {
			try {
				cuenta1.retirar(cantidad);
			} catch (Exception e) {
				System.out.print("Fallo al retirar");
			}
		} else if (opcion == 1) {
			try {
				System.out.println("Ingreso en cuenta");
				cuenta1.ingresar(cantidad);
			} catch (Exception e) {
				System.out.print("Fallo al ingresar");
			}
		}
	}
}