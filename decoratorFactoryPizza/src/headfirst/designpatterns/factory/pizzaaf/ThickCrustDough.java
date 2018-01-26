package headfirst.designpatterns.factory.pizzaaf;

public class ThickCrustDough extends Pizza {

	private Pizza myPizza;
	
	ThickCrustDough(Pizza toBeDecoratedPizza) {
		this.myPizza = toBeDecoratedPizza;
	}
	
	public double getCost() {
		return 1.00 + myPizza.getCost();
	}
	
	public String toString() {
		return "Marinara Sauce";
	}
}
