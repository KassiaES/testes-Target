package exerc3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
 • O menor valor de faturamento ocorrido em um dia do mês;
 • O maior valor de faturamento ocorrido em um dia do mês;
 • Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

 IMPORTANTE:
 a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
 b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média; *
 */

public class Distribuidora {
    public static void main(String[] args) throws FileNotFoundException {

        List listaVendas = new ArrayList<>();
        JSONParser parser = new JSONParser();


        try {
            JSONArray dadosArquivo = (JSONArray) parser.parse(new InputStreamReader(new FileInputStream("src/exerc3/dados.json")));
            for (Object o: dadosArquivo){
                JSONObject dadosDoDia = (JSONObject) o;
                Integer data = Integer.parseInt(dadosDoDia.get("dia").toString()) ;
                Double valor = Double.parseDouble(dadosDoDia.get("valor").toString());

            VendaDoDia vendaDoDia = new VendaDoDia(0,0);
            vendaDoDia.setDia(data);
            vendaDoDia.setValor(valor);
            listaVendas.add(vendaDoDia);


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }



    }



}
