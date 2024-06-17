
//Desenvolver um Conversor de Moedas que ofereça interação textual (via console) com os usuários, proporcionando no mínimo
//6 opções distintas de conversões de moedas em um menu. A taxa de conversão não será estática, mas sim dinamicamente
//obtida por meio de uma API, garantindo dados precisos e em tempo real para uma experiência mais atualizada e eficaz.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Conversor conversorMoeda = new Conversor();
        Scanner leitura = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("1 - USD \t 4 - JPY \n" +
                           "2 - BRL \t 5 - GBP \n" +
                           "3 - EUR \t 6 - ARS ");
        System.out.println("=============================");

        System.out.println("Digite uma moeda, base para conversão: ");
        var moedaBase = leitura.nextLine();

        System.out.println("Digite uma moeda para qual você deseja converter ");
        var moedaConvertida = leitura.nextLine();

        System.out.println("Digite um valor para conversão: ");
        var valorConversao = leitura.nextDouble();

        try{
            MoedaDataTransfer moedaDT = conversorMoeda.conversorDeMoeda(moedaBase, moedaConvertida, valorConversao);
            Moeda moeda = new Moeda(moedaDT);

            System.out.println(moeda);

        } catch (NullPointerException e) {
            System.out.println("Não foi possivél fazer a conversão: " + e.getMessage());
        }
    }
}
