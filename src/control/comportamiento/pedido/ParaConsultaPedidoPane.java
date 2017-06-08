package control.comportamiento.pedido;

import control.comportamiento.ParaUI;
import vista.pedido.ConsultaPedidoPane;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;

public class ParaConsultaPedidoPane extends ConsultaPedidoPane {

	private ParaUI ui;

	/**
	 * Create the panel.
	 */
	public ParaConsultaPedidoPane(ParaUI ui) {
		this.ui = ui;
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout layout = (CardLayout) ui.paraCardPane.getLayout();
				layout.show(ui.paraCardPane, "hall");
			}
		});
		
	}

}
