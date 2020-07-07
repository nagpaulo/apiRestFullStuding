package br.com.studingspringboot.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.studingspringboot.project.model.entity.Servico;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Integer> {

}
