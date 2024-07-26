package br.com.postech.hackathon.domain.model.request;

import java.time.LocalDateTime;

import br.com.postech.hackathon.domain.model.response.MedicoResponse;
import br.com.postech.hackathon.domain.model.response.PacienteResponse;

public record AgendamentoRequest(Long id, PacienteResponse paciente, MedicoResponse medico, LocalDateTime dataAgendamento, 
		String statusMedico, String statusPaciente, String justificativaCancelamento) {

}
