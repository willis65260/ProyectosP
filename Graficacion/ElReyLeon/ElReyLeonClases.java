package ElReyLeon;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.Position;

import java.net.*;
import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.Iterator;
import java.util.Random;

public class ElReyLeonClases {

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
		URL ruta = getClass().getResource("../Recursos/PumbaD.gif");
		// figura = new ImageIcon(ruta);
		EtiquetasInternas[2]
				.setIcon(new ImageIcon(new ImageIcon(ruta).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT)));
	}

	public void SetImageSimba() {
		URL ruta = getClass().getResource("../Recursos/SimbaD.gif");
		// figura = new ImageIcon(ruta);
		EtiquetasInternas[0]
				.setIcon(new ImageIcon(new ImageIcon(ruta).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT)));
	}

	public void SetImagePumbaV() {
		URL ruta = getClass().getResource("../Recursos/PumbaI.gif");
		// figura = new ImageIcon(ruta);
		EtiquetasInternas[2]
				.setIcon(new ImageIcon(new ImageIcon(ruta).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT)));
	}

	public void SetImageSimbaV() {
		URL ruta = getClass().getResource("../Recursos/SimbaI.gif");
		// figura = new ImageIcon(ruta);
		EtiquetasInternas[0]
				.setIcon(new ImageIcon(new ImageIcon(ruta).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT)));
	}

	public void SetSimbaImageNull() {

	}

	public void SetPumbaImageNull() {

	}

}

class Jugador {

	int posicion;
	boolean cazzu;
	LinkedList<Integer> movimientos;
	URL ruta;
	ImageIcon figura;
	vector_Etiqueta[][] vEti;
	defTablero[] T;
	JButton bDado;
	int pos_interna;
	String nombre;
	JFrame V;
	JFrame ventana_anterior;

	public Jugador(vector_Etiqueta[][] vEti, defTablero[] T, JButton bDado, int pos_interna, String nombre, JFrame V,
			JFrame ventana_anterior) {
		this.vEti = vEti;
		this.T = T;
		this.bDado = bDado;
		this.nombre = nombre;
		this.pos_interna = pos_interna;
		this.V = V;
		this.ventana_anterior = ventana_anterior;
		cazzu = false;
		posicion = 1;
		movimientos = new LinkedList<Integer>();
		ruta = getClass().getResource("../Recursos/" + nombre + "D.gif");
		figura = new ImageIcon(ruta);
		SetImageJugador();
	}

	public void ActualizarFigura(String actualizar) {
		ruta = getClass().getResource("../Recursos/" + nombre + actualizar + ".gif");
		figura = new ImageIcon(ruta);
	}

	public void AgregarMovimiento(int mov) {
		System.out.println("Salio " + mov + " en el dado");

		this.movimientos.add(mov);
		System.out.println("Se agrego " + movimientos + " a la lista de movimientos");

	}

	public void MoverJugador() {
		// llamar a el hilo para mover al jugador por las casillas de la ultima
		// posicionde el array
		// Correccion no sera un array sino una linked list
		// ---posible bug que si se encuentra en la misma posicion que en la
		// del final de array pero no deberia pasar es decir que se deba mover a la
		// posicion 15 y ya se encuentre en la 15
		// $BUG posicion + movimientos.removeFirst() solo funciona si se trata de una
		// $tirada de dado normal pero si es de un avance extra, genera errores
		// $if (T[nueva].getAvance() != 0) {
		// $ jugador.AgregarMovimiento(T[nueva].getAvance());
		// $}
		// *BUG arreglado solamente fue realizar una resta antes de agregar el
		// *movimiento extra
		// *if (T[nueva].getAvance() != 0) {
		// * jugador.AgregarMovimiento(T[nueva].getAvance() - posicion);
		// *}

		Thread HiloMover = new Thread(
				new ThreadDemo(posicion, movimientos, figura, vEti, T, bDado, this, V, ventana_anterior));

		HiloMover.start();
	}

	public void SetImageJugador() {

		// figura = new ImageIcon(ruta);
		// try {
		// System.out.println("Te " + T[posicion].getRenglon());

		// System.out.println("Algo salio mal");
		vEti[T[posicion].getRenglon()][T[posicion].getColumna()].EtiquetasInternas[pos_interna]
				.setIcon(new ImageIcon(figura.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT)));
		// System.out.println("Algo salio mal");

		// } catch (Exception e) {
		// // TODO: handle exception
		// System.out.println("Te " + T[posicion].getRenglon());

		// System.out.println("Algo salio mal");
		// }
	}

	public void SetImageJugadorBeforeNull() {
		vEti[T[posicion - 1].getRenglon()][T[posicion - 1].getColumna()].EtiquetasInternas[pos_interna].setIcon(null);
	}

	public void SetImageJugadorAfterNull() {
		vEti[T[posicion + 1].getRenglon()][T[posicion + 1].getColumna()].EtiquetasInternas[pos_interna].setIcon(null);
	}
}

class ThreadDemo implements Runnable {

	int nueva;
	// int posicion;
	ImageIcon figura;
	vector_Etiqueta[][] vEti;
	defTablero[] T;
	JButton bDado;
	Jugador jugador;
	LinkedList<Integer> movimientos;
	JFrame V;
	JFrame ventana_anterior;

	public ThreadDemo(int posicion, LinkedList<Integer> movimientos, ImageIcon figura, vector_Etiqueta[][] vEti,
			defTablero[] T, JButton bDado, Jugador jugador, JFrame V, JFrame ventana_anterior) {
		// System.out.println("Entro a jugador " + jugador.nombre);
		// $En teoria esto no se necesita
		this.movimientos = movimientos;
		// this.posicion = posicion;
		this.figura = figura;
		this.vEti = vEti;
		this.T = T;
		this.bDado = bDado;
		this.jugador = jugador;
		this.V = V;
		this.ventana_anterior = ventana_anterior;
		try {

		} catch (Exception e) {
			System.out.println(e);
			System.out.println(nueva);
			System.out.println(e);
		}

	}

	public void run() {
		try {
			bDado.setEnabled(false);
			// Verificar si a donde se va a mover el personaje esta detras o delante de mi
			// $ While para sacar todos los elementos del array list de jugador movimientos
			System.out.println(nueva + " " + jugador.posicion);
			// * La nueva posicion se encuentra delante de mi
			// $ posible problema es que llegue con la pila vacia a este punto pero en
			// $ teoria no deberia pasar ya que este metodo siempre se manda llamar despues
			// $ de una tirada de dado
			while (!movimientos.isEmpty()) {
				nueva = jugador.movimientos.removeFirst() + jugador.posicion;

				if (nueva > 30) {
					System.out.println("mas de 30, se agregaron " + ((nueva - 30) * -1) + " a la linked list");
					jugador.AgregarMovimiento((nueva - 30) * -1);
					nueva = 30;
				}

				if (nueva >= jugador.posicion) {// avanzo hacia adelante
					// System.out.println("IF 1:" + jugador.nombre + "Esta en la posicion" + vieja);
					JOptionPane.showMessageDialog(null, jugador.nombre + " avanza a la posicion " + nueva, "",
							JOptionPane.INFORMATION_MESSAGE, new ImageIcon(jugador.ruta));
					// System.out.println(jugador.nombre + " avanza a la posicion " + nueva);

					while (jugador.posicion < nueva) {
						// System.out.println("IF 1: " + jugador.nombre + " Esta en la posicion " +
						// vieja);
						MoverAdelante(jugador.posicion);
						// System.out.println(jugador.nombre + " se encuentra en la posicion " +
						// jugador.posicion);
						jugador.posicion++;
						Thread.sleep(500);
					}
					MoverAdelante(jugador.posicion);
					// System.out.println(jugador.nombre + " se encuentra en la posicion " +
					// jugador.posicion);
				} else if (nueva < jugador.posicion) {
					// System.out.println("IF 1:" + jugador.nombre + "Esta en la posicion" + vieja);
					JOptionPane.showMessageDialog(null, jugador.nombre + " retrocede a la posicion " + nueva, "",
							JOptionPane.INFORMATION_MESSAGE, new ImageIcon(jugador.ruta));

					// * La nueva posicion se encuentra detras de mi
					// ! Por alguna razon esto funciona con valores negativos
					while (jugador.posicion > nueva) {
						MoverAtras(jugador.posicion);
						jugador.posicion--;
						Thread.sleep(500);
					}
					MoverAtras(jugador.posicion);

				} else {
					System.out.println("no esta entrando a los if's");
				}

				if (T[nueva].getAvance() != 0) {
					// $BUG hay que verificaar si se va a avanzar o retroceder antes de agregar el
					// $movimiento
					// *arreglado
					System.out.println("Avance " + T[nueva].getAvance() + " posicion " + jugador.posicion);
					jugador.AgregarMovimiento(T[nueva].getAvance() - jugador.posicion);
					System.out.println("Se avanzaran " + jugador.movimientos.getFirst());
				}
				Thread.sleep(500);
				System.out.println(jugador.movimientos);
				System.out.println(jugador.nombre + " se encuentra en la posicion " + jugador.posicion);
				// $ BUG: el dado puede estar activo por pequeños periodos de tiempo entre los
				// * BUG arreglado ya que el boton se activara una vez se terminen todos los
				// movimientos que hay en el vector movimientos

				// multiples movimientos que pueda tener un jugador

			}
			if (jugador.posicion == 30) {
				bDado.setEnabled(false);
				JOptionPane.showMessageDialog(null, jugador.nombre + " Ha llegado a la posicion " + jugador.posicion
						+ " y ha ganado FELICIDADES!!!");
				ventana_anterior.setVisible(true);
				V.dispose();
				System.out.println("Alguien ya gano, adios");
			}
			if (jugador.posicion == 23) {
				jugador.cazzu = true;
			}

			bDado.setEnabled(true);
			URL dado = getClass().getResource("../Recursos/dadochido.gif");
			bDado.setIcon(new ImageIcon(dado));

		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getStackTrace()[0].getLineNumber());

		}
	}

	public void MoverAdelante(int i) {
		// Limpia la casilla anterior (i-1) si avanza y se encuentra en la posicion
		// numero 1 entonces no necesita limpiar la casilla anterior
		// try {
		if (T[jugador.posicion].r % 2 == 0)
			jugador.ActualizarFigura("D");
		else
			jugador.ActualizarFigura("I");
		if (i > 1) {
			jugador.SetImageJugadorBeforeNull();

		}

		jugador.SetImageJugador();
		// } catch (Exception e) {
		// //TODO: handle exception
		// System.out.println("Algo salio mal");
		// }
	}

	public void MoverAtras(int i) {
		// Limpia la casilla anterior (i+1) si retrocedde y se encuentra en la posicion
		// numero 30 entonces no necesita limpiar la casilla siguiente

		if (T[jugador.posicion].r % 2 == 0)
			jugador.ActualizarFigura("D");
		else
			jugador.ActualizarFigura("I");
		if (i < 30) {
			jugador.SetImageJugadorAfterNull();
		}

		jugador.SetImageJugador();
	}
}
