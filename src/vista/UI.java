package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JToolBar;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.CardLayout;

public class UI extends JFrame {

	protected JPanel cardPane;
	protected JMenuBar menuBar;
	protected JMenu mnCliente;
	protected JMenu mnArticulo;
	protected JMenu mnPedido;
	protected JMenuItem mntmConsultaCliente;
	protected JMenuItem mntmAltaArticulo;
	protected JMenuItem mntmConsultaArticulo;
	protected JMenuItem mntmAltaPedido;
	protected JMenuItem mntmConsultaPedido;
	protected JMenuItem mntmAltaCliente;

	

	/**
	 * Create the frame.
	 */
	public UI() {
		setTitle("Money Maker 3000 \u2122");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnCliente = new JMenu("Cliente");
		menuBar.add(mnCliente);
		
		mntmAltaCliente = new JMenuItem("Alta");
		mnCliente.add(mntmAltaCliente);
		
		mntmConsultaCliente = new JMenuItem("Consulta");
		mnCliente.add(mntmConsultaCliente);
		
		mnArticulo = new JMenu("Art\u00EDculo");
		menuBar.add(mnArticulo);
		
		mntmAltaArticulo = new JMenuItem("Alta");
		mnArticulo.add(mntmAltaArticulo);
		
		mntmConsultaArticulo = new JMenuItem("Consulta");
		mnArticulo.add(mntmConsultaArticulo);
		
		mnPedido = new JMenu("Pedido");
		menuBar.add(mnPedido);
		
		mntmAltaPedido = new JMenuItem("Alta");
		mnPedido.add(mntmAltaPedido);
		
		mntmConsultaPedido = new JMenuItem("Consulta");
		mnPedido.add(mntmConsultaPedido);
		cardPane = new JPanel();
		cardPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cardPane);
		cardPane.setLayout(new CardLayout(0, 0));
	}

}
