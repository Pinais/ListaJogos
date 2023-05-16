package com.gg.listaJogos.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gg.listaJogos.dto.ListaJogosDTO;
import com.gg.listaJogos.entities.ListaJogos;
import com.gg.listaJogos.repositories.ListaJogosRepository;

@Service
public class ListaJogosService {
	
	@Autowired
	private ListaJogosRepository ListaJogosRepository;
	
	public List<ListaJogosDTO> findAll(){
		List<ListaJogos> listaJogos = ListaJogosRepository.findAll();
		List<ListaJogosDTO> listaJogosDTO = new ArrayList<ListaJogosDTO>();
		for(ListaJogos jogo : listaJogos) {
			listaJogosDTO.add(new ListaJogosDTO(jogo));
		}
		return listaJogosDTO;
	}

}
