package com.gg.listaJogos.dto;

import com.gg.listaJogos.entities.Jogo;

public class JogoMinDTO {
	private Long id;
	private String titulo;
	private Integer ano;
	private String imgUrl;
	private String descricaoCurta;
	
	public JogoMinDTO(Jogo entidade) {
		this.id = entidade.getId();
		this.titulo = entidade.getTitulo();
		this.ano = entidade.getAno();
		this.imgUrl = entidade.getImgUrl();
		this.descricaoCurta = entidade.getDescricaoCurta();
	}
	
	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getDescricaoCurta() {
		return descricaoCurta;
	}

	public JogoMinDTO() {
		
	}
	
}