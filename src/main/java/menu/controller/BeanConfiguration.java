package menu.controller;

import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration;

import menu.beans.MenuItem;  

@Configuration
public class BeanConfiguration {
	
	@Bean
	public MenuItem menuItem() {
		MenuItem bean = new MenuItem();
		bean.setName("Sweet Tempeh Wrap");
		bean.setDietaryDescription("Vegan");
		bean.setPrice(11.99);
		bean.setSpicyOrNot("Not Spicy");
		return bean;
	}

}
