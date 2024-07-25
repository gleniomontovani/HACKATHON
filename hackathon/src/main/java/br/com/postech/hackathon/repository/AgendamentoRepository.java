package br.com.postech.hackathon.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.postech.hackathon.domain.entity.Agendamento;

@Repository
public interface AgendamentoRepository extends MongoRepository<Agendamento, Long>{

}
