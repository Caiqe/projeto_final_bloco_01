package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import controller.Controller;
import model.Livro;
import model.Roupa;
import util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Controller controller = new Controller();

		int opcao = -1, tipoProduto, codigo;

		do {
			try {
				System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_RED_BOLD_BRIGHT
						+ "                                                ");
				System.out.println(" +--------------------------------------------+ ");
				System.out.println(" |                                            | ");
				System.out.println(" |                 TendTudo                   | ");
				System.out.println(" |                                            | ");
				System.out.println(" +--------------------------------------------+ " + Cores.TEXT_RESET);
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND
						+ " |                                            | ");
				System.out.println(" |        [1]  -  Listar todo Catálogo        | ");
				System.out.println(" |        [2]  -  Adicionar Produto           | ");
				System.out.println(" |        [3]  -  Atualizar Produto           | ");
				System.out.println(" |        [4]  -  Buscar produto              | ");
				System.out.println(" |        [5]  -  Remover Produto             | ");
				System.out.println(" |                                            | ");
				System.out.println(" |        [0]  -  Encerrar Programa           | ");
				System.out.println(" |                                            | ");
				System.out.println(" +--------------------------------------------+ ");
				System.out.println("                                                ");
				opcao = sc.nextInt();

				switch (opcao) {
				case 1 -> {
					System.out.println("\nCatálogo: \n\n");
					controller.mostrarCatalogo();

				}
				case 2 -> {
					do {
						System.out.println("\nAdicionar Produto: \n");
						System.out.println("Informe o tipo de produto: \n");
						System.out.println(" [1]  -  Livro");
						System.out.println(" [2]  -  Roupa");
						tipoProduto = sc.nextInt();
					} while (tipoProduto < 1 || tipoProduto > 2);
					switch (tipoProduto) {
					case 1 -> {
						do {
							System.out.println("Informe um código para o Produto:");
							codigo = sc.nextInt();
							sc.nextLine();
						} while (controller.buscarNaCollection(codigo) != null);

						System.out.println("Informe o nome do Livro:");
						String nome = sc.nextLine();
						System.out.println("Informe o valor (R$) do livro: ");
						float valor = sc.nextFloat();
						sc.nextLine();
						System.out.println("Informe o gênero textual do livro: ");
						String genero = sc.nextLine();
						System.out.println("Informe a qtd. de páginas: ");
						int paginas = sc.nextInt();

						controller.adicionarProduto(new Livro(codigo, nome, valor, genero, paginas));
					}
					case 2 -> {
						do {
							System.out.println("Informe um código para o Produto:");
							codigo = sc.nextInt();
							sc.nextLine();
						} while (controller.buscarNaCollection(codigo) != null);

						System.out.println("Informe o tipo da roupa:");
						String nome = sc.nextLine();
						System.out.println("Informe o valor (R$) da roupa: ");
						float valor = sc.nextFloat();
						sc.nextLine();
						System.out.println("Informe o tamanho da roupa: (Ex: P,M,G)");
						String tamanho = sc.nextLine();
						System.out.println("Informe a cor da roupa: ");
						String cor = sc.nextLine();

						controller
								.adicionarProduto(new Roupa(codigo, nome, valor, tamanho.toUpperCase().charAt(0), cor));
					}
					default -> {
						System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND
								+ "Opção inválida!" + Cores.TEXT_RESET);
					}
					}

				}
				case 3 -> {
					System.out.println("\nAtualizar Produto: \n");

					System.out.println("Informe o tipo de Produto que deseja atualizar: ");
					System.out.println(" [1]  -  Livro");
					System.out.println(" [2]  -  Roupa");
					tipoProduto = sc.nextInt();
					switch (tipoProduto) {

					case 1 -> {
						System.out.println("Informe o código do Produto que deseja atualizar: ");
						codigo = sc.nextInt();
						sc.nextLine();

						if (controller.buscarNaCollection(codigo) != null) {

							System.out.println("Informe o novo nome do Livro:");
							String nome = sc.nextLine();
							System.out.println("Informe o novo valor (R$) do livro: ");
							float valor = sc.nextFloat();
							sc.nextLine();
							System.out.println("Informe o novo gênero textual do livro: ");
							String genero = sc.nextLine();
							System.out.println("Informe a qtd. de páginas: ");
							int paginas = sc.nextInt();

							controller.atualizarProduto(new Livro(codigo, nome, valor, genero, paginas));
						} else {
							System.out.println("\nO Produto com código " + codigo + " não foi encontrado!\n");
						}
					}
					case 2 -> {
						System.out.println("Informe o código do Produto que deseja atualizar: ");
						codigo = sc.nextInt();
						sc.nextLine();

						if (controller.buscarNaCollection(codigo) != null) {

							System.out.println("Informe o novo nome da roupa:");
							String nome = sc.nextLine();
							System.out.println("Informe o novo valor (R$) da roupa: ");
							float valor = sc.nextFloat();
							sc.nextLine();
							System.out.println("Informe o novo tamanho da roupa: (Ex: P,M,G)");
							String tamanho = sc.nextLine();

							System.out.println("Informe a nova cor da roupa");
							String cor = sc.nextLine();

							controller.atualizarProduto(
									new Roupa(codigo, nome, valor, tamanho.toUpperCase().charAt(0), cor));
						} else {
							System.out.println("\nO Produto com código " + codigo + " não foi encontrado!\n");
						}
					}
					default -> {
						System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND
								+ "Opção inválida!" + Cores.TEXT_RESET);
					}
					}
				}

				case 4 -> {
					System.out.println("\nBuscar Produto: \n");
					System.out.println("Informe o código do Produto: ");
					codigo = sc.nextInt();

					controller.buscarProdutoPorCodigo(codigo);
				}
				case 5 -> {
					System.out.println("\nRemover Produto: \n");
					System.out.println("Informe o código do Produto: ");
					codigo = sc.nextInt();
					controller.removerProduto(codigo);
				}
				case 0 -> {
					sobre();
					System.out.println("\nPrograma encerrado!");

				}
				default -> {
					System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND
							+ "Opção Inválida! Digite alguma das seguintes opções: \n\n" + Cores.TEXT_RESET);
				}
				}
			} catch (InputMismatchException e) {
				System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND + "Opção inválida!"
						+ Cores.TEXT_RESET);
				sc.nextLine();
			}

		} while (opcao != 0);
		sc.close();

	}

	public static void sobre() {
		System.out.println("\n\n" + Cores.TEXT_RED_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND + " TendTudo"
				+ Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND
				+ " - O lugar onde você encontra tudo que precisa!\n\n");
		System.out.println(" Projeto desenvolvido por: Caique Gomes                         ");
		System.out.println(" Contato: cttcaiquegomes@gmail.com                              ");
		System.out.println(" GitHub: https://github.com/Caiqe                               ");
	}

}
