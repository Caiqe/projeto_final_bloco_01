package repository;

import model.Produto;

public interface ProdutoRepository {

	void buscarProdutoPorCodigo(int codigo);

	void mostrarCatalogo();

	void adicionarProduto(Produto produto);

	void atualizarProduto(Produto produto);

	void removerProduto(int codigo);

}
