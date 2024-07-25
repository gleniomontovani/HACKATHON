package br.com.postech.hackathon.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.postech.hackathon.domain.model.response.MedicoResponse;
import br.com.postech.hackathon.service.MedicoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/medicos")
@RequiredArgsConstructor
public class MedicoController {
	
	private final MedicoService medicoService;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON)
	public ResponseEntity<List<MedicoResponse>> buscarMedico(String especialidade, BigDecimal avaliacao) {
		return new ResponseEntity<>(medicoService.buscarMedico(especialidade, avaliacao), HttpStatus.OK);
	}
}
