package Serpientes_escaleras;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.net.*;
//import java.util.Iterator;
import java.util.Random;

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

class vector_Etiqueta {
	JLabel etiqueta;
	JPanel PanelInterno;
	JLabel[] EtiquetasInternas;
	ImageIcon figura;

	public vector_Etiqueta() {
		etiqueta = new JLabel();
		EtiquetasInternas = new JLabel[4];
		PanelInterno = new JPanel();
		PanelInterno.setLayout(new GridLayout(2, 2));
		PanelInterno.setOpaque(false);

		for (int i = 0; i < 4; i++) {

			EtiquetasInternas[i] = new JLabel();
			EtiquetasInternas[i].setOpaque(false);
			PanelInterno.add(EtiquetasInternas[i]);
		}
	}

	public void SetImagePumba() {
		URL ruta = getClass().getResource("../Recursos/pumba5.gif");
		// figura = new ImageIcon(ruta);
		EtiquetasInternas[2]
				.setIcon(new ImageIcon(new ImageIcon(ruta).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT)));
	}

	public void SetImageSimba() {
		URL ruta = getClass().getResource("../Recursos/prueba2.gif");
		// figura = new ImageIcon(ruta);
		EtiquetasInternas[0]
				.setIcon(new ImageIcon(new ImageIcon(ruta).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT)));
	}

	public void SetImagePumbaV() {
		URL ruta = getClass().getResource("../Recursos/pumba6.gif");
		// figura = new ImageIcon(ruta);
		EtiquetasInternas[2]
				.setIcon(new ImageIcon(new ImageIcon(ruta).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT)));
	}

	public void SetImageSimbaV() {
		URL ruta = getClass().getResource("../Recursos/prueba3.gif");
		// figura = new ImageIcon(ruta);
		EtiquetasInternas[0]
				.setIcon(new ImageIcon(new ImageIcon(ruta).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT)));
	}

}

public class SerpEscaleras extends JPanel implements ActionListener {
	JFrame V;
	Image imgTablero;
	vector_Etiqueta vEti[][];
	int posfr, posfc;
	ImageIcon figura;
	JPanel panelDado;
	JButton bDado;
	ImageIcon imgDado;
	int numGenerado;
	defTablero T[];
	int ubicacionS;
	int ubicacionP;

	boolean OdioLasBanderas;

	public SerpEscaleras() {
		OdioLasBanderas = true;
		V = new JFrame("Serpientes y escaleras versi�n El Rey Le�n");
		V.setSize(900, 700);
		V.setLocationRelativeTo(this);
		setSize(900, 700);
		setLayout(new GridLayout(5, 6));
		construirTablero();
		ubicacionP = 1;
		ubicacionS = 1;
		vEti = new vector_Etiqueta[5][6];
		for (int r = 0; r < vEti.length; r++)
			for (int c = 0; c < vEti[0].length; c++) {
				vEti[r][c] = new vector_Etiqueta();
				add(vEti[r][c].PanelInterno);
			}

		posfr = 4;
		posfc = 0;

		URL ruta = getClass().getResource("../Recursos/pumba5.gif");
		figura = new ImageIcon(ruta);
		vEti[posfr][posfc].SetImagePumba();
		vEti[posfr][posfc].SetImageSimba();

		ruta = getClass().getResource("../Recursos/fondo.png");
		imgTablero = new ImageIcon(ruta).getImage();
		V.add(this, BorderLayout.CENTER);
		panelDado = new JPanel();
		ruta = getClass().getResource("../Recursos/dadochido.gif");
		imgDado = new ImageIcon(ruta);
		bDado = new JButton(imgDado);
		bDado.setOpaque(false);
		bDado.setContentAreaFilled(false);
		bDado.setBorderPainted(false);
		panelDado.add(bDado);
		V.add(panelDado, BorderLayout.WEST);
		// evento del boton
		bDado.addActionListener(this);

		V.setVisible(true);
		V.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void construirTablero() {
		T = new defTablero[31];
		// r1
		T[1] = new defTablero(1, 4, 0, 0);// p r c avance
		T[2] = new defTablero(2, 4, 1, 0);
		T[3] = new defTablero(3, 4, 2, 0);// sube a la 18
		T[4] = new defTablero(4, 4, 3, 0);
		T[5] = new defTablero(5, 4, 4, 0);
		T[6] = new defTablero(6, 4, 5, 0);
		// r2
		T[7] = new defTablero(7, 3, 5, 0);
		T[8] = new defTablero(8, 3, 4, 16);
		T[9] = new defTablero(9, 3, 3, 0);
		T[10] = new defTablero(10, 3, 2, 0);
		T[11] = new defTablero(11, 3, 1, 0);
		T[12] = new defTablero(12, 3, 0, 0);
		// r3
		T[13] = new defTablero(13, 2, 0, 0);
		T[14] = new defTablero(14, 2, 1, 0);
		T[15] = new defTablero(15, 2, 2, 0);
		T[16] = new defTablero(16, 2, 3, 0);
		T[17] = new defTablero(17, 2, 4, 0);
		T[18] = new defTablero(18, 2, 5, 0);
		// r4
		T[19] = new defTablero(19, 1, 5, 0);
		T[20] = new defTablero(20, 1, 4, 0);
		T[21] = new defTablero(21, 1, 3, 0);
		T[22] = new defTablero(22, 1, 2, 29);
		T[23] = new defTablero(23, 1, 1, 0);// PIERDE TURNO, CHECAR
		T[24] = new defTablero(24, 1, 0, 0);
		// r5
		T[25] = new defTablero(25, 0, 0, 6);
		T[26] = new defTablero(26, 0, 1, 0);
		T[27] = new defTablero(27, 0, 2, 0);
		T[28] = new defTablero(28, 0, 3, 9);
		T[29] = new defTablero(29, 0, 4, 0);
		T[30] = new defTablero(30, 0, 5, 0);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(imgTablero, 0, 0, getWidth(), getHeight(), this);
	}

	public static void main(String[] args) {
		new SerpEscaleras();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Random R = new Random();
		numGenerado = 1 + R.nextInt(6);
		// System.out.println(numGenerado);

		URL ruta = getClass().getResource("../Recursos/dado" + numGenerado + ".png");
		bDado.setIcon(new ImageIcon(ruta));

		// personalizar el mensaje que debe aparecer, habilitar y deshabilitar segun sea
		// el caso, debe aparecer el icono del personaje que avance

		// posfr = T[ubicacion].getRenglon();
		// posfc = T[ubicacion].getColumna();

		if (OdioLasBanderas) {
			System.out.println("entra simba");

			ruta = getClass().getResource("../Recursos/prueba2.gif");
			JOptionPane.showMessageDialog(null, "Mengano AVANZA " + numGenerado + " posiciones", "",
					JOptionPane.INFORMATION_MESSAGE, new ImageIcon(ruta));
			ruta = getClass().getResource("../Recursos/dadochido.gif");
			bDado.setIcon(new ImageIcon(ruta));

			int ubicacion_vieja = ubicacionS;

			ubicacionS += numGenerado;
			vEti[posfr][posfc].etiqueta.setIcon(null);
			int restar = 0;

			if (ubicacionS > 30) {
				restar = ubicacionS - 30;
				ubicacionS = 30;
			}

			int avan = T[ubicacionS].getAvance();
			if (avan != 0) {
				if (avan < ubicacionS)
					JOptionPane.showMessageDialog(null, "Regresa a la posici�n " + avan);
				else
					JOptionPane.showMessageDialog(null, "Sube a la posici�n " + avan);
				// ubicacionS = avan;
			} else {
				if (ubicacionS == 30) {

					avan = 30 - restar;
				}
			}

			if (restar == 0) {
				Thread descanso = new Thread(
						new ThreadDemo(ubicacionS, ubicacion_vieja, figura, vEti, T, bDado, 1, avan, 0));

				descanso.start();
				if (avan != 0)
					ubicacionS = avan;
			} else {
				Thread descanso = new Thread(new ThreadDemo(ubicacionS, ubicacion_vieja, figura, vEti, T, bDado, 1,
						avan, T[ubicacionS - restar].getAvance()));
				if (avan == 0) {
				}
				// ubicacionS = avan;
				else {
					avan = T[ubicacionS - restar].getAvance();
					ubicacionS = avan;
				}
				descanso.start();
			}

			if (avan != 0)
				ubicacionS = avan;
			// if (ubicacionS == 30) {
			// // ubicacionS = T[avan].getAvance();
			// System.out.println("Entro alla");

			// }

			OdioLasBanderas = false;

		} else {
			System.out.println("entra pumba");
			ruta = getClass().getResource("../Recursos/pumba5.gif");
			JOptionPane.showMessageDialog(null, "FULANO AVANZA " + numGenerado + " posiciones", "",
					JOptionPane.INFORMATION_MESSAGE, new ImageIcon(ruta));
			ruta = getClass().getResource("../Recursos/dadochido.gif");

			bDado.setIcon(new ImageIcon(ruta));

			int ubicacion_vieja = ubicacionP;

			ubicacionP += numGenerado;
			vEti[posfr][posfc].etiqueta.setIcon(null);

			int restar = 0;
			if (ubicacionP > 30) {
				restar = ubicacionP - 30;
				ubicacionP = 30;
			}
			int avan = T[ubicacionP].getAvance();
			if (avan != 0) {
				if (avan < ubicacionP)
					JOptionPane.showMessageDialog(null, "Regresa a la posici�n " + avan);
				else
					JOptionPane.showMessageDialog(null, "Sube a la posici�n " + avan);
				// ubicacionP = avan;
			} else {
				if (ubicacionP == 30) {
					// ubicacionP = 30;
					avan = 30 - restar;
				}
			}

			if (restar == 0) {
				Thread descanso = new Thread(
						new ThreadDemo(ubicacionP, ubicacion_vieja, figura, vEti, T, bDado, 2, avan, 0));

				descanso.start();
				if (avan != 0)
					ubicacionP = avan;
			} else {
				Thread descanso = new Thread(new ThreadDemo(ubicacionP, ubicacion_vieja, figura, vEti, T, bDado, 2,
						avan, T[ubicacionP - restar].getAvance()));
				descanso.start();
				if (avan == 0) {
				}
				// ubicacionP = avan;
				else {
					avan = T[ubicacionP - restar].getAvance();
					ubicacionP = avan;
				}
				// ubicacionP = T[ubicacionP - restar].getAvance();
			}

			if (avan != 0)
				ubicacionP = avan;
			// if (ubicacionP == 30) {

			// System.out.println("Entro aqui");
			// }

			OdioLasBanderas = true;

		}
		// vEti[posfr][posfc].setIcon(figura);

		// if (ubicacionS == 30) {
		// JOptionPane.showMessageDialog(null, "���Has ganado la partida!!!");
		// bDado.setEnabled(false);
		// ruta = getClass().getResource("../Recursos/fondometa.png");
		// imgTablero = new ImageIcon(ruta).getImage();
		// bDado.setEnabled(false);
		// } else if (ubicacionP == 30) {
		// JOptionPane.showMessageDialog(null, "���Has ganado la partida!!!");
		// bDado.setEnabled(false);
		// ruta = getClass().getResource("../Recursos/fondometa.png");
		// imgTablero = new ImageIcon(ruta).getImage();
		// bDado.setEnabled(false);
		// }
	}
}

class ThreadDemo implements Runnable {

	int nueva;
	int vieja;
	ImageIcon figura;
	vector_Etiqueta[][] vEti;
	defTablero[] T;
	JButton bDado;
	int turno;
	int avan;
	int avan_dos;

	public ThreadDemo(int nueva, int vieja, ImageIcon figura, vector_Etiqueta[][] vEti, defTablero[] T, JButton bDado,
			int turno, int avan, int avance_dos) {

		this.nueva = nueva;
		this.vieja = vieja;
		this.figura = figura;
		this.vEti = vEti;
		this.T = T;
		this.bDado = bDado;
		this.turno = turno;
		this.avan = avan;
		this.avan_dos = avance_dos;
	}

	public void run() {
		try {
			bDado.setEnabled(false);
			// System.out.println("Hola mundo");
			// if (vieja < nueva || nueva < avan) {
			System.out.println("vieja < nueva");
			for (int i = vieja; i <= nueva; i++) {
				int posfr, posfc;
				if (i > 1) {
					posfr = T[i - 1].getRenglon();
					posfc = T[i - 1].getColumna();
					if (turno == 1)
						vEti[posfr][posfc].EtiquetasInternas[0].setIcon(null);
					else
						vEti[posfr][posfc].EtiquetasInternas[2].setIcon(null);
				}

				posfr = T[i].getRenglon();
				posfc = T[i].getColumna();

				if (posfr % 2 == 0) {
					if (turno == 1)
						vEti[posfr][posfc].SetImageSimba();
					else
						vEti[posfr][posfc].SetImagePumba();
				} else {
					if (turno == 1)
						vEti[posfr][posfc].SetImageSimbaV();
					else
						vEti[posfr][posfc].SetImagePumbaV();
				}
				vieja = i;

				Thread.sleep(100);
			}
			nueva = avan;
			if (avan != 0)
				if (vieja < nueva) {
					for (int i = vieja; i <= nueva; i++) {

						int posfr, posfc;
						if (i > 1) {
							posfr = T[i - 1].getRenglon();
							posfc = T[i - 1].getColumna();
							if (turno == 1)
								vEti[posfr][posfc].EtiquetasInternas[0].setIcon(null);
							else
								vEti[posfr][posfc].EtiquetasInternas[2].setIcon(null);
						}

						posfr = T[i].getRenglon();
						posfc = T[i].getColumna();

						if (posfr % 2 == 0) {
							if (turno == 1)
								vEti[posfr][posfc].SetImageSimba();
							else
								vEti[posfr][posfc].SetImagePumba();
						} else {
							if (turno == 1)
								vEti[posfr][posfc].SetImageSimbaV();
							else
								vEti[posfr][posfc].SetImagePumbaV();
						}
						Thread.sleep(100);
					}
				} else {
					System.out.println("vieja > nueva");

					for (int i = vieja; i >= nueva; i--) {

						int posfr, posfc;
						if (i < 30) {
							posfr = T[i + 1].getRenglon();
							posfc = T[i + 1].getColumna();
							if (turno == 1)
								vEti[posfr][posfc].EtiquetasInternas[0].setIcon(null);
							else
								vEti[posfr][posfc].EtiquetasInternas[2].setIcon(null);
						}

						posfr = T[i].getRenglon();
						posfc = T[i].getColumna();

						if (posfr % 2 == 0) {
							if (turno == 1)
								vEti[posfr][posfc].SetImageSimba();
							else
								vEti[posfr][posfc].SetImagePumba();
						} else {
							if (turno == 1)
								vEti[posfr][posfc].SetImageSimbaV();
							else
								vEti[posfr][posfc].SetImagePumbaV();
						}
						vieja = i;
						Thread.sleep(100);
					}

					if (avan_dos != 0) {
						nueva = avan_dos;
						for (int i = vieja; i >= nueva; i--) {
							int posfr, posfc;
							if (i < 30) {
								posfr = T[i + 1].getRenglon();
								posfc = T[i + 1].getColumna();
								if (turno == 1)
									vEti[posfr][posfc].EtiquetasInternas[0].setIcon(null);
								else
									vEti[posfr][posfc].EtiquetasInternas[2].setIcon(null);
							}

							posfr = T[i].getRenglon();
							posfc = T[i].getColumna();

							if (posfr % 2 == 0) {
								if (turno == 1)
									vEti[posfr][posfc].SetImageSimba();
								else
									vEti[posfr][posfc].SetImagePumba();
							} else {
								if (turno == 1)
									vEti[posfr][posfc].SetImageSimbaV();
								else
									vEti[posfr][posfc].SetImagePumbaV();
							}
							vieja = i;
							Thread.sleep(100);
						}
					}

				}

			// }else {
			// System.out.println("Aqui algo salio mal");
			// }
			bDado.setEnabled(true);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getStackTrace()[0].getLineNumber());
		}
	}
}

// package Serpientes_escaleras;

// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// import javax.swing.*;
// import java.net.*;
// //import java.util.Iterator;
// import java.util.Random;

// class defTablero {
// int posicion;
// int r, c;
// int avance;

// public defTablero(int p, int r, int c, int avance) {
// posicion = p;
// this.r = r;
// this.c = c;
// this.avance = avance;
// }

// public int getRenglon() {

// return r;
// }

// public int getColumna() {

// return c;
// }

// public int getAvance() {

// return avance;
// }
// }

// public class SerpEscaleras extends JPanel implements ActionListener {
// JFrame V;
// Image imgTablero;
// JPanel vEti[][];
// JLabel vEtiInterno[];
// int posfr, posfc;
// ImageIcon figura;
// JPanel panelDado;
// JButton bDado;
// ImageIcon imgDado;
// int numGenerado;
// defTablero T[];
// int ubicacion;
// JPanel panelInterno[];

// public SerpEscaleras() {
// V = new JFrame("Serpientes y escaleras versi�n El Rey Le�n");
// V.setSize(900, 700);
// V.setLocationRelativeTo(this);
// setSize(900, 700);
// setLayout(new GridLayout(5, 6));
// construirTablero();
// ubicacion = 1;
// vEti = new JPanel[5][6];
// panelInterno = new JPanel[31];
// vEtiInterno = new JLabel[121];
// int a = 0;
// int ce = 0;
// for (int r = 0; r < vEti.length; r++)
// for (int c = 0; c < vEti[0].length; c++) {
// vEti[r][c] = new JPanel();
// vEti[r][c].setLayout(new GridLayout(2, 2));
// vEti[r][c].setOpaque(false);

// // panelInterno[ce] = new JPanel();
// // panelInterno[ce].setLayout(new GridLayout(2, 2));
// // panelInterno[ce].setOpaque(false);

// for (int b = 0; b < 4; b++, a++) {

// vEtiInterno[a] = new JLabel();
// vEtiInterno[a].setOpaque(false);
// vEti[r][c].add(vEtiInterno[a]);

// }

// // vEti[r][c].add(panelInterno[ce]);
// add(panelInterno[ce]);
// ce++;
// }

// posfr = 4;
// posfc = 0;
// URL ruta = getClass().getResource("../Recursos/pumba5.gif");
// figura = new ImageIcon(ruta);
// vEti[posfr][posfc].setIcon(figura);

// ruta = getClass().getResource("../Recursos/fondo.png");
// imgTablero = new ImageIcon(ruta).getImage();
// V.add(this, BorderLayout.CENTER);
// panelDado = new JPanel();
// ruta = getClass().getResource("../Recursos/dadochido.gif");
// imgDado = new ImageIcon(ruta);
// bDado = new JButton(imgDado);
// bDado.setOpaque(false);
// bDado.setContentAreaFilled(false);
// bDado.setBorderPainted(false);
// panelDado.add(bDado);
// V.add(panelDado, BorderLayout.WEST);
// // evento del boton
// bDado.addActionListener(this);
// ruta = getClass().getResource("../Recursos/pumba6.gif");
// ImageIcon asdasf = new ImageIcon(ruta);
// vEtiInterno[0].setIcon(asdasf);
// V.setVisible(true);
// V.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// }

// public void construirTablero() {
// T = new defTablero[31];
// // r1
// T[1] = new defTablero(1, 4, 0, 0);// p r c avance
// T[2] = new defTablero(2, 4, 1, 0);
// T[3] = new defTablero(3, 4, 2, 18);// sube a la 18
// T[4] = new defTablero(4, 4, 3, 0);
// T[5] = new defTablero(5, 4, 4, 0);
// T[6] = new defTablero(6, 4, 5, 0);
// // r2
// T[7] = new defTablero(7, 3, 5, 0);
// T[8] = new defTablero(8, 3, 4, 16);
// T[9] = new defTablero(9, 3, 3, 0);
// T[10] = new defTablero(10, 3, 2, 0);
// T[11] = new defTablero(11, 3, 1, 1);
// T[12] = new defTablero(12, 3, 0, 0);
// // r3
// T[13] = new defTablero(13, 2, 0, 24);
// T[14] = new defTablero(14, 2, 1, 0);
// T[15] = new defTablero(15, 2, 2, 4);
// T[16] = new defTablero(16, 2, 3, 0);
// T[17] = new defTablero(17, 2, 4, 0);
// T[18] = new defTablero(18, 2, 5, 0);
// // r4
// T[19] = new defTablero(19, 1, 5, 7);
// T[20] = new defTablero(20, 1, 4, 0);
// T[21] = new defTablero(21, 1, 3, 0);
// T[22] = new defTablero(22, 1, 2, 29);
// T[23] = new defTablero(23, 1, 1, 23);// PIERDE TURNO, CHECAR
// T[24] = new defTablero(24, 1, 0, 0);
// // r5
// T[25] = new defTablero(25, 0, 0, 6);
// T[26] = new defTablero(26, 0, 1, 0);
// T[27] = new defTablero(27, 0, 2, 0);
// T[28] = new defTablero(28, 0, 3, 9);
// T[29] = new defTablero(29, 0, 4, 0);
// T[30] = new defTablero(30, 0, 5, 0);
// }

// protected void paintComponent(Graphics g) {
// super.paintComponent(g);
// g.drawImage(imgTablero, 0, 0, getWidth(), getHeight(), this);
// }

// public static void main(String[] args) {
// new SerpEscaleras();
// }

// @Override
// public void actionPerformed(ActionEvent arg0) {
// Random R = new Random();
// numGenerado = 1 + R.nextInt(6);
// // System.out.println(numGenerado);

// URL ruta = getClass().getResource("../Recursos/dado" + numGenerado + ".png");
// bDado.setIcon(new ImageIcon(ruta));

// // personalizar el mensaje que debe aparecer, habilitar y deshabilitar segun
// sea
// // el caso, debe aparecer el icono del personaje que avance

// JOptionPane.showMessageDialog(null, "FULANO AVANZA " + numGenerado + "
// posiciones");
// ruta = getClass().getResource("../Recursos/dadochido.gif");
// bDado.setIcon(new ImageIcon(ruta));
// int ubicacion_vieja = ubicacion;
// ubicacion += numGenerado;
// vEti[posfr][posfc].setIcon(null);

// if (ubicacion > 30) {
// int restar = ubicacion - 30;
// ubicacion = 30 - restar;
// }

// int avan = T[ubicacion].getAvance();
// if (avan != 0) {
// if (avan < ubicacion)
// JOptionPane.showMessageDialog(null, "Regresa a la posici�n " + avan);
// else
// JOptionPane.showMessageDialog(null, "Sube a la posici�n " + avan);
// ubicacion = avan;
// }

// // posfr = T[ubicacion].getRenglon();
// // posfc = T[ubicacion].getColumna();

// Thread descanso = new Thread(new ThreadDemo(ubicacion, ubicacion_vieja,
// figura, vEti, T, bDado));

// descanso.start();

// // vEti[posfr][posfc].setIcon(figura);

// if (ubicacion == 30) {
// JOptionPane.showMessageDialog(null, "���Has ganado la partida!!!");
// bDado.setEnabled(false);
// ruta = getClass().getResource("../Recursos/fondometa.png");
// imgTablero = new ImageIcon(ruta).getImage();
// }
// }
// }

// class ThreadDemo implements Runnable {

// int nueva;
// int vieja;
// ImageIcon figura;
// JLabel[][] vEti;
// defTablero[] T;
// JButton bDado;

// public ThreadDemo(int nueva, int vieja, ImageIcon figura, JLabel[][] vEti,
// defTablero[] T, JButton bDado) {
// this.nueva = nueva;
// this.vieja = vieja;
// this.figura = figura;
// this.vEti = vEti;
// this.T = T;
// this.bDado = bDado;
// }

// public void run() {
// try {
// bDado.setEnabled(false);
// System.out.println("Hola mundo");
// for (int i = vieja; i <= nueva; i++) {
// int posfr, posfc;
// if (i > 1) {
// posfr = T[i - 1].getRenglon();
// posfc = T[i - 1].getColumna();
// vEti[posfr][posfc].setIcon(null);
// }

// posfr = T[i].getRenglon();
// posfc = T[i].getColumna();

// if (posfr % 2 == 0) {
// vEti[posfr][posfc].setIcon(figura);
// } else {
// URL ruta = getClass().getResource("../Recursos/pumba6.gif");
// ImageIcon figuravolteada = new ImageIcon(ruta);
// vEti[posfr][posfc].setIcon(figuravolteada);
// }

// Thread.sleep(1000);
// }
// bDado.setEnabled(true);
// } catch (Exception e) {
// System.out.println(e);
// }
// }
// }