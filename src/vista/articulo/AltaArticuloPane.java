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
 
public class AltaArticuloPane extends JPanel {
    protected JTextField txtNombre;
    protected JTextField txtPrecio;
    protected JButton btnCancelar;
    protected JButton btnAlta;
    protected JTextArea txtDescripcion;
 
    /**
     * Create the panel.
     */
    public AltaArticuloPane() {
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{10, 0, 221, 5, 0, 10, 0};
        gridBagLayout.rowHeights = new int[]{10, 0, 5, 0, 5, 0, 0, 0, 5, 0};
        gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
        setLayout(gridBagLayout);
         
          JLabel lblNombre = new JLabel("Nombre:");
          GridBagConstraints gbc_lblNombre = new GridBagConstraints();
          gbc_lblNombre.anchor = GridBagConstraints.EAST;
          gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
          gbc_lblNombre.gridx = 1;
          gbc_lblNombre.gridy = 1;
          add(lblNombre, gbc_lblNombre);
        
         txtNombre = new JTextField();
         txtNombre.setColumns(10);
         GridBagConstraints gbc_txtNombre = new GridBagConstraints();
         gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
         gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
         gbc_txtNombre.gridx = 2;
         gbc_txtNombre.gridy = 1;
         add(txtNombre, gbc_txtNombre);
        
         btnAlta = new JButton("Alta");
         GridBagConstraints gbc_btnAlta = new GridBagConstraints();
         gbc_btnAlta.fill = GridBagConstraints.HORIZONTAL;
         gbc_btnAlta.insets = new Insets(0, 0, 5, 5);
         gbc_btnAlta.gridx = 4;
         gbc_btnAlta.gridy = 1;
         add(btnAlta, gbc_btnAlta);
         
          JLabel lblPrecio = new JLabel("Precio:");
          GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
          gbc_lblPrecio.anchor = GridBagConstraints.EAST;
          gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
          gbc_lblPrecio.gridx = 1;
          gbc_lblPrecio.gridy = 3;
          add(lblPrecio, gbc_lblPrecio);
        
         txtPrecio = new JTextField();
         txtPrecio.setColumns(10);
         GridBagConstraints gbc_txtPrecio = new GridBagConstraints();
         gbc_txtPrecio.fill = GridBagConstraints.HORIZONTAL;
         gbc_txtPrecio.anchor = GridBagConstraints.WEST;
         gbc_txtPrecio.insets = new Insets(0, 0, 5, 5);
         gbc_txtPrecio.gridx = 2;
         gbc_txtPrecio.gridy = 3;
         add(txtPrecio, gbc_txtPrecio);
        
         JLabel lblDescripcion = new JLabel("Descripci\u00F3n:");
         GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
         gbc_lblDescripcion.anchor = GridBagConstraints.NORTHEAST;
         gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
         gbc_lblDescripcion.gridx = 1;
         gbc_lblDescripcion.gridy = 5;
         add(lblDescripcion, gbc_lblDescripcion);
         
          txtDescripcion = new JTextArea();
          txtDescripcion.setLineWrap(true);
          GridBagConstraints gbc_txtDescripcion = new GridBagConstraints();
          gbc_txtDescripcion.gridwidth = 3;
          gbc_txtDescripcion.gridheight = 2;
          gbc_txtDescripcion.insets = new Insets(0, 0, 5, 5);
          gbc_txtDescripcion.fill = GridBagConstraints.BOTH;
          gbc_txtDescripcion.gridx = 2;
          gbc_txtDescripcion.gridy = 5;
          add(txtDescripcion, gbc_txtDescripcion);
          
           btnCancelar = new JButton("Cancelar");
           GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
           gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
           gbc_btnCancelar.gridx = 4;
           gbc_btnCancelar.gridy = 7;
           add(btnCancelar, gbc_btnCancelar);
 
    }
 
}
