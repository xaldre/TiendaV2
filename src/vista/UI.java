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

public class UI extends JFrame {

	protected JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnCleinte;
	private JMenu mnNewMenu;
	private JMenu mnConsulta;
	private JMenuItem mntmConsulta;
	private JMenuItem mntmAlta_1;
	private JMenuItem mntmConsulta_1;
	private JMenuItem mntmAlta_2;
	private JMenuItem mntmConsulta_2;
	private JMenuItem mntmAlta;

	

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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
	}

}
