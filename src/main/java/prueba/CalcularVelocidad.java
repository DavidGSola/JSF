package prueba;

/**
 * Un tipo de Filtro concreto para calcular la velocidad
 * @author DavidGSola
 *
 */
public class CalcularVelocidad implements Filtro
{
	public double ejecutar(double peticion) 
	{
		System.out.println("Ejecutando filtro Calcular Velocidad");
		return peticion+5;
	}

}
