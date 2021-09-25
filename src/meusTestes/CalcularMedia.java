package meusTestes;

public class CalcularMedia {
    public static void main(String[] args) {
        double[] previsao = {547541.50,77952.00,1158657.00,447550.00};
        double[] valoresReais = {537800.50,78790.00,1159500.00,447550.00};

        double media1 = 0;
        double media2 = 0;
        double total1 = 0;
        double total2 = 0;
        double soma = 0;

        for (int i = 0; i <previsao.length ; i++) {
            for (int j = 0; j < valoresReais.length; j++) {
                if (previsao[i]>valoresReais[j]) {
                    media1 = previsao[i] - valoresReais[j];
                    total1 += media1;
                }else if (previsao[i]<valoresReais[j]){
                    media2 = valoresReais[j]-previsao[i];
                    total2 += media2;
                }
                else {
                    soma = (total1- total2);
                }
            }

        }
        System.out.println(soma);
    }
}
