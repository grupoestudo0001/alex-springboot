package br.com.financeiro;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.financeiro.exceptions.OperacaoMatematicaNaoSuportadaException;
import br.com.financeiro.util.ConverterNumero;

@RestController
public class CalculadoraController {
	
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value = "/somar/{numero1}/{numero2}", method=RequestMethod.GET)
	public Double somar(
			@PathVariable(value = "numero1") String numero1,
			@PathVariable(value = "numero2") String numero2
		) throws Exception {
		
		return ConverterNumero.converteToDouble(numero1) + ConverterNumero.converteToDouble(numero2);
	}
	
	@RequestMapping(value = "/subtrair/{numero1}/{numero2}", method=RequestMethod.GET)
	public Double subtrair(
			@PathVariable(value = "numero1") String numero1,
			@PathVariable(value = "numero2") String numero2
		) throws Exception {
				
		return ConverterNumero.converteToDouble(numero1) - ConverterNumero.converteToDouble(numero2);
	}
	
	@RequestMapping(value = "/multiplicar/{numero1}/{numero2}", method=RequestMethod.GET)
	public Double multiplicar(
			@PathVariable(value = "numero1") String numero1,
			@PathVariable(value = "numero2") String numero2
		) throws Exception {
				
		return ConverterNumero.converteToDouble(numero1) * ConverterNumero.converteToDouble(numero2);
	}
	
	@RequestMapping(value = "/dividir/{numero1}/{numero2}", method=RequestMethod.GET)
	public Double dividir(
			@PathVariable(value = "numero1") String numero1,
			@PathVariable(value = "numero2") String numero2
		) throws Exception {
				
		return ConverterNumero.converteToDouble(numero1) / ConverterNumero.converteToDouble(numero2);
	}
	
	@RequestMapping(value = "/media/{numero1}/{numero2}", method=RequestMethod.GET)
	public Double media(
			@PathVariable(value = "numero1") String numero1,
			@PathVariable(value = "numero2") String numero2
		) throws Exception {
				
		return (ConverterNumero.converteToDouble(numero1) + ConverterNumero.converteToDouble(numero2)) / 2;
	}
	
	@RequestMapping(value = "/raizQuadrada/{numero}", method=RequestMethod.GET)
	public Double raizQuadrada(
			@PathVariable(value = "numero") String numero
		) throws Exception {
				
		return Math.sqrt(ConverterNumero.converteToDouble(numero));
	}

}
