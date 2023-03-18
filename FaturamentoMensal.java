// 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:

// SP – R$67.836,43
// RJ – R$36.678,66
// MG – R$29.229,88
// ES – R$27.165,48
// // Outros – R$19.849,53
// Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.

public class FaturamentoMensal {

    // declaração das variaveis com os valores
    public static void main(String[] args) {
        double sp = 67836.43, rj = 36678.66, mg = 29229.88, es = 27165.48, outros = 19849.53;
        double total = sp + rj + mg + es + outros;

        // Efetuando o calculo multiplicando por 100 e dividindo pelo valor total para
        // obter a porcentagem

        double porcentagemSp = sp * 100 / total;
        double porcentagemRj = rj * 100 / total;
        double porcentagemMg = mg * 100 / total;
        double porcentagemEs = es * 100 / total;
        double porcentagemOutros = outros * 100 / total;

        // Mostrando ao usuário a mensagem final com a porcentagem de cada um dos
        // estados

        System.out.println("Segue o percentual que cada estado teve dentro do valor total mensal: ");
        System.out.println("SP: " + porcentagemSp + "%");
        System.out.println("RJ: " + porcentagemRj + "%");
        System.out.println("MG: " + porcentagemMg + "%");
        System.out.println("ES: " + porcentagemMg + "%");
        System.out.println("Outros: " + porcentagemOutros + "%");

    }

}
