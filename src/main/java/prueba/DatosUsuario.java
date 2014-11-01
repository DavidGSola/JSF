package prueba;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name = "datosUsuario", eager = true)
@SessionScoped
public class DatosUsuario implements Serializable
{
	private String paisSeleccionado = "";
	private String data = "";
	private static Map<String, String> correspondenciaPiases;
	
	static
	{
		correspondenciaPiases = new HashMap<String, String>();
		correspondenciaPiases.put("España", "ES");
		correspondenciaPiases.put("Francia", "FR");
		correspondenciaPiases.put("Irlanda", "IR");
	}
	
	private static final long serialVersionUID = 1L;
	
	public DatosUsuario()
	{

	}

	public void localCambiado(ValueChangeEvent e)
	{
		//asignar un nuevo valor al pais
		paisSeleccionado = e.getNewValue().toString();
	}
	
	public Map<String, String> getCountries()
	{
		return correspondenciaPiases;
	}
	
	public void setPaisSeleccionado(String paisSeleccionado)
	{
		this.paisSeleccionado = paisSeleccionado;
	}
	
	public String getPaisSeleccionado()
	{
		return paisSeleccionado;
	}
	
	public void actualizarDatos(ActionEvent e)
	{
		data = "Hola a todo el mundo!";
	}
	
	public String mostrarResultado()
	{
		return "pagina2";
	}
	
	public String getData() 
	{
		return data;
	}
		
	public void setData(String data) 
	{
		this.data = data;
	}
	
	public void eventoManejado(ComponentSystemEvent event)
	{
		data ="Hola a todo el mundo!";
	}

}