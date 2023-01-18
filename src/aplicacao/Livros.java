package aplicacao;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Livros {
	//Atributos
	private static final Random GERADORCODIGO = new Random ();
	private int codigo;
	private String titulo;
	private String autor;
	private String codigoISBN;
	private int numeroPaginas;
	private Double valorLivro;
	private String edicao;
	private String volume;
	private String secao;
	private ArrayList <Livros> listaLivros = new ArrayList <> ();
	
	//construtores
	
	public Livros() {
	
	}
	
	public Livros(int codigo, String titulo, String autor, String codigoISBN, int numeroPaginas, Double valorLivro,
			String edicao, String volume, String secao) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.codigoISBN = codigoISBN;
		this.numeroPaginas = numeroPaginas;
		this.valorLivro = valorLivro;
		this.edicao = edicao;
		this.volume = volume;
		this.secao = secao;
	}
		
	//Métodos acessores
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = (GERADORCODIGO.nextInt(9999) + 10000);
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getCodigoISBN() {
		return codigoISBN;
	}
	public void setCodigoISBN(String codigoISBN) {
		this.codigoISBN = codigoISBN;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public Double getValorLivro() {
		return valorLivro;
	}
	public void setValorLivro(Double valorLivro) {
		this.valorLivro = valorLivro;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	
	public String getSecao() {
		return secao;
	}
	public void setSecao(String secao) {
		this.secao = secao;
	}

	//Métodos especiais
	
	//Métodos para entrada de dados:

	//Métodos para capturar as entradas do usuário:
	public String scanner() {
		Scanner sc = new Scanner (System.in);
		
	    String line = sc.nextLine();
		
		return line;
	}
	
	public double scanner(double line) {
		Scanner sc = new Scanner (System.in);
		
		line = sc.nextDouble();
		
		return line;
	}
	
	public int scanner(int line) {
		Scanner sc = new Scanner (System.in);
		
		line = sc.nextInt();
		
		return line;
	}
	
	//Método cadastrar:
	public void cadastrarLivros() {
	
		System.out.println();
		System.out.println("*======== CADASTRO DE LIVROS ========*");
		String resp;
		
		do {
			
			Livros l = new Livros();
			
			System.out.println();
			System.out.println("*==== Digite as informações do Livro ====*");
			l.setCodigo(0);
			System.out.print(" -> Título: "); 
			l.setTitulo(scanner());
			System.out.print(" -> Autor: ");
			l.setAutor(scanner());
			System.out.print(" -> ISBN: ");
			l.setCodigoISBN(scanner());
			System.out.print(" -> Número de páginas: ");
			l.setNumeroPaginas(scanner(0));
			System.out.print(" -> Valor do livro: ");
			l.setValorLivro(scanner(0.0));
			System.out.print(" -> Edição: ");
			l.setEdicao(scanner());
			System.out.print(" -> volume: ");
			l.setVolume(scanner());
			System.out.print(" -> Seção: ");
			l.setSecao(scanner());
			
			listaLivros.add(l);
			
			
			System.out.println("Deseja adicionar outro livro ao cadastro: (S - SIM ou N - NAO) ");
			System.out.print("->");
			resp = scanner();
			System.out.println("======================================");
			
	} while (resp.equalsIgnoreCase("s"));
 }
	
	//Método para listar todos os livros
	public void listarLivros() {
		System.out.println();
		if(listaLivros.size() > 0) {
		System.out.println("*======= LISTA DE LIVROS =======*");
		System.out.println("Quantidade: " + listaLivros.size()); 
		System.out.println("===============================");
		for(Livros l: listaLivros) {
			System.out.println(" => Código: " + l.getCodigo());
			System.out.println(" => Título: " + l.getTitulo());
			System.out.println(" => Autor: " + l.getAutor());
			System.out.println(" => ISBN: " + l.getCodigoISBN());
			System.out.println(" => Número de páginas: " + l.getNumeroPaginas());
			System.out.println(" => Valor do Livro: R$" + l.getValorLivro());
			System.out.println(" => Edição: " + l.getEdicao());
			System.out.println(" => Volume: " + l.getVolume());
			System.out.println(" => Seção: " +  l.getSecao());
			System.out.println("===============================");
		 }
		} else {
			throw new RuntimeException("Não há registros no sistema, realize o cadastro!!!");
		}
	}
	
	//Método para listar o livro em pesquisar
	public void listarLivros(int i) {
		System.out.println("===============================");
			System.out.println(" => Código: " + listaLivros.get(i).getCodigo());
			System.out.println(" =>Título: " + listaLivros.get(i).getTitulo());
			System.out.println(" => Autor: " + listaLivros.get(i).getAutor());
			System.out.println(" => ISBN: " + listaLivros.get(i).getCodigoISBN());
			System.out.println(" => Número de páginas: " + listaLivros.get(i).getNumeroPaginas());
			System.out.println(" => Valor do Livro: R$" + listaLivros.get(i).getValorLivro());
			System.out.println(" => Edição: " + listaLivros.get(i).getEdicao());
			System.out.println(" => Volume: " + listaLivros.get(i).getVolume());
			System.out.println(" => Seção: " +  listaLivros.get(i).getSecao());
			System.out.println("===============================");
	}

	//Método para pesquisar a partir do ISBN
	public void pesquisarISBN() {
		System.out.println();
		System.out.println("*===== PESQUISAR LIVROS A PARTIR DO ISBN =====*");
		System.out.println("Digite o código ISBN do livro que deseja encontrar: ");
		System.out.print("->");
		String codigo = scanner();
		System.out.println("===============================");
		
		if(listaLivros.size() > 0) {
		for(int i = 0; i < listaLivros.size(); i++) {
			if(listaLivros.get(i).getCodigoISBN().equalsIgnoreCase(codigo)) {
				listarLivros(i);
			}
		}
	} else {
		throw new RuntimeException("Não há registros no sistema!!! Realize o cadastro!!");
	}
	}
	
	
	//Método pesquisar a partir do título:
	public void pesquisarTitulo() {
		System.out.println();
		System.out.println("*===== PESQUISAR LIVROS A PARTIR DO TÍTULO =====*");
		System.out.println("Digite o Título do livro que deseja encontrar: ");
		System.out.print("->");
		String titulo = scanner();
		System.out.println("===============================");
		
		if(listaLivros.size() > 0) {
		for(int i = 0; i < listaLivros.size(); i++) {
			if(listaLivros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
				listarLivros(i);
			} 
		}
	} else {
		throw new RuntimeException("Não há registros no sistema!!! Realize o cadastro!!");
	}
	}
	
	//Remover livro a partir do título
	public void removerTitulo() {
		String resp;
		
		System.out.println();
		System.out.println("*===== REMOVER LIVROS A PARTIR DO TÍTULO =====*");
		System.out.println("Digite o Título do livro que deseja remover: ");
		System.out.print("->");
		String titulo = scanner();
		System.out.println("===============================");
		
		if(listaLivros.size() > 0) {
		do {
		for(int i = 0; i < listaLivros.size(); i++) {
			if(listaLivros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
				
				listaLivros.remove(i);
			} 
			}
		System.out.println("=====================================");
		System.out.println("Deseja remover outro livro ao cadastro: (S - SIM ou N - NAO) ");
		System.out.print("->");
		resp = scanner();
		System.out.println("=====================================");
		
       } while (resp.equalsIgnoreCase("s"));
		listarLivros();
	} else {
		throw new RuntimeException("Não há registros no sistema!!! Realize o cadastro!!");
	}
	}
	
        //Método para armazenar as informações do método atualizarLivros();
		public void atualizarLivros(int i) {
			System.out.println();
			System.out.print(" -> Título: "); listaLivros.get(i).setTitulo(scanner());
			System.out.print(" -> Autor: "); listaLivros.get(i).setAutor(scanner());
			System.out.print(" -> ISBN: ");	listaLivros.get(i).setCodigoISBN(scanner());
			System.out.print(" -> Número de páginas: "); listaLivros.get(i).setNumeroPaginas(scanner(0));
			System.out.print(" -> Valor do livro: "); listaLivros.get(i).setValorLivro(scanner(0.0));
			System.out.print(" -> Edição: "); listaLivros.get(i).setEdicao(scanner());
			System.out.print(" -> volume: "); listaLivros.get(i).setVolume(scanner());
			System.out.print(" -> Seção: "); listaLivros.get(i).setSecao(scanner());
	
			listarLivros();
	    }

		//Método atulizar a partir do título:
		public void atualizarLivros() {
			if(listaLivros.size() > 0) {
			System.out.println();
			System.out.println("*===== MENU DE ATUALIZAÇÃO =====*");
			System.out.println("1 - PELO TÍTULO");
			System.out.println("2 - PELO ISBN");
			System.out.println("Digite a opção desejada para atualizar: ");
			System.out.print("->");
			int op = scanner(0);
			System.out.println("===============================");
			
			switch (op) {
			
			case 1:
				System.out.println();
				System.out.println("*===== ATUALIZAR LIVROS A PARTIR DO TÍTULO =====*");
				System.out.println("Digite o Título do livro que deseja atualizar: ");
				System.out.print("->");
				String titulo = scanner();
				System.out.println("=================================================");
				
				for(int i = 0; i < listaLivros.size(); i++) {
					if(listaLivros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
					   atualizarLivros(i);
					}
				}
				break;
				
			case 2:
				System.out.println();
				System.out.println("*===== ATUALIZAR LIVROS A PARTIR DO ISBN =====*");
				System.out.println("Digite o ISBN do livro que deseja atualizar: ");
				System.out.print("->");
				String codigoISBN = scanner();
				System.out.println("=================================================");
				
				for(int i = 0; i < listaLivros.size(); i++) {
					if(listaLivros.get(i).getCodigoISBN().equalsIgnoreCase(codigoISBN)) {
						atualizarLivros(i);
					} 
				}
				break;
				
			default:
				System.out.println("Opção inválida!!");
				break;
			}
		} else {
			throw new RuntimeException("Não há registros no sistema, realize o cadastro!!!");
		}
		}
		
		//Método pesquisar a partir do Autor:
		public void pesquisarAutor() {
			System.out.println();
			System.out.println("*===== PESQUISAR LIVROS A PARTIR DO AUTOR =====*");
			System.out.println("Digite o Autor do livro que deseja encontrar: ");
			System.out.print("->");
			String autor = scanner();
			System.out.println("===============================");
			
			if(listaLivros.size() > 0) {
			for(int i = 0; i < listaLivros.size(); i++) {
				if(listaLivros.get(i).getAutor().equalsIgnoreCase(autor)) {
					listarLivros(i);
				} 
			}
		} else {
			throw new RuntimeException("Não há registros no sistema, realize o cadastro!!!");
		}
		}
			
		
		
		//Remover livro a partir do autor
		public void removerAutor() {
			
			if(listaLivros.size() > 0) {
            System.out.println();
			System.out.println("*===== REMOVER LIVROS A PARTIR DO AUTOR =====*");
			System.out.println("Digite o Autor do livro que deseja remover: ");
			System.out.print("->");
			String autor = scanner();
			System.out.println("===============================");
			
				    listaLivros.removeIf(listaLivros -> listaLivros.getAutor().equalsIgnoreCase(autor));
					
		} else {
			throw new RuntimeException("Não há registros no sistema, realize o cadastro!!!");
		}
		}
		
		//Método para acompanhamento de leitura
		public void leitura() {
			if(listaLivros.size() > 0) {
			System.out.println();
			System.out.println("*========= ACOMPANHAMENTO DE LEITURA =========*");
			System.out.println("Digite o título do livro que está lendo no momento: ");
			System.out.print("->");
			String titulo = scanner();
			
			System.out.println("Digite o número da página em que iniciou a leitura: ");
			System.out.print("->");
			int nInicial = scanner(0);
			
			System.out.println("Digite o número da página em que finalizou a leitura: ");
			System.out.print("->");
			int nFinal = scanner(0);
			
			double nLidas = nFinal - nInicial;
			double nRestantes;
			
			for(int i = 0; i < listaLivros.size(); i++) {
				if(listaLivros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
					nRestantes = listaLivros.get(i).getNumeroPaginas() - nLidas - nInicial;
					
					double totalDias = (nRestantes/nLidas);
					
					System.out.println("*======= Você está lendo " + listaLivros.get(i).getTitulo().toUpperCase() + " =======*");
					System.out.println(" => O Livro possui " + listaLivros.get(i).getNumeroPaginas() + " páginas!");
					System.out.println(" => Você leu " + nLidas + " páginas!");
					System.out.println(" => Restam " + nRestantes + " páginas para finalizar o livro!");
					System.out.printf("  => Se você manter esse rítmo diário terminará o livro em %.2f dias! %n", totalDias);
					System.out.println("=======================================");
				}
		}
		
    } else {
		throw new RuntimeException("Não há registros no sistema, realize o cadastro!!!");
	}
  }
}


         
	



