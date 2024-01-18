package com.reviewexercise.bucadorpalabras;

import java.io.File;

import javax.swing.JFileChooser;

import com.reviewexercise.bucadorpalabras.clases.BuscadorPalabras;

public class Main {
    public static void main(String[] args) {

        // JFileChooser j = new JFileChooser();
        
        // j.showOpenDialog(null);

        // String path = j.getSelectedFile().getAbsolutePath();

        File f = new File("D:\\learning\\java\\java_repasos\\ejerecicios-java-campus\\buscador-palabras\\src\\main\\resources\\archivo.txt");
        boolean asd = BuscadorPalabras.buscadorPalabras(f, "Integer");
        System.out.println(asd);
    }
}