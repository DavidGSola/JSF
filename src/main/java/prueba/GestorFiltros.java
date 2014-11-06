package prueba;

/**
 * Gestor de Filtros de acuerdo al patrón Interceptor
 * @author DavidGSola
 *
 */
public class GestorFiltros 
{
	/**
	 * Objetivo, en este caso la página a la que se pasará
	 * trás la ejecución de todos los filtros
	 */
	private String mObjetivo; 
	
	/**
	 * Cadena de filtros
	 */
	private CadenaFiltro mCadena;
	
	/**
	 * Constructor de del Gestor de Filtros
	 * @param objetivo
	 */
	public GestorFiltros(String objetivo)
	{
		mObjetivo = objetivo;
		mCadena = new CadenaFiltro();
	}
	
	/**
	 * Ejecuta los filtros a través de la Cadena de Filtros
	 * @param peticion
	 * @return resultado trás la ejecución de todos los filtros
	 */
	public double ejecutar(double peticion)
	{
		return mCadena.ejecutar(peticion);
	}
	
	/**
	 * Añade un filtro a la Cadena de Filtros
	 * @param filtro
	 */
	public void addFiltro(Filtro filtro)
	{
		mCadena.add(filtro);
	}
	
	/**
	 * Elimina un filtro de la Cadena de Filtros
	 * @param filtro
	 */
	public void deleteFiltro(Filtro filtro)
	{
		mCadena.delete(filtro);
	}

	public String getObjetivo()
	{
		return mObjetivo;
	}
}
