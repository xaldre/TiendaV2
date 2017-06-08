package control.comportamiento.cliente;

import java.awt.CardLayout;

import control.comportamiento.ParaUI;
import vista.cliente.ConsultaClientePane;

public class ParaConsultaclientePane extends ConsultaClientePane {

	private ParaUI ui;

	/**
	 * Create the panel.
	 */
	public ParaConsultaclientePane(ParaUI ui) {
		this.ui = ui;

		// TODO usar esto para cambiar de cards
//		CardLayout layout = (CardLayout) ui.paraCardPane.getLayout();
//		layout.show(ui.paraCardPane, "consultaPedido");
	}

}
