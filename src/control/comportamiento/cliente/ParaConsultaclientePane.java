package control.comportamiento.cliente;

import java.awt.CardLayout;

import control.comportamiento.ParaUI;
import vista.cliente.ConsultaClientePane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ParaConsultaclientePane extends ConsultaClientePane {

	private ParaUI ui;

	/**
	 * Create the panel.
	 */
	public ParaConsultaclientePane(ParaUI ui) {
		this.ui = ui;
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout layout = (CardLayout) ui.paraCardPane.getLayout();
				layout.show(ui.paraCardPane, "hall");
			}
		});
	}

}
