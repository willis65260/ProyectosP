package ElReyLeon;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Prueba implements ActionListener {
	JButton btnNewButton, btnJugadores, btnSalir, btnAyuda, btnInstrucciones;

	private JFrame frame;

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnNewButton) {// 1 Jugador
			new ElReyLeon(1,frame);
		} else if (e.getSource() == btnJugadores) {// 2 Jugadores
			new ElReyLeon(2,frame);
		} else if (e.getSource() == btnSalir) {
			System.exit(0);
		} else if (e.getSource() == btnAyuda) {
			new Ayuda(frame);
		} else if (e.getSource() == btnInstrucciones) {
			new Instrucciones(frame);
		}else{
			System.out.println("Algo salio mal we");
		}
		frame.setVisible(false);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba window = new Prueba();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Prueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 509, 329);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		btnNewButton = new JButton("1 JUGADOR");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(102, 102, 204));
		btnNewButton.setBounds(60, 145, 126, 23);
		btnNewButton.addActionListener(this);
		frame.getContentPane().add(btnNewButton);

		btnJugadores = new JButton("2 JUGADORES");
		btnJugadores.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnJugadores.setForeground(new Color(255, 255, 255));
		btnJugadores.setBackground(new Color(51, 153, 102));
		btnJugadores.setBounds(60, 179, 126, 23);
		btnJugadores.addActionListener(this);
		frame.getContentPane().add(btnJugadores);

		btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSalir.setForeground(Color.WHITE);
		btnSalir.setBackground(new Color(204, 51, 51));
		btnSalir.setBounds(386, 237, 83, 23);
		btnSalir.addActionListener(this);
		frame.getContentPane().add(btnSalir);

		btnAyuda = new JButton("AYUDA");
		btnAyuda.setForeground(new Color(0, 0, 0));
		btnAyuda.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAyuda.setBackground(new Color(255, 255, 153));
		btnAyuda.setBounds(370, 27, 92, 23);
		btnAyuda.addActionListener(this);
		frame.getContentPane().add(btnAyuda);

		btnInstrucciones = new JButton("INSTRUCCIONES");
		btnInstrucciones.setForeground(new Color(0, 0, 0));
		btnInstrucciones.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnInstrucciones.setBackground(new Color(255, 204, 153));
		btnInstrucciones.setBounds(343, 54, 140, 23);
		btnInstrucciones.addActionListener(this);
		frame.getContentPane().add(btnInstrucciones);

		JLabel lblNewLabel = new JLabel("\u00BFDESEA JUGAR?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(47, 120, 157, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Prueba.class.getResource("../Recursos/menu.png")));
		lblNewLabel_1.setBounds(0, 0, 493, 290);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
