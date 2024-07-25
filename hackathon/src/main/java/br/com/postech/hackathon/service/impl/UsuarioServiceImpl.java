package br.com.postech.hackathon.service.impl;

import org.springframework.stereotype.Service;

import br.com.postech.hackathon.domain.model.response.UsuarioResponse;
import br.com.postech.hackathon.service.UsuarioService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService{

	@Override
	public UsuarioResponse login(String type, String login, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

}
