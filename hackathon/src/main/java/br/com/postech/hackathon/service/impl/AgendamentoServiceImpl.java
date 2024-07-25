package br.com.postech.hackathon.service.impl;

import org.springframework.stereotype.Service;

import br.com.postech.hackathon.domain.model.request.AgendamentoRequest;
import br.com.postech.hackathon.domain.model.response.AgendamentoResponse;
import br.com.postech.hackathon.service.AgendamentoService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AgendamentoServiceImpl implements AgendamentoService{

	@Override
	public AgendamentoResponse cadastrarAgendamento(AgendamentoRequest agendamento) {
		// TODO Auto-generated method stub	
		return null;
	}

	@Override
	public void aceitarConsulta(Long agendamentoId, String crm, String status) {
		// TODO Auto-generated method stub		
	}

}
