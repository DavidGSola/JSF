package prueba;

import java.util.ArrayList;

/**
 * Clase que representa una cadena de filtros
 * de acuerdo al patrón Interceptor
 * @author DavidGSola
 *
 */
public class CadenaFiltro 
{
	/**
	 * Lista de filtros
	 */
	ArrayList<Filtro> mFiltros;
	
	/**
	 * Constructor
	 */
	public CadenaFiltro()
	{
		mFiltros = new ArrayList<Filtro>();
	}
	
	/**
	 * Ejcuta todos los filtros. El resultado de un filtro pasa
	 * a ser el argumento del siguiente.
	 * @param peticion 
	 * @return resultado trás la ejecución de los filtros
	 */
	public double ejecutar(double peticion)
	{
		double resultado = peticion;
		for(Filtro filtro : mFiltros)
		{
			resultado = filtro.ejecutar(resultado);
		}
		
		return resultado;
	}
	
	/**
	 * Añade un filtro a la lista de filtros
	 * @param filtro
	 */
	public void add(Filtro filtro)
	{
		mFiltros.add(filtro);
	}
	
	/**
	 * Elimina un filtro de la lista de filtros
	 * @param filtro
	 */
	public void delete(Filtro filtro)
	{
		mFiltros.remove(filtro);
	}
}
