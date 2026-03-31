package loja.virtual.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import loja.virtual.model.Acesso;
import loja.virtual.repository.AcessoRepository;

@Service
public class AcessoService {
	
	@Autowired
	private AcessoRepository acessoRepository;
	
	public Acesso save(Acesso acesso) {
		
		/*Aqui fazemos qualquer tipo de validaçap*/
		
		return acessoRepository.save(acesso);
		
	}

}
