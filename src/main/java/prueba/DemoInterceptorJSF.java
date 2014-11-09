package prueba;

import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;


/**
 * Clase con la interfaz básica para obtener una velocidad y lanzar 
 * en un cliente una serie de filtros.
 * @author DavidGSola
 *
 */
public class DemoInterceptorJSF extends JFrame implements ActionListener
{	
	/**
	 * Botón iniciar
	 */
	private JButton jbIniciar;
	private JTextArea jtVelocidad;
	
	private JPanel jpPanel;
	
	private Cliente mCliente;
	
	public static void main(String[] args) 
	{
		Cliente cliente = new Cliente();
		
		DemoInterceptorJSF frame = new DemoInterceptorJSF();
		frame.setCliente(cliente);
		
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand() == "iniciar")
		{
			if(!jtVelocidad.getText().isEmpty())
			{
				mCliente.setVelocidad(jtVelocidad.getText());
				mCliente.ejecutarFiltros();
			}
		}
	}
	
	public DemoInterceptorJSF()
	{
		this.setBounds(300,300,245,245);
		
		jpPanel = new JPanel();
		jpPanel.setBounds(300, 300, 245, 245);
		jpPanel.setLayout(null);

		jtVelocidad = new JTextArea();
		jtVelocidad.setBounds(10, 57, 204, 65);
		jtVelocidad.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtVelocidad.setMargin(new Insets(10, 10, 10, 10));
		jtVelocidad.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyPressed(KeyEvent key)
			{
				if(KeyEvent.VK_ENTER == key.getKeyCode())
				{
					key.consume();
					jbIniciar.doClick();
				}
			}
		});
		jpPanel.add(jtVelocidad);
		
		jbIniciar = new JButton("Lanzar");
		jbIniciar.setBounds(10, 133, 204, 65);
		jbIniciar.setActionCommand("iniciar");
		jbIniciar.setFont(new Font("Tahoma", Font.BOLD, 18));
		jbIniciar.addActionListener(this);
		jpPanel.add(jbIniciar);
		
		JLabel jlVelocidad = new JLabel("Velocidad:");
		jlVelocidad.setVerticalAlignment(SwingConstants.BOTTOM);
		jlVelocidad.setFont(new Font("Tahoma", Font.ITALIC, 24));
		jlVelocidad.setHorizontalAlignment(SwingConstants.LEFT);
		jlVelocidad.setBounds(10, 11, 204, 35);
		jpPanel.add(jlVelocidad);
		
		getContentPane().add(jpPanel);
	}
	
	public void setCliente(Cliente cliente)
	{
		this.mCliente = cliente;
	}

}
