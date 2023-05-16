package com.gg.listaJogos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gg.listaJogos.entities.ListaJogos;

public interface ListaJogosRepository extends JpaRepository<ListaJogos, Long>{
	
}
