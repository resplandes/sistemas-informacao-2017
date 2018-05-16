/*
 * Classe que representa a Agenda
 * */
package modelo;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	// Lista de contatos da agenda
	List<Contato> contatos = new ArrayList<Contato>();

	/*
	 * Adiciona um contato na lista
	 * 
	 * @param nome, email, telefone
	 */
	public void add(String nome, String email, String telefone) {
		Contato contato = new Contato();
		contato.setContato(nome);
		contato.setEmail(email);
		contato.setTelefone(telefone);
		contatos.add(contato);
	}

	//Remove um objeto da listas
	public void remove(String nomeDoContato) {
		contatos.remove(get(nomeDoContato));
	}
	
	//Altera um objeto passando o nome antigo e o nome novo
	public void alterar(String nomeAntigo,String nomeNovo,String emailNovo,String foneNovo){
		remove(nomeAntigo);
		add(nomeNovo, emailNovo, foneNovo);
	}
	//Metodo que retorna um objeto por nome
	public Contato get(String nomeDoContato) {
		Contato contatoFiltro = new Contato();
		contatoFiltro.setContato(nomeDoContato);
		int posicaoDoContato=contatos.indexOf(contatoFiltro);
		return contatos.get(posicaoDoContato);
	}

	//Metodo que imprimi a lista de objetos
	public void imprimir() {
		contatos.stream().forEach(c -> {
			System.out.println(c);
		});
	}

}
