package Serpientes_escaleras;

//import java.awt.event.Actionevent;
//import java.awt.ActionListener;

import java.awt.*;
import java.net.*;
import java.util.Random;

import javax.swing.*;

class defTableros {
    int pos;
    int r, c;
    int avance;

    public defTableros(int a, int b, int d, int e) {
        pos = a;
        r = b;
        c = d;
        avance = e;
    }
}

public class Serp_esca extends JPanel {
    JFrame V;
    Image imgTablero;
    JLabel vEti[][];
    int posfx, posfy;
    ImageIcon figura;
    JPanel panel_Dado;
    JButton bDado;
    ImageIcon imgDado;
    int numero_generado;
    URL ruta;
    defTableros T[];

    public Serp_esca() {
        V = new JFrame("Serpientes y escaleras");
        V.setSize(900, 700);
        V.setLocationRelativeTo(this);
        setSize(900, 700);

        setLayout(new GridLayout(5, 6));
        ConstruirTablero();
        vEti = new JLabel[5][6];
        posfx = 0;
        posfy = 4;
        for (int r = 0; r < vEti.length; r++) {
            for (int c = 0; c < vEti[0].length; c++) {
                vEti[r][c] = new JLabel();
                vEti[r][c].setOpaque(false);
                add(vEti[r][c]);
            }
        }

        ruta = getClass().getResource("../Recursos/simbaD.gif");
        // figura = new ImageIcon(ruta);

        vEti[posfy][posfx].setIcon(
                new ImageIcon(new ImageIcon(ruta).getImage().getScaledInstance(180, 117, Image.SCALE_DEFAULT)));

        ruta = getClass().getResource("../Recursos/tablero.png");
        imgTablero = new ImageIcon(ruta).getImage();
        V.add(this, BorderLayout.CENTER);
        panel_Dado = new JPanel();

        ruta = getClass().getResource("../Recursos/dadochido.gif");
        imgDado = new ImageIcon(ruta);
        bDado = new JButton(imgDado);
        bDado.setOpaque(false);
        bDado.setContentAreaFilled(false);
        bDado.setBorderPainted(false);

        panel_Dado.add(bDado);
        V.add(panel_Dado, BorderLayout.SOUTH);
        // evento del boton del dado
        bDado.addActionListener(ae -> {
            Random R = new Random();
            numero_generado = 1 + R.nextInt(6);

            ruta = getClass().getResource("../Recursos/dado" + numero_generado + ".png");
            bDado.setIcon(new ImageIcon(ruta));

            JOptionPane.showMessageDialog(null, "Avanza " + numero_generado + " espacios");

            bDado.setIcon(imgDado);

        });

        V.setVisible(true);
        V.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void ConstruirTablero() {
        T = new defTableros[30];
        for (int i = 0; i < T.length; i++) {

        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imgTablero, 0, 0, getWidth(), getHeight(), this);
    }

    public static void main(String[] args) {
        new Serp_esca();
    }

}