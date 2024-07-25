package br.com.postech.hackathon.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.postech.hackathon.domain.entity.Paciente;

@Repository
public interface PacienteRepository extends MongoRepository<Paciente, Long>{

}
