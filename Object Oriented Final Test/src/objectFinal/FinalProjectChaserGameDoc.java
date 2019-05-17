package objectFinal;
import static org.junit.Assert.*;

import org.junit.Test;

import finalProject.FinalCode;

public class FinalProjectChaserGameDoc {
	public static String foodPicker() {
		Random random = new Random();	
		String[] food  = {"banana", "birthdayCake", "bread", "candy", "cherry", "chocolate", "cookie", "corn", "donut", "drumstick", "flan", "frenchFries", "friedEgg", "fruitShiskabob", "grapes", "greenApple", "greenSoup", "hamburger", "honey", "icecreamBowl", "icecreamCone", "lemon", "lollypop", "meatOnBones", "meatShishkabob", "melon", "orange", "orangeJuice", "peach", "pear", "pineapple", "pizzaSlice", "redApple", "rice", "spaghetti","strawberry", "strawberryIcecream", "strawberryShortCake", "tomato", "watermelonSlice", "yams" };
		int rand = random.nextInt(food.length);
		String result = new String("images/food/" + food[rand] + ".png");
		return result;
	}	
	@Test
	public void test() {
		assertEquals(result, foodPicker());
		if (result == FinalProjectChaserGameDoc.foodPicker()) {
			System.out.println("addMatrix function is correct.");
		}
		else {
			System.out.println("addMatrix Function is a failure.");
		}
	}

}
