package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Preencha o formulário abaixo sobre seu jardim: ");
        System.out.print("Nome do Jardim: ");
        String nome = sc.nextLine();

        System.out.print("Área total em metros: ");
        double qtdMetros = sc.nextDouble();

        System.out.print("Área que deseja pôr grama: ");
        double qtdMetrosGrama = sc.nextDouble();

        System.out.print("Valor do quilo do adubo na sua cidade: ");
        double valorAdubo = sc.nextDouble();

        System.out.print("Valor do metro quadrado da Grama: ");
        double valorMetroGrama = sc.nextDouble();

        System.out.print("Quantas plantas deseja no seu adubo: ");
        int qtdPlantas = sc.nextInt();

        Jardinagem jardim = new Jardinagem(nome, qtdMetros, qtdPlantas, qtdMetrosGrama, valorAdubo, valorMetroGrama);

        jardim.imprimirInformacoes();
    }
}
