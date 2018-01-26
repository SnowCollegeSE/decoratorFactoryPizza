package headfirst.designpatterns.factory.pizzaaf;

public class BlackOlives extends Pizza {
	
	private Pizza myPizza;
	
	BlackOlives(Pizza toBeDecoratedPizza) {
		this.myPizza = toBeDecoratedPizza;
	}
	
	public double getCost() {
		return .10 + myPizza.getCost();
	}
	
	public String toString() {
		return "BlackOlives";
	}
}
