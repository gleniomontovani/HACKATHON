package br.com.postech.hackathon.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.postech.hackathon.domain.entity.Medico;

@Repository
public interface MedicoRepository extends MongoRepository<Medico, Long>{
	
	List<Medico> findByEspecialidadeAndAvaliacao(String especialidade, BigDecimal avaliacao);

}
