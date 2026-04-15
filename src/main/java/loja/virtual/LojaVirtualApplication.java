package loja.virtual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages = {"loja.virtual.model"})
@ComponentScan(basePackages = {"loja.virtual.*"})
@EnableJpaRepositories(basePackages = {"loja.virtual.repository"})
@EnableTransactionManagement
public class LojaVirtualApplication{

	public static void main(String[] args) {
		SpringApplication.run(LojaVirtualApplication.class, args);
	}

}
