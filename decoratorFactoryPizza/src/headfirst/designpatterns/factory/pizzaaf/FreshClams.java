package headfirst.designpatterns.factory.pizzaaf;

public class FreshClams extends Pizza {
	
	private Pizza myPizza;
	
	FreshClams(Pizza toBeDecoratedPizza) {
		this.myPizza = toBeDecoratedPizza;
	}
	
	public double getCost() {
		return .10 + myPizza.getCost();
	}
	
	public String toString() {
		return "Marinara Sauce";
	}
}
