package br.com.estabulo.repository;

import br.com.estabulo.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AlunoDAO extends PagingAndSortingRepository<Aluno, Long> {

}
