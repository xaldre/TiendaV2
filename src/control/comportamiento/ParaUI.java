package control.comportamiento;

import vista.UI;
import java.awt.event.ActionListener;

import control.logica.Gestor;
import modelo.Articulo;
import modelo.Pedido;
import modelo.Cliente;

import java.awt.event.ActionEvent;

public class ParaUI extends UI {
	public ParaUI() {
		btnAltaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Gestor().insertar(new Cliente("1","3"));
			}
		});
		btnAltaArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Gestor().insertar(new Articulo());
			}
		});
		btnAltaPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Gestor().insertar(new Pedido());
			}
		});
	}

}
