package org.geneation.LojaFarmacia.repository;

import java.util.List;

import org.geneation.LojaFarmacia.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
	
}

