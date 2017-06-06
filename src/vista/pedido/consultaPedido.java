package vista.pedido;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;

import java.awt.Component;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;

public class consultaPedido extends JPanel {

	private JTable table;
	private JTextField textNumeroPedido;
	private JTextField textFecha;
	private JTextField textDNI;
	private JTextField textLineaPedido;

	/**
	 * Create the panel.
	 * @return 
	 */
	public consultaPedido() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{7, 0, 0, 118, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblPedido = new JLabel("Número de pedido:");
		GridBagConstraints gbc_lblPedido = new GridBagConstraints();
		gbc_lblPedido.fill = GridBagConstraints.BOTH;
		gbc_lblPedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblPedido.gridx = 1;
		gbc_lblPedido.gridy = 1;
		add(lblPedido, gbc_lblPedido);
		
		textNumeroPedido = new JTextField();
		GridBagConstraints gbc_textNumeroPedido = new GridBagConstraints();
		gbc_textNumeroPedido.gridwidth = 4;
		gbc_textNumeroPedido.insets = new Insets(0, 0, 5, 5);
		gbc_textNumeroPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNumeroPedido.gridx = 2;
		gbc_textNumeroPedido.gridy = 1;
		add(textNumeroPedido, gbc_textNumeroPedido);
		textNumeroPedido.setColumns(10);
		
		JButton btnCargar = new JButton("Cargar");
		GridBagConstraints gbc_btnCargar = new GridBagConstraints();
		gbc_btnCargar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCargar.gridx = 7;
		gbc_btnCargar.gridy = 1;
		add(btnCargar, gbc_btnCargar);
		
		JButton btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 7;
		gbc_btnCancelar.gridy = 2;
		add(btnCancelar, gbc_btnCancelar);
		
		JLabel lblFecha = new JLabel("Fecha:");
		GridBagConstraints gbc_lblFecha = new GridBagConstraints();
		gbc_lblFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFecha.insets = new Insets(0, 0, 5, 5);
		gbc_lblFecha.gridx = 1;
		gbc_lblFecha.gridy = 3;
		add(lblFecha, gbc_lblFecha);
		
		textFecha = new JTextField();
		textFecha.setEditable(false);
		textFecha.setColumns(10);
		GridBagConstraints gbc_textFecha = new GridBagConstraints();
		gbc_textFecha.gridwidth = 4;
		gbc_textFecha.insets = new Insets(0, 0, 5, 5);
		gbc_textFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFecha.gridx = 2;
		gbc_textFecha.gridy = 3;
		add(textFecha, gbc_textFecha);
		
		JLabel lblDNI = new JLabel("DNI:");
		GridBagConstraints gbc_lblDNI = new GridBagConstraints();
		gbc_lblDNI.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDNI.insets = new Insets(0, 0, 5, 5);
		gbc_lblDNI.gridx = 1;
		gbc_lblDNI.gridy = 4;
		add(lblDNI, gbc_lblDNI);
		
		textDNI = new JTextField();
		textDNI.setEditable(false);
		textDNI.setColumns(10);
		GridBagConstraints gbc_textDNI = new GridBagConstraints();
		gbc_textDNI.gridwidth = 4;
		gbc_textDNI.insets = new Insets(0, 0, 5, 5);
		gbc_textDNI.fill = GridBagConstraints.HORIZONTAL;
		gbc_textDNI.gridx = 2;
		gbc_textDNI.gridy = 4;
		add(textDNI, gbc_textDNI);
		
		JLabel lblLineaPedido = new JLabel("Pedido:");
		GridBagConstraints gbc_lblLineaPedido = new GridBagConstraints();
		gbc_lblLineaPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblLineaPedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblLineaPedido.gridx = 1;
		gbc_lblLineaPedido.gridy = 5;
		add(lblLineaPedido, gbc_lblLineaPedido);
		
		textLineaPedido = new JTextField();
		textLineaPedido.setEditable(false);
		textLineaPedido.setColumns(10);
		GridBagConstraints gbc_textLineaPedido = new GridBagConstraints();
		gbc_textLineaPedido.gridheight = 2;
		gbc_textLineaPedido.gridwidth = 4;
		gbc_textLineaPedido.insets = new Insets(0, 0, 5, 5);
		gbc_textLineaPedido.fill = GridBagConstraints.BOTH;
		gbc_textLineaPedido.gridx = 2;
		gbc_textLineaPedido.gridy = 5;
		add(textLineaPedido, gbc_textLineaPedido);
	}
}
