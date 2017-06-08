package control.comportamiento.articulo;

import vista.articulo.AltaArticuloPane;
import java.awt.event.ActionListener;

import control.comportamiento.ParaUI;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

public class ParaAltaArticuloPane extends AltaArticuloPane {

	private ParaUI ui;
	
	/**
	 * Create the panel.
	 */
	public ParaAltaArticuloPane(ParaUI ui) {
		this.ui = ui;
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout layout = (CardLayout) ui.paraCardPane.getLayout();
				layout.show(ui.paraCardPane, "hall");
			}
		});
		
	}

}
