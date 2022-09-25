package br.com.financeiro.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.financeiro.model.Pessoa;

@Service
public class PessoaService {
	
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PessoaService.class.getName());
	
	public Pessoa BuscarPorId(String id) {
		
		logger.info("Buscando uma pessoa!");
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setId(counter.incrementAndGet());
		pessoa.setPrimeiroNome("Alex");
		pessoa.setUltimoNome("Resende");
		pessoa.setEndereco("Estrada de quatis, 111");
		pessoa.setSexo("Masculino");
		
		return pessoa;
	}
	
	public List<Pessoa> BuscarTodos() {
		
		logger.info("Buscando todas as pessoas!");
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		for (int i = 0; i < 8; i++) {
			Pessoa pessoa = mockPessoa(i);
			pessoas.add(pessoa);
		}
		
		return pessoas;
		
	}
	
	public Pessoa Incluir(Pessoa pessoa) {
		
		logger.info("Incluíndo uma pessoa!");
		
		return pessoa;
	}
	
	public Pessoa Atualizar(Pessoa pessoa) {
		
		logger.info("Atualizando uma pessoa!");
		
		return pessoa;
	}
	
	public Boolean Deletar(String id) {
		
		logger.info("Deleteando uma pessoa!");
		
		return true;
	}

	private Pessoa mockPessoa(int i) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setId(counter.incrementAndGet());
		pessoa.setPrimeiroNome("Primeiro nome " + i);
		pessoa.setUltimoNome("Último nome " + i);
		pessoa.setEndereco("Endereço " + i);
		pessoa.setSexo("Sexo " + i);
		
		return pessoa;
	}

}
