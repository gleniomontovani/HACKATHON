package br.com.postech.hackathon.domain.entity;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Document(collection = "medico")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Medico {

	private Long id;
	private Usuario usuario;
	private String nome;
	private String especialidade;
	private String crm;
	private BigDecimal avaliacao;
}
