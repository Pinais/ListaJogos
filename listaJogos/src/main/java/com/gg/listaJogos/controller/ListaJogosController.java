package com.gg.listaJogos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gg.listaJogos.dto.ListaJogosDTO;
import com.gg.listaJogos.services.ListaJogosService;

@RestController
@RequestMapping(value = "/listas")
public class ListaJogosController {
	
	@Autowired
	private ListaJogosService listaJogosService;
	
	@GetMapping
	public List<ListaJogosDTO> findAll(){
		List<ListaJogosDTO> resultado= listaJogosService.findAll();
		return resultado;
	}
	
}
