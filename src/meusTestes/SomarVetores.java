package meusTestes;

public class SomarVetores {
    public static void main(String[] args) {
        int[] arrA = {2, 4, 5};
        int[] arrB = {2, 4, 7};


        int soma = 0;
        int valor = 0;

        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrB.length; j++) {
                if (arrA[i] == (arrB[j])) {
                    valor = arrA[i];
                    soma += valor;

                }
            }
        }
        System.out.println(soma);
    }
}
