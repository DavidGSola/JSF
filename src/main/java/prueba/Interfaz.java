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
	@SuppressWarnings("unused")
	private String estadoMotor;
		
	/**
	 * Motor
	 */
	private static Motor mMotor = new Motor();
	
	static
	{
		mMotor.iniciar();
	}
	
	/**
	 * Style para el botón de encender/apagar el motor
	 */
	private String claseBotonCSS = "botonEncender";
	
	/**
	 * Texto para el botón de enender/apagar el motor
	 */
	private String textBotonOnOff = "Encender";

	public String getClaseBotonCSS()
	{
		return claseBotonCSS;
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
				claseBotonCSS = "botonEncender";
				textBotonOnOff = "Encender";
				break;
			case APAGADO:
				mMotor.encender();
				claseBotonCSS = "botonApagar";
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
