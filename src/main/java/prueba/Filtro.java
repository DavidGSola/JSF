package prueba;

/**
 * Interfaz que deben implementar todos los filtros
 * @author DavidGSola
 *
 */
public interface Filtro 
{
	/**
	 * Método de ejecución del filtro
	 * @param peticion 
	 * @return valor trás ejecutar el filtro sobre peticinon
	 */
	public double ejecutar(double peticion);
}
