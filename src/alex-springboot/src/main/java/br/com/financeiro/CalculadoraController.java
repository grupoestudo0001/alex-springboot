package br.com.financeiro;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.financeiro.exceptions.OperacaoMatematicaNaoSuportadaException;

@RestController
public class CalculadoraController {
	
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value = "/somar/{numero1}/{numero2}", method=RequestMethod.GET)
	public Double somar(
			@PathVariable(value = "numero1") String numero1,
			@PathVariable(value = "numero2") String numero2
		) throws Exception {
		
		if (!isNumerico(numero1) || !isNumerico(numero2)) {
			throw new OperacaoMatematicaNaoSuportadaException("Por favor inserir um número.");
		}
		
		return converteToDouble(numero1) + converteToDouble(numero2);
	}
	
	@RequestMapping(value = "/subtrair/{numero1}/{numero2}", method=RequestMethod.GET)
	public Double subtrair(
			@PathVariable(value = "numero1") String numero1,
			@PathVariable(value = "numero2") String numero2
		) throws Exception {
		
		if (!isNumerico(numero1) || !isNumerico(numero2)) {
			throw new OperacaoMatematicaNaoSuportadaException("Por favor inserir um número.");
		}
		
		return converteToDouble(numero1) - converteToDouble(numero2);
	}
	
	@RequestMapping(value = "/multiplicar/{numero1}/{numero2}", method=RequestMethod.GET)
	public Double multiplicar(
			@PathVariable(value = "numero1") String numero1,
			@PathVariable(value = "numero2") String numero2
		) throws Exception {
		
		if (!isNumerico(numero1) || !isNumerico(numero2)) {
			throw new OperacaoMatematicaNaoSuportadaException("Por favor inserir um número.");
		}
		
		return converteToDouble(numero1) * converteToDouble(numero2);
	}
	
	@RequestMapping(value = "/dividir/{numero1}/{numero2}", method=RequestMethod.GET)
	public Double dividir(
			@PathVariable(value = "numero1") String numero1,
			@PathVariable(value = "numero2") String numero2
		) throws Exception {
		
		if (!isNumerico(numero1) || !isNumerico(numero2)) {
			throw new OperacaoMatematicaNaoSuportadaException("Por favor inserir um número.");
		}
		
		return converteToDouble(numero1) / converteToDouble(numero2);
	}

	private Double converteToDouble(String strNumero) {
		if (strNumero == null) return 0D;
		
		String numero = strNumero.replaceAll(",", ".");
				
		if (isNumerico(numero)) return Double.parseDouble(numero);
		
		return 0D;
	}

	private boolean isNumerico(String strNumero) {
		
		if (strNumero == null) return false;
		
		String numero = strNumero.replaceAll(",", ".");
		
		return numero.matches("[-+]?[0-9]*\\.?[0-9]+");
	}

}
