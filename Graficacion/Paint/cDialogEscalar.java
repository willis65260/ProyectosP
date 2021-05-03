package Paint;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
import javax.swing.*;

public class cDialogEscalar extends JDialog
{
	
	
	double cantEsc=0.0;
	JLabel et1,et2;
	JTextField ct1;
	JButton bac,bca;
	
	public cDialogEscalar(PrincTransf2D2 v,boolean modal)
	{
		super(v.v,modal);
		setTitle("Escalar figura");
		setSize(500,60);
		setLayout(new FlowLayout());
		setLocationRelativeTo(this);
		URL ruta=getClass().getResource("/Unidad2/rec/escala.png");
		et1=new JLabel(new ImageIcon(ruta));
		et2=new JLabel("Cantidad a escalar: ");
		ct1=new JTextField(10);
		bac=new JButton("Aceptar");
		bca=new JButton("Cancelar");
		add(et1);add(et2);add(ct1);add(bac);add(bca);
		
		bac.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String res=ct1.getText();
				try 
				{
					cantEsc=Double.parseDouble(res);
				}catch(NumberFormatException a)
				{
					cantEsc=1.0;
				}
				setVisible(false);
				dispose();
			}
		});
		
		bca.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				cantEsc=1.0;
				setVisible(false);
				dispose();
			}
		});
		
		
		
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
	}
	
	public double mostrar()
	{
		setVisible(true);
		return cantEsc;
	}
}
