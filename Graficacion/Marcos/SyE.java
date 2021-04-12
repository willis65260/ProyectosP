package Marcos;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

// import jdk.internal.org.objectweb.asm.Label;

public class SyE extends JPanel implements ActionListener {

	JFrame V;
	Image imgTablero;
	JLabel veti[][];
	int posfx, posfy, posfx2, posfy2, bandera;
	ImageIcon figura, figura2, figUnidas, figura1reverse, figura2reverse, figuraJreverse, figuraganando, figuraganando2;
	JPanel paneldado;
	ImageIcon imgdado, imgserpi, imgsalir;
	JButton bDado, bDado2, salir;
	int numGenerado, numGenerado2;
	defTablero T[];
	int ubicacion, ubicacion2, ubicacionant;
	int ubicacion_vieja2, ubicacion_vieja;

	Jugador MegamanAzul, MegamanCafe;
	boolean ban_jugador, ban_2_jugadores;

	private JButton btnSalir;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;

	public SyE(int ban) {
		V = new JFrame("Serpientes y Escaleras");
		V.setSize(900, 700);
		V.setLocationRelativeTo(this);
		setSize(900, 700);

		setLayout(new GridLayout(8, 8));
		// Construir tablero
		construirTablero();
		bandera = ban;
		ubicacion = 1;
		ubicacion2 = 1;
		veti = new JLabel[8][8];
		for (int r = 0; r < veti.length; r++) {
			for (int c = 0; c < veti[0].length; c++) {
				veti[r][c] = new JLabel();
				add(veti[r][c]);
				// minuto 22:33
			}
			posfx = 7;
			posfy = 0;
			posfx2 = 7;
			posfy2 = 0;
		}

		URL ruta = getClass().getResource("rec/megaman60x60.gif");
		figura = new ImageIcon(ruta);
		veti[posfx][posfy].setIcon(figura);
		ruta = getClass().getResource("rec/tablero6.jpg");
		imgTablero = new ImageIcon(ruta).getImage();
		V.getContentPane().add(this);
		paneldado = new JPanel();
		ruta = getClass().getResource("rec/dadin.gif");
		imgdado = new ImageIcon(ruta);
		bDado = new JButton(imgdado);
		bDado.setOpaque(false);
		bDado.setContentAreaFilled(false);
		bDado.setBorderPainted(false);
		ruta = getClass().getResource("rec/salir2.png");
		imgsalir = new ImageIcon(ruta);
		paneldado.setLayout(new GridLayout(0, 6, 0, 0));
		paneldado.add(bDado);
		V.getContentPane().add(paneldado, BorderLayout.SOUTH);

		label1 = new JLabel("");
		paneldado.add(label1);

		label2 = new JLabel("");
		paneldado.add(label2);

		label3 = new JLabel("");
		paneldado.add(label3);

		label4 = new JLabel("");
		paneldado.add(label4);

		ruta = getClass().getResource("rec/megaman2.gif");
		figura2 = new ImageIcon(ruta);
		ruta = getClass().getResource("rec/gifJuntos.gif");
		figUnidas = new ImageIcon(ruta);
		ruta = getClass().getResource("rec/reverseMegaman.gif");
		figura1reverse = new ImageIcon(ruta);
		ruta = getClass().getResource("rec/gifJuntoReverse.gif");
		figuraJreverse = new ImageIcon(ruta);
		ruta = getClass().getResource("rec/megaman2reverse.gif");
		figura2reverse = new ImageIcon(ruta);
		ruta = getClass().getResource("rec/megamanGanando1.gif");
		figuraganando = new ImageIcon(ruta);
		ruta = getClass().getResource("rec/megamanGanando2.gif");
		figuraganando2 = new ImageIcon(ruta);

		MegamanAzul = new Jugador("Megaman azul", 1, T, veti, figura, figura1reverse, figuraganando);
		ban_2_jugadores = false;
		MegamanCafe = new Jugador("Megaman cafe", 100, T, veti, figura2, figura2reverse, figuraganando2);
		if (ban == 2) {
			veti[posfx2][posfy2].setIcon(figUnidas);
			paneldado.remove(label1);
			bDado2 = new JButton(imgdado);
			bDado2.setEnabled(false);
			bDado2.setOpaque(false);
			bDado2.setContentAreaFilled(false);
			bDado2.setBorderPainted(false);
			paneldado.add(bDado2, 1);
			bDado2.addActionListener(this);
			MegamanCafe = new Jugador("Megaman cafe", 1, T, veti, figura2, figura2reverse, figuraganando2);
			ban_2_jugadores = true;
			ubicacion2 = 1;
		}
		ban_jugador = true;

		btnSalir = new JButton();
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				V.dispose();
				new MenuInicio();
			}
		});

		btnSalir.setIcon(new ImageIcon(SyE.class.getResource("rec/salir2.png")));
		btnSalir.setOpaque(false);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorderPainted(false);

		paneldado.add(btnSalir);

		// evento del boton
		bDado.addActionListener(this);

		V.setVisible(true);
		V.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void construirTablero() {
		T = new defTablero[65];
		// definicion del primer renglon de tablero
		T[1] = new defTablero(1, 7, 0, 0);
		T[2] = new defTablero(2, 7, 1, 0);
		T[3] = new defTablero(3, 7, 2, 18);
		T[4] = new defTablero(4, 7, 3, 0);
		T[5] = new defTablero(5, 7, 4, 0);
		T[6] = new defTablero(6, 7, 5, 0);
		T[7] = new defTablero(7, 7, 6, 0);
		T[8] = new defTablero(8, 7, 7, 0);
		//
		T[9] = new defTablero(9, 6, 7, 0);
		T[10] = new defTablero(10, 6, 6, 0);
		T[11] = new defTablero(11, 6, 5, 0);
		T[12] = new defTablero(12, 6, 4, 0);
		T[13] = new defTablero(13, 6, 3, 0);
		T[14] = new defTablero(14, 6, 2, 0);
		T[15] = new defTablero(15, 6, 1, 0);
		T[16] = new defTablero(16, 6, 0, 0);

		T[17] = new defTablero(17, 5, 0, 0);
		T[18] = new defTablero(18, 5, 1, 0);
		T[19] = new defTablero(19, 5, 2, 0);
		T[20] = new defTablero(20, 5, 3, 0);
		T[21] = new defTablero(21, 5, 4, 7);
		T[22] = new defTablero(22, 5, 5, 0);
		T[23] = new defTablero(23, 5, 6, 0);
		T[24] = new defTablero(24, 5, 7, 39);

		T[25] = new defTablero(25, 4, 7, 0);
		T[26] = new defTablero(26, 4, 6, 0);
		T[27] = new defTablero(27, 4, 5, 0);
		T[28] = new defTablero(28, 4, 4, 0);
		T[29] = new defTablero(29, 4, 3, 53);
		T[30] = new defTablero(30, 4, 2, 0);
		T[31] = new defTablero(31, 4, 1, 0);
		T[32] = new defTablero(32, 4, 0, (33 + numGenerado));

		T[33] = new defTablero(33, 3, 0, 0);
		T[34] = new defTablero(34, 3, 1, 19);
		T[35] = new defTablero(35, 3, 2, 0);
		T[36] = new defTablero(36, 3, 3, 0);
		T[37] = new defTablero(37, 3, 4, 0);
		T[38] = new defTablero(38, 3, 5, 0);
		T[39] = new defTablero(39, 3, 6, 0);
		T[40] = new defTablero(40, 3, 7, 0);
		//
		T[41] = new defTablero(41, 2, 7, 0);
		T[42] = new defTablero(42, 2, 6, 0);
		T[43] = new defTablero(43, 2, 5, 0);
		T[44] = new defTablero(44, 2, 4, 0);
		T[45] = new defTablero(45, 2, 3, 0);
		T[46] = new defTablero(46, 2, 2, 0);
		T[47] = new defTablero(47, 2, 1, 0);
		T[48] = new defTablero(48, 2, 0, 63);

		T[49] = new defTablero(49, 1, 0, 0);
		T[50] = new defTablero(50, 1, 1, 0);
		T[51] = new defTablero(51, 1, 2, 0);
		T[52] = new defTablero(52, 1, 3, 0);
		T[53] = new defTablero(53, 1, 4, 0);
		T[54] = new defTablero(54, 1, 5, 0);
		T[55] = new defTablero(55, 1, 6, 43);
		T[56] = new defTablero(56, 1, 7, 0);

		T[57] = new defTablero(57, 0, 7, 0);
		T[58] = new defTablero(58, 0, 6, 0);
		T[59] = new defTablero(59, 0, 5, 0);
		T[60] = new defTablero(60, 0, 4, 0);
		T[61] = new defTablero(61, 0, 3, 0);
		T[62] = new defTablero(62, 0, 2, 52);
		T[63] = new defTablero(63, 0, 1, 0);
		T[64] = new defTablero(64, 0, 0, 0);
	}

	public boolean ImagenJunta() {
		if (posfx == posfx2) {
			if (posfy == posfy2) {
				return true;
			}

		}
		return false;
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(imgTablero, 0, 0, getWidth(), getHeight(), this);

	}

	/*
	 * public static void main(String[] args) { new SyE(); }
	 */

	public void actionPerformed(ActionEvent e) {
		// Random R = new Random();
		// numGenerado = 1 + R.nextInt(6);
		numGenerado = 2;
		System.out.println(numGenerado);
		URL ruta = getClass().getResource("rec/dado" + numGenerado + ".png");
		bDado.setIcon(new ImageIcon(ruta));
		// 13:00 LO IDEAL DE QUI ES TENER UN CUADRO PERSONALIZADO PARA LOS JUGADORES
		ruta = getClass().getResource("rec/serpiente.png");
		imgserpi = new ImageIcon(ruta);
		// JOptionPane.showMessageDialog(null,"Avanza "+ numGenerado+" posiciones");
		JOptionPane.showMessageDialog(null, "Avanza " + numGenerado + " posiciones", "Serpientes y Escaleras", 0,
				imgserpi);
		ruta = getClass().getResource("rec/dadin.gif");
		bDado.setIcon(new ImageIcon(ruta));

		// if (ubicacion > 64) {
		// int resta = ubicacion - 64;
		// ubicacion = 64 - resta;
		// }

		int avan = T[ubicacion].getAvance();

		if (avan != 0) {
			if (avan < ubicacion)
				JOptionPane.showMessageDialog(null, "Regresa a la posicion " + avan, "Serpientes y Escaleras", 0,
						imgserpi);
			else
				JOptionPane.showMessageDialog(null, "sube a la posicion " + avan, "Serpientes y Escaleras", 0,
						imgserpi);
			// ubicacion = avan;
			// * avance directo sin animacion
		}

		ubicacion = MegamanAzul.ubicacion + numGenerado;

		if (ubicacion > 64) {
			int resta = ubicacion - 64;
			ubicacion = 64 - resta;
		}

		avan = T[ubicacion].getAvance();

		if (avan != 0) {
			ubicacion = avan;
		}

		if (ban_2_jugadores)
			if (ban_jugador) {

				Thread Hilo = new Thread(new MoverGif(MegamanAzul, ubicacion, MegamanCafe, T, veti, V));

				Hilo.start();
				ban_jugador = false;
				bDado.setEnabled(false);
				bDado2.setEnabled(true);

			} else {
				ubicacion = MegamanCafe.ubicacion + numGenerado;

				if (ubicacion > 64) {
					int resta = ubicacion - 64;
					ubicacion = 64 - resta;
				}

				avan = T[ubicacion].getAvance();

				if (avan != 0) {
					ubicacion = avan;
				}

				Thread Hilo = new Thread(new MoverGif(MegamanCafe, ubicacion, MegamanAzul, T, veti, V));

				Hilo.start();
				ban_jugador = true;
				bDado.setEnabled(true);
				bDado2.setEnabled(false);
			}
		else {

			Thread Hilo = new Thread(new MoverGif(MegamanAzul, ubicacion, MegamanCafe, T, veti, V));

			Hilo.start();
		}
	}

}

class Jugador {
	String nombre;
	int ubicacion;
	defTablero T[];
	JLabel veti[][];
	ImageIcon imagen;
	ImageIcon imagen_reverse;
	ImageIcon imagen_ganando;

	public Jugador(String nombre, int ubicacion, defTablero[] T, JLabel veti[][], ImageIcon imagen,
			ImageIcon imagen_reverse, ImageIcon imagen_ganando) {
		this.ubicacion = ubicacion;
		this.T = T;
		this.veti = veti;
		this.imagen = imagen;
		this.imagen_reverse = imagen_reverse;
		this.imagen_ganando = imagen_ganando;
		this.nombre = nombre;
	}
}

class MoverGif implements Runnable {
	URL ruta;

	ImageIcon figura;// $ jugador uno
	ImageIcon figura2;// $ jugador dos

	ImageIcon figura1reverse;
	ImageIcon figura2reverse;

	ImageIcon figUnidas;
	ImageIcon figuraJreverse;

	ImageIcon figuraganando;
	ImageIcon figuraganando2;

	Jugador jugador;
	Jugador jugador2;

	int ubicacion_nueva;

	int posfx, posfy;

	defTablero T[];
	JLabel veti[][];

	JFrame V;

	public MoverGif(Jugador jugador, int ubicacion_nueva, Jugador jugador2, defTablero[] T, JLabel veti[][], JFrame V) {

		this.jugador = jugador;
		this.ubicacion_nueva = ubicacion_nueva;
		this.jugador2 = jugador2;
		this.T = T;
		this.veti = veti;
		this.V = V;
		GenerarFiguras();

	}

	public void run() {
		try {
			if (jugador.ubicacion <= ubicacion_nueva) {
				// * pa' delante
				while (jugador.ubicacion <= ubicacion_nueva) {
					System.out.println("Se esta moviendo " + jugador.ubicacion);

					if (jugador.ubicacion > 1) {
						posfx = T[jugador.ubicacion - 1].getRenglon();
						posfy = T[jugador.ubicacion - 1].getColumna();
						veti[posfx][posfy].setIcon(CargarFiguraOrNull());
					}

					posfx = T[jugador.ubicacion].getRenglon();
					posfy = T[jugador.ubicacion].getColumna();
					veti[posfx][posfy].setIcon(CargarFigura());

					jugador.ubicacion++;
					Thread.sleep(500);
				}
				jugador.ubicacion--;
				System.out.println("Se esta moviendo " + jugador.ubicacion);

			} else {
				// * pa' tras
				while (ubicacion_nueva <= jugador.ubicacion) {
					if (jugador.ubicacion < 64) {
						posfx = T[jugador.ubicacion + 1].getRenglon();
						posfy = T[jugador.ubicacion + 1].getColumna();
						veti[posfx][posfy].setIcon(CargarFiguraAtrasOrNull());
					}
					posfx = T[jugador.ubicacion].getRenglon();
					posfy = T[jugador.ubicacion].getColumna();

					veti[posfx][posfy].setIcon(CargarFigura());

					jugador.ubicacion--;
					Thread.sleep(500);
				}
				jugador.ubicacion++;
			}

			if (jugador.ubicacion == 64) {
				JOptionPane.showMessageDialog(null, "Felicidades has GANADO!!!!", "Serpientes y Escaleras", 0,
						jugador.imagen_ganando);
				V.dispose();
				new MenuInicio();
			}

		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getStackTrace()[0].getLineNumber());
		}
	}

	public ImageIcon CargarFiguraOrNull() {
		if (jugador.ubicacion - 1 == jugador2.ubicacion) {

			if (T[jugador.ubicacion - 1].r % 2 != 0)
				return jugador2.imagen;
			else
				return jugador2.imagen_reverse;

		} else if (jugador.ubicacion - 1 != jugador2.ubicacion) {
			return null;
		}

		return figuraganando;
	}

	public ImageIcon CargarFigura() {
		if (jugador.ubicacion == jugador2.ubicacion) {

			if (T[jugador.ubicacion].r % 2 != 0)
				return figUnidas;
			else
				return figuraJreverse;

		} else {
			if (T[jugador.ubicacion].r % 2 != 0)
				return jugador.imagen;
			else
				return jugador.imagen_reverse;

		}

	}

	public ImageIcon CargarFiguraAtrasOrNull() {
		if (jugador.ubicacion + 1 == jugador2.ubicacion) {

			if (T[jugador.ubicacion + 1].r % 2 != 0)
				return jugador2.imagen;
			else
				return jugador2.imagen_reverse;

		} else if (jugador.ubicacion + 1 != jugador2.ubicacion) {
			return null;
		}

		return figuraganando;
	}

	public void GenerarFiguras() {
		ruta = getClass().getResource("rec/megaman.gif");
		figura = new ImageIcon(ruta);
		ruta = getClass().getResource("rec/megaman2.gif");
		figura2 = new ImageIcon(ruta);
		ruta = getClass().getResource("rec/gifJuntos.gif");
		figUnidas = new ImageIcon(ruta);
		ruta = getClass().getResource("rec/reverseMegaman.gif");
		figura1reverse = new ImageIcon(ruta);
		ruta = getClass().getResource("rec/gifJuntoReverse.gif");
		figuraJreverse = new ImageIcon(ruta);
		ruta = getClass().getResource("rec/megaman2reverse.gif");
		figura2reverse = new ImageIcon(ruta);
		ruta = getClass().getResource("rec/megamanGanando1.gif");
		figuraganando = new ImageIcon(ruta);
		ruta = getClass().getResource("rec/megamanGanando2.gif");
		figuraganando2 = new ImageIcon(ruta);
	}

}

class defTablero {
	int posicion;
	int r, c;
	int avance;

	public defTablero(int p, int r, int c, int avance) {
		posicion = p;
		this.r = r;
		this.c = c;
		this.avance = avance;
	}

	public int getRenglon() {

		return r;
	}

	public int getColumna() {

		return c;
	}

	public int getAvance() {

		return avance;
	}
}
