package loja.virtual;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import loja.virtual.controller.AcessoController;
import loja.virtual.model.Acesso;

@SpringBootTest(classes = LojaVirtualApplication.class)
class LojaVirtualApplicationTests {


	@SuppressWarnings("unused")
	@Autowired
	private AcessoController acessoController;
	
	@Test
	public void testeCadastraAcesso() {
		
		Acesso acesso = new Acesso();
		
		acesso.setDescricao("ROLE_ADMIN");
		
		acessoController.SalvarAcesso(acesso);
	}

}
