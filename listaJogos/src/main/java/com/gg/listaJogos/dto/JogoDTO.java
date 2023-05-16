package com.gg.listaJogos.dto;

import org.springframework.beans.BeanUtils;

import com.gg.listaJogos.entities.Jogo;

public class JogoDTO {
	private Long id;
	private String titulo;
	private Integer ano;
	private String genero;
	private String plataforma;
	private Double pontuacao;
	private String imgUrl;
	private String descricaoLonga;
	
	public JogoDTO() {
		
	}
	public JogoDTO(Jogo entidade) {
		BeanUtils.copyProperties(entidade, this);
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
	public String getDescricaoLonga() {
		return descricaoLonga;
	}
	public void setDescricaoLonga(String descricaoLonga) {
		this.descricaoLonga = descricaoLonga;
	}
	
}
