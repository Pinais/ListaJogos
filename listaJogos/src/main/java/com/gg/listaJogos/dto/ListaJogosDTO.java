package com.gg.listaJogos.dto;

import com.gg.listaJogos.entities.ListaJogos;

public class ListaJogosDTO {
	private Long id;
	private String nome;
	
	public ListaJogosDTO(){
		
	}
	public ListaJogosDTO(ListaJogos lista){
		this.id = lista.getId();
		this.nome = lista.getNome();		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
