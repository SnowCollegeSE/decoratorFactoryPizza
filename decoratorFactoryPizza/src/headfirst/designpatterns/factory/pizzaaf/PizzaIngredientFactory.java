package headfirst.designpatterns.factory.pizzaaf;

public interface PizzaIngredientFactory {
	/*
	 * Everything below would be sent to a factory as there are news right?
	 * public Pizza orderPizza(String type) {
	 * Pizza pizza = factory.createPizza(type);
	 *--so if string is thick dough, cheese, cheese, pepperoni, pepperoni factory takes care of that
	 * }
	 * 
	 * inside t he factory
	 * 
	 * factory {
	 * Pizza pizza = null;
	 * 
	 * createPizza(String type)
	 * {
	 * 		--PARSE the string and put each part in its own array variable
	 * 		--have a for loop with a switch statement stepping through the loop creating decorator pizzas
	 * 		
	 *      for (integer i = 0; i < array.max; i++) {
	 * 			pizza = new array[i](pizza);
	 * 		{ 
	 * }
	 * 
	 * 
	*/
	public Pizza createPizza(String item);
 
}
