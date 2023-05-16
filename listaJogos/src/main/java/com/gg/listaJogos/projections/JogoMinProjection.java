package com.gg.listaJogos.projections;

public interface JogoMinProjection {

	Long getId();
	String getTitulo();
	Integer getAno();
	String getImgUrl();
	String getDescricaoCurta();
	Double getPosicao();
}
