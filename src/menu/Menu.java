package menu;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		do {
		System.out.println(" +--------------------------------------------+");
		System.out.println(" |                                            |");
		System.out.println(" |                 TendTudo                   |");
		System.out.println(" |                                            |");
		System.out.println(" +--------------------------------------------+");
		System.out.println(" |                                            |");
		System.out.println(" |        [1]  -  Listar todo Catálogo        |");
		System.out.println(" |        [2]  -  Adicionar Produto           |");
		System.out.println(" |        [3]  -  Atualizar Produto           |");
		System.out.println(" |        [4]  -  Buscar produto              |");
		System.out.println(" |        [5]  -  Remover Produto             |");
		System.out.println(" |                                            |");
		System.out.println(" |        [0]  -  Encerrar Programa           |");
		System.out.println(" |                                            |");
		System.out.println(" +--------------------------------------------+");
		opcao = sc.nextInt();
		
		switch(opcao) {
		case 1->{
			System.out.println("\nCatálogo: \n\n");
			
		}
		case 2->{
			System.out.println("\nAdicionar Produto: \n");
			
		}
		case 3->{
			System.out.println("\nAtualizar Produto: \n");
			
		}
		case 4->{
			System.out.println("\nBuscar Produto: \n");
		}
		case 5->{
			System.out.println("\nRemover Produto: \n");
		}
		case 0->{
			sobre();
			System.out.println("\nPrograma encerrado!");
			
		}
		default ->{
			System.out.println("Opção Inválida! Digite alguma das seguintes opções: \n\n");
		}
		}
		}while(opcao!=0);

	}
	public static void sobre() {
		System.out.println("\n\nTendTudo - O lugar onde você encontra tudo que precisa!\n\n");
		System.out.println("Projeto desenvolvido por: Caique Gomes                         ");
		System.out.println("Contato: cttcaiquegomes@gmail.com                              ");
		System.out.println("GitHub: https://github.com/Caiqe                               ");
	}

}
