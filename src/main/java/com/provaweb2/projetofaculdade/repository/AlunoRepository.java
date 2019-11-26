package com.provaweb2.projetofaculdade.repository;

import com.provaweb2.projetofaculdade.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
