package com.produtos.controller;

import com.produtos.model.Produto;
import com.produtos.repository.IProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/produtos")
public class ProdutoResource {

    @Autowired
    IProdutoRepository produtoRepository;

    @GetMapping("")
    public List<Produto> get(){
        return produtoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Produto get(@PathVariable(value = "id") long id){
        return produtoRepository.findById(id);
    }

    @PostMapping("")
    public Produto post(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(value = "id") long id){
        produtoRepository.deleteById(id);
    }

    @PutMapping("")
    public Produto put(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }
}
