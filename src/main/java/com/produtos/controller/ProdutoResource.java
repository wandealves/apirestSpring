package com.produtos.controller;

import com.produtos.model.Produto;
import com.produtos.repository.IProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/produtos")
@Api(value = "API REST Produtos")
@CrossOrigin(origins = "*")
public class ProdutoResource {

    @Autowired
    IProdutoRepository produtoRepository;

    @GetMapping("")
    @ApiOperation(value = "Retorna lista de produtos")
    public List<Produto> get(){
        return produtoRepository.findAll();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Retorna produto por id")
    public Produto get(@PathVariable(value = "id") long id){
        return produtoRepository.findById(id);
    }

    @PostMapping("")
    @ApiOperation(value = "Inseri um produto novo")
    public Produto post(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Remove produto por id")
    public void delete(@PathVariable(value = "id") long id){
        produtoRepository.deleteById(id);
    }

    @PutMapping("")
    @ApiOperation(value = "Atualiza produto")
    public Produto put(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }
}
