package br.com.financeiro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.financeiro.model.Setor;
import br.com.financeiro.services.SetorService;

@RestController
@RequestMapping("/setor")
public class SetorController {

	@Autowired
	private SetorService service;
	
	@RequestMapping(value = "/{id}",
					method = RequestMethod.GET,
					produces = MediaType.APPLICATION_JSON_VALUE)
	public Setor BuscarPorId(@PathVariable(value = "id") Long id) {
		return service.BuscarPorId(id);
	}
	
	@RequestMapping(method = RequestMethod.GET,
					produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Setor> BuscarTodos() {
		return service.BuscarTodos();
	}
	
	@RequestMapping(method = RequestMethod.POST,
					consumes = MediaType.APPLICATION_JSON_VALUE,
					produces = MediaType.APPLICATION_JSON_VALUE)
	public Setor Incluir(@RequestBody Setor setor) {
		return service.Incluir(setor);
	}
	
	@RequestMapping(method = RequestMethod.PUT,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Setor Atualizar(@RequestBody Setor setor) {
		return service.Atualizar(setor);
	}
	
	@RequestMapping(value = "/{id}",
					method = RequestMethod.DELETE)
	public void Deletar(@PathVariable(value = "id") Long id) {
		service.Deletar(id);
	}
}
