package headfirst.designpatterns.factory.pizzaaf;

public class Eggplant extends Pizza {
	
	@SuppressWarnings("unused")
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
