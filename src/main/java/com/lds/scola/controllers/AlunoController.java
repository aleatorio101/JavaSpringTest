package com.lds.scola.controllers;

import com.lds.scola.models.AlunoModel;
import com.lds.scola.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<AlunoModel> findAll(){
        return alunoService.findAll();
    }

    @PostMapping
    public AlunoModel criarAluno( @RequestBody AlunoModel alunoModel) {
        return alunoService.criarAluno(alunoModel);
    }

    @DeleteMapping( "/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id){
        alunoService.deletarAluno(id);
        return ResponseEntity.ok("Entidade id: " + id + " deletado com sucesso");

    }

    @GetMapping("/{id}")
    public AlunoModel findById( @PathVariable Long id){
        return alunoService.findById(id);
    }

    @PutMapping("/{id}")
    public AlunoModel atualizar(@PathVariable Long id, @RequestBody AlunoModel alunoModel){
        return alunoService.atualizarAluno(id, alunoModel);
    }
}
