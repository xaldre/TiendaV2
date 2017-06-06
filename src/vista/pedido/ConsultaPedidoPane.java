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

public class ConsultaPedidoPane extends JPanel {

	private JTable table;
	private JTextField textNumeroPedido;
	private JTextField textFecha;
	private JTextField textDNI;
	private JTextField textLineaPedido;

	/**
	 * Create the panel.
	 * @return 
	 */
	public ConsultaPedidoPane() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{10, 0, 118, 5, 0, 10, 0};
		gridBagLayout.rowHeights = new int[]{10, 0, 0, 0, 0, 0, 0, 0, 5, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblPedido = new JLabel("N\u00BA de pedido:");
		GridBagConstraints gbc_lblPedido = new GridBagConstraints();
		gbc_lblPedido.anchor = GridBagConstraints.EAST;
		gbc_lblPedido.fill = GridBagConstraints.VERTICAL;
		gbc_lblPedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblPedido.gridx = 1;
		gbc_lblPedido.gridy = 1;
		add(lblPedido, gbc_lblPedido);
		
		textNumeroPedido = new JTextField();
		GridBagConstraints gbc_textNumeroPedido = new GridBagConstraints();
		gbc_textNumeroPedido.insets = new Insets(0, 0, 5, 5);
		gbc_textNumeroPedido.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNumeroPedido.gridx = 2;
		gbc_textNumeroPedido.gridy = 1;
		add(textNumeroPedido, gbc_textNumeroPedido);
		textNumeroPedido.setColumns(10);
		
		JButton btnConsultar = new JButton("Consultar");
		GridBagConstraints gbc_btnConsultar = new GridBagConstraints();
		gbc_btnConsultar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnConsultar.insets = new Insets(0, 0, 5, 5);
		gbc_btnConsultar.gridx = 4;
		gbc_btnConsultar.gridy = 1;
		add(btnConsultar, gbc_btnConsultar);
		
		JLabel lblDNI = new JLabel("DNI Cliente:");
		GridBagConstraints gbc_lblDNI = new GridBagConstraints();
		gbc_lblDNI.anchor = GridBagConstraints.EAST;
		gbc_lblDNI.insets = new Insets(0, 0, 5, 5);
		gbc_lblDNI.gridx = 1;
		gbc_lblDNI.gridy = 3;
		add(lblDNI, gbc_lblDNI);
		
		textDNI = new JTextField();
		textDNI.setEditable(false);
		textDNI.setColumns(10);
		GridBagConstraints gbc_textDNI = new GridBagConstraints();
		gbc_textDNI.insets = new Insets(0, 0, 5, 5);
		gbc_textDNI.fill = GridBagConstraints.HORIZONTAL;
		gbc_textDNI.gridx = 2;
		gbc_textDNI.gridy = 3;
		add(textDNI, gbc_textDNI);
		
		JLabel lblFecha = new JLabel("Fecha:");
		GridBagConstraints gbc_lblFecha = new GridBagConstraints();
		gbc_lblFecha.anchor = GridBagConstraints.EAST;
		gbc_lblFecha.insets = new Insets(0, 0, 5, 5);
		gbc_lblFecha.gridx = 1;
		gbc_lblFecha.gridy = 4;
		add(lblFecha, gbc_lblFecha);
		
		textFecha = new JTextField();
		textFecha.setEditable(false);
		textFecha.setColumns(10);
		GridBagConstraints gbc_textFecha = new GridBagConstraints();
		gbc_textFecha.insets = new Insets(0, 0, 5, 5);
		gbc_textFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFecha.gridx = 2;
		gbc_textFecha.gridy = 4;
		add(textFecha, gbc_textFecha);
		
		JLabel lblLineaPedido = new JLabel("Pedido:");
		GridBagConstraints gbc_lblLineaPedido = new GridBagConstraints();
		gbc_lblLineaPedido.anchor = GridBagConstraints.EAST;
		gbc_lblLineaPedido.insets = new Insets(0, 0, 5, 5);
		gbc_lblLineaPedido.gridx = 1;
		gbc_lblLineaPedido.gridy = 5;
		add(lblLineaPedido, gbc_lblLineaPedido);
		
		textLineaPedido = new JTextField();
		textLineaPedido.setEditable(false);
		textLineaPedido.setColumns(10);
		GridBagConstraints gbc_textLineaPedido = new GridBagConstraints();
		gbc_textLineaPedido.gridheight = 2;
		gbc_textLineaPedido.gridwidth = 3;
		gbc_textLineaPedido.insets = new Insets(0, 0, 5, 5);
		gbc_textLineaPedido.fill = GridBagConstraints.BOTH;
		gbc_textLineaPedido.gridx = 2;
		gbc_textLineaPedido.gridy = 5;
		add(textLineaPedido, gbc_textLineaPedido);
		
		JButton btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 4;
		gbc_btnCancelar.gridy = 7;
		add(btnCancelar, gbc_btnCancelar);
	}
}
