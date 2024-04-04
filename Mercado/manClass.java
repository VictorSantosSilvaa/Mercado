package Mercado;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class manClass {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja Bem vindo ao mercado.");
		System.out.println();
		// produto
		do {
			// Objetos instanciados.
			Produto produto = new Produto();
			Alimento alimento = new Alimento();
			Eletronico eletronico = new Eletronico();

			System.out.println("Digite uma opcao: ");
			System.out.println("1 - Cadastrar Produto. ");
			System.out.println("2 - Cadastrar Alimento. ");
			System.out.println("3 - Cadastrar Eletronico. ");
			System.out.println("4 - Sair do programa. ");
			System.out.print("Escreva: ");
			System.out.println();
			int opcao;

			opcao = sc.nextInt();

			switch (opcao) {
			case 1: {

				// Cadastrando produto
				do {
					System.out.println("Código do produto: ");
					if (sc.hasNextInt()) {
						produto.setCodigo(sc.nextInt());
					} else {
						System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
						sc.next();
					}
				} while (produto.getCodigo() == 0);

				do {
					System.out.println("Nome do produto: ");
					if (sc.hasNext()) {
						produto.setNome(sc.next());
					} else {
						System.out.println("Entrada inválida. Por favor, insira uma String.");
						sc.next();
					}
				} while (produto.getNome() == null);

				do {
					System.out.println("Descrição do produto: ");
					if (sc.hasNext()) {
						produto.setDescricao(sc.next());
					} else {
						System.out.println("Entrada inválida. Por favor, insira uma String.");
					}
				} while (produto.getDescricao() == null);

				do {
					System.out.println("Quantidade: ");
					if (sc.hasNextInt()) {
						produto.setQuantidade(sc.nextInt());
					} else {
						System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
						sc.next();
					}
				} while (produto.getQuantidade() == 0);

				do {
					System.out.println("Preço: ");
					if (sc.hasNextDouble()) {
						produto.setPreco(sc.nextDouble());
					} else {
						System.out.println("Entrada inválida. Por favor, insira um número de ponto flutuante.");
						sc.next();
					}
				} while (produto.getPreco() == 0.0);

				// Gravando produto
				produto.gravaEstoque(produto.getCodigo(), produto.getNome(), produto.getDescricao(),
						produto.getQuantidade(), produto.getPreco());
				System.out.println("Produto cadastrado com sucesso.");
				continue;
			}

			case 2: {
				// Cadastrando Alimento
				System.out.println("Escreva o código do alimento: ");
				alimento.setCodigo(sc.nextInt());

				System.out.println("Descrição do alimento: ");
				alimento.setNome(sc.next());

				System.out.println("Escreva um alimento: ");
				alimento.setDescricao(sc.next());

				System.out.println("Escreva a quantidade: ");
				alimento.setQuantidade(sc.nextInt());

				System.out.println("Escreva o preço: ");
				alimento.setPreco(sc.nextDouble());

				System.out.println("Escreva a data de validade: ");
				alimento.setDataValidade((sc.next()));

				// Gravando produto
				alimento.gravaEstoque(alimento.getCodigo(), alimento.getNome(), alimento.getDescricao(),
						alimento.getQuantidade(), alimento.getPreco());
				System.out.println("Alimento cadastrado com sucesso.");
				continue;
			}

			case 3: {
				// Cadastrando Eletronico

				System.out.println("Código do eletronico.");
				eletronico.setCodigo(sc.nextInt());

				System.out.print("Nome do eletronico: ");
				eletronico.setNome(sc.next());

				System.out.print("Descrição do eletronico: ");
				eletronico.setDescricao(sc.next());

				System.out.print("Quantidade do eletronico: ");
				eletronico.setQuantidade(sc.nextInt());

				System.out.print("Preço do eletronico: ");
				eletronico.setPreco(sc.nextDouble());

				System.out.print("Marca do eletronico: ");
				eletronico.setMarca(sc.next());

				System.out.print("Modelo do eletronico: ");
				eletronico.setModelo(sc.next());

				// Gravando produto
				eletronico.gravaEstoque(eletronico.getCodigo(), eletronico.getNome(), eletronico.getDescricao(),
						eletronico.getQuantidade(), eletronico.getPreco());
				System.out.println("Eletronico cadastrado com sucesso.");
				continue;
			}
			case 4: {
				System.out.println("Você saiu do programa. Até logo.");
				return;
			}
			default:
				System.err.println("Algo deu errado.");
			}
		} while (true);
	}
}
