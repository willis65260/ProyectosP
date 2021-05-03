package Paint;

import java.awt.*;

class punto2D
{
	int x,y;
	public punto2D(int a, int b)
	{
		x=a;y=b;
	}
}

public class Figura2D   
{
	int figuraUni[];
	int figuraBid[][];
	punto2D figuraPunt[];
	
	public Figura2D()
	{
		figuraUni=new int[]{300,400,350,400,350,500,
							400,500,400,300,350,300,
							300,400};
		
		figuraBid=new int[][] {{300,400},{350,400},{350,500},{400,500},
							   {400,300},{350,300},{300,400}};
							   
		figuraPunt=new punto2D[]{new punto2D(300, 400),new punto2D(350, 400),
								 new punto2D(350, 500),new punto2D(400, 500),
								 new punto2D(400, 300),new punto2D(350, 300),
								 new punto2D(300, 400)};
			
	}
	
	public void DibujarVecPuntos(Graphics g)
	{
		g.setColor(Color.ORANGE);
		for(int p1=0,p2=1;p1<figuraBid.length-1;p1+=1,p2+=1)
		{
			g.drawLine(figuraPunt[p1].x,figuraPunt[p1].y,figuraPunt[p2].x,figuraPunt[p2].y);
		}
	}
	
	public void DibujarVecBid(Graphics g)
	{
		g.setColor(Color.RED);
		for(int p1=0,p2=1;p1<figuraBid.length-1;p1+=1,p2+=1)
		{
			g.drawLine(figuraBid[p1][0],figuraBid[p1][1], figuraBid[p2][0], 
					figuraBid[p2][1]);
		}
	}
	
	public void DibujarVecUni(Graphics g)
	{
		
		g.setColor(Color.BLUE);
		
		for(int i=0;i<figuraUni.length-3;i+=2)
		{
			g.drawLine(figuraUni[i],figuraUni[i+1],figuraUni[i+2],figuraUni[i+3]);
			
		}
	}
}
