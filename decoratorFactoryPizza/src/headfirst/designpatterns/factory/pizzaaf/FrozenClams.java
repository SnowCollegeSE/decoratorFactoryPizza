package headfirst.designpatterns.factory.pizzaaf;

public class FrozenClams extends Pizza {
	
	private Pizza myPizza;
	
	FrozenClams(Pizza toBeDecoratedPizza) {
		this.myPizza = toBeDecoratedPizza;
	}
	
	public double getCost() {
		return .10 + myPizza.getCost();
	}
	
	public String toString() {
		return "Frozen Clams";
	}
}
