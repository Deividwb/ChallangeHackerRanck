package meusTestes;

import java.util.ArrayList;
import java.util.List;

public class PalavrasRepetidasNaFrase {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        List<String> listas = new ArrayList<String>();

        listas.add("quero entar pro crescer para crescer na carreia e crescer");
        lista.add("pera");
        lista.add("maca");
        lista.add("pera");
        lista.add("pera");
        lista.add("abacate");
        lista.add("pera");

        String encontrar = "crescer";

        int contador = 0;
        for (String string : listas) {
            if (string.equalsIgnoreCase(encontrar)) {
                contador++;

            }
        }
        System.out.println(encontrar+"x+= "+contador);
    }

}

