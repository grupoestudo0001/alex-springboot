package br.com.financeiro;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExemploController {
	
	private static final String template = "Olá, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/exemplo")
	public Exemplo exemplo(@RequestParam(value = "name", defaultValue = "Mundo") String name) {
		return new Exemplo(counter.incrementAndGet(), String.format(template, name));
	}

}
