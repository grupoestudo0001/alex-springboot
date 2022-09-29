package br.com.financeiro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.financeiro.data.vo.v1.SetorVO;
import br.com.financeiro.services.SetorService;
import br.com.financeiro.util.MediaType;

@RestController
@RequestMapping("/setor")
public class SetorController {

	@Autowired
	private SetorService service;

	@GetMapping(value = "/{id}",
			produces = MediaType.APPLICATION_JSON)
	public SetorVO BuscarPorId(@PathVariable(value = "id") Long id) {
		return service.BuscarPorId(id);
	}

	@GetMapping(produces = {
							MediaType.APPLICATION_JSON,
							MediaType.APPLICATION_YML,
							MediaType.APPLICATION_XML
							})
	public List<SetorVO> BuscarTodos() {
		return service.BuscarTodos();
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON,
			produces = MediaType.APPLICATION_JSON)
	public SetorVO Incluir(@RequestBody SetorVO setor) {
		return service.Incluir(setor);
	}

	@PutMapping(consumes = MediaType.APPLICATION_JSON,
			produces = MediaType.APPLICATION_JSON)
	public SetorVO Atualizar(@RequestBody SetorVO setor) {
		return service.Atualizar(setor);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> Deletar(@PathVariable(value = "id") Long id) {
		service.Deletar(id);
		return ResponseEntity.noContent().build();
	}
}
