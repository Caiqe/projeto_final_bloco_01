package model;

public class Livro extends Produto {

	private String genero;
	private int numeroDePaginas;

	public Livro(int codigo, String nome, float preco, String genero, int numeroDePaginas) {
		super(codigo, nome, preco);
		this.genero = genero;
		this.numeroDePaginas = numeroDePaginas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	@Override
	public void mostrarProduto() {
		super.mostrarProduto();
		System.out.println("Gênero Textual: " + this.genero);
		System.out.println("Número de páginas: " + this.numeroDePaginas+"p");
		System.out.println();
	}

}
