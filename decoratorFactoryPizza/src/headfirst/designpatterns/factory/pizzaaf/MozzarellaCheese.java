package headfirst.designpatterns.factory.pizzaaf;

public class MozzarellaCheese extends Pizza {
	
	private Pizza myPizza;
	
	MozzarellaCheese(Pizza toBeDecoratedPizza) {
		this.myPizza = toBeDecoratedPizza;
	}
	
	public double getCost() {
		return .50 + myPizza.getCost();
	}
	
	public String toString() {
		return "MozzarellaCheese";
	}
}
