package br.com.financeiro.services;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.financeiro.model.Pessoa;

@Service
public class PessoaService {
	
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PessoaService.class.getName());
	
	public Pessoa GetById(String id) {
		
		logger.info("Buscando uma pessoa");
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setId(counter.incrementAndGet());
		pessoa.setPrimeiroNome("Alex");
		pessoa.setUltimoNome("Resende");
		pessoa.setEndereco("Estrada de quatis, 111");
		pessoa.setSexo("Masculino");
		
		return pessoa;
	}

}
