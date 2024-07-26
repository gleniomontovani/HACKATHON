package br.com.postech.hackathon.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import br.com.postech.hackathon.configuration.ModelMapperConfiguration;
import br.com.postech.hackathon.domain.entity.Medico;
import br.com.postech.hackathon.domain.model.response.MedicoResponse;
import br.com.postech.hackathon.repository.MedicoRepository;
import br.com.postech.hackathon.service.MedicoService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MedicoServiceImpl implements MedicoService{
	private static final ModelMapper MAPPER = ModelMapperConfiguration.getModelMapper();
	private final MedicoRepository repository;
	
	@Override
	public List<MedicoResponse> buscarMedico(String especialidade, BigDecimal avaliacao) {
		List<Medico> lista = repository.findByEspecialidadeAndAvaliacao(especialidade, avaliacao);
		
		return MAPPER.map(lista, new TypeToken<List<MedicoResponse>>() {}.getType());
	}
}
