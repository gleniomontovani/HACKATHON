package br.com.postech.hackathon.service;

import java.math.BigDecimal;
import java.util.List;

import br.com.postech.hackathon.domain.model.response.MedicoResponse;

public interface MedicoService {

	public List<MedicoResponse> buscarMedico(String especialidade, BigDecimal avaliacao);
}
