package br.com.postech.hackathon.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import br.com.postech.hackathon.configuration.ModelMapperConfiguration;
import br.com.postech.hackathon.domain.entity.Agendamento;
import br.com.postech.hackathon.domain.model.request.AgendamentoRequest;
import br.com.postech.hackathon.domain.model.response.AgendamentoResponse;
import br.com.postech.hackathon.exception.NotFoundException;
import br.com.postech.hackathon.repository.AgendamentoRepository;
import br.com.postech.hackathon.service.AgendamentoService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AgendamentoServiceImpl implements AgendamentoService{
	private static final ModelMapper MAPPER = ModelMapperConfiguration.getModelMapper();
	private final AgendamentoRepository repository;
	
	@Override
	public AgendamentoResponse cadastrarAgendamento(AgendamentoRequest agendamento) {
		var agendamentoEntity = MAPPER.map(agendamento, Agendamento.class);
		
		agendamentoEntity = repository.save(agendamentoEntity);
		
		return MAPPER.map(agendamentoEntity, AgendamentoResponse.class);
	}

	@Override
	public AgendamentoResponse aceitarConsulta(Long agendamentoId, String crm, String status) {
		var agendamento = repository.findById(agendamentoId)
				.orElseThrow(() -> new NotFoundException("Agendamento não encontrado!"));
		
		agendamento.setStatusMedico(status);
		var agendamentoEntity = repository.save(agendamento);
		
		return MAPPER.map(agendamentoEntity, AgendamentoResponse.class);
	}

}
