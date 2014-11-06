package prueba;

/**
 * Un tipo de Filtro concreto para calcular la velocidad
 * @author DavidGSola
 *
 */
public class Calcular implements Filtro
{

	public double ejecutar(double velocidad) 
	{
		return velocidad*10;
	}

}
