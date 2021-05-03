package Proyecto.src;

import java.awt.Graphics;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class PrincipalTransformaciones2D extends JPanel implements ActionListener {

    JFrame V;
    Figura2D F;
    JButton btn_escalamiento, btn_deformacion, btn_restaurar,btn_rotacion_derecha;

    public PrincipalTransformaciones2D() {
        V = new JFrame("Transformaciones en 2D");
        V.setSize(800, 600);
        V.setLocationRelativeTo(this);
        V.setLayout(new BorderLayout());

        JPanel panel_botones = new JPanel();

        btn_escalamiento = new JButton("escalar");
        btn_escalamiento.addActionListener(this);
        panel_botones.add(btn_escalamiento);

        btn_deformacion = new JButton("deformar");
        btn_deformacion.addActionListener(this);
        panel_botones.add(btn_deformacion);

        btn_restaurar = new JButton("restaurar");
        btn_restaurar.addActionListener(this);
        panel_botones.add(btn_restaurar);

        btn_rotacion_derecha = new JButton("rotacion derecha");
        btn_rotacion_derecha.addActionListener(this);
        panel_botones.add(btn_rotacion_derecha);

        V.add(panel_botones, BorderLayout.NORTH);

        F = new Figura2D();
        V.add(this);
        V.setVisible(true);
        V.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        F.DibujarVecPuntos(g);
    }

    public static void main(String[] args) {
    
        new PrincipalTransformaciones2D();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn_escalamiento) {

            String cant = JOptionPane.showInputDialog(null, "Dame la cantidad a escalar la figura", "Escalamiento");
            try {
                Double escalar = Double.parseDouble(cant);
                F.escalarO(escalar);
                repaint();

            } catch (NumberFormatException err) {
                JOptionPane.showMessageDialog(null, "Error numerico");
            }
        } else if (e.getSource() == btn_deformacion) {
            String cant0 = JOptionPane.showInputDialog(null, "Dame la cantidad a deformar la figura en x",
                    "Deformacion x");
            String cant1 = JOptionPane.showInputDialog(null, "Dame la cantidad a deformar la figura en y",
                    "Deformacion y");

            try {
                Double defx = Double.parseDouble(cant0);
                Double defy = Double.parseDouble(cant1);

                F.deformarO(defx, defy);
                repaint();

            } catch (NumberFormatException err) {
                JOptionPane.showMessageDialog(null, "Error numerico");
            }
        }else if (e.getSource() == btn_rotacion_derecha) {
            String cant0 = JOptionPane.showInputDialog(null, "Dame la cantidad a rotar la figura hacia la derecha",
                    "rotacion en grados");
        
            try {
                int rota = Integer.parseInt(cant0);
                F.rotacion_derechaO(rota);
                repaint();

            } catch (NumberFormatException err) {
                JOptionPane.showMessageDialog(null, "Error numerico");
            }
        } else if (e.getSource() == btn_restaurar) {
            F.restaurar();
            repaint();
        }

    }

}
