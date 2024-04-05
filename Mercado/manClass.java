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
			
			int opcao;

			opcao = sc.nextInt();
			System.out.println();

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

			// Cadastrando Alimento
			case 2: {
				System.out.println("Escreva o código do alimento: ");
				do {
					if (sc.hasNextInt()) {
						alimento.setCodigo(sc.nextInt());
					} else {
						System.out.println("Entrada inválida. Por favor, insira um número válido.");
						sc.next();
					}
				} while (alimento.getCodigo() == 0);

				do {
					System.out.println("Nome do alimento: ");
					if (sc.hasNext()) {
						alimento.setNome(sc.next());
					} else {
						System.out.println("Entrada inválida. Por favor, insira um nome válido.");
						sc.next();
					}
				} while (alimento.getNome() == null);

				do {
					System.out.println("Descrição: ");
					if (sc.hasNext()) {
						alimento.setDescricao(sc.next());
					} else {
						System.out.println("Entrada inválida. Tente novamente.");
						sc.next();
					}
				} while (alimento.getDescricao() == null);

				do {
					System.out.println("Quantidade: ");
					if (sc.hasNextInt()) {
						alimento.setQuantidade(sc.nextInt());
					} else {
						System.out.println("Entrada inválida. Tente novamente.");
						sc.next();
					}
				} while (alimento.getQuantidade() == 0);

				do {
					System.out.println("Escreva o preço: ");					
					if (sc.hasNextDouble()) {
						alimento.setPreco(sc.nextDouble());
					} else {
						System.out.println("Entrada inválida. tente novamente");
						sc.next();
					}
				} while (alimento.getPreco() == 0);

				do {
					System.out.println("Escreva a data de validade: ");			
					if (sc.hasNext()) {
						alimento.setDataValidade((sc.next()));
					} else {
						System.out.println("Entrada inválida. tente novamente");
						sc.next();
					}
				} while (alimento.getDataValidade() == null);
				
				// Gravando produto
				alimento.gravaEstoque(alimento.getCodigo(), alimento.getNome(), alimento.getDescricao(),
						alimento.getQuantidade(), alimento.getPreco());
				System.out.println("Alimento cadastrado com sucesso.");
				continue;
			}

			case 3: {
				// Cadastrando Eletronico
				
				do {
					System.out.println("Código do eletronico.");	
					if (sc.hasNextInt()) {
						eletronico.setCodigo(sc.nextInt());
					} else {
						System.out.println("Entrada inválida. tente novamente");
						sc.next();
					}
				} while (eletronico.getCodigo() == 0);
				
				do {
					System.out.print("Nome do eletronico: ");
					if (sc.hasNext()) {
						eletronico.setNome(sc.next());	
					} else {
						System.out.println("Entrada inválida. tente novamente");
						sc.next();
					}
				} while (eletronico.getNome() == null);
				
				do {
					System.out.print("Descrição do eletronico: ");
					if (sc.hasNext()) {
						eletronico.setDescricao(sc.next());	
					} else {
						System.out.println("Entrada inválida. tente novamente");
						sc.next();
					}
				} while (eletronico.getDescricao() == null);
				
				do {
					System.out.print("Quantidade do eletronico: ");
					if (sc.hasNextInt()) {
						eletronico.setQuantidade(sc.nextInt());						
					} else {
						System.out.println("Entrada inválida. Tente novamente");
						sc.next();
					}
				} while (eletronico.getQuantidade() == 0);
				
				do {
					System.out.print("Preço do eletronico: ");
					if (sc.hasNextDouble()) {
						eletronico.setPreco(sc.nextDouble());		
					} else {
						System.out.println("Entrada inválida. tente novamente");
						sc.next();
					}
				} while (eletronico.getPreco() == 0.0);
				
				do {
					System.out.print("Marca do eletronico: ");
					if (sc.hasNext()) {
						eletronico.setMarca(sc.next());	
					} else {
						System.out.println("Entrada inválida. tente novamente");
						sc.next();
					}
				} while (eletronico.getMarca() == null);

				do {
					System.out.print("Modelo do eletronico: ");
					if (sc.hasNext()) {
						eletronico.setModelo(sc.next());
					} else {
						System.out.println("Entrada inválida. tente novamente");
						sc.next();
					}
				} while (eletronico.getModelo() == null);

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
