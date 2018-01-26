package headfirst.designpatterns.factory.pizzaaf;

public class Mushroom extends Pizza {
	
	private Pizza myPizza;
	
	Mushroom(Pizza toBeDecoratedPizza) {
		this.myPizza = toBeDecoratedPizza;
	}
	
	public double getCost() {
		return .10 + myPizza.getCost();
	}
	
	public String toString() {
		return "Mushroom";
	}
}
