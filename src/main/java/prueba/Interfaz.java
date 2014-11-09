package prueba;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import prueba.Motor.Estado;

@ManagedBean(name = "interfaz", eager = true)
@SessionScoped
public class Interfaz 
{	
	/**
	 * Estado actual del motor
	 */
	private String estadoMotor;
		
	/**
	 * Motor
	 */
	private Motor mMotor;
	
	/**
	 * Style común para todos los botones
	 */
	private String styleFijo;
	
	/**
	 * Style para el botón de encender/apagar el motor
	 */
	private String styleActual;
	
	/**
	 * Texto para el botón de enender/apagar el motor
	 */
	private String textBotonOnOff;
	
	/**
	 * Constructor del Cliente
	 */
	public Interfaz()
	{	mMotor = new Motor();
		mMotor.iniciar();
		styleFijo  = "color:#FFFFFF;"
				   + "background-color:#A4A4A4;"
				   + "height:65px;"
				   + "width:130px;"
				   + "font:15px Verdana;"
				   + "font-weight: bold;"
				   + "text-align:center;"
				   + "margin:15px;";
		
		 styleActual = styleFijo 
				 	 + "border: 1px solid #d02718;" 
				     + "background-color:#f24537;";
		 
		 textBotonOnOff = "Encender";
	}
	
	public String getStyleActual()
	{
		return styleActual;
	}
	
	public String getStyleFijo()
	{
		return styleFijo;
	}
	
	public String getTextBotonOnOff()
	{
		return textBotonOnOff;
	}
	
	/**
	 * Devuelve un String con el valor actual del estado del motor
	 * @return
	 */
	public String getEstadoMotor()
	{
		Estado estado = mMotor.getEstado();
		
		switch(estado)
		{
			case APAGADO:
				return "APAGADO";
			case ENCENDIDO:
				return "ENCENDIDO";
			case ACELERANDO:
				return "ACELERANDO";
			default:
				return "INVALIDO";
		}
	}
	
	/**
	 * Apaga o enciende el motor de acuerdo a su estado anterior
	 * @param e
	 */
	public void cambiarEstadoMotor(ActionEvent e)
	{
		switch(mMotor.getEstado())
		{
			case ENCENDIDO:
			case ACELERANDO:
				mMotor.apagar();
				styleActual = styleFijo 
							+ "border: 1px solid #d02718;"
							+ "color:#FFFFFF;"
						    + "background-color:#f24537;";
				textBotonOnOff = "Encender";
				break;
			case APAGADO:
				mMotor.encender();
				styleActual = styleFijo
							+ "border: 1px solid #83c41a;"
							+ "color:#FFFFFF;"
					    	+ "background-color:#9dce2c;";
				textBotonOnOff = "Apagar";
				break;
		}
	}
	
	/**
	 * Cambia el estado del motor a acelerar si es posible
	 * @param e
	 */
	public void acelerarMotor(ActionEvent e)
	{
		if(mMotor.getEstado() == Estado.ENCENDIDO)
			mMotor.acelerar();
		
	}
}
