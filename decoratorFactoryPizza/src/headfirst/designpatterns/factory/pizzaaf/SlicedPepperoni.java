package headfirst.designpatterns.factory.pizzaaf;

public class SlicedPepperoni extends Pizza {
	
	private Pizza myPizza;
	
	SlicedPepperoni(Pizza toBeDecoratedPizza) {
		this.myPizza = toBeDecoratedPizza;
	}
	
	public double getCost() {
		return .75 + myPizza.getCost();
	}
	
	public String toString() {
		return "Sliced Pepperoni";
	}
}
