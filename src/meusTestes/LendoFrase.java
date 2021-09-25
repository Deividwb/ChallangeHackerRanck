package meusTestes;


import java.io.DataInputStream;


public class LendoFrase {
    public static void main(String[] args) {



        int quant = 0;
        String texto = "Tem dia que parece dia de feira dia Dia";
        String valor = "dia";
        String[] arrayString = texto.split(" ");

        for (int i = 0; i < arrayString.length; i++) {

            if (arrayString[i].equalsIgnoreCase(valor)) {
                quant++;
            }

        }
        System.out.println(quant);
}
}





