// 3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
// • O menor valor de faturamento ocorrido em um dia do mês;
// • O maior valor de faturamento ocorrido em um dia do mês;
// • Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

// IMPORTANTE:
// a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
// b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;

public class Faturamento {
    public static void main(String[] args) {
        double valorFaturamentoMenor = 0, valorFaturamentoMaior = 0, valorSuperiorMensal = 0;
        int count = 0;
        Double[] faturamentos = { 22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0,
                42889.2258, 11191.4722, 11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614,
                0.0, 0.0, 35240.182, 43829.166, 18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221,
                13220.495, 8414.61
        };
        // criação do array para armazenamento dos valores

        for (int i = 0; i < faturamentos.length; i++) { // * Bloco para calcular o faturamento maior utilizando o for */

            if (faturamentos[i] < valorFaturamentoMenor) {
                valorFaturamentoMenor = faturamentos[i];
            }
        }

        for (int i = 0; i < faturamentos.length; i++) { // * Bloco para calcular o faturamento menor utilizando o for */

            if (faturamentos[i] > valorFaturamentoMaior) {
                valorFaturamentoMaior = faturamentos[i];
            }
        }

        // mensagem para mostrar tanto o maior, quanto o menor valor de faturamento

        System.out.println("O menor valor de faturamento foi: " + valorFaturamentoMenor
                + ", e o maior valor de faturamento foi: " + valorFaturamentoMaior);

        for (int i = 0; i < faturamentos.length; i++) { // * Bloco para calcular quais valores estão acima da média
                                                        // mensal utilizando o for e dividindo pela quantidade de
                                                        // valores que forem diferentes do 0 */
            valorSuperiorMensal += faturamentos[i];
            if (faturamentos[i] != 0) {
                count++;
            }
        }

        valorSuperiorMensal = valorSuperiorMensal / count;

        // Mensagem final, e que mostra também os números maiores que a média mensal

        System.out.println("A média mensal foi: " + valorSuperiorMensal);
        System.out.println("Abaixo estão os valores diarios maiores que a média mensal");

        for (int i = 0; i < faturamentos.length; i++) {
            if (faturamentos[i] > valorSuperiorMensal) {
                System.out.println(faturamentos[i]);
            }
        }

    }

}
