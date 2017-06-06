package test.vista.pedido;

import java.awt.EventQueue;
import javax.swing.JFrame;
import vista.pedido.AltaPedidoPane;

public class TestAltaPedidoPane extends JFrame {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestAltaPedidoPane frame = new TestAltaPedidoPane();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestAltaPedidoPane() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setContentPane(new AltaPedidoPane());
	}

}
