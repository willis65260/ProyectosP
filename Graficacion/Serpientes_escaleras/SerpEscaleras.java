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

public class SerpEscaleras extends JPanel implements ActionListener {
	JFrame V;
	Image imgTablero;
	JLabel vEti[][];
	int posfr, posfc;
	ImageIcon figura;
	JPanel panelDado;
	JButton bDado;
	ImageIcon imgDado;
	int numGenerado;
	defTablero T[];
	int ubicacion;

	public SerpEscaleras() {
		V = new JFrame("Serpientes y escaleras versi�n El Rey Le�n");
		V.setSize(900, 700);
		V.setLocationRelativeTo(this);
		setSize(900, 700);
		setLayout(new GridLayout(5, 6));
		construirTablero();
		ubicacion = 1;
		vEti = new JLabel[5][6];
		for (int r = 0; r < vEti.length; r++)
			for (int c = 0; c < vEti[0].length; c++) {
				vEti[r][c] = new JLabel();
				add(vEti[r][c]);
			}

		posfr = 4;
		posfc = 0;
		URL ruta = getClass().getResource("../Recursos/pumba5.gif");
		figura = new ImageIcon(ruta);
		vEti[posfr][posfc].setIcon(figura);

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
		T[3] = new defTablero(3, 4, 2, 18);// sube a la 18
		T[4] = new defTablero(4, 4, 3, 0);
		T[5] = new defTablero(5, 4, 4, 0);
		T[6] = new defTablero(6, 4, 5, 0);
		// r2
		T[7] = new defTablero(7, 3, 5, 0);
		T[8] = new defTablero(8, 3, 4, 16);
		T[9] = new defTablero(9, 3, 3, 0);
		T[10] = new defTablero(10, 3, 2, 0);
		T[11] = new defTablero(11, 3, 1, 1);
		T[12] = new defTablero(12, 3, 0, 0);
		// r3
		T[13] = new defTablero(13, 2, 0, 24);
		T[14] = new defTablero(14, 2, 1, 0);
		T[15] = new defTablero(15, 2, 2, 4);
		T[16] = new defTablero(16, 2, 3, 0);
		T[17] = new defTablero(17, 2, 4, 0);
		T[18] = new defTablero(18, 2, 5, 0);
		// r4
		T[19] = new defTablero(19, 1, 5, 7);
		T[20] = new defTablero(20, 1, 4, 0);
		T[21] = new defTablero(21, 1, 3, 0);
		T[22] = new defTablero(22, 1, 2, 29);
		T[23] = new defTablero(23, 1, 1, 23);// PIERDE TURNO, CHECAR
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

		JOptionPane.showMessageDialog(null, "FULANO AVANZA " + numGenerado + " posiciones");
		ruta = getClass().getResource("../Recursos/dadochido.gif");
		bDado.setIcon(new ImageIcon(ruta));
		int ubicacion_vieja = ubicacion;
		ubicacion += numGenerado;
		vEti[posfr][posfc].setIcon(null);

		if (ubicacion > 30) {
			int restar = ubicacion - 30;
			ubicacion = 30 - restar;
		}

		int avan = T[ubicacion].getAvance();
		if (avan != 0) {
			if (avan < ubicacion)
				JOptionPane.showMessageDialog(null, "Regresa a la posici�n " + avan);
			else
				JOptionPane.showMessageDialog(null, "Sube a la posici�n " + avan);
			ubicacion = avan;
		}

		// posfr = T[ubicacion].getRenglon();
		// posfc = T[ubicacion].getColumna();
		
		Thread descanso = new Thread(new ThreadDemo(ubicacion, ubicacion_vieja, figura, vEti, T,bDado));
		
		descanso.start();

		// vEti[posfr][posfc].setIcon(figura);

		if (ubicacion == 30) {
			JOptionPane.showMessageDialog(null, "���Has ganado la partida!!!");
			bDado.setEnabled(false);
			ruta = getClass().getResource("../Recursos/fondometa.png");
			imgTablero = new ImageIcon(ruta).getImage();
		}
	}
}

class ThreadDemo implements Runnable {

	int nueva;
	int vieja;
	ImageIcon figura;
	JLabel[][] vEti;
	defTablero[] T;
	JButton bDado;
	public ThreadDemo(int nueva, int vieja, ImageIcon figura, JLabel[][] vEti, defTablero[] T,JButton bDado) {
		this.nueva = nueva;
		this.vieja = vieja;
		this.figura = figura;
		this.vEti = vEti;
		this.T = T;
		this.bDado=bDado;
	}

	public void run() {
		try {
			bDado.setEnabled(false);
			System.out.println("Hola mundo");
			for (int i = vieja; i <= nueva; i++) {
				int posfr, posfc;
				if (i > 1) {
					posfr = T[i - 1].getRenglon();
					posfc = T[i - 1].getColumna();
					vEti[posfr][posfc].setIcon(null);
				}
				posfr = T[i].getRenglon();
				posfc = T[i].getColumna();
				if (posfr % 2 == 0) {
					vEti[posfr][posfc].setIcon(figura);
				}else{
					URL ruta = getClass().getResource("../Recursos/pumba6.gif");
					ImageIcon figuravolteada = new ImageIcon(ruta);
					vEti[posfr][posfc].setIcon(figuravolteada);
				}
				Thread.sleep(1000);
			}
			bDado.setEnabled(true);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}