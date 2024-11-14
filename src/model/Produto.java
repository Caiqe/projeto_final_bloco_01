package model;

public abstract class Produto {
	private int codigo;
	private String nome;
	private float preco;
	public Produto(int codigo, String nome, float preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void mostrarProduto() {
		System.out.println("Informações do Produto:\n");
		System.out.println("Código: "+this.codigo);
		System.out.println("Nome: "+this.nome);
		System.out.println("Preço: "+this.preco);
	}

}
