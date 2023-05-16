package com.gg.listaJogos.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gg.listaJogos.dto.JogoDTO;
import com.gg.listaJogos.dto.JogoMinDTO;
import com.gg.listaJogos.dto.error.ErrorException;
import com.gg.listaJogos.entities.Jogo;
import com.gg.listaJogos.repositories.JogoRepository;


@Service
public class JogoService {
	
	@Autowired
	private JogoRepository jogoRepository;
	@Transactional(readOnly = true)
	public List<JogoMinDTO> findAll(){
		List<Jogo> listaJogos = jogoRepository.findAll();
		List<JogoMinDTO> listaMinJogos = new ArrayList<JogoMinDTO>();
		for(Jogo jogo : listaJogos) {
			listaMinJogos.add(new JogoMinDTO(jogo));
		}
		return listaMinJogos;
	}
	
	@Transactional(readOnly = true)
	public JogoDTO findById(Long id) {
		Jogo resultado = jogoRepository.findById(id).orElse(null);
		if(resultado == null) {
			throw new ErrorException("Jogo não encontrado.");
		}
		
		JogoDTO dto = new JogoDTO(resultado);
		return dto;
	}
}
