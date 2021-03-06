package headfirst.designpatterns.factory.pizzaaf;

public class ThinCrustDough extends Pizza {
	
	private Pizza myPizza;
	
	ThinCrustDough(Pizza toBeDecoratedPizza) {
		this.myPizza = toBeDecoratedPizza;
	}
	
	public double getCost() {
		return 1.00 + myPizza.getCost();
	}
	
	public String toString() {
		return "ThinCrustDough";
	}
}
