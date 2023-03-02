package testePercentualEstado;

import java.text.DecimalFormat;

public class TestePercentualEstado {
    public static void main(String[] args) {
        double faturamentoTotal = 180759.98; // faturamento total mensal
        double[] estados = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};
        String[] nomesEstados = {"SP", "RJ", "MG", "ES", "Outros"};

        // cálculo dos percentuais de representação de cada estado
        double[] pctEstados = new double[estados.length];
        for (int i = 0; i < estados.length; i++) {
            pctEstados[i] = (estados[i] / faturamentoTotal) * 100;
        }

        // formatação dos percentuais em duas casas decimais
        DecimalFormat df = new DecimalFormat("#.##");
        for (int i = 0; i < pctEstados.length; i++) {
            String pctFormatado = df.format(pctEstados[i]);
            pctFormatado = pctFormatado.replace(',', '.'); // substitui a vírgula por um ponto
            pctEstados[i] = Double.valueOf(pctFormatado);
        }

        // exibição dos resultados
        System.out.println("Percentual de representação por estado:");
        for (int i = 0; i < pctEstados.length; i++) {
            System.out.println(nomesEstados[i] + ": " + pctEstados[i] + "%");
        }
    }
}