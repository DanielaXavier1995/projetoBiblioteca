package aplicacao;

public class Menu extends Biblioteca{

	//Atributos
	  int op;
		
	//construtores
	  public Menu() {
	  }
		
	//métodos
	  public void menu (int op) {
		  
			System.out.println("*========== MENU BIBLIOTECA ==========*");
			System.out.println("| 1 - Cadastrar                       |");
			System.out.println("| 2 - Pesquisar Livro por ISBN        |");
			System.out.println("| 3 - Pesquisar Livro por Titulo      |");
			System.out.println("| 4 - Pesquisar Livro por Autor       |");
			System.out.println("| 5 - Remover Livro por Titulo        |");
			System.out.println("| 6 - Remover Livro por Autor         |");
			System.out.println("| 7 - Listar Livros                   |");
			System.out.println("| 8 - Atualizar Livro                 |");
			System.out.println("| 9 - Acompanhamento leitura          |");
			System.out.println("| 10 - Exibir Menu                    |");
			System.out.println("| 11 - Sair do Menu                   |");
		
			do {
			
			System.out.println();
			System.out.println("*==================================*");
			System.out.println("Digite a opção desejada do MENU: ");
			System.out.print("-> ");
			op = scanner(0);
			System.out.println("*==================================*");
			
			switch (op) {
			
			case 1:
				if(getNome() == null) {
				cadastrarBiblioteca();
				}
				cadastrarLivros();
				break;
			
			case 2:
				try {
				pesquisarISBN();
				} catch (RuntimeException e){
					System.out.println(e.getMessage());
				}
				break;
			
			case 3:
				try {
				pesquisarTitulo();
				} catch (RuntimeException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 4:
				try {
				pesquisarAutor();
				} catch (RuntimeException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 5:
				try {
				removerTitulo();
				} catch (RuntimeException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 6:
				try {
				removerAutor();
				} catch (RuntimeException e) {
					System.out.println(e.getMessage());
				}
				break;
			
			case 7:
				try {
				listarLivros();
				} catch (RuntimeException e){
					System.out.println(e.getMessage());
				}
				break;
			
			case 8:
				try {
				atualizarLivros();
				} catch (RuntimeException e){
					System.out.println(e.getMessage());
				}
				break;
				
			case 9:
				try {
				leitura();
				} catch (RuntimeException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 10:
				 System.out.println("BEM VINDO A BIBLIOTECA");
				 System.out.println("*=============== MENU ================*");
				 System.out.println("| 1 - Cadastrar Livros                |");
				 System.out.println("| 2 - Pesquisar Livro por ISBN        |");
				 System.out.println("| 3 - Pesquisar Livro por Titulo      |");
				 System.out.println("| 4 - Pesquisar Livro por Autor       |");
				 System.out.println("| 5 - Remover Livro por Titulo        |");
				 System.out.println("| 6 - Remover Livro por Autor         |");
				 System.out.println("| 7 - Listar Livros                   |");
				 System.out.println("| 8 - Atualizar Livro                 |");
				 System.out.println("| 9 - Acompanhamento leitura          |");
				 System.out.println("| 10 - Exibir Menu                    |");
				 System.out.println("| 11 - Sair do Menu                   |");
				 break;
			
			case 11:
				System.out.println("SAINDO DO MENU!!");
				break;
				
			default:
				System.out.println("Opção errada!! Tente novamente!");
				break;
			
			}
			} while(op != 11);
	  }
}
