package headfirst.designpatterns.factory.pizzaaf;

public class NYPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item) {
		Pizza mypizza = null;
		PizzaIngredientFactory ingredientFactory =
		new NYPizzaIngredientFactory();
		mypizza = ingredientFactory.createPizza(item);
		return mypizza;
	}
}
