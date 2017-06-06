package vista.articulo;
 
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
 
public class altaArticuloPane extends JPanel {
    private JTextField textNombre;
    private JTextField textPrecio;
 
    /**
     * Create the panel.
     */
    public altaArticuloPane() {
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{0, 0, 221, 0, 0, 0, 0};
        gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
        gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
        setLayout(gridBagLayout);
       
        JLabel labelNombre = new JLabel("Nombre:");
        GridBagConstraints gbc_labelNombre = new GridBagConstraints();
        gbc_labelNombre.anchor = GridBagConstraints.EAST;
        gbc_labelNombre.insets = new Insets(0, 0, 5, 5);
        gbc_labelNombre.gridx = 1;
        gbc_labelNombre.gridy = 2;
        add(labelNombre, gbc_labelNombre);
       
        textNombre = new JTextField();
        textNombre.setColumns(10);
        GridBagConstraints gbc_textNombre = new GridBagConstraints();
        gbc_textNombre.insets = new Insets(0, 0, 5, 5);
        gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
        gbc_textNombre.gridx = 2;
        gbc_textNombre.gridy = 2;
        add(textNombre, gbc_textNombre);
       
        JButton buttonAlta = new JButton("Alta");
        GridBagConstraints gbc_buttonAlta = new GridBagConstraints();
        gbc_buttonAlta.fill = GridBagConstraints.HORIZONTAL;
        gbc_buttonAlta.insets = new Insets(0, 0, 5, 5);
        gbc_buttonAlta.gridx = 4;
        gbc_buttonAlta.gridy = 2;
        add(buttonAlta, gbc_buttonAlta);
       
        JButton buttonCancelar = new JButton("Cancelar");
        GridBagConstraints gbc_buttonCancelar = new GridBagConstraints();
        gbc_buttonCancelar.insets = new Insets(0, 0, 5, 5);
        gbc_buttonCancelar.gridx = 4;
        gbc_buttonCancelar.gridy = 3;
        add(buttonCancelar, gbc_buttonCancelar);
       
        JLabel labelPrecio = new JLabel("Precio:");
        GridBagConstraints gbc_labelPrecio = new GridBagConstraints();
        gbc_labelPrecio.anchor = GridBagConstraints.EAST;
        gbc_labelPrecio.insets = new Insets(0, 0, 5, 5);
        gbc_labelPrecio.gridx = 1;
        gbc_labelPrecio.gridy = 4;
        add(labelPrecio, gbc_labelPrecio);
       
        textPrecio = new JTextField();
        textPrecio.setColumns(10);
        GridBagConstraints gbc_textPrecio = new GridBagConstraints();
        gbc_textPrecio.fill = GridBagConstraints.HORIZONTAL;
        gbc_textPrecio.anchor = GridBagConstraints.WEST;
        gbc_textPrecio.insets = new Insets(0, 0, 5, 5);
        gbc_textPrecio.gridx = 2;
        gbc_textPrecio.gridy = 4;
        add(textPrecio, gbc_textPrecio);
       
        JLabel labelDescripcion = new JLabel("Descripci\u00F3n:");
        GridBagConstraints gbc_labelDescripcion = new GridBagConstraints();
        gbc_labelDescripcion.anchor = GridBagConstraints.NORTH;
        gbc_labelDescripcion.insets = new Insets(0, 0, 5, 5);
        gbc_labelDescripcion.gridx = 1;
        gbc_labelDescripcion.gridy = 6;
        add(labelDescripcion, gbc_labelDescripcion);
       
        JTextArea textDescripcion = new JTextArea();
        textDescripcion.setLineWrap(true);
        GridBagConstraints gbc_textDescripcion = new GridBagConstraints();
        gbc_textDescripcion.insets = new Insets(0, 0, 5, 5);
        gbc_textDescripcion.fill = GridBagConstraints.BOTH;
        gbc_textDescripcion.gridx = 2;
        gbc_textDescripcion.gridy = 6;
        add(textDescripcion, gbc_textDescripcion);
 
    }
 
}
