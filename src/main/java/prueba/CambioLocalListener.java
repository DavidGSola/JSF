package prueba;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

public class CambioLocalListener implements ValueChangeListener 
{
	public void processValueChange(ValueChangeEvent evento) throws AbortProcessingException 
	{
		DatosUsuario datosUsuario = (DatosUsuario)   FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("datosUsuario");
		datosUsuario.setPaisSeleccionado(evento.getNewValue().toString());
	}
}