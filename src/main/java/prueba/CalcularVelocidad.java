package prueba;

/**
 * Un tipo de Filtro concreto para calcular la velocidad
 * @author DavidGSola
 *
 */
public class CalcularVelocidad implements Filtro
{
	public double ejecutar(double velocidad) 
	{
		return velocidad+5;
	}

}
