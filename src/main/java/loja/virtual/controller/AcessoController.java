package loja.virtual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import loja.virtual.model.Acesso;
import loja.virtual.repository.AcessoRepository;
import loja.virtual.service.AcessoService;

@RestController
public class AcessoController {

	@Autowired
	private AcessoService acessoService;
	
	@Autowired
	private AcessoRepository acessoRepository;
	
	@ResponseBody/*Retorna o objeto para quem fez a requisição*/
	@PostMapping(value = "**/salvarAcesso")/*Mapeando a url para receber JSON*/
	public ResponseEntity<Acesso>  salvarAcesso(@RequestBody Acesso acesso) {/*Recebe o JSON e converte para Objeto*/

		Acesso acessoSalvo = acessoService.save(acesso);
		
		return new ResponseEntity<Acesso>(acessoSalvo, HttpStatus.OK);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@ResponseBody/*Retorna o objeto para quem fez a requisição*/
	@PostMapping(value = "**/deleteAcesso")/*Mapeando a url para receber JSON*/
	public ResponseEntity<Acesso>  deleteAcesso(@RequestBody Acesso acesso) {/*Recebe o JSON e converte para Objeto*/
		
		acessoRepository.deleteById(acesso.getId());
		
		return new ResponseEntity("Acesso Removido", HttpStatus.OK);
	}
	
}
