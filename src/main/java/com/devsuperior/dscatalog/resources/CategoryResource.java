package com.devsuperior.dscatalog.resources;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalog.entities.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	/*
	 * 
	 * Resource = recursos: são implementados pelos controladores
	 * @RestController = indica que essa classe é uma controladora
	 * Transforma a classe em um recurso REST...
	 * 
	 * 
	 * @RequestMapping: mapeia a sua rota
	 * 
	 * endpoint = são as rotas dentro do recurso
	 * 
	 * */
		
	@GetMapping
	public ResponseEntity<List <Category>> findAll(){
		List<Category> list = new ArrayList<>();
		list.add(new Category(1L, "Livros"));
		list.add(new Category(2L, "Eletronico"));
		return ResponseEntity.ok().body(list);
	}
	

}
