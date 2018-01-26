package headfirst.designpatterns.factory.pizzaaf;

public class MarinaraSauce extends Pizza {
	
	private Pizza myPizza;
	
	MarinaraSauce(Pizza toBeDecoratedPizza) {
		this.myPizza = toBeDecoratedPizza;
	}
	
	public double getCost() {
		return .25 + myPizza.getCost();
	}
	
	public String toString() {
		return "Marinara Sauce";
	}
}
