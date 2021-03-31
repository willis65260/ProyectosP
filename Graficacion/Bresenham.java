// package Graficacion;

import java.awt.*;
import javax.swing.*;

public class Bresenham extends JPanel {

	private static final long serialVersionUID = 1L;

	JFrame vent;

	public Bresenham() {
		vent = new JFrame("Algoritmo de Bresenham");
		setSize(800, 600);
		// setBackground(Color.BLACK);
		vent.setSize(800, 600);
		vent.add(this);
		vent.setVisible(true);
		vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		// dibujar la linea con el algoritmo de Bresenham
		g.setColor(Color.RED);
		Linea(g, 100, 100, 120, 150);
		
		// dibujar una circunferencia con el algoritmo de Bresenham
		g.setColor(Color.RED);
		Circulo(g, 100, 100, 100);

	}

	public void Linea(Graphics g, int x0, int y0, int x1, int y1) {
		int x, y, dx, dy, p, incE, incNE, stepx, stepy;
		dx = (x1 - x0);
		dy = (y1 - y0);

		/* determinar que punto usar para empezar, cual para terminar */
		if (dy < 0) {
			dy = -dy;
			stepy = -1;
		} else {
			stepy = 1;
		}

		if (dx < 0) {
			dx = -dx;
			stepx = -1;
		} else {
			stepx = 1;
		}

		x = x0;
		y = y0;
		g.drawLine(x0, y0, x0, y0);
		/* se cicla hasta llegar al extremo de la línea */
		if (dx > dy) {
			p = 2 * dy - dx;
			incE = 2 * dy;
			incNE = 2 * (dy - dx);
			while (x != x1) {
				x = x + stepx;
				if (p < 0) {
					p = p + incE;
				} else {
					y = y + stepy;
					p = p + incNE;
				}
				g.drawLine(x, y, x, y);
			}
		} else {
			p = 2 * dx - dy;
			incE = 2 * dx;
			incNE = 2 * (dx - dy);
			while (y != y1) {
				y = y + stepy;
				if (p < 0) {
					p = p + incE;
				} else {
					x = x + stepx;
					p = p + incNE;
				}
				g.drawLine(x, y, x, y);
			}
		}
	}

	public void Circulo(Graphics g, int xc, int yc, int r) {
		int d = (5 / 4) * r;
		int x = 0;
		int y = r;
		do {
			g.setColor(Color.red);
			g.drawLine(y + xc, x + yc, y + xc, x + yc);
			g.drawLine(x + xc, y + yc, x + xc, y + yc);
			g.drawLine(x + xc, -y + yc, x + xc, -y + yc);
			g.drawLine(y + xc, -x + yc, y + xc, -x + yc);
			g.drawLine(-y + xc, -x + yc, -y + xc, -x + yc);
			g.drawLine(-x + xc, -y + yc, -x + xc, -y + yc);
			g.drawLine(-x + xc, y + yc, -x + xc, y + yc);
			g.drawLine(-y + xc, x + yc, -y + xc, x + yc);

			if (d < 0) {
				d = d + 2 * x + 3;
			} else {
				d = d + 2 * (x - y) + 5;
				y = y - 1;
			}
			x = x + 1;
		} while (x < y);

	}

	public static void main(String[] args) {
		new Bresenham();
	}
}