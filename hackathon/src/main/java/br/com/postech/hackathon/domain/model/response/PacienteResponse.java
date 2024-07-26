package br.com.postech.hackathon.domain.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PacienteResponse {

	private Long id;
	private UsuarioResponse usuario;
	private String nome;
	private String email;
	private String cpf;
}
