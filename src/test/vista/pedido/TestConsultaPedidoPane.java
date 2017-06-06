package test.vista.pedido;

import java.awt.EventQueue;
import javax.swing.JFrame;
import vista.pedido.ConsultaPedidoPane;

public class TestConsultaPedidoPane extends JFrame {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestConsultaPedidoPane frame = new TestConsultaPedidoPane();
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
	public TestConsultaPedidoPane() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setContentPane(new ConsultaPedidoPane());
	}

}
