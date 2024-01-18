package com.reviewexercise.bucadorpalabras.clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Function;

public abstract class BuscadorPalabras {
    
    private static FileReader fileReader = null;
    private static BufferedReader bufferedReader = null;

    /*
     * String[] palabras = loQueQuieroBuscar.split("\\s+");
     */

    static Function<String,String> quitarPunto = (a) -> {
        String[] sep = a.split("\\.");
        return sep[0];
    };

    public static boolean buscadorPalabras(File f, String palabraBusqueda){
        try{
            fileReader = new FileReader(f);
            bufferedReader = new BufferedReader(fileReader);

            String linea = bufferedReader.readLine();
            while (linea != null) {
                String[] palabras = linea.split("\\s+");
                for(String palabra: palabras){
                    if(quitarPunto.apply(palabra).equals(palabraBusqueda)){
                        return true;
                    }
                }
                linea = bufferedReader.readLine();
            }
            bufferedReader.close();
            return false;

        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return false;
    }


}
