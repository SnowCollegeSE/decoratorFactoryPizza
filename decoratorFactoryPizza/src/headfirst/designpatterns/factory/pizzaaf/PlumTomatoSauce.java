package headfirst.designpatterns.factory.pizzaaf;

public class PlumTomatoSauce extends Pizza {
	
	private Pizza myPizza;
	
	PlumTomatoSauce(Pizza toBeDecoratedPizza) {
		this.myPizza = toBeDecoratedPizza;
	}
	
	public double getCost() {
		return .10 + myPizza.getCost();
	}
	
	public String toString() {
		return "PlumTomatoSauce";
	}
}
