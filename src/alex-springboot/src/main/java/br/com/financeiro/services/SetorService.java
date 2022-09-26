package br.com.financeiro.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.financeiro.exceptions.ResourceNotFoundException;
import br.com.financeiro.model.Setor;
import br.com.financeiro.repositories.SetorRepository;

@Service
public class SetorService {

	private Logger logger = Logger.getLogger(SetorService.class.getName());
	
	@Autowired
	SetorRepository repository;
	
	public Setor BuscarPorId(Long id) {
		
		logger.info("Buscando um setor!");
				
		return repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Setor não encontrado com o Id!"));
	}
	
	public List<Setor> BuscarTodos() {
		
		logger.info("Buscando todos os setores!");
		
		return repository.findAll();
		
	}
	
	public Setor Incluir(Setor setor) {
		
		logger.info("Incluíndo um setor!");
		
		return repository.save(setor);
	}
	
	public Setor Atualizar(Setor setor) {
		
		logger.info("Atualizando um setor!");
		
		Setor entity = repository.findById(setor.getId())
							.orElseThrow(() -> new ResourceNotFoundException("Setor não encontrado com o Id!"));
		
		entity.setDescricao(setor.getDescricao());
		entity.setInativo(setor.getInativo());
		
		return repository.save(setor);
	}
	
	public void Deletar(Long id) {
		
		logger.info("Deleteando um setor!");
		
		Setor entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Setor não encontrado com o Id!"));
				
		repository.delete(entity);
	}

}
