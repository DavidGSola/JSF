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

public class DemoInterceptorJSF extends JFrame implements ActionListener
{	
	private JButton botonIniciar;
	private JTextArea velocidad;
	
	private JPanel panel;
	
	private Cliente cliente;
	
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
			cliente.setVelocidad(velocidad.getText());
			cliente.ejecutarFiltros();
		}
	}
	
	public DemoInterceptorJSF()
	{
		this.setBounds(300,300,230,245);
		
		panel = new JPanel();
		panel.setBounds(300, 300, 245, 245);
		panel.setLayout(null);

		velocidad = new JTextArea();
		velocidad.setBounds(10, 57, 204, 65);
		velocidad.setFont(new Font("Tahoma", Font.PLAIN, 24));
		velocidad.setMargin(new Insets(10, 10, 10, 10));
		velocidad.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyPressed(KeyEvent key)
			{
				if(KeyEvent.VK_ENTER == key.getKeyCode())
				{
					key.consume();
					botonIniciar.doClick();
				}
			}
		});
		panel.add(velocidad);
		
		botonIniciar = new JButton("Conectar");
		botonIniciar.setBounds(10, 133, 204, 65);
		botonIniciar.setActionCommand("iniciar");
		botonIniciar.setFont(new Font("Tahoma", Font.BOLD, 18));
		botonIniciar.addActionListener(this);
		panel.add(botonIniciar);
		
		JLabel jlVelocidad = new JLabel("Velocidad:");
		jlVelocidad.setVerticalAlignment(SwingConstants.BOTTOM);
		jlVelocidad.setFont(new Font("Tahoma", Font.ITALIC, 24));
		jlVelocidad.setHorizontalAlignment(SwingConstants.LEFT);
		jlVelocidad.setBounds(10, 11, 204, 35);
		panel.add(jlVelocidad);
		
		getContentPane().add(panel);
	}
	
	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}

}
