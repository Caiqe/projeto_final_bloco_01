package model;

public class Roupa extends Produto {

	private char tamanho;
	private String cor;

	public Roupa(int codigo, String nome, float preco, char tamanho, String cor) {
		super(codigo, nome, preco);
		this.tamanho = tamanho;
		this.cor = cor;
	}

	public char getTamanho() {
		return tamanho;
	}

	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public void mostrarProduto() {
		super.mostrarProduto();
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Cor: " + this.cor);
		System.out.println();
	}

}
