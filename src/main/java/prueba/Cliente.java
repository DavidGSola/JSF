package prueba;

import java.io.IOException;
import java.net.URISyntaxException;


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
		mGestor = new GestorFiltros("http://localhost:8080/holamundo/home.jsf");
		mGestor.addFiltro(new Calcular());
		mGestor.addFiltro(new CalcularVelocidad());
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
	 * Se lanza a través de un botón
	 */
	public void ejecutarFiltros()
	{
		double resultado = mGestor.ejecutar(Double.valueOf(velocidad));
		velocidad = String.valueOf(resultado);
		
		try 
		{
			java.awt.Desktop.getDesktop().browse(new java.net.URI(mGestor.getObjetivo()));
		} catch (IOException e) 
		{
			e.printStackTrace();
		} catch (URISyntaxException e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Cambia la pantalla a la pantalla objetivo que tiene el gestor de filtros
	 * @return nombre de la pantalla .xhtml
	 */
	public String gotoObjetivo()
	{
		return mGestor.getObjetivo();
	}
}
