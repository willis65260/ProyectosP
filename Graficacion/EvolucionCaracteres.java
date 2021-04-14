// package Graficacion;
// import java.awt.*;
// import javax.swing.*;
// @SuppressWarnings("serial")
// public class EvolucionCaracteres extends JPanel{
// //	mapa de caracteres
// 	char letraA[][]= {
// 			{' ',' ','*','*','*','*',' ',' '},
// 			{' ','*','*','*','*','*','*',' '},
// 			{'*','*','*',' ',' ','*','*','*'},
// 			{'*','*','*',' ',' ','*','*','*'},
// 			{'*','*','*',' ',' ','*','*','*'},
// 			{'*','*','*','*','*','*','*','*'},
// 			{'*','*','*','*','*','*','*','*'},
// 			{'*','*','*',' ',' ','*','*','*'},
// 			{'*','*','*',' ',' ','*','*','*'},
// 			{'*','*','*',' ',' ','*','*','*'},
// 			{'*','*','*',' ',' ','*','*','*'}};
	
// //	mapa de pixeles
// 	Color letraAC[][]= {
// 			{Color.BLACK,Color.BLACK,Color.RED,Color.RED,Color.RED,Color.RED,Color.BLACK,Color.BLACK},
// 			{Color.BLACK,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.BLACK},
// 			{Color.RED,Color.RED,Color.RED,Color.BLACK,Color.BLACK,Color.RED,Color.RED,Color.RED},
// 			{Color.RED,Color.RED,Color.RED,Color.BLACK,Color.BLACK,Color.RED,Color.RED,Color.RED},
// 			{Color.RED,Color.RED,Color.RED,Color.BLACK,Color.BLACK,Color.RED,Color.RED,Color.RED},
// 			{Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED},
// 			{Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED},
// 			{Color.RED,Color.RED,Color.RED,Color.BLACK,Color.BLACK,Color.RED,Color.RED,Color.RED},
// 			{Color.RED,Color.RED,Color.RED,Color.BLACK,Color.BLACK,Color.RED,Color.RED,Color.RED},
// 			{Color.RED,Color.RED,Color.RED,Color.BLACK,Color.BLACK,Color.RED,Color.RED,Color.RED},
// 			{Color.RED,Color.RED,Color.RED,Color.BLACK,Color.BLACK,Color.RED,Color.RED,Color.RED}};
	
	
// //	mapa de bits
// 	int letraAMB[]= {0x3C,0x7E,0xE7,0xE7,0xE7,0xFF,0xFF,0xE7,0xE7,0xE7};
	
	
// 	JFrame Vent;
// 	public EvolucionCaracteres(){
// 		setSize(800,600);
// 		Vent = new JFrame("Evolucion de caracteres");
// 		Vent.setSize(800, 600);
// 		setBackground(Color.black);
// 		Vent.add(this);
		
// 		Vent.setVisible(true);
// 		Vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 	}
	

// 	protected void paintComponent(Graphics g) {
// 		super.paintComponent(g);
// 		//Dibujar el mapa de caracter 
// 		DibujaMapaCaracter(g);
// 		//Dibujar mapa de pixeles
// 		DibujaMapaDePixeles(g);
// 		//Dibujar mapa de bits
// 		DibujaMapaDeBits(g);
// 	}

// 	public void DibujaMapaDeBits(Graphics g) {
// 		int cx=300;
// 		int cy=150;
// 		g.setColor(Color.YELLOW);
// 		for (int r = 0; r < letraAMB.length; r++) {
// 			for (int d = 31,c=0; c <32 ; c++,d--) {
// 				int mascara=1<<d;
// 				int op=letraAMB[r]&mascara;
// 				if(op!=0) {
// 					//pintar dibujo
// 					g.drawLine(cx+c, cy+r, cx+c, cy+r);
// 				}
// 			}
			
// 		}
// 	}
	
// 	public void DibujaMapaCaracter(Graphics g) {
// 		int cx=200;
// 		int cy=150;
// 		for (int i = 0; i < letraAC.length; i++) {
			
// 			for (int j = 0; j < letraAC[0].length; j++) {
// 				g.setColor(letraAC[i][j]);
// 				g.drawLine(cx, cy, cx, cy);
// 				cx+=8;
// 			}
// 			cy+=8;
// 			cx=200;
// 		}
// 	}
// 	public void DibujaMapaDePixeles(Graphics g) {
// 		int cx=100;
// 		int cy=150;
// 		for (int i = 0; i < letraA.length; i++) {
			
// 			for (int j = 0; j < letraA[0].length; j++) {
// 				g.setColor(Color.blue);
// 				g.drawString(letraA[i][j]+"", cx, cy);
// 				cx+=8;
// 			}
// 			cy+=8;
// 			cx=100;
// 		}
// 	}
	
// 	public static void main(String[] args) {
// 		new EvolucionCaracteres();
// 	}
	
	
// }
	
