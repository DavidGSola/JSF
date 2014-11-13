package prueba;

import java.io.IOException;
import java.net.URISyntaxException;

public class Objetivo implements Filtro
{
	/**
	 * URL donde está desplegado el componente
	 */
	private String urlObjetivo;
	
	/**
	 * Constructor por defecto de {@link Objetivo}
	 * @param urlObjetivo
	 */
	public Objetivo(String urlObjetivo)
	{
		this.urlObjetivo = urlObjetivo;
	}
	
	public double ejecutar(double velocidad) 
	{
		System.out.println("Ejecutando filtro Objetivo");
		try 
		{
			// Se llama al browser por defecto del sistema operativo
			java.awt.Desktop.getDesktop().browse(new java.net.URI(urlObjetivo));
		} catch (IOException e) 
		{
			e.printStackTrace();
		} catch (URISyntaxException e) 
		{
			e.printStackTrace();
		}
		
		// Es irrelevante el valor que devuelva
		return -1;
	}

}
