package br.com.financeiro.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.financeiro.exceptions.ResourceNotFoundException;
import br.com.financeiro.util.ConverterNumero;
import br.com.financeiro.util.OperacaoMatematica;

@RestController
public class CalculadoraController {
	
	private final AtomicLong counter = new AtomicLong();
	private OperacaoMatematica operacoes = new OperacaoMatematica();
	
	@RequestMapping(value = "/somar/{numero1}/{numero2}", method=RequestMethod.GET)
	public Double somar(
			@PathVariable(value = "numero1") String numero1,
			@PathVariable(value = "numero2") String numero2
		) throws Exception {
		
		return operacoes.somar(ConverterNumero.converteToDouble(numero1), ConverterNumero.converteToDouble(numero2));
	}
	
	@RequestMapping(value = "/subtrair/{numero1}/{numero2}", method=RequestMethod.GET)
	public Double subtrair(
			@PathVariable(value = "numero1") String numero1,
			@PathVariable(value = "numero2") String numero2
		) throws Exception {
				
		return operacoes.subtrair(ConverterNumero.converteToDouble(numero1), ConverterNumero.converteToDouble(numero2));
	}
	
	@RequestMapping(value = "/multiplicar/{numero1}/{numero2}", method=RequestMethod.GET)
	public Double multiplicar(
			@PathVariable(value = "numero1") String numero1,
			@PathVariable(value = "numero2") String numero2
		) throws Exception {
				
		return operacoes.multiplicar(ConverterNumero.converteToDouble(numero1), ConverterNumero.converteToDouble(numero2));
	}
	
	@RequestMapping(value = "/dividir/{numero1}/{numero2}", method=RequestMethod.GET)
	public Double dividir(
			@PathVariable(value = "numero1") String numero1,
			@PathVariable(value = "numero2") String numero2
		) throws Exception {
				
		return operacoes.dividir(ConverterNumero.converteToDouble(numero1), ConverterNumero.converteToDouble(numero2));
	}
	
	@RequestMapping(value = "/media/{numero1}/{numero2}", method=RequestMethod.GET)
	public Double media(
			@PathVariable(value = "numero1") String numero1,
			@PathVariable(value = "numero2") String numero2
		) throws Exception {
				
		return operacoes.media(ConverterNumero.converteToDouble(numero1), ConverterNumero.converteToDouble(numero2));
	}
	
	@RequestMapping(value = "/raizQuadrada/{numero}", method=RequestMethod.GET)
	public Double raizQuadrada(
			@PathVariable(value = "numero") String numero
		) throws Exception {
				
		return operacoes.raizQuadrada(ConverterNumero.converteToDouble(numero));
	}

}
