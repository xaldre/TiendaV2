package vista;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {

	private BufferedImage image;

	public ImagePanel(String route) {
		super();
		try {
			this.image = ImageIO.read(new File(route));
		} catch (IOException ex) {
			// handle exception...
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
//		g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters
		
		int initialX = (int) ((this.getWidth()*0.5)-(image.getWidth()*0.5));
		
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), 0, 0, image.getWidth(), image.getHeight(), this);
	}

}