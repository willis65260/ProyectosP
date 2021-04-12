package ElReyLeon;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.net.*;
//import java.util.Iterator;
import java.util.Random;

public class ElReyLeon extends JPanel implements ActionListener {
    JFrame V;
    Image imgTablero;
    vector_Etiqueta vEti[][];
    int posfr, posfc;
    ImageIcon figura;
    JPanel panelDado;
    JButton bDado;
    ImageIcon imgDado;
    int numGenerado;
    defTablero T[];
    int ubicacionS;
    int ubicacionP;
    int numero_jugadores;
    Jugador Simba, Pumba;
    boolean OdioLasBanderas;
    JFrame ventana_anterior;
    JButton imagen_jugador1;
    JButton imagen_jugador2;

    public ElReyLeon(int numero_jugadores, JFrame ventana_anterior) {
        this.ventana_anterior = ventana_anterior;
        this.numero_jugadores = numero_jugadores;
        OdioLasBanderas = true;
        construirTablero();
        Simba = new Jugador(vEti, T, bDado, 0, "Simba", V, ventana_anterior);

        imagen_jugador1 = new JButton();
        imagen_jugador1.setIcon(Simba.figura);
        panelDado.add(imagen_jugador1);
        if (numero_jugadores != 1) {
            Pumba = new Jugador(vEti, T, bDado, 2, "Pumba", V, ventana_anterior);
            imagen_jugador2 = new JButton();
            imagen_jugador2.setIcon(Pumba.figura);
            imagen_jugador2.setEnabled(false);
            panelDado.add(imagen_jugador2);

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("botones " + numero_jugadores);
        if (numero_jugadores == 1) {
            Simba.AgregarMovimiento(TirarDado());
            Simba.MoverJugador();
        } else {
            System.out.println("entro al else ");

            if (OdioLasBanderas) {
                if (!Simba.cazzu) {
                    Simba.AgregarMovimiento(TirarDado());
                    Simba.MoverJugador();
                    imagen_jugador2.setEnabled(true);
                    imagen_jugador1.setEnabled(false);
                } else {
                    Simba.cazzu = false;
                }
                OdioLasBanderas = false;
            } else {
                if (!Pumba.cazzu) {
                    Pumba.AgregarMovimiento(TirarDado());
                    Pumba.MoverJugador();
                    imagen_jugador1.setEnabled(true);
                    imagen_jugador2.setEnabled(false);
                } else {
                    Pumba.cazzu = false;
                }
                OdioLasBanderas = true;
            }
        }

    }

    public int TirarDado() {
        Random R = new Random();
        numGenerado = 1 + R.nextInt(6);
        // System.out.println(numGenerado);

        URL ruta = getClass().getResource("../Recursos/dado" + numGenerado + ".png");
        bDado.setIcon(new ImageIcon(ruta));
        return numGenerado;
    }

    public void construirTablero() {
        OdioLasBanderas = true;
        V = new JFrame("Serpientes y escaleras version El Rey Leon");
        V.setSize(900, 700);
        V.setLocationRelativeTo(this);
        setSize(900, 700);
        setLayout(new GridLayout(5, 6));
        ubicacionP = 1;
        ubicacionS = 1;
        vEti = new vector_Etiqueta[5][6];
        for (int r = 0; r < vEti.length; r++)
            for (int c = 0; c < vEti[0].length; c++) {
                vEti[r][c] = new vector_Etiqueta();
                add(vEti[r][c].PanelInterno);
            }
        posfr = 4;
        posfc = 0;

        URL ruta = getClass().getResource("../Recursos/pumba5.gif");
        // vEti[posfr][posfc].SetImagePumba();
        // vEti[posfr][posfc].SetImageSimba();

        ruta = getClass().getResource("../Recursos/fondo.png");
        imgTablero = new ImageIcon(ruta).getImage();
        V.add(this, BorderLayout.CENTER);
        panelDado = new JPanel();
        panelDado.setLayout(new GridLayout(3, 1));
        ruta = getClass().getResource("../Recursos/dadochido.gif");
        imgDado = new ImageIcon(ruta);
        bDado = new JButton(imgDado);
        bDado.setOpaque(false);
        bDado.setContentAreaFilled(false);
        bDado.setBorderPainted(false);

        panelDado.add(bDado);

        V.add(panelDado, BorderLayout.WEST);
        // evento del boton
        bDado.addActionListener(this);

        V.setVisible(true);
        V.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        V.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                ventana_anterior.setVisible(true);
            }
        });
        
        V.addWindowFocusListener(new WindowFocusListener() {
            @Override
            public void windowLostFocus(WindowEvent e) {
                // System.exit(0);

            }

            @Override
            public void windowGainedFocus(WindowEvent e) {

            }
        });

        T = new defTablero[31];
        // r1
        T[1] = new defTablero(1, 4, 0, 0);// p r c avance
        T[2] = new defTablero(2, 4, 1, 0);
        T[3] = new defTablero(3, 4, 2, 18);// sube a la 18
        T[4] = new defTablero(4, 4, 3, 0);
        T[5] = new defTablero(5, 4, 4, 0);
        T[6] = new defTablero(6, 4, 5, 0);
        // r2
        T[7] = new defTablero(7, 3, 5, 0);
        T[8] = new defTablero(8, 3, 4, 16);
        T[9] = new defTablero(9, 3, 3, 0);
        T[10] = new defTablero(10, 3, 2, 0);
        T[11] = new defTablero(11, 3, 1, 1);
        T[12] = new defTablero(12, 3, 0, 0);
        // r3
        T[13] = new defTablero(13, 2, 0, 24);
        T[14] = new defTablero(14, 2, 1, 0);
        T[15] = new defTablero(15, 2, 2, 4);
        T[16] = new defTablero(16, 2, 3, 0);
        T[17] = new defTablero(17, 2, 4, 0);
        T[18] = new defTablero(18, 2, 5, 0);
        // r4
        T[19] = new defTablero(19, 1, 5, 7);
        T[20] = new defTablero(20, 1, 4, 0);
        T[21] = new defTablero(21, 1, 3, 0);
        T[22] = new defTablero(22, 1, 2, 29);
        T[23] = new defTablero(23, 1, 1, 0);// PIERDE TURNO, CHECAR
        T[24] = new defTablero(24, 1, 0, 0);
        // r5
        T[25] = new defTablero(25, 0, 0, 6);
        T[26] = new defTablero(26, 0, 1, 0);
        T[27] = new defTablero(27, 0, 2, 0);
        T[28] = new defTablero(28, 0, 3, 9);
        T[29] = new defTablero(29, 0, 4, 0);
        T[30] = new defTablero(30, 0, 5, 0);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imgTablero, 0, 0, getWidth(), getHeight(), this);

    }

    public static void main(String[] args) {

    }

}
