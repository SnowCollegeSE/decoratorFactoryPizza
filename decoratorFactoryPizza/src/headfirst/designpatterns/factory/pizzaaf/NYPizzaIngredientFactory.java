package headfirst.designpatterns.factory.pizzaaf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
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
	
	public Pizza createPizza(String item) {
		Pizza myPizza = new Pizza();
		
		if(item.equals("NYSpecial"))
		{
			myPizza = new ThickCrustDough(myPizza);
			myPizza = new MarinaraSauce(myPizza);
			myPizza = new MozzarellaCheese(myPizza);
			myPizza = new SlicedPepperoni(myPizza);
			myPizza = new Onion(myPizza);
			myPizza = new BlackOlives(myPizza);
			return myPizza;
		}
		else if(item.equals("Cheese"))
		{
			myPizza = new ThickCrustDough(myPizza);
			myPizza = new MarinaraSauce(myPizza);
			myPizza = new MozzarellaCheese(myPizza);
			return myPizza;
		}
		
		List<String> pizzaToppings = ToppingsParse(item);
		
		for(int i = 0; i < pizzaToppings.size(); i++) {
			switch(pizzaToppings.get(i)) {
			//Pizza toppings go here for the cases
			case "ThickCrustDough":
				myPizza = new ThickCrustDough(myPizza);
				break;
			case "MarinaraSauce":
				myPizza = new MarinaraSauce(myPizza);
				break;
			case "MozzarellaCheese":
				myPizza = new MozzarellaCheese(myPizza);
				break;
			case "SlicedPepperoni":
				myPizza = new SlicedPepperoni(myPizza);
				break;
			case "BlackOlives":
				myPizza = new BlackOlives(myPizza);
				break;
			case "Eggplant":
				myPizza = new Eggplant(myPizza);
				break;
			case "FreshClams":
				myPizza = new FreshClams(myPizza);
				break;
			case "FrozenClams":
				myPizza = new FrozenClams(myPizza);
				break;
			case "Garlic":
				myPizza = new Garlic(myPizza);
				break;
			case "Mushroom":
				myPizza = new Mushroom(myPizza);
				break;
			case "Onion":
				myPizza = new Onion(myPizza);
				break;
			case "ParmesanCheese":
				myPizza = new ParmesanCheese(myPizza);
				break;
			case "PlumTomatoSauce":
				myPizza = new PlumTomatoSauce(myPizza);
				break;
			case "RedPepper":
				myPizza = new RedPepper(myPizza);
				break;
			case "ReggianoCheese":
				myPizza = new ReggianoCheese(myPizza);
				break;
			case "Spinach":
				myPizza = new Spinach(myPizza);
				break;
			case "ThinCrustDough":
				myPizza = new ThinCrustDough(myPizza);
				break;
			default:
				System.out.println("Invalid string parsed for pizza toppings, or case isn't working. Please debug.");
			}
		}
		
		return myPizza;
	}
	
	public List<String> ToppingsParse(String item) {
		List<String> pizzaToppings = new ArrayList<String>(Arrays.asList(item.split(",")));
		return pizzaToppings;
	}
}