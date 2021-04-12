package Marcos;

import java.net.URL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuInicio extends JPanel {
	JFrame V;
	Image fondo;
	public int banjugadores;
	
	public MenuInicio() { 
		V=new JFrame("Serpientes y Escaleras");
		V.setSize(400,300);
		V.setLocationRelativeTo(this);
		setSize(400,300);
		URL ruta=getClass().getResource("rec/Madera.jpg");
		fondo=new ImageIcon(ruta).getImage();
		V.getContentPane().add(this);
		setLayout(null);
	
	ruta=getClass().getResource("rec/Play3.png");
	ImageIcon play=new ImageIcon(ruta);
	
		
		JButton btn1 = new JButton();
		
		btn1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn1.setBounds(153, 116, 89, 23);
		btn1.setIcon(play);
		btn1.setOpaque(false);
		btn1.setContentAreaFilled(false);
		btn1.setBorderPainted(false);
		btn1.setSize(80, 80);
		add(btn1);
		
		ruta=getClass().getResource("rec/ayuda.png");
		ImageIcon ayuda=new ImageIcon(ruta);
		JButton btn2 = new JButton();
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Bienvenido al juego de Serpientes y Escaleras\r\n" + 
						"como jugar:\r\n" + 
						"1.- Elige el numero de jugadores 1 o 2\r\n" + 
						"2.- Una vez elegido dale en play\r\n" + 
						"3.- Dentro del juego daras click en el dado para avanzar\r\n" + 
						"4.- Si caes en una escalera subes de posicion\r\n" + 
						"5.- Si caes en una serpiente bajas de posicion\r\n" + 
						"A DIVERTIRSE!!!", "AYUDA",1,ayuda);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn2.setBounds(10, 211, 89, 23);
		btn2.setIcon(ayuda);
		btn2.setOpaque(false);
		btn2.setContentAreaFilled(false);
		btn2.setBorderPainted(false);
		btn2.setSize(50, 50);
		add(btn2);
		
		JRadioButton rb1 = new JRadioButton("1 Jugador");
		rb1.setForeground(UIManager.getColor("ToggleButton.highlight"));
		rb1.setFont(new Font("Arial", Font.BOLD, 14));
		rb1.setSelected(false);
		rb1.setBounds(126, 59, 109, 23);
		rb1.setContentAreaFilled(false);
		
		
		JRadioButton rb2 = new JRadioButton("2 Jugadores");
		rb2.setForeground(UIManager.getColor("ToggleButton.highlight"));
		rb2.setFont(new Font("Arial", Font.BOLD, 14));
		rb2.setSelected(true);
		rb2.setBounds(126, 86, 125, 23);
		rb2.setContentAreaFilled(false);
		rb2.setOpaque(false);
		rb2.setBorderPainted(false);
		
		ButtonGroup bg= new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		add(rb1);
		add(rb2);
		
		JLabel lblNewLabel = new JLabel("Serpientes y Escaleras");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(56, 21, 277, 31);
		add(lblNewLabel);
		
		JLabel label_serpi = new JLabel("");
		label_serpi.setIcon(new ImageIcon(MenuInicio.class.getResource("rec/serpiente.png")));
		label_serpi.setBounds(10, 59, 80, 123);
		add(label_serpi);
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				V.dispose();
			}
		});
		button.setIcon(new ImageIcon(MenuInicio.class.getResource("rec/exit.png")));
		button.setOpaque(false);
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBounds(324, 211, 50, 50);
		add(button);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(MenuInicio.class.getResource("rec/Escalera.png")));
		label.setBounds(283, 59, 80, 123);
		add(label);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				V.dispose();
				if(rb1.isSelected()) {
					banjugadores=1;

				}
				else if(rb2.isSelected()) {
					banjugadores=2;
				}
			
				//System.out.println(banjugadores);
				new SyE(banjugadores);
			}
		});
		
		
		V.setVisible(true);
		V.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(fondo, 0, 0, getWidth(),getHeight(),this);
		
	}
	public static void main(String[] args) {
		new MenuInicio();
	}
}
