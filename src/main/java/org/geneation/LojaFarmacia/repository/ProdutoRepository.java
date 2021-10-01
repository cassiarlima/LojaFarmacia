package org.geneation.LojaFarmacia.repository;

import java.util.List;

import org.geneation.LojaFarmacia.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	List<Produto> findAllByTituloContainingIgnoreCase(String titulo);

}
