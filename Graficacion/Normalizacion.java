package Graficacion;

import java.applet.*;
import java.awt.*;

public class Normalizacion extends Applet {
    int x, y, x1, y1;
    double xd, yd, x1d, y1d;

    public void init() {
        setSize(600, 400);
        x = 100;
        y = 170;
        x1 = 420;
        y1 = 255;
        // TODO entero dividido por entero da como resultado un entero si en la
        // TODO siguiente linea
        // TODO no se hace el casteo a double, el resultado da 0
        xd = (double) x / 600.0;
        yd = (double) y / 400.0;
        x1d = (double) x1 / 600.0;
        y1d = (double) y1 / 400.0;
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
    }
}
