package com.gg.listaJogos.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gg.listaJogos.dto.JogoMinDTO;
import com.gg.listaJogos.entities.Jogo;
import com.gg.listaJogos.repositories.JogoRepository;

@Service
public class JogoService {
	
	@Autowired
	private JogoRepository jogoRepository;
	
	public List<JogoMinDTO> findAll(){
		List<Jogo> listaJogos = jogoRepository.findAll();
		List<JogoMinDTO> listaMinJogos = new ArrayList<JogoMinDTO>();
		for(Jogo jogo : listaJogos) {
			listaMinJogos.add(new JogoMinDTO(jogo));
		}
		return listaMinJogos;
	}
}
