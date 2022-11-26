package br.com.estabulo.repository;

import br.com.estabulo.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoDAO extends JpaRepository<Aluno, Long> {

}
