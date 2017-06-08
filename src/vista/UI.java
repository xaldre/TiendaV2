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
	protected JMenu mnCleinte;
	protected JMenu mnNewMenu;
	protected JMenu mnConsulta;
	protected JMenuItem mntmConsulta;
	protected JMenuItem mntmAlta_1;
	protected JMenuItem mntmConsulta_1;
	protected JMenuItem mntmAlta_2;
	protected JMenuItem mntmConsulta_2;
	protected JMenuItem mntmAlta;

	

	/**
	 * Create the frame.
	 */
	public UI() {
		setTitle("Money Maker 3000 \u2122");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnCleinte = new JMenu("Cliente");
		menuBar.add(mnCleinte);
		
		mntmAlta = new JMenuItem("Alta");
		mnCleinte.add(mntmAlta);
		
		mntmConsulta = new JMenuItem("Consulta");
		mnCleinte.add(mntmConsulta);
		
		mnNewMenu = new JMenu("Art\u00EDculo");
		menuBar.add(mnNewMenu);
		
		mntmAlta_1 = new JMenuItem("Alta");
		mnNewMenu.add(mntmAlta_1);
		
		mntmConsulta_1 = new JMenuItem("Consulta");
		mnNewMenu.add(mntmConsulta_1);
		
		mnConsulta = new JMenu("Pedido");
		menuBar.add(mnConsulta);
		
		mntmAlta_2 = new JMenuItem("Alta");
		mnConsulta.add(mntmAlta_2);
		
		mntmConsulta_2 = new JMenuItem("Consulta");
		mnConsulta.add(mntmConsulta_2);
		cardPane = new JPanel();
		cardPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cardPane);
		cardPane.setLayout(new CardLayout(0, 0));
	}

}
