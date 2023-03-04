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
        BigDecimal percentSP = new BigDecimal((fatSP/totalFaturamento) *100);

        System.out.printf("O percentual de faturamento de São Paulo é %d", percentSP);
    }

}
