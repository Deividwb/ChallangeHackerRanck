package meusTestes;

public class VerificarLetrasIguais {
    public static void main(String[] args) {
        String teste = "teste";
        String poste = "poste";
        String verifica;


        int soma = 0;
        for (int i = 0; i <teste.length() ; i++) {
            teste.charAt(i);
            for (int j = 0; j < poste.length(); j++) {
                poste.charAt(j);
                if (teste.charAt(i) == poste.charAt(j)){
                    soma += soma;
                }
            }
        }
        System.out.println(soma*100);

    }

}
