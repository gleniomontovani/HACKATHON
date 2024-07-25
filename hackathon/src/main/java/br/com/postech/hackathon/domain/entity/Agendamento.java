package br.com.postech.hackathon.domain.entity;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Document(collection = "agendamento")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Agendamento {

	private Long id;
	private Paciente paciente;
	private Medico medico;
	private LocalDateTime dataAgendamento;
	private String statusMedico;
	private String statusPaciente;
	private String justificativaCancelamento;
}
