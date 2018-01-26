package headfirst.designpatterns.factory.pizzaaf;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class pizzaCostTest {
	@ParameterizedTest(name = "{index}=> testCost = {0}, pizzaWanted = {1}")
	@CsvSource({
		"6.75, Cheese",
		"9.00, ChicagoSpecial",
		"6.85, third",
		"6.30, fourth",
		"6.75, NYCheese",
		"7.70, NYSpecial",
		"6.85, fifth",
		"6.30, sixth"
		
	})
	void test(double testCost, String pizzaWanted) {
		//TODO: Consider switching numbers to enumerated types which I think is supported for more readable test case
		ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		NYPizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza testPizza = null;
		
		switch(pizzaWanted) {
		case "Cheese":
			testPizza = chicagoPizzaStore.createPizza("Cheese");
			assertEquals(testCost, testPizza.getCost(), .002);
			break;
		case "ChicagoSpecial":
			testPizza = chicagoPizzaStore.createPizza("ChicagoSpecial");
			assertEquals(testCost, testPizza.getCost(), .002);
			break;
		case "third":
			testPizza = chicagoPizzaStore.createPizza("ThickCrustDough,MarinaraSauce,MozzarellaCheese,Mushroom");
			assertEquals(testCost, testPizza.getCost(), .002);
			break;
		case "fourth":
			testPizza = chicagoPizzaStore.createPizza("ThinCrustDough,PlumTomatoSauce,ReggianoCheese,RedPepper");
			assertEquals(testCost, testPizza.getCost(), .002);
			break;
		case "NYCheese":
			testPizza = nyPizzaStore.createPizza("Cheese");
			assertEquals(testCost, testPizza.getCost(), .002);
			break;
		case "NYSpecial":
			testPizza = nyPizzaStore.createPizza("NYSpecial");
			assertEquals(testCost, testPizza.getCost(), .002);
			break;
		case "fifth":
			testPizza = nyPizzaStore.createPizza("ThickCrustDough,MarinaraSauce,MozzarellaCheese,Mushroom");
			assertEquals(testCost, testPizza.getCost(), .002);
			break;
		case "sixth":
			testPizza = nyPizzaStore.createPizza("ThinCrustDough,PlumTomatoSauce,ReggianoCheese,RedPepper");
			assertEquals(testCost, testPizza.getCost(), .002);
			break;
		default:
			System.out.println("Invalid Option, Issue with test case");
		}
	}
}
