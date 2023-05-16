package com.gg.listaJogos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gg.listaJogos.dto.JogoMinDTO;
import com.gg.listaJogos.dto.ListaJogosDTO;
import com.gg.listaJogos.services.JogoService;
import com.gg.listaJogos.services.ListaJogosService;

@RestController
@RequestMapping(value = "/listas")
public class ListaJogosController {
	
	@Autowired
	private ListaJogosService listaJogosService;
	@Autowired
	private JogoService jogoService;
	
	@GetMapping
	public List<ListaJogosDTO> findAll(){
		List<ListaJogosDTO> resultado= listaJogosService.findAll();
		return resultado;
	}
	
	@GetMapping(value = "/{idLista}/jogos")
	public List<JogoMinDTO> findByList(@PathVariable Long idLista){
		List<JogoMinDTO> listaMinJogos= jogoService.findByList(idLista);
		return listaMinJogos;
	}
	
}
