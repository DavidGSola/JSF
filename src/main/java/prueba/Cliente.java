package prueba;

public class Cliente 
{	
	/**
	 * Velocidad que el usuario insertará a través del formulario
	 */
	private String velocidad;
	/**
	 * Gestor de filtros del cliente
	 */
	private GestorFiltros mGestor;
	
	/**
	 * Constructor del Cliente
	 */
	public Cliente()
	{
		mGestor = new GestorFiltros();
		mGestor.addFiltro(new Calcular());
		mGestor.addFiltro(new CalcularVelocidad());
		mGestor.addFiltro(new Objetivo("http://localhost:8080/holamundo/home.jsf"));
	}

	public void setVelocidad(String velocidad)
	{
		this.velocidad = velocidad;
	}
	
	public String getVelocidad()
	{
		return velocidad;
	}

	/**
	 * Ejecuta los filtros a través del gestor del filtros.
	 */
	public void ejecutarFiltros()
	{
		double resultado = mGestor.ejecutar(Double.valueOf(velocidad));
		velocidad = String.valueOf(resultado);
	}
}
