package com.devsuperior.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dscatalog.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	/*Deve conter apenas as operações de acesso ao banco de dados
	 * 
	 * É a parte que realizar as operações Salvar, excluir, atualizar, buscar
	 * */
	
	

}
