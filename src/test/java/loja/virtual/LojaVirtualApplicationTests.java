package loja.virtual;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import loja.virtual.controller.AcessoController;
import loja.virtual.model.Acesso;
import loja.virtual.repository.AcessoRepository;

@SpringBootTest(classes = LojaVirtualApplication.class)
class LojaVirtualApplicationTests extends Teste{


	@SuppressWarnings("unused")
	@Autowired
	private AcessoController acessoController;
	
	@SuppressWarnings("unused")
	@Autowired
	private AcessoRepository acessoRepository;
	
	@Test
	public void testeCadastraAcesso() {
		
		Acesso acesso = new Acesso();
		
		acesso.setDescricao("ROLE_ADMIN");
		
		acesso = acessoController.salvarAcesso(acesso).getBody();
		
		assertEquals(true, acesso.getId() > 0);
		
		//Teste para verificar se o acesso foi cadastrado com a descrição correta
		assertEquals("ROLE_ADMIN", acesso.getDescricao());
		
		
		Acesso acesso2 = acessoRepository.findById(acesso.getId()).get();
		
		assertEquals(acesso.getId(), acesso2.getId());
		
		//Crie um teste de query para verificar se o acesso foi cadastrado com a descrição correta
		
		acesso = new Acesso();
		
		acesso.setDescricao("ROLE_USER");
		
		acesso = acessoController.salvarAcesso(acesso).getBody();
		
		List<Acesso> acessos = acessoRepository.findByDescricao("ROLE_USER");
		
		assertEquals(1, acessos.size());
		
		acessoRepository.deleteById(acesso.getId());
		
	}

}
