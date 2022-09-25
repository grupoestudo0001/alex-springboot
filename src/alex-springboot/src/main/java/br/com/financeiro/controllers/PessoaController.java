package br.com.financeiro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.financeiro.model.Pessoa;
import br.com.financeiro.services.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	@Autowired
	private PessoaService service;
	
	@RequestMapping(value = "/{id}",
					method = RequestMethod.GET,
					produces = MediaType.APPLICATION_JSON_VALUE)
	public Pessoa BuscarPorId(@PathVariable(value = "id") String id) {
		return service.BuscarPorId(id);
	}
	
	@RequestMapping(method = RequestMethod.GET,
					produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pessoa> BuscarTodos() {
		return service.BuscarTodos();
	}
	
	@RequestMapping(method = RequestMethod.POST,
					consumes = MediaType.APPLICATION_JSON_VALUE,
					produces = MediaType.APPLICATION_JSON_VALUE)
	public Pessoa Incluir(@RequestBody Pessoa pessoa) {
		return service.Incluir(pessoa);
	}
	
	@RequestMapping(method = RequestMethod.PUT,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Pessoa Atualizar(@RequestBody Pessoa pessoa) {
		return service.Atualizar(pessoa);
	}
	
	@RequestMapping(value = "/{id}",
					method = RequestMethod.DELETE)
	public Boolean Deletar(@PathVariable(value = "id") String id) {
		return service.Deletar(id);
	}
}
