package prueba;

import javax.faces.application.Application;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.PostConstructApplicationEvent;
import javax.faces.event.PreDestroyApplicationEvent;
import javax.faces.event.SystemEvent;
import javax.faces.event.SystemEventListener;

public class SystemEventListenerCliente implements SystemEventListener {
   
	public void processEvent(SystemEvent event) throws AbortProcessingException 
	{
		if(event instanceof PostConstructApplicationEvent)
			System.out.println("La aplicación ha comenzado. Ha ocurrido un evento PostConstructApplicationEvent!");
		else if(event instanceof PreDestroyApplicationEvent)
				System.out.println("a ocurrido PreDestroyApplicationEvent. La aplicacion esta parando");
   }

	public boolean isListenerForSource(Object value) 
	{
		return (value instanceof Application);
	}
}