package ElReyLeon;

import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import jankovicsandras.imagetracer.ImageTracer;

public class Clase {

    public static void main(String[] args) {
    Image image = null;

        try {
            // Read from a file
            File file = new File("../Recursos/dado");
            image = ImageIO.read(file);

            // Read from an input stream
            InputStream is = new BufferedInputStream(new FileInputStream("image.gif"));
            image = ImageIO.read(is);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Use a label to display the image
        JFrame frame = new JFrame();
        JLabel label = new JLabel(new ImageIcon(image));
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);

        
    }
}
