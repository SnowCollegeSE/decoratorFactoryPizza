package headfirst.designpatterns.factory.pizzaaf;

public class ParmesanCheese extends Pizza {
	
	private Pizza myPizza;
	
	ParmesanCheese(Pizza toBeDecoratedPizza) {
		this.myPizza = toBeDecoratedPizza;
	}
	
	public double getCost() {
		return .10 + myPizza.getCost();
	}
	
	public String toString() {
		return "ParmesanCheese";
	}
}
