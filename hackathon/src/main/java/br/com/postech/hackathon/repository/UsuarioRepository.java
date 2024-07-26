package br.com.postech.hackathon.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.postech.hackathon.domain.entity.Usuario;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, Long>{

	Usuario findByTipoAndSenha(String tipo, String senha);
}
