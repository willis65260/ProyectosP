package Paint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejercicio2 extends JPanel {
	JFrame V;
	int[] puntosx = { 50, 50, 100, 100 };
	int[] puntosy = { 50, 100, 100, 50 };

	private int[] xs = { 75, 150, 300, 375 };
	private int[] ys = { 250, 100, 350, 250 };

	BufferedImage slate;
    TexturePaint slatetp;
	
	public Ejercicio2() {
		V = new JFrame();
		V.setSize(800, 600);
		V.setTitle("Practicas");
		V.setLocationRelativeTo(null);
		this.setSize(800, 600);
		V.add(this);
		
		try {
			slate = ImageIO.read(new File("/img/flor.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		slatetp = new TexturePaint(slate, new Rectangle(0, 0, 90, 60));
		
		V.setVisible(true);
		V.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		GeneralPath path = new GeneralPath();
		path.moveTo(100, 100);
		path.lineTo(150, 125);
		path.lineTo(135, 175);
		path.lineTo(65, 175);
		path.lineTo(50, 125);
		path.closePath();
		Graphics2D g2d2 = (Graphics2D) g;
		Graphics2D g2d3 = (Graphics2D) g;

		g2d.setPaint(new GradientPaint(150, 125, Color.blue, 65, 175, Color.red));
		g2d.setStroke(new BasicStroke(5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		g2d.fill(path);

		g.translate(200, 0);
		g2d3.setPaint(new GradientPaint(150, 125, Color.green, 65, 175, Color.yellow));
		g2d3.setStroke(new BasicStroke(5f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL));
		g2d3.fill(path);

		g.translate(200, 0);
		g2d2.setPaint(slatetp);
		g2d2.setStroke(new BasicStroke(5f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL));
		g2d2.fill(path);
		
//		g.translate(200, 0);
//		g2d.draw(path);
//		path.closePath();
//		g.translate(200, 0);
//
//		g2d.draw(path);

	}

	public static void main(String[] args) {
		new Ejercicio2();
	}
}
