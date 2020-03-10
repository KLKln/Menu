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
		
		
		MenuItem poppers = new MenuItem("Jalapeno Poppers", "Vegetarian", 8.99, "Spicy");
		repo.save(poppers);
		MenuItem ribeye = new MenuItem("Ribeye", "Paleo", 17.99, "Not Spicy");
		repo.save(ribeye);
		MenuItem shrimpCurry = new MenuItem("Shrimp Curry", "Pescatarian", 16.99, "Spicy");
		repo.save(shrimpCurry);
		MenuItem salad = new MenuItem("Kale Tempeh Salad", "Vegan",10.99, "Not Spicy");
		repo.save(salad);
		MenuItem chickenSandwich = new MenuItem("Chicken Sandwich", "Poultry", 9.99, "Not Spicy");
		repo.save(chickenSandwich);
		MenuItem chickenFriedSteak = new MenuItem("Chicken Fried Steak", "Beef", 12.99, "Not Spicy");
		repo.save(chickenFriedSteak);
		List<MenuItem> menu = repo.findAll();
		for(MenuItem menuitems: menu) {
			System.out.println(menuitems.toString());
		}
		((AbstractApplicationContext)appContext).close();

	}
	
}
