package Graficacion;

import java.awt.*;



import javax.swing.*;


@SuppressWarnings("serial")
public class Brausenjam extends JPanel {

    JFrame Frame_ventana;

    public Brausenjam() {
        Frame_ventana = new JFrame();
        setSize(800, 600);
        Frame_ventana.setSize(800, 600);
        Frame_ventana.add(this);
        Frame_ventana.setVisible(true);
        Frame_ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        // *Fue Realizado con la ayuda de los siguientes videos
        // https://www.youtube.com/watch?v=ujyCaZJIDcg
        // https://www.youtube.com/watch?v=h3gDB89h0os
        // Linea_Bresenham(g, 100, 100, 50, 50);
        // Estos fueron realizados con el pdf que nos mando, se que tienen algunos errores
        // pero ya no alcanzo a corregirlos :/ lo siento profe
        Linea_Bresenham_PDF(g, 100, 100, 120, 150);
        Circulo(g, 100, 100, 100);

    }

    public void Linea_Bresenham(Graphics g, int xo, int yo, int xn, int yn) {
        int triangulo_x = xn - xo;
        System.out.println(triangulo_x + " " + xn + " " + xo);
        int triangulo_y = yn - yo;
        int pk = 2 * triangulo_y - triangulo_x;
        int xk = xo;
        int yk = yo;
        int triangulo_x_veces = triangulo_x;

        int pendiente_m = yn - yo / xn - xo;
        System.out.println(pendiente_m);

        do {
            g.drawLine(xk, yk, xk, yk);
            if (pk < 0) {
                pk = pk + 2 * triangulo_y;
                if (xo != xn)
                    xk = xk + 1;
                if (yo != yn)
                    yk = yk + 1;
                // yk=yk;
            } else {
                pk = pk + (2 * triangulo_y) - (2 * triangulo_x);
                if (xo != xn)
                    xk = xk + 1;
                if (yo != yn)
                    yk = yk + 1;
            }
            System.out.println("entro");
            triangulo_x_veces--;
            System.out.println(triangulo_x_veces);
        } while (triangulo_x_veces > 0);
        System.out.println("cerro");
    }

    public void Linea_Bresenham_PDF(Graphics g, int xo, int yo, int xn, int yn) {
        int triangulo_x, triangulo_y, xk, yk, xfin, pk;
        triangulo_x = Math.abs(xn - xo);
        triangulo_y = Math.abs(yn - yo);
        pk = (2 * triangulo_y) - triangulo_x;

        if (triangulo_x > triangulo_y) {
            xk = xn;
            yk = yn;
            xfin = xo;
        } else {
            xk = xo;
            yk = yo;
            xfin = xn;
        }

        while (xk < xfin) {
            xk++;
            if (pk < 0) {
                pk = pk + 2 * triangulo_y;
            } else {
                yk++;
                pk = pk + (2 * triangulo_y) - (2 * triangulo_x);
            }
            g.drawLine(xk, yk, xk, yk);
        }
    }

    public void Circulo(Graphics g, int xc, int yc, int r) {
        int y=r, x=0, p=0;
        plotpuntos(g, y, x, p, xc, yc, r);
        
        p=1-r;
        while(x<y){
            x++;
            if(p>=0){
                y--;
            }
            if(p<0){
                p=p+2*x+1;
            }else{
                p=p+2*(x-y)+1;
            }
            plotpuntos(g, y, x, p, xc, yc, r);
        }


    }

    public void plotpuntos(Graphics g, int y,int x,int p,int xc, int yc, int r){
        g.drawLine(xc - x, yc + y,xc - x, yc + y);
        g.drawLine(xc + x, yc - y,xc + x, yc - y);
        g.drawLine(xc - x, yc - y,xc - x, yc - y);
        g.drawLine(xc + y, yc + x,xc + y, yc + x);
        g.drawLine(xc - y, yc + x,xc - y, yc + x);
        g.drawLine(xc + y, yc - x,xc + y, yc - x);
        g.drawLine(xc - y, yc - x,xc - y, yc - x);
        
    }

    public static void main(String[] args) {
        new Brausenjam();
    }
}
