package com.gg.listaJogos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gg.listaJogos.entities.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long>{
	
}
