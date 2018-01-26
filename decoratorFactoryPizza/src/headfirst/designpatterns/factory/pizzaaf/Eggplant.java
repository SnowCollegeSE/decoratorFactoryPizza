package headfirst.designpatterns.factory.pizzaaf;

public class Eggplant extends Pizza {
	
	private Pizza myPizza;
	
	Eggplant(Pizza toBeDecoratedPizza) {
		this.myPizza = toBeDecoratedPizza;
	}
	
	public double getCost() {
		return .10 + myPizza.getCost();
	}
	
	public String toString() {
		return "Eggplant";
	}
}
