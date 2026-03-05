package com.lds.scola.services;

import com.lds.scola.models.AlunoModel;
import com.lds.scola.repositorys.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<AlunoModel> findAll() {
        return alunoRepository.findAll();
    }

    public AlunoModel criarAluno(AlunoModel alunoModel) {
        return alunoRepository.save(alunoModel);
    }

    public void deletarAluno(Long id){
        alunoRepository.deleteById(id);
    }

    public AlunoModel atualizarAluno(Long id, AlunoModel alunoModel){

        AlunoModel aluno = alunoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));

        aluno.setNome(alunoModel.getNome());
        aluno.setMatricula(alunoModel.getMatricula());

        return alunoRepository.save(aluno);
    }

    public AlunoModel findById(Long id) {
        return alunoRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Aluno não encontrado"));
    }

}
