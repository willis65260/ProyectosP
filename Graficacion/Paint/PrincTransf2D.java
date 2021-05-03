package Paint;

import javax.swing.*;
import java.awt.*;

public class PrincTransf2D extends JPanel
{

	
	JFrame v;
	Figura2D F;
	
	public PrincTransf2D()
	{
		v=new JFrame("Transmormaciones en 2D");
		v.setSize(800,600);
		setSize(800,600);
		v.setLocationRelativeTo(this);
		
		v.add(this);
		F=new Figura2D();
		
		
		
		v.setVisible(true);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	protected void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		//F.DibujarVecUni(g);
		//F.DibujarVecBid(g);
		F.DibujarVecPuntos(g);
	}
	
	public static void main(String[] args) 
	{
		new PrincTransf2D();
	}

}

