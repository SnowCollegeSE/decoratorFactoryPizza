package headfirst.designpatterns.factory.pizzaaf;

public class Garlic extends Pizza {
	
	private Pizza myPizza;
	
	Garlic(Pizza toBeDecoratedPizza) {
		this.myPizza = toBeDecoratedPizza;
	}
	
	public double getCost() {
		return .10 + myPizza.getCost();
	}
	
	public String toString() {
		return "Garlic";
	}
}
