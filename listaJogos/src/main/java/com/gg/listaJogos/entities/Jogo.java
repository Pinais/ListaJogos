package com.gg.listaJogos.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tabela_jogo")
public class Jogo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	//A palavra year é reservada, caso estivesse usando era só colocar a annotation
	//@column("novo_nome_da_coluna")
	private Integer ano;
	private String genero;
	private String plataforma;
	private Double pontuacao;
	private String imgUrl;
	@Column(columnDefinition = "TEXT")
	private String descricaoCurta;
	@Column(columnDefinition = "TEXT")
	private String descricaoLonga;
	
	public Jogo() {
		
	}

	public Jogo(Long id, String titulo, Integer ano, String genero, String plataforma, Double pontuacao, String imgUrl,
			String descricaoCurta, String descricaoLonga) {
		this.id = id;
		this.titulo = titulo;
		this.ano = ano;
		this.genero = genero;
		this.plataforma = plataforma;
		this.pontuacao = pontuacao;
		this.imgUrl = imgUrl;
		this.descricaoCurta = descricaoCurta;
		this.descricaoLonga = descricaoLonga;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public Double getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Double pontuacao) {
		this.pontuacao = pontuacao;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getDescricaoCurta() {
		return descricaoCurta;
	}

	public void setDescricaoCurta(String descricaoCurta) {
		this.descricaoCurta = descricaoCurta;
	}

	public String getDescricaoLonga() {
		return descricaoLonga;
	}

	public void setDescricaoLonga(String descricaoLonga) {
		this.descricaoLonga = descricaoLonga;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogo other = (Jogo) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
