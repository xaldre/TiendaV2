package test.vista.articulo;

import java.awt.EventQueue;
import javax.swing.JFrame;
import vista.articulo.AltaArticuloPane;

public class TestAltaArticuloPane extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestAltaArticuloPane frame = new TestAltaArticuloPane();
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
	public TestAltaArticuloPane() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setContentPane(new AltaArticuloPane());
	}

}
