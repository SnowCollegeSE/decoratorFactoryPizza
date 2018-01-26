package headfirst.designpatterns.factory.pizzaaf;

public class ChicagoPizzaStore extends PizzaStore {
	
	protected Pizza createPizza(String item) {
		Pizza mypizza = null;
		PizzaIngredientFactory ingredientFactory =
		new ChicagoPizzaIngredientFactory();
		mypizza = ingredientFactory.createPizza(item);
		return mypizza;
	}
}
