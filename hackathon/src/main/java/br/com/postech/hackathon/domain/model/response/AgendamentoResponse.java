package br.com.postech.hackathon.domain.model.response;

import java.time.LocalDateTime;

import br.com.postech.hackathon.domain.entity.Medico;
import br.com.postech.hackathon.domain.entity.Paciente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AgendamentoResponse {

	private Long id;
	private Paciente paciente;
	private Medico medico;
	private LocalDateTime dataAgendamento;
	private String statusMedico;
	private String statusPaciente;
	private String justificativaCancelamento;
}
