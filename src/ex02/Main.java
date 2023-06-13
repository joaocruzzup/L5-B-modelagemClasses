package ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Caixa caixa = new Caixa();

        System.out.println("Boas vindas ao caixa!");
        System.out.println("Atualmente o saldo é: " + caixa.saldo);

        boolean repetir = true;
        while (repetir) {
            System.out.println("Selecione uma opção?");
            System.out.println("1 - Ver saldo atual ");
            System.out.println("2 - Adicionar dinheiro");
            System.out.println("3 - Retirar dinheiro");
            System.out.println("0 - Sair do caixa");
            System.out.print("\nDigite a opção: ");
            int resposta = sc.nextInt();
            sc.nextLine();
            switch (resposta) {
                case 0:
                    repetir = false;
                    break;
                case 1:
                    System.out.println("Saldo: R$" + caixa.saldo);
                    System.out.println("Digite * ENTER * para voltar ao Menu");
                    sc.nextLine();
                    break;
                case 2:
                    System.out.print("Digite a quantidade do depósito: ");
                    caixa.adicionarCredito(sc.nextDouble());
                    sc.nextLine();
                    System.out.println("Depósito realizado com sucesso!\nDigite * ENTER * para voltar ao Menu");
                    sc.nextLine();
                    break;
                case 3:
                    System.out.print("Digite a quantidade do saque: ");
                    boolean sucess = caixa.debitar(sc.nextDouble());
                    sc.nextLine();
                    if (sucess == false) {
                        System.out.println("Erro: O saldo é insuficiente");
                    } else {
                        System.out.println("Saque realizado com sucesso!");
                    }
                    System.out.println("\nDigite * ENTER * para voltar ao Menu");
                    sc.nextLine();
                    break;
                default:
                    System.out.println("* Valor inválido *");
                    break;
            }
        }
    }
}
