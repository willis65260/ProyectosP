package ElReyLeon;

import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class Instrucciones implements ActionListener {

	JFrame frame;
	JFrame ventana_anterior;
	JButton btnRegresar;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public Instrucciones(JFrame ventana_anterior) {
		this.ventana_anterior = ventana_anterior;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 516, 341);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		btnRegresar = new JButton("REGRESAR");
		btnRegresar.setForeground(Color.WHITE);
		btnRegresar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRegresar.setBackground(new Color(204, 51, 51));
		btnRegresar.setBounds(358, 147, 105, 23);
		btnRegresar.addActionListener(this);

		frame.getContentPane().add(btnRegresar);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Instrucciones.class.getResource("../Recursos/inst.png")));
		lblNewLabel.setBounds(0, 0, 500, 302);
		frame.getContentPane().add(lblNewLabel);

		frame.addWindowFocusListener(new WindowFocusListener() {
			@Override
			public void windowLostFocus(WindowEvent e) {
				frame.dispose();
				ventana_anterior.setVisible(true);
			}

			@Override
			public void windowGainedFocus(WindowEvent e) {

			}
		});
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnRegresar) {
			frame.dispose();
			ventana_anterior.setVisible(true);

		}
	}
}
