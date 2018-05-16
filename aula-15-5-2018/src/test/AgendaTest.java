/*
 * Classe  que representa um Testador de Agenda
 * */
package test;

import modelo.Agenda;

public class AgendaTest {
	public static void main(String[] args) {
		Agenda agenda = new Agenda();	
		System.out.println("Iniciando processo...");
		agenda.add("Willian","willianresplandes@gmail.com","66999716730");
		agenda.add("Marcio","123@gmail.com","123");
		agenda.add("Atilio","12312@gmail.com","123");
		agenda.add("Matheus","123@gmail.com","as");
		agenda.add("Juan","mcdonjuan@gmail.com","123");
		
		System.out.println("Imprimindo...");
		agenda.imprimir();
		
		System.out.println("Removendo...");
		agenda.remove("Marcio");
		
		System.out.println("Imprimindo...");
		agenda.imprimir();
		
		System.out.println("Alterando...");
		agenda.alterar("Willian", "Lindão", "email@email.com.br", "123");
		
		agenda.imprimir();
	}
}
