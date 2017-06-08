package control.comportamiento.cliente;

import control.comportamiento.ParaUI;
import vista.cliente.AltaClientePane;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;

public class ParaAltaClientePane extends AltaClientePane {

	private ParaUI ui;
	
	/**
	 * Create the panel.
	 */
	public ParaAltaClientePane(ParaUI ui) {
		this.ui = ui;
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout layout = (CardLayout) ui.paraCardPane.getLayout();
				layout.show(ui.paraCardPane, "hall");
			}
		});

	}

}
