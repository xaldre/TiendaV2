package vista.pedido;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

public class altaPedido extends JFrame {

	private JPanel wat;
	private JTextField txtAPCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					altaPedido frame = new altaPedido();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public altaPedido() {
		setTitle("MoneyMaker3000 - Alta pedido");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		wat = new JPanel();
		wat.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(wat);
		GridBagLayout gbl_wat = new GridBagLayout();
		gbl_wat.columnWidths = new int[]{0, 133, 0, 0, 150, 0};
		gbl_wat.rowHeights = new int[]{0, 0, 0};
		gbl_wat.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_wat.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		wat.setLayout(gbl_wat);
		
		JLabel lblCliente = new JLabel("Cliente");
		GridBagConstraints gbc_lblCliente = new GridBagConstraints();
		gbc_lblCliente.anchor = GridBagConstraints.EAST;
		gbc_lblCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblCliente.gridx = 2;
		gbc_lblCliente.gridy = 0;
		wat.add(lblCliente, gbc_lblCliente);
		
		txtAPCliente = new JTextField();
		GridBagConstraints gbc_txtAPCliente = new GridBagConstraints();
		gbc_txtAPCliente.insets = new Insets(0, 0, 5, 5);
		gbc_txtAPCliente.anchor = GridBagConstraints.NORTH;
		gbc_txtAPCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAPCliente.gridx = 3;
		gbc_txtAPCliente.gridy = 0;
		wat.add(txtAPCliente, gbc_txtAPCliente);
		txtAPCliente.setColumns(10);
	}

}
