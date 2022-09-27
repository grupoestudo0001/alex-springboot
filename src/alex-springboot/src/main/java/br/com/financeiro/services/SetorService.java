package br.com.financeiro.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.financeiro.data.vo.v1.SetorVO;
import br.com.financeiro.exceptions.ResourceNotFoundException;
import br.com.financeiro.mapper.DozerMapper;
import br.com.financeiro.model.Setor;
import br.com.financeiro.repositories.SetorRepository;

@Service
public class SetorService {

	private Logger logger = Logger.getLogger(SetorService.class.getName());
	
	@Autowired
	SetorRepository repository;
	
	public SetorVO BuscarPorId(Long id) {
		
		logger.info("Buscando um setor!");
		
		var setor = repository
						.findById(id)
						.orElseThrow(() -> new ResourceNotFoundException("Setor não encontrado com o Id!"));
		
		return DozerMapper.parseObject(setor, SetorVO.class);
		
		
	}
	
	public List<SetorVO> BuscarTodos() {
		
		logger.info("Buscando todos os setores!");
		
		return DozerMapper.parseListObjects(repository.findAll(), SetorVO.class);
		
	}
	
	public SetorVO Incluir(SetorVO setorVO) {
		
		logger.info("Incluíndo um setor!");
		
		var setor = DozerMapper.parseObject(setorVO, Setor.class);
				
		var setorSalvo = repository.save(setor);
		
		return DozerMapper.parseObject(setorSalvo, SetorVO.class);
		
	}
	
	public SetorVO Atualizar(SetorVO setorVO) {
		
		logger.info("Atualizando um setor!");
		
		var setor = repository.findById(setorVO.getId())
							.orElseThrow(() -> new ResourceNotFoundException("Setor não encontrado com o Id!"));
		
		setor.setDescricao(setorVO.getDescricao());
		setor.setInativo(setorVO.getInativo());
		
		return DozerMapper.parseObject(repository.save(setor), SetorVO.class);
	}
	
	public void Deletar(Long id) {
		
		logger.info("Deleteando um setor!");
		
		var setor = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Setor não encontrado com o Id!"));
				
		repository.delete(setor);
	}

}
