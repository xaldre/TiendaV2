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
	private JTextField text_ca_referencia;
	private JTextField text_ca_nombre;
	private JTextField text_ca_precio;
	private JTextField text_ca_descripcion;
	private JButton btn_ca_cancelar;

	/**
	 * Create the panel.
	 * @return 
	 */
	public ConsultaArticuloPane() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{20, 0, 0, 118, 0, 0, 5, 0, 20, 0};
		gridBagLayout.rowHeights = new int[]{20, 0, 0, 0, 0, 0, 0, 0, 5, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lbl_ca_referencia = new JLabel("N\u00BA de referencia:");
		GridBagConstraints gbc_lbl_ca_referencia = new GridBagConstraints();
		gbc_lbl_ca_referencia.fill = GridBagConstraints.HORIZONTAL;
		gbc_lbl_ca_referencia.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_ca_referencia.gridx = 1;
		gbc_lbl_ca_referencia.gridy = 1;
		add(lbl_ca_referencia, gbc_lbl_ca_referencia);
		
		text_ca_referencia = new JTextField();
		GridBagConstraints gbc_text_ca_referencia = new GridBagConstraints();
		gbc_text_ca_referencia.gridwidth = 4;
		gbc_text_ca_referencia.insets = new Insets(0, 0, 5, 5);
		gbc_text_ca_referencia.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_ca_referencia.gridx = 2;
		gbc_text_ca_referencia.gridy = 1;
		add(text_ca_referencia, gbc_text_ca_referencia);
		text_ca_referencia.setColumns(10);
		
		JButton btn_ca_consultar = new JButton("Consultar");
		GridBagConstraints gbc_btn_ca_consultar = new GridBagConstraints();
		gbc_btn_ca_consultar.insets = new Insets(0, 0, 5, 5);
		gbc_btn_ca_consultar.gridx = 7;
		gbc_btn_ca_consultar.gridy = 1;
		add(btn_ca_consultar, gbc_btn_ca_consultar);
		
		JLabel lbl_ca_nombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lbl_ca_nombre = new GridBagConstraints();
		gbc_lbl_ca_nombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_lbl_ca_nombre.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_ca_nombre.gridx = 1;
		gbc_lbl_ca_nombre.gridy = 2;
		add(lbl_ca_nombre, gbc_lbl_ca_nombre);
		
		text_ca_nombre = new JTextField();
		text_ca_nombre.setEditable(false);
		text_ca_nombre.setColumns(10);
		GridBagConstraints gbc_text_ca_nombre = new GridBagConstraints();
		gbc_text_ca_nombre.gridwidth = 4;
		gbc_text_ca_nombre.insets = new Insets(0, 0, 5, 5);
		gbc_text_ca_nombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_ca_nombre.gridx = 2;
		gbc_text_ca_nombre.gridy = 2;
		add(text_ca_nombre, gbc_text_ca_nombre);
		
		JLabel lbl_ca_precio = new JLabel("Precio:");
		GridBagConstraints gbc_lbl_ca_precio = new GridBagConstraints();
		gbc_lbl_ca_precio.fill = GridBagConstraints.HORIZONTAL;
		gbc_lbl_ca_precio.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_ca_precio.gridx = 1;
		gbc_lbl_ca_precio.gridy = 3;
		add(lbl_ca_precio, gbc_lbl_ca_precio);
		
		text_ca_precio = new JTextField();
		text_ca_precio.setEditable(false);
		text_ca_precio.setColumns(10);
		GridBagConstraints gbc_text_ca_precio = new GridBagConstraints();
		gbc_text_ca_precio.gridwidth = 4;
		gbc_text_ca_precio.insets = new Insets(0, 0, 5, 5);
		gbc_text_ca_precio.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_ca_precio.gridx = 2;
		gbc_text_ca_precio.gridy = 3;
		add(text_ca_precio, gbc_text_ca_precio);
		
		JLabel lbl_ca_descripcion = new JLabel("Descripci\u00F3n:");
		GridBagConstraints gbc_lbl_ca_descripcion = new GridBagConstraints();
		gbc_lbl_ca_descripcion.fill = GridBagConstraints.HORIZONTAL;
		gbc_lbl_ca_descripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_ca_descripcion.gridx = 1;
		gbc_lbl_ca_descripcion.gridy = 4;
		add(lbl_ca_descripcion, gbc_lbl_ca_descripcion);
		
		text_ca_descripcion = new JTextField();
		text_ca_descripcion.setEditable(false);
		text_ca_descripcion.setColumns(10);
		GridBagConstraints gbc_text_ca_descripcion = new GridBagConstraints();
		gbc_text_ca_descripcion.gridheight = 3;
		gbc_text_ca_descripcion.gridwidth = 6;
		gbc_text_ca_descripcion.insets = new Insets(0, 0, 5, 5);
		gbc_text_ca_descripcion.fill = GridBagConstraints.BOTH;
		gbc_text_ca_descripcion.gridx = 2;
		gbc_text_ca_descripcion.gridy = 4;
		add(text_ca_descripcion, gbc_text_ca_descripcion);
		
		btn_ca_cancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btn_ca_cancelar = new GridBagConstraints();
		gbc_btn_ca_cancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btn_ca_cancelar.gridx = 7;
		gbc_btn_ca_cancelar.gridy = 7;
		add(btn_ca_cancelar, gbc_btn_ca_cancelar);
	}
}
