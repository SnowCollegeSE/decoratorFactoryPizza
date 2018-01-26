package headfirst.designpatterns.factory.pizzaaf;

public class RedPepper extends Pizza {
	
	private Pizza myPizza;
	
	RedPepper(Pizza toBeDecoratedPizza) {
		this.myPizza = toBeDecoratedPizza;
	}
	
	public double getCost() {
		return .10 + myPizza.getCost();
	}
	
	public String toString() {
		return "RedPepper";
	}
}
