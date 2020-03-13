package stream;

public class Produto {

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + "]";
	}

	private Integer codigo;
	private String nome;
	private Double preco;

	public Produto() {
		this.codigo = 0;
		this.nome = "";
		this.preco = 0.0;
	}

	public Produto(Integer codigo, String nome, Double preco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
