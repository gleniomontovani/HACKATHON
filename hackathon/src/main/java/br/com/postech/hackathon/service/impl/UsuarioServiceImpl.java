package br.com.postech.hackathon.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import br.com.postech.hackathon.configuration.ModelMapperConfiguration;
import br.com.postech.hackathon.domain.entity.Usuario;
import br.com.postech.hackathon.domain.model.response.UsuarioResponse;
import br.com.postech.hackathon.repository.UsuarioRepository;
import br.com.postech.hackathon.service.UsuarioService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService{
	private static final ModelMapper MAPPER = ModelMapperConfiguration.getModelMapper();
	private final UsuarioRepository repository;	
	
	@Override
	public UsuarioResponse login(String type, String login, String senha) {
		Usuario usuario = repository.findByTipoAndSenha(type, senha);
		return MAPPER.map(usuario, UsuarioResponse.class);
	}

}
