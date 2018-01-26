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
		"6.85, theThree",
		//"11.00, ThinCrustDough,PlumTomatoSauce,ReggianoCheese,RedPepper",
		//"4.00, NYCheese",
		//"1.00, NYThinCrustDough,PlumTomatoSauce,ReggianoCheese,RedPepper",
		//"2.00, NYSpecial",
		//"3.00, NYThickCrustDough,MarinaraSauce,MozzarellaCheese,Mushroom"
		
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
		case "theThree":
			testPizza = chicagoPizzaStore.createPizza("ThickCrustDough,MarinaraSauce,MozzarellaCheese,Mushroom");
			assertEquals(testCost, testPizza.getCost(), .002);
			break;
		case "theFour":
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
		case "NYThickCrustDough,MarinaraSauce,MozzarellaCheese,Mushroom":
			testPizza = nyPizzaStore.createPizza("ThickCrustDough,MarinaraSauce,MozzarellaCheese,Mushroom");
			assertEquals(testCost, testPizza.getCost(), .002);
			break;
		case "NYThinCrustDough,PlumTomatoSauce,ReggianoCheese,RedPepper":
			testPizza = nyPizzaStore.createPizza("ThinCrustDough,PlumTomatoSauce,ReggianoCheese,RedPepper");
			assertEquals(testCost, testPizza.getCost(), .002);
			break;
		default:
			System.out.println("Invalid Option, Issue with test case");
		}
	}
}
