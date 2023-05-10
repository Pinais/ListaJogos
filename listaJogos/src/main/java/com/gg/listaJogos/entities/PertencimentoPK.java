package com.gg.listaJogos.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class PertencimentoPK {
	@ManyToOne
	@JoinColumn(name = "jogo_id")
	private Jogo jogo;
	@ManyToOne
	@JoinColumn(name = "lista_id")
	private ListaJogos lista;
	
	public PertencimentoPK() {
		
	}

	public PertencimentoPK(Jogo jogo, ListaJogos lista) {
		this.jogo = jogo;
		this.lista = lista;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	public ListaJogos getLista() {
		return lista;
	}

	public void setLista(ListaJogos lista) {
		this.lista = lista;
	}

	@Override
	public int hashCode() {
		return Objects.hash(jogo, lista);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PertencimentoPK other = (PertencimentoPK) obj;
		return Objects.equals(jogo, other.jogo) && Objects.equals(lista, other.lista);
	}
	
	
}
