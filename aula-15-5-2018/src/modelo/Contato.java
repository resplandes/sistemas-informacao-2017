/*
 * Classe que representa o contato
 * */
package modelo;

public class Contato {
	private String contato;
	private String telefone;
	private String email;
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//Metodo que faz imprimir um objeto em string sem precisar converter
	@Override
	public String toString() {
		return "Contato [contato=" + contato + ", telefone=" + telefone + ", email=" + email + "]";
	}
	
	//Metodo reponsavel por procurar um contato por nome - (� criado automatico)
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contato == null) ? 0 : contato.hashCode());
		return result;
	}
	//Metodo reponsavel por procurar um contato por nome - (� criado automatico)
	@Override//@Override significa sobreescrito
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (contato == null) {
			if (other.contato != null)
				return false;
		} else if (!contato.equals(other.contato))
			return false;
		return true;
	}

	
		
}
