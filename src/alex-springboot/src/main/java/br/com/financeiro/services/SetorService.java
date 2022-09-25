package br.com.financeiro.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.financeiro.model.Setor;

@Service
public class SetorService {

	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(SetorService.class.getName());
	
	public Setor BuscarPorId(String id) {
		
		logger.info("Buscando um setor!");
		
		Setor setor = new Setor();
		
		setor.setId(counter.incrementAndGet());
		setor.setDescricao("Bancário");
		setor.setInativo(false);
		
		return setor;
	}
	
	public List<Setor> BuscarTodos() {
		
		logger.info("Buscando todos os setores!");
		
		List<Setor> setores = new ArrayList<>();
		
		for (int i = 0; i < 8; i++) {
			Setor setor = mockSetor(i);
			setores.add(setor);
		}
		
		return setores;
		
	}
	
	public Setor Incluir(Setor setor) {
		
		logger.info("Incluíndo um setor!");
		
		return setor;
	}
	
	public Setor Atualizar(Setor setor) {
		
		logger.info("Atualizando um setor!");
		
		return setor;
	}
	
	public Boolean Deletar(String id) {
		
		logger.info("Deleteando um setor!");
		
		return true;
	}

	private Setor mockSetor(int i) {
		
		Setor setor = new Setor();
		
		setor.setId(counter.incrementAndGet());
		setor.setDescricao("Bancário" + i);
		setor.setInativo(false);
		
		return setor;
	}
}
