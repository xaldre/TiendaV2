package vista.articulo;

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

public class ConsultaArticuloPane extends JPanel {
	private JTextField txtCliente;
	private JTable table;
	private JTextField txtReferencia;
	private JTextField txtNombre;
	private JTextField txtPrecio;
	private JTextField txtDescripcion;
	private JButton btnCancelar;

	/**
	 * Create the panel.
	 * @return 
	 */
	public ConsultaArticuloPane() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{10, 0, 118, 5, 0, 10, 0};
		gridBagLayout.rowHeights = new int[]{10, 0, 0, 0, 0, 0, 0, 0, 5, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblReferencia = new JLabel("N\u00BA de referencia:");
		GridBagConstraints gbc_lblReferencia = new GridBagConstraints();
		gbc_lblReferencia.anchor = GridBagConstraints.EAST;
		gbc_lblReferencia.insets = new Insets(0, 0, 5, 5);
		gbc_lblReferencia.gridx = 1;
		gbc_lblReferencia.gridy = 1;
		add(lblReferencia, gbc_lblReferencia);
		
		txtReferencia = new JTextField();
		GridBagConstraints gbc_txtReferencia = new GridBagConstraints();
		gbc_txtReferencia.insets = new Insets(0, 0, 5, 5);
		gbc_txtReferencia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtReferencia.gridx = 2;
		gbc_txtReferencia.gridy = 1;
		add(txtReferencia, gbc_txtReferencia);
		txtReferencia.setColumns(10);
		
		JButton btnConsultar = new JButton("Consultar");
		GridBagConstraints gbc_btnConsultar = new GridBagConstraints();
		gbc_btnConsultar.insets = new Insets(0, 0, 5, 5);
		gbc_btnConsultar.gridx = 4;
		gbc_btnConsultar.gridy = 1;
		add(btnConsultar, gbc_btnConsultar);
		
		JLabel lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 2;
		add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 2;
		add(txtNombre, gbc_txtNombre);
		
		JLabel lblPrecio = new JLabel("Precio:");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecio.gridx = 1;
		gbc_lblPrecio.gridy = 3;
		add(lblPrecio, gbc_lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setColumns(10);
		GridBagConstraints gbc_txtPrecio = new GridBagConstraints();
		gbc_txtPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecio.gridx = 2;
		gbc_txtPrecio.gridy = 3;
		add(txtPrecio, gbc_txtPrecio);
		
		JLabel lblDescripcion = new JLabel("Descripci\u00F3n:");
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.anchor = GridBagConstraints.EAST;
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 1;
		gbc_lblDescripcion.gridy = 4;
		add(lblDescripcion, gbc_lblDescripcion);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setEditable(false);
		txtDescripcion.setColumns(10);
		GridBagConstraints gbc_txtDescripcion = new GridBagConstraints();
		gbc_txtDescripcion.gridheight = 3;
		gbc_txtDescripcion.gridwidth = 3;
		gbc_txtDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_txtDescripcion.fill = GridBagConstraints.BOTH;
		gbc_txtDescripcion.gridx = 2;
		gbc_txtDescripcion.gridy = 4;
		add(txtDescripcion, gbc_txtDescripcion);
		
		btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 4;
		gbc_btnCancelar.gridy = 7;
		add(btnCancelar, gbc_btnCancelar);
	}
}
