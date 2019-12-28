package com.produtos.repository;

import com.produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProdutoRepository extends JpaRepository<Produto, Long> {
}
