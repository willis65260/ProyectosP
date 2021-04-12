package ElReyLeon;

import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Color;

public class Ayuda implements ActionListener {

	JFrame frame;
	JButton btnRegresar;
	JFrame ventana_anterior;


	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	
	public Ayuda(JFrame ventana_anterior) {
		this.ventana_anterior = ventana_anterior;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 509, 334);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);// cambiar par que no se salga del rpograma
		frame.getContentPane().setLayout(null);
frame.setLocationRelativeTo(null);
		JLabel lblAyuda = new JLabel("AYUDA");
		lblAyuda.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAyuda.setBounds(107, 11, 71, 29);
		frame.getContentPane().add(lblAyuda);

		JTextArea txtrAyudaASimba = new JTextArea();
		txtrAyudaASimba.setBackground(SystemColor.menu);
		txtrAyudaASimba.setText("Ayuda  a  Simba, a  Pumba o a ambos\n" + "a poder  enfrentar a  Scar  para  poder\n"
				+ "liberar el reino, pero ten cuidado con\n" + "encontrarte con las hienas, puede que\n"
				+ "te ahuyenten y te hagan regresar, por\n" + "otro lado, procura los bichos viscosos \n"
				+ "y  sabrosos,  te  daran  energia  para\n" + "avanzar mas. Tambien ten cuidado con\n"
				+ "Cazzu, te dara un regaño y asi perderas\n" + "un turno.");
		txtrAyudaASimba.setBounds(33, 51, 224, 161);
		frame.getContentPane().add(txtrAyudaASimba);

		btnRegresar = new JButton("REGRESAR");
		btnRegresar.setForeground(Color.WHITE);
		btnRegresar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRegresar.setBackground(new Color(204, 51, 51));
		btnRegresar.setBounds(341, 250, 112, 23);
		btnRegresar.addActionListener(this);
		frame.getContentPane().add(btnRegresar);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Ayuda.class.getResource("../Recursos/ayuda.png")));
		lblNewLabel.setBounds(0, 0, 493, 295);
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
