package br.com.financeiro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@GetMapping(value = "/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Setor BuscarPorId(@PathVariable(value = "id") Long id) {
		return service.BuscarPorId(id);
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Setor> BuscarTodos() {
		return service.BuscarTodos();
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Setor Incluir(@RequestBody Setor setor) {
		return service.Incluir(setor);
	}

	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Setor Atualizar(@RequestBody Setor setor) {
		return service.Atualizar(setor);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> Deletar(@PathVariable(value = "id") Long id) {
		service.Deletar(id);
		return ResponseEntity.noContent().build();
	}
}
