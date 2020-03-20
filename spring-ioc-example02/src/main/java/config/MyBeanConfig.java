package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import main.Main;
//skenira pakete  i pravi beaonove
@ComponentScan(basePackages = {"repository",
		"service","main"})
public class MyBeanConfig {
	
	
}
