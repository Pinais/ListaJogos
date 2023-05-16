package com.gg.listaJogos.dto.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ErrorException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ErrorException(String mensagem) {
		super(mensagem);
	}
		
}
