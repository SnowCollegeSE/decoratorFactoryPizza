package headfirst.designpatterns.factory.pizzaaf;

public class Spinach extends Pizza {
	
	private Pizza myPizza;
	
	Spinach(Pizza toBeDecoratedPizza) {
		this.myPizza = toBeDecoratedPizza;
	}
	
	public double getCost() {
		return .10 + myPizza.getCost();
	}
	
	public String toString() {
		return "Spinach";
	}
}
