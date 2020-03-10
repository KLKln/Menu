package menu.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MenuItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String dietaryDescription;
	private double price;
	private String spicyOrNot;
	
	public MenuItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MenuItem(long id, String name, String dietaryDescription, double price, String spicyOrNot) {
		super();
		this.id = id;
		this.name = name;
		this.dietaryDescription = dietaryDescription;
		this.price = price;
		this.spicyOrNot = spicyOrNot;
	}
	
	public MenuItem(String name, String dietaryDescription, double price, String spicyOrNot) {
		super();
		this.name = name;
		this.dietaryDescription = dietaryDescription;
		this.price = price;
		this.spicyOrNot = spicyOrNot;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDietaryDescription() {
		return dietaryDescription;
	}

	public void setDietaryDescription(String dietaryDescription) {
		this.dietaryDescription = dietaryDescription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSpicyOrNot() {
		return spicyOrNot;
	}

	public void setSpicyOrNot(String spicyOrNot) {
		this.spicyOrNot = spicyOrNot;
	}

	@Override
	public String toString() {
		return "MenuItem [id=" + id + ", name=" + name + ", dietaryDescription=" + dietaryDescription + ", price="
				+ price + ", spicyOrNot=" + spicyOrNot + "]";
	}
	
	

}
