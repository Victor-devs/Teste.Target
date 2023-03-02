package testeFaturamento;

public class TesteFaturamento {

	    public static void main(String[] args) {
	        
	        // Definindo vetor com faturamento diário
	        double[] faturamentoDiario = { 1000.0, 1500.0, 2000.0, 800.0, 1200.0, 0.0, 0.0, 2500.0, 1800.0, 1300.0, 1700.0, 1900.0, 2200.0, 2100.0, 0.0, 1000.0, 1200.0, 800.0, 900.0, 700.0, 1700.0, 2200.0, 2300.0, 2000.0, 1800.0, 1500.0, 1900.0, 1700.0, 1500.0, 1100.0 };
	        
	        // Variáveis para armazenar o menor e o maior faturamento
	        double menorFaturamento = faturamentoDiario[0];
	        double maiorFaturamento = faturamentoDiario[0];
	        
	        // Variáveis para armazenar o total de faturamento e a quantidade de dias com faturamento acima da média
	        double totalFaturamento = 0.0;
	        int diasAcimaMedia = 0;
	        
	        // Percorrendo o vetor de faturamento diário para realizar as operações
	        for (double faturamento : faturamentoDiario) {
	            if (faturamento < menorFaturamento) {
	                menorFaturamento = faturamento;
	            }
	            if (faturamento > maiorFaturamento) {
	                maiorFaturamento = faturamento;
	            }
	            totalFaturamento += faturamento;
	        }
	        
	        // Calculando a média mensal de faturamento
	        int diasUteis = 0; // considerando apenas dias úteis (segunda a sexta)
	        for (int i = 0; i < faturamentoDiario.length; i++) {
	            if (faturamentoDiario[i] > 0.0) {
	                diasUteis++;
	            }
	        }
	        double mediaMensal = totalFaturamento / diasUteis;
	        
	        // Contando os dias com faturamento acima da média
	        for (double faturamento : faturamentoDiario) {
	            if (faturamento > mediaMensal) {
	                diasAcimaMedia++;
	            }
	        }
	        
	        // Imprimindo os resultados
	        System.out.println("Menor faturamento diário: R$" + menorFaturamento);
	        System.out.println("Maior faturamento diário: R$" + maiorFaturamento);
	        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaMedia);
	    }

	}

