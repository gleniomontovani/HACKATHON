package br.com.postech.hackathon.service;

import br.com.postech.hackathon.domain.model.request.AgendamentoRequest;
import br.com.postech.hackathon.domain.model.response.AgendamentoResponse;

public interface AgendamentoService {

	public AgendamentoResponse cadastrarAgendamento(AgendamentoRequest agendamento);
	
	public AgendamentoResponse aceitarConsulta(Long agendamentoId, String crm, String status);
}
