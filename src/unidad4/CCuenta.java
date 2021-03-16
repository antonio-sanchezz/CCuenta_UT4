package unidad4;

/**
 * Esta clase define las operaciones que pueden ser realizadas
 * y tambien obtiene diferentes datos sobre la cuenta en uso.
 * @author Antonio Sanchez
 *
 */
public class CCuenta {

	// Propiedades de la Clase Cuenta
	protected String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInteres;

	/**
	 * Constructor por defecto de la clase CCuenta.
	 */
	public CCuenta() {
	}

	/**
	 * Constructor que nos permite crear una nueva cuenta con diferentes parametros.
	 * @param nom - nombre del titular de la cuenta
	 * @param cue - numero de la cuenta
	 * @param sal - saldo de la cuenta
	 * @param tipo - tipo de interes de la cuenta
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInteres = tipo;
	}

	/**
	 * Asigna el nombre del titular de la cuenta.
	 * @param nom - nombre del titular de la cuenta
	 */
	public void asignarNombre(String nom) {
		nombre = nom;
	}

	/**
	 * Devuelve el nombre del titular de la cuenta.
	 * @return nombre - nombre titular de la cuenta
	 */
	public String obtenerNombre() {
		return nombre;
	}

	/**
	 * Devuelve el saldo actual de la cuenta.
	 * @return saldo - saldo actual de la cuenta
	 */
	public double estado() {
		return saldo;
	}

	/**
	 * Metodo que nos permite ingresar dinero en la cuenta asignada.
	 * @param cantidad - cantidad de dinero que se quiere ingresar
	 * @throws Exception en caso de que la cantidad a ingresar sea negativa
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
		setSaldo(saldo + cantidad);
	}

	/**
	 * Metodo que nos permite retirar dinero en la cuenta asignada.
	 * @param cantidad - cantidad de dinero que nos permite retirar
	 * @throws Exception en caso de que la cantidad a retirar sea negativa o no haya suficiente saldo
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (estado() < cantidad) {
			throw new Exception("No se hay suficiente saldo");
		}
		setSaldo(saldo - cantidad);
	}

	/**
	 * Devuelve el numero de cuenta.
	 * @return cuenta - numero de cuenta
	 */
	public String obtenerCuenta() {
		return cuenta;
	}

	/**
	 * Nos permite establecer un numero de cuenta.
	 * @param cuenta - el numero de cuenta que se quiere establecer
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Nos permite establecer el saldo.
	 * @param saldo - el saldo que se quiere establecer
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Obtenemos el interes de la cuenta.
	 * @return tipoInteres - interes de la cuenta
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Nos permite establecer el interes de la cuenta.
	 * @param tipoInteres - el interes que se quiere establecer
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}