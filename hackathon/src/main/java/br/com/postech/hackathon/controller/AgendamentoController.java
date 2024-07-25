package br.com.postech.hackathon.controller;

import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.postech.hackathon.domain.model.request.AgendamentoRequest;
import br.com.postech.hackathon.domain.model.response.AgendamentoResponse;
import br.com.postech.hackathon.service.AgendamentoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/agendamentos")
@RequiredArgsConstructor
public class AgendamentoController {

	private final AgendamentoService agendamentoService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON)
	public ResponseEntity<AgendamentoResponse> cadastrarAgendamento(AgendamentoRequest agendamento){
        return new ResponseEntity<>(agendamentoService.cadastrarAgendamento(agendamento), HttpStatus.CREATED);
    }
	
	public ResponseEntity<?> aceitarConsulta(Long agendamentoId, String crm, String status) {
		agendamentoService.aceitarConsulta(agendamentoId, crm, status);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
