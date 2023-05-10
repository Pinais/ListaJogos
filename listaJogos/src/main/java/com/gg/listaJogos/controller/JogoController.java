package com.gg.listaJogos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gg.listaJogos.dto.JogoMinDTO;
import com.gg.listaJogos.services.JogoService;

@RestController
@RequestMapping(value = "/jogos")
public class JogoController {
	
	@Autowired
	private JogoService jogoService;
	
	@GetMapping
	public List<JogoMinDTO> findAll(){
		List<JogoMinDTO> listaMinJogos= jogoService.findAll();
		return listaMinJogos;
	}
}
