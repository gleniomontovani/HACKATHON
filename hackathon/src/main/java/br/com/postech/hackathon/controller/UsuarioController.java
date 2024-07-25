package br.com.postech.hackathon.controller;

import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.postech.hackathon.domain.model.response.UsuarioResponse;
import br.com.postech.hackathon.service.UsuarioService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

	private final UsuarioService usuarioService;
	
	@GetMapping(path = "/{type}/{login}/{senha}", produces = MediaType.APPLICATION_JSON)
	public ResponseEntity<UsuarioResponse> login(@PathVariable String type, @PathVariable String login, @PathVariable String senha) {
		return new ResponseEntity<>(usuarioService.login(type, login, senha), HttpStatus.OK);
	}
}
