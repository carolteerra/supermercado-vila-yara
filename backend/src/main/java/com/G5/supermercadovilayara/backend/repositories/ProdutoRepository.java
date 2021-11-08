package com.G5.supermercadovilayara.backend.repositories;

import org.springframework.data.repository.CrudRepository;
import com.G5.supermercadovilayara.backend.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto,Long> {

    Object findAllById();
}
