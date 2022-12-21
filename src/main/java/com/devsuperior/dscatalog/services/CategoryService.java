package com.devsuperior.dscatalog.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dscatalog.dto.CategoryDTO;
import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.repositories.CategoryRepository;
import com.devsuperior.dscatalog.services.exceptions.ResourceNotFoundException;

@Service
public class CategoryService {
	
	/*Responsável por realizar o serviço solicitado pelo usuário
	 * A lógica de negocio do sistema
	 * Calcular, Buscar determina usuário
	 * @Transactional garante transação com banco de dados, garante que será executado na camada de serviço
	 *  readOnly = true não da locking no banco de dados, garantindo mais performance
	 *  */

	@Autowired
	private CategoryRepository repository;
	
	@Transactional(readOnly = true)
	public List<CategoryDTO> findAll(){
		//recuperei as categoria do banco e joguei na em list
		List<Category> list = repository.findAll();		
		
		//conversando category em categoryDTO		
		return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
		
	}

	@Transactional(readOnly = true)
	public CategoryDTO findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		Category entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found - executando excessão"));
		return new CategoryDTO(entity);
	}

	@Transactional
	public CategoryDTO insert(CategoryDTO dto) {
		Category entity = new Category();
		entity.setName(dto.getName());
		repository.save(entity);
		return new CategoryDTO(entity);
		
		
	}

	@Transactional
	public CategoryDTO update(Long id, CategoryDTO dto) {
		try {
		Category entity = repository.getOne(id);
		entity.setName(dto.getName());
		entity = repository.save(entity);
		return new CategoryDTO(entity);
		}
		catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException("id not found" + id);
		}		
	}
	
	
	
	
	
}
