package headfirst.designpatterns.factory.pizzaaf;

public class Pizza {
	String name;

	void prepare() {
		System.out.println("Putting the toppings on the pizza");
	}
	
	void bake() {
		System.out.println("Baking for 25 minutes at 350");
	}

	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	void box() {
		System.out.println("Placing the pizza in the official PizzaStore box");
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
	
	public double getCost() {
		return 5.00;
	}

	public String getDescription() {
		return this.name;
	}
}
