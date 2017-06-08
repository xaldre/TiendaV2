package control.comportamiento;

import vista.ImagePanel;
import vista.UI;
import java.awt.event.ActionListener;
import java.util.spi.CalendarDataProvider;

import javax.swing.JPanel;

import control.comportamiento.articulo.ParaAltaArticuloPane;
import control.comportamiento.articulo.ParaConsultaArticuloPane;
import control.comportamiento.cliente.ParaAltaClientePane;
import control.comportamiento.cliente.ParaConsultaclientePane;
import control.comportamiento.pedido.ParaAltaPedidoPane;
import control.comportamiento.pedido.ParaConsultaPedidoPane;
import control.logica.Gestor;
import modelo.Articulo;
import modelo.Pedido;
import modelo.Cliente;

import java.awt.CardLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;

public class ParaUI extends UI {

	public ParaAltaArticuloPane altaArticulo = new ParaAltaArticuloPane(this);
	public ParaConsultaArticuloPane consultaArticulo = new ParaConsultaArticuloPane(this);
	public ParaAltaClientePane altaCliente = new ParaAltaClientePane(this);
	public ParaConsultaclientePane consultaCliente = new ParaConsultaclientePane(this);
	public ParaAltaPedidoPane altaPedido = new ParaAltaPedidoPane(this);
	public ParaConsultaPedidoPane consultaPedido = new ParaConsultaPedidoPane(this);
	public JPanel paraCardPane = cardPane;
	public JPanel hall = new ImagePanel("assets/background.png");

	public ParaUI() {
		paraCardPane.add(hall, "hall");
		paraCardPane.add(altaArticulo, "altaArticulo");
		paraCardPane.add(consultaArticulo, "consultaArticulo");
		paraCardPane.add(altaCliente, "altaCliente");
		paraCardPane.add(consultaCliente, "consultaCliente");
		paraCardPane.add(altaPedido, "altaPedido");
		paraCardPane.add(consultaPedido, "consultaPedido");

		CardLayout layout = (CardLayout) paraCardPane.getLayout();
		layout.show(paraCardPane, "hall");

		mntmConsultaPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.show(paraCardPane, "consultaPedido");
			}
		});
		mntmAltaPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.show(paraCardPane, "altaPedido");
			}
		});
		mntmConsultaArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.show(paraCardPane, "consultaArticulo");
			}
		});
		mntmAltaArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.show(paraCardPane, "altaArticulo");
			}
		});
		mntmConsultaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.show(paraCardPane, "consultaCliente");
			}
		});
		mntmAltaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.show(paraCardPane, "altaCliente");
			}
		});
	}

}
