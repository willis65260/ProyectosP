package Paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class cDialogoRotacion extends JDialog
{
	
	double argRotar[];
	JLabel et1,et2,et3;
	JRadioButton rb1,rb2;
	ButtonGroup bg;
	JTextField ct;
	JButton bac,bca;

	public cDialogoRotacion(PrincTransf2D2 v,boolean modal)
	{
		super(v.v,modal);
		setTitle("Rotar una figura en cualquier sentido");
		setSize(550,60);
		setLayout(new FlowLayout());
		setLocationRelativeTo(this);
		URL ruta=getClass().getResource("/Unidad2/rec/rotari.png");
		et1=new JLabel(new ImageIcon(ruta));
		ruta=getClass().getResource("/Unidad2/rec/rotard.png");
		et2=new JLabel(new ImageIcon(ruta));
		et3= new JLabel("Cantidad a botar");
		bg=new ButtonGroup();
		rb1=new JRadioButton("",true);
		rb2=new JRadioButton();
		bg.add(rb1);bg.add(rb2);
		ct=new JTextField(5);
		bac=new JButton("Aceptar");
		bca=new JButton("Cancelar");
		add(et1);add(rb1);add(et2);
		add(rb2);add(et3);add(ct);
		add(bac);add(bca);
		
		bac.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				argRotar=new double[2];
				if(rb1.isSelected())
				
					argRotar[0]=0;
				else 
					argRotar[0]=1;
					String res=ct.getText();
					try {
						argRotar[1]=Double.parseDouble(res);
					}catch(NumberFormatException a)
					{
						argRotar=null;
					}
					setVisible(false);
					dispose();
				}
			
		});
		
		bca.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				argRotar=null;
				setVisible(false);
				dispose();
			}
		});


		
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);

	}
	
	public double[] mostrar()
	{
		setVisible(true);
		return argRotar;
	}
}
