package exerc4;

import java.math.BigDecimal;

/**
 * 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
 *
 * SP – R$67.836,43
 * RJ – R$36.678,66
 * MG – R$29.229,88
 * ES – R$27.165,48
 * Outros – R$19.849,53
 *
 * Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.
 */

public class CalcPercent {

    public static void main(String[] args) {
        double fatSP = 67836.43;
        double fatRJ = 36678.66;
        double fatMG = 29229.88;
        double fatES = 27165.48;
        double fatOutros = 19849.53;

        double totalFaturamento = fatSP + fatRJ + fatMG + fatES + fatOutros;

        double percentSP = (fatSP/totalFaturamento)*100d;
        double percentRJ = (fatRJ/totalFaturamento)*100d;
        double percentMG = (fatMG/totalFaturamento)*100d;
        double percentES = (fatES/totalFaturamento)*100d;
        double percentOutros = (fatOutros/totalFaturamento)*100d;

        System.out.printf("O percentual de faturamento de SP é: %.2f%% \n", percentSP);
        System.out.printf("O percentual de faturamento do RJ é: %.2f%% \n", percentRJ);
        System.out.printf("O percentual de faturamento de MG é: %.2f%% \n", percentMG);
        System.out.printf("O percentual de faturamento do ES é: %.2f%% \n", percentES);
        System.out.printf("O percentual de faturamento de Outros é: %.2f%% \n", percentOutros);

    }

}
