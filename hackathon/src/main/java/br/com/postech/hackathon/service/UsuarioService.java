package br.com.postech.hackathon.service;

import br.com.postech.hackathon.domain.model.response.UsuarioResponse;

public interface UsuarioService {

	public UsuarioResponse login(String type, String login, String senha);
}
