package headfirst.designpatterns.factory.pizzaaf;

public class ReggianoCheese extends Pizza {
	
	private Pizza myPizza;
	
	ReggianoCheese(Pizza toBeDecoratedPizza) {
		this.myPizza = toBeDecoratedPizza;
	}
	
	public double getCost() {
		return .10 + myPizza.getCost();
	}
	
	public String toString() {
		return "ReggianoCheese";
	}
}
