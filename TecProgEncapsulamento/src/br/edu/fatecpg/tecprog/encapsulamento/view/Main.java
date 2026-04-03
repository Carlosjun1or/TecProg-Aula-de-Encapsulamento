package br.edu.fatecpg.tecprog.encapsulamento.view;

import br.edu.fatecpg.tecprog.encapsulamento.model.*;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao = -1;
		while (opcao != 0) {
			menuPrincipal();
			opcao = lerInt("Opcao: ");
			switch (opcao) {
			case 1 -> menuCarro();
			case 2 -> menuContaBancaria();
			case 3 -> menuProduto();
			case 0 -> System.out.println("\nEncerrando... Ate logo!");
			default -> System.out.println("[!] Opcao invalida.");
			}
		}
	}

	static void menuPrincipal() {
		System.out.println("\n╔══════════════════════════════╗");
		System.out.println("║        MENU PRINCIPAL        ║");
		System.out.println("╠══════════════════════════════╣");
		System.out.println("║  1. Carro                    ║");
		System.out.println("║  2. Conta Bancaria           ║");
		System.out.println("║  3. Produto                  ║");
		System.out.println("║  0. Sair                     ║");
		System.out.println("╚══════════════════════════════╝");
	}

	static void menuCarro() {
		System.out.println("\n=== EXERCICIO 1 - CARRO ===");
		System.out.print("Marca: ");
		String marca = sc.nextLine();
		System.out.print("Modelo: ");
		String modelo = sc.nextLine();
		int ano = lerInt("Ano: ");
		double capacidade = lerDouble("Capacidade do tanque (litros): ");

		Carro carro = new Carro(marca, modelo, ano, capacidade);

		double valorGasolina = lerDouble("Valor da gasolina por litro (R$): ");
		double custo = carro.calcularCustoAbastecer(valorGasolina);

		System.out.println("\n--- Resultado ---");
		System.out.printf("Carro    : %s %s (%d)%n", carro.getMarca(), carro.getModelo(), carro.getAno());
		System.out.printf("Tanque   : %.1f litros%n", carro.getCapacidadeTanque());
		System.out.printf("Preco/L  : R$ %.2f%n", valorGasolina);
		System.out.printf("Total    : R$ %.2f%n", custo);
	}

	static void menuContaBancaria() {
		System.out.println("\n=== EXERCICIO 2 - CONTA BANCARIA ===");
		System.out.print("Nome do titular: ");
		String titular = sc.nextLine();
		ContaBancaria conta = new ContaBancaria(titular);

		int opcao = -1;
		while (opcao != 0) {
			System.out.println("\n-- Conta de " + conta.getTitular() + " --");
			System.out.printf("   Saldo atual: R$ %.2f%n", conta.getSaldo());
			System.out.println("  1. Depositar");
			System.out.println("  2. Sacar");
			System.out.println("  0. Voltar");
			opcao = lerInt("  Opcao: ");

			switch (opcao) {
			case 1 -> {
				double val = lerDouble("  Valor para depositar: R$ ");
				if (conta.depositar(val))
					System.out.printf("  [OK] Deposito de R$ %.2f realizado!%n", val);
				else
					System.out.println("  [ERRO] Valor invalido (deve ser positivo).");
			}
			case 2 -> {
				double val = lerDouble("  Valor para sacar: R$ ");
				if (conta.sacar(val))
					System.out.printf("  [OK] Saque de R$ %.2f realizado!%n", val);
				else
					System.out.println("  [ERRO] Saldo insuficiente ou valor invalido.");
			}
			case 0 -> System.out.println("  Voltando ao menu principal...");
			default -> System.out.println("  [!] Opcao invalida.");
			}
		}
	}

	static void menuProduto() {
		System.out.println("\n=== EXERCICIO 3 - PRODUTO ===");
		System.out.print("Nome do produto: ");
		String nome = sc.nextLine();
		double preco = lerDouble("Preco (R$): ");
		int estoque = lerInt("Quantidade em estoque: ");

		Produto produto = new Produto(nome, preco, estoque);
		System.out.println("\n" + produto);

		int opcao = -1;
		while (opcao != 0) {
			System.out.println("\n-- Editar Produto --");
			System.out.println("  1. Alterar preco");
			System.out.println("  2. Alterar estoque");
			System.out.println("  3. Exibir produto");
			System.out.println("  0. Voltar");
			opcao = lerInt("  Opcao: ");

			switch (opcao) {
			case 1 -> {
				double novoPreco = lerDouble("  Novo preco (R$): ");
				produto.setPreco(novoPreco);
				System.out.printf("  Preco atual: R$ %.2f%n", produto.getPreco());
			}
			case 2 -> {
				int novoEstoque = lerInt("  Nova quantidade em estoque: ");
				produto.setQuantidadeEstoque(novoEstoque);
				System.out.println("  Estoque atual: " + produto.getQuantidadeEstoque());
			}
			case 3 -> System.out.println("\n" + produto);
			case 0 -> System.out.println("  Voltando ao menu principal...");
			default -> System.out.println("  [!] Opcao invalida.");
			}
		}
	}

	static int lerInt(String msg) {
		while (true) {
			try {
				System.out.print(msg);
				return Integer.parseInt(sc.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.println("  [!] Digite um numero inteiro valido.");
			}
		}
	}

	static double lerDouble(String msg) {
		while (true) {
			try {
				System.out.print(msg);
				return Double.parseDouble(sc.nextLine().trim().replace(",", "."));
			} catch (NumberFormatException e) {
				System.out.println("  [!] Digite um numero valido (ex: 9.90).");
			}
		}
	}
}
