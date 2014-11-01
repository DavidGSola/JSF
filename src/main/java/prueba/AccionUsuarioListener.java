package prueba;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;


public class AccionUsuarioListener implements ActionListener
{
	public void processAction(ActionEvent arg0) throws AbortProcessingException 
	{
		DatosUsuario datosUsuario = (DatosUsuario)   FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("datosUsuario");
		datosUsuario.setData("Hello World");
	}
}