package dio.com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
	
		Livro livro = factory.getBean(Livro.class);
		livro.setNome("Natureza do Espaço");
		livro.setCodigo("M4236");
		
		Autor autor = factory.getBean(Autor.class);
		autor.setNome("Milton Santos");
		
		livro.exibir();
		
		((AbstractApplicationContext) factory).close();
	}

}