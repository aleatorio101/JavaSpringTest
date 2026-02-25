package com.lds.scola.repositorys;

import com.lds.scola.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository <AlunoModel, Long> {
}
