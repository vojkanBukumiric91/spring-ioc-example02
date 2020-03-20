package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import config.MyBeanConfig;
import repository.IRepository;
import service.MessageService;
@Component(value="main")
public class Main {
	
	@Autowired
	private Main main;
	@Autowired
	IRepository txtRepository;
	@Autowired
	IRepository xmlRepository;
	@Autowired
	MessageService messageService;
	
	public static void main(String[] args) {
		
		//2.main ne kreiramo preko new operatora
		BeanFactory container = new AnnotationConfigApplicationContext(MyBeanConfig.class);
		Main main = container.getBean("main",Main.class);
		
	//	Main main = new Main();
		main.annotationConfig();
		main.saveMessage("Gladan sam!!!");
	}

	private void annotationConfig() {
		txtRepository.save("My plain message!");
		xmlRepository.save("My xml message!");
	}
	
	private void saveMessage(String message) {
		
		messageService.save(message);
		
		
	}
}
