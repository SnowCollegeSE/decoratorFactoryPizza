package headfirst.designpatterns.factory.pizzaaf;

public class Onion extends Pizza {
	
	private Pizza myPizza;
	
	Onion(Pizza toBeDecoratedPizza) {
		this.myPizza = toBeDecoratedPizza;
	}
	
	public double getCost() {
		return .10 + myPizza.getCost();
	}
	
	public String toString() {
		return "Onion";
	}
}
