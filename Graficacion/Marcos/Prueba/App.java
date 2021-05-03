package Marcos.Prueba;

import jankovicsandras.imagetracer.ImageTracer;

import java.io.*;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import jankovicsandras.imagetracer.ImageTracer;

public class App {

    public static void main(String[] args) {

        try {
            ImageTracer.saveString("smiley.jpg" ,ImageTracer.imageToSVG("smiley.jpg.svg",null,null));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
