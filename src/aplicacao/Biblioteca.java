package aplicacao;

import java.util.ArrayList;

public class Biblioteca extends Livros {
	//Atributos
	private String nome;
	private String endereco;
	private String capacidade;
	
	//construtores
	
	public Biblioteca() {
	
	}
	
	public Biblioteca(int codigo, String titulo, String autor, String codigoISBN, int numeroPaginas, Double valorLivro,
			String edicao, String volume, String secao) {
		super(codigo, titulo, autor, codigoISBN, numeroPaginas, valorLivro, 
			  edicao, volume, secao);
	}
	
	public Biblioteca(String nome, String endereco, String capacidade) {
		this.nome = nome;
		this.endereco = endereco;
		this.capacidade = capacidade;
	}
	
	//Métodos acessores
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
	
	//Métodos especiais
	
	//Método para cadastro da biblioteca
	public void cadastrarBiblioteca() {
		
		System.out.println();
		System.out.println("*========== CADASTRO DE BIBLIOTECA ==========*");
		System.out.print(" -> nome: "); 
		setNome(scanner());
		System.out.print(" -> Endereço: ");
		setEndereco(scanner());
		System.out.print(" -> Capacidade: ");
		setCapacidade(scanner());
		
		System.out.println(toString()); 
	}

	public String toString() {
		return     "\n*===================================*" +
		           "\n => BEM-VINDO A BIBLIOTECA " + getNome().toUpperCase() +
	               "\n => ENDEREÇO: " + getEndereco().toUpperCase() +
	               "\n => CAPACIDADE: " + getCapacidade().toUpperCase() +
	               "\n*===================================*";
	}
}
