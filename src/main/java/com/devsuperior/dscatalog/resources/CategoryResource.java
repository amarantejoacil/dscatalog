package com.devsuperior.dscatalog.resources;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalog.dto.CategoryDTO;
import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	/*
	 * 
	 * Resource = recursos São os controllers
	 * @RestController = indica que essa classe é uma controladora
	 * Transforma a classe em um recurso REST...
	 * 
	 * 
	 * @RequestMapping: mapeia a sua rota
	 * 
	 * endpoint = são as rotas dentro do recurso
	 * 
	 * Responsavél pela interação camara de serviço 	 * 
	 * */
	
	@Autowired
	private CategoryService service;
	
		
	@GetMapping
	public ResponseEntity<List <CategoryDTO>> findAll(){
		List<CategoryDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	

}
