package vista.pedido;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.JScrollPane;

public class altaPedidoPane extends JPanel {
	private JTextField txtCliente;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public altaPedidoPane() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 47, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblCliente = new JLabel("Cliente:");
		GridBagConstraints gbc_lblCliente = new GridBagConstraints();
		gbc_lblCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblCliente.gridx = 2;
		gbc_lblCliente.gridy = 1;
		add(lblCliente, gbc_lblCliente);
		
		txtCliente = new JTextField();
		GridBagConstraints gbc_txtCliente = new GridBagConstraints();
		gbc_txtCliente.gridwidth = 2;
		gbc_txtCliente.insets = new Insets(0, 0, 5, 5);
		gbc_txtCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCliente.gridx = 3;
		gbc_txtCliente.gridy = 1;
		add(txtCliente, gbc_txtCliente);
		txtCliente.setColumns(10);
		
		JLabel lblSeleccioneUnArtculo = new JLabel("Seleccione un art\u00EDculo:");
		GridBagConstraints gbc_lblSeleccioneUnArtculo = new GridBagConstraints();
		gbc_lblSeleccioneUnArtculo.anchor = GridBagConstraints.WEST;
		gbc_lblSeleccioneUnArtculo.gridwidth = 3;
		gbc_lblSeleccioneUnArtculo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeleccioneUnArtculo.gridx = 1;
		gbc_lblSeleccioneUnArtculo.gridy = 3;
		add(lblSeleccioneUnArtculo, gbc_lblSeleccioneUnArtculo);
		
		JComboBox cBoxArticulo = new JComboBox();
		GridBagConstraints gbc_cBoxArticulo = new GridBagConstraints();
		gbc_cBoxArticulo.gridwidth = 3;
		gbc_cBoxArticulo.insets = new Insets(0, 0, 5, 5);
		gbc_cBoxArticulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_cBoxArticulo.gridx = 1;
		gbc_cBoxArticulo.gridy = 4;
		add(cBoxArticulo, gbc_cBoxArticulo);
		
		JButton btnAgregar = new JButton("Agregar");
		GridBagConstraints gbc_btnAgregar = new GridBagConstraints();
		gbc_btnAgregar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAgregar.gridx = 4;
		gbc_btnAgregar.gridy = 4;
		add(btnAgregar, gbc_btnAgregar);
		
		JButton btnCrearPedido = new JButton("Crear pedido");
		GridBagConstraints gbc_btnCrearPedido = new GridBagConstraints();
		gbc_btnCrearPedido.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrearPedido.gridx = 6;
		gbc_btnCrearPedido.gridy = 4;
		add(btnCrearPedido, gbc_btnCrearPedido);
		
		table = new JTable();
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.insets = new Insets(0, 0, 5, 5);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 1;
		gbc_table.gridy = 5;
		add(table, gbc_table);
		
		String[] columnas = {"Id", "Nombre", "Cantidad", "Precio"};
		DefaultTableModel modeloTabla = new DefaultTableModel(columnas,  0);

	}

}
