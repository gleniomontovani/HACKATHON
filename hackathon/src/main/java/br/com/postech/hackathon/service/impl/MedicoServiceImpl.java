package br.com.postech.hackathon.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.postech.hackathon.domain.model.response.MedicoResponse;
import br.com.postech.hackathon.service.MedicoService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MedicoServiceImpl implements MedicoService{

	@Override
	public List<MedicoResponse> buscarMedico(String especialidade, BigDecimal avaliacao) {
		// TODO Auto-generated method stub	
		return null;
	}

}
