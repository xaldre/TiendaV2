package vista;

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
import javax.swing.JTextPane;

public class altaArticulo extends JFrame {

	private JPanel contentPane;
	private JTextField txtPrecioArticulo;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					altaArticulo frame = new altaArticulo();
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
	public altaArticulo() {
		setAlwaysOnTop(true);
		setTitle("MoneyMaker 3000 \u2122 - Alta art\u00EDculo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 68, 233, 43, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 62, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblPrecioArticulo = new JLabel("Precio:");
		GridBagConstraints gbc_lblPrecioArticulo = new GridBagConstraints();
		gbc_lblPrecioArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioArticulo.anchor = GridBagConstraints.EAST;
		gbc_lblPrecioArticulo.gridx = 1;
		gbc_lblPrecioArticulo.gridy = 1;
		contentPane.add(lblPrecioArticulo, gbc_lblPrecioArticulo);
		
		txtPrecioArticulo = new JTextField();
		GridBagConstraints gbc_txtPrecioArticulo = new GridBagConstraints();
		gbc_txtPrecioArticulo.anchor = GridBagConstraints.WEST;
		gbc_txtPrecioArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecioArticulo.gridx = 2;
		gbc_txtPrecioArticulo.gridy = 1;
		contentPane.add(txtPrecioArticulo, gbc_txtPrecioArticulo);
		txtPrecioArticulo.setColumns(10);
		
		JLabel lblNombreArticulo = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombreArticulo = new GridBagConstraints();
		gbc_lblNombreArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreArticulo.anchor = GridBagConstraints.EAST;
		gbc_lblNombreArticulo.gridx = 1;
		gbc_lblNombreArticulo.gridy = 3;
		contentPane.add(lblNombreArticulo, gbc_lblNombreArticulo);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 3;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Descripci\u00F3n:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 5;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.insets = new Insets(0, 0, 5, 5);
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.gridx = 2;
		gbc_textPane.gridy = 5;
		contentPane.add(textPane, gbc_textPane);
	}

}
