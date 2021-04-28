
/* ---------------------------------------------------------------
   UNIVESP - Universidade Virtual do Estado de São Paulo
             Disciplina Programação Orientada a Objetos

  Conversão de temperatura de Celsius para Fahrenheit e vice-versa
   --------------------------------------------------------------- */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Comunicacao[] comunicacoes = {new Celsius(), new Fahrenheit()};
        Scanner sc = new Scanner(System.in);

        while (true) {

            char tipoTemperatura = selecionarTipo(sc);
            if (tipoTemperatura == 'X') break;

            Comunicacao comunicacao = comunicacoes["CF".indexOf(tipoTemperatura)];

            while (true) {

                int temperatura = lerTemperatura(comunicacao, sc);
                if (temperatura == 999) break;

                comunicacao.mensagemTemperatura(
                        tipoTemperatura == 'C'
                                ? Converter.deCelsius(temperatura)
                                : Converter.deFahrenheit(temperatura)
                );

            }

            System.out.println("\n");

        }

        System.out.println("Bye...bye!\n");

    }

    private static char selecionarTipo(Scanner sc) {

        System.out.println("\n" + "-".repeat(55));
        System.out.println("Tecle: C = Celsius, F = Fahrenheit, X = Encerrar");

        String opcao = "";

        while (true) {

            System.out.print("?: ");
            opcao = sc.next().toUpperCase();
            if ("CFX".indexOf(opcao) != -1) break;

            alertar("::: opção inválida!\n");
        }

        System.out.println(); // salta linha

        return opcao.charAt(0);

    }

    private static int lerTemperatura(Comunicacao comunicacao, Scanner sc) {

        comunicacao.mensagemAguardaDados();
        int temperatura;

        while (true) {

            try {
                System.out.print("?: ");
                temperatura = sc.nextInt();
                return temperatura;

            } catch (InputMismatchException e) {
            }

            alertar("::: somente números!");
            sc.nextLine();

        }

    }

    private static void alertar(String mensagem) {
        System.out.println("\u001B[33m" + mensagem + "\u001B[39m");
    }

}
