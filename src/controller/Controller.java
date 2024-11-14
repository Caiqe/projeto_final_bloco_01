package controller;

import java.util.ArrayList;
import java.util.List;

import model.Produto;
import repository.ProdutoRepository;

public class Controller implements ProdutoRepository {

	List<Produto> produtos = new ArrayList<Produto>();

	@Override
	public void buscarProdutoPorCodigo(int codigo) {
		var produto = buscarNaCollection(codigo);

		if (produto != null) {
			produto.mostrarProduto();
		} else {
			System.out.println("\nO Produto com código: " + codigo + " não foi encontrado!");
		}

	}

	@Override
	public void mostrarCatalogo() {
		for (Produto produto : produtos) {
			produto.mostrarProduto();
		}

	}

	@Override
	public void adicionarProduto(Produto produto) {

		produtos.add(produto);

	}

	@Override
	public void atualizarProduto(Produto produto) {
		int codigo = produto.getCodigo();
		
		int index = produtos.indexOf(buscarNaCollection(codigo));

		produtos.set(index, produto);

	}

	@Override
	public void removerProduto(int codigo) {
		var produto = buscarNaCollection(codigo);
		if (produto != null) {
			produtos.remove(produto);
			System.out.println("\nProduto removido!");
		} else {
			System.out.println("\nO Produto com código: " + codigo + " não foi encontrado!");
		}
	}

	public Produto buscarNaCollection(int numero) {
		for (var produto : produtos) {
			if (produto.getCodigo() == numero) {
				return produto;
			}
		}
		return null;
	}

}
