package test.vista.cliente;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import vista.cliente.AltaClientePane;

public class TestAltaClientePane extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestAltaClientePane frame = new TestAltaClientePane();
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
	public TestAltaClientePane() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setContentPane(new AltaClientePane());
	}

}
