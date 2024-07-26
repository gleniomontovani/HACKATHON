package br.com.postech.hackathon.domain.model.response;

import java.math.BigDecimal;

import br.com.postech.hackathon.domain.entity.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MedicoResponse {

	private Long id;
	private Usuario usuario;
	private String nome;
	private String especialidade;
	private String crm;
	private BigDecimal avaliacao;
}
