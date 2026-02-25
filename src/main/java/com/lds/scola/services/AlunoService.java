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

    public AlunoModel atualizarAluno(AlunoModel alunoModel, Long id){

        AlunoModel pessoaModel1 = alunoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        pessoaModel1.setNome(alunoModel.getNome());
        pessoaModel1.setMatricula(alunoModel.getMatricula());
        pessoaModel1.setEndereco(alunoModel.getEndereco());

        return alunoRepository.save(alunoModel);
    }


}
