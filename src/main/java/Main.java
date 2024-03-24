import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoCidade;
        int numVeiculos, numAcidentes;
        int maiorIndiceAcidentes = Integer.MIN_VALUE, menorIndiceAcidentes = Integer.MAX_VALUE;
        int codCidadeMaiorIndice = 0, codCidadeMenorIndice = 0;
        int totalVeiculos = 0, totalAcidentesMenor2000 = 0;
        int numCidadesMenor2000 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Cidade " + i);
            System.out.print("Digite o código da cidade: ");
            codigoCidade = scanner.nextInt();

            System.out.print("Digite o número de veículos de passeio em 1999: ");
            numVeiculos = scanner.nextInt();

            System.out.print("Digite o número de acidentes de trânsito com vítimas em 1999: ");
            numAcidentes = scanner.nextInt();

            totalVeiculos += numVeiculos;

            if (numVeiculos < 2000) {
                totalAcidentesMenor2000 += numAcidentes;
                numCidadesMenor2000++;
            }

            if (numAcidentes > maiorIndiceAcidentes) {
                maiorIndiceAcidentes = numAcidentes;
                codCidadeMaiorIndice = codigoCidade;
            }

            if (numAcidentes < menorIndiceAcidentes) {
                menorIndiceAcidentes = numAcidentes;
                codCidadeMenorIndice = codigoCidade;
            }
        }

        double mediaVeiculos = totalVeiculos / 5.0;
        double mediaAcidentesMenor2000 = 0.0;
        if (numCidadesMenor2000 > 0) {
            mediaAcidentesMenor2000 = totalAcidentesMenor2000 / (double) numCidadesMenor2000;
        }

        System.out.println("\nEstatísticas:");
        System.out.println("Maior índice de acidentes de trânsito: " + maiorIndiceAcidentes +
                ", Cidade: " + codCidadeMaiorIndice);
        System.out.println("Menor índice de acidentes de trânsito: " + menorIndiceAcidentes +
                ", Cidade: " + codCidadeMenorIndice);
        System.out.println("Média de veículos nas cinco cidades: " + mediaVeiculos);
        System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos: " +
                mediaAcidentesMenor2000);

        scanner.close();
    }
}
