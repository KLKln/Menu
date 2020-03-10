package menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import menu.beans.MenuItem;
import menu.controller.BeanConfiguration;
import menu.repository.MenuItemRepository;

/*@SpringBootApplication
public class MenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(MenuApplication.class);
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	
		MenuItem m = appContext.getBean("menuItem", MenuItem.class);
		
		System.out.println(m.toString());
	}
	

}*/

@SpringBootApplication
public class MenuApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(MenuApplication.class, args);
	}
	@Autowired
	MenuItemRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		MenuItem m = appContext.getBean("menuitem", MenuItem.class);
		m.setDietaryDescription("Spicy");
		repo.save(m);
		
		MenuItem i = new MenuItem("Jalapeno Poppers", "Vegetarian", 8.99, "Spicy");
		repo.save(i);
		List<MenuItem> menu = repo.findAll();
		for(MenuItem menuitems: menu) {
			System.out.println(menuitems.toString());
		}
		((AbstractApplicationContext)appContext).close();

	}
	
}
