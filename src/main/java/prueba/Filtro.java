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
	 * @param velocidad
	 * @return
	 */
	public double ejecutar(double velocidad);
}
