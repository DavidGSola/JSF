package prueba;

/**
 * Clase que representa un motor de un vehículo
 * @author DavidGSola
 *
 */
public class Motor 
{
	/**
	 * Posibles estados del motor
	 *
	 */
	public enum Estado { APAGADO, ENCENDIDO, ACELERANDO};
	
	/**
	 * Estado actual del motor
	 */
	private Estado estadoActual;
	
	/**
	 * Constructor del motor
	 */
	public Motor()
	{
		estadoActual = Estado.APAGADO;
	}
	
	public Estado getEstado()
	{
		return estadoActual;
	}
	
	/**
	 * Enciende el motor
	 */
	public void encender()
	{
		estadoActual = Estado.ENCENDIDO;
	}
	
	/**
	 * Apaga el motor
	 */
	public void apagar()
	{
		estadoActual = Estado.APAGADO;
	}
	
	/**
	 * Inicia el motor, en este caso se inicia ha apagado
	 */
	public void iniciar()
	{
		estadoActual = Estado.APAGADO;
	}
	
	/**
	 * Situa al motor en la posición de acelerar
	 */
	public void acelerar()
	{
		estadoActual = Estado.ACELERANDO;
	}
}
