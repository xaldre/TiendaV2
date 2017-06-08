package control.comportamiento.articulo;

import control.comportamiento.ParaUI;
import vista.articulo.ConsultaArticuloPane;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;

public class ParaConsultaArticuloPane extends ConsultaArticuloPane {

	private ParaUI ui;

	/**
	 * Create the panel.
	 */
	public ParaConsultaArticuloPane(ParaUI ui) {
		this.ui = ui;
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout layout = (CardLayout) ui.paraCardPane.getLayout();
				layout.show(ui.paraCardPane, "hall");
			}
		});

	}

}
