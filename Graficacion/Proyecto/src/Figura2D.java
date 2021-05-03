package Proyecto.src;

import java.awt.*;

class punto2D {
    double x, y;

    public punto2D(double a, double b) {
        x = a;
        y = b;
    }
}

public class Figura2D {
    punto2D figura[];

    public Figura2D() {
        figura = new punto2D[] { new punto2D(300, 400), new punto2D(350, 400), new punto2D(350, 500),
                new punto2D(400, 500), new punto2D(400, 300), new punto2D(350, 300), new punto2D(300, 400) };
    }

    public void DibujarVecPuntos(Graphics g) {
        g.setColor(Color.blue);
        for (int p1 = 0, p2 = 1; p1 < figura.length - 1; p1++, p2++) {
            g.drawLine((int) figura[p1].x, (int) figura[p1].y, (int) figura[p2].x, (int) figura[p2].y);
        }
    }

    public void escalarO(double esc) {
        for (int i = 0; i < figura.length; i++) {
            figura[i].x = esc * figura[i].x;
            figura[i].y = esc * figura[i].y;
        }
    }

    public void deformarO(double defx, double defy) {
        for (int i = 0; i < figura.length; i++) {
            double coor_x = figura[i].x;
            figura[i].x = figura[i].x + defx * figura[i].y;
            figura[i].y = defy * coor_x + figura[i].y;
        }
    }

    public void rotacion_derechaO(int angulo) {

        double angulo_radianes = Math.toRadians(angulo);
        double seno = Math.sin(angulo_radianes);
        double coseno = Math.cos(angulo_radianes);

        for (int i = 0; i < figura.length; i++) {
            double x = figura[i].x;
            double y = figura[i].y;

            figura[i].x = x * coseno - y * seno;
            figura[i].y = x * seno + y * coseno;
        }
    }

    public void restaurar() {
        figura = new punto2D[] { new punto2D(300, 400), new punto2D(350, 400), new punto2D(350, 500),
                new punto2D(400, 500), new punto2D(400, 300), new punto2D(350, 300), new punto2D(300, 400) };
    }

}
