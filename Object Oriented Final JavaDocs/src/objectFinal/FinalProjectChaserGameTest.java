package objectFinal;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.AnyOf.anyOf;

import org.junit.Test;

public class FinalProjectChaserGameTest {

	@Test
	public void testFoodPicker() {
		assertThat(Food.foodPicker(), anyOf(is("images/food/banana.png"), is("images/food/birthdayCake.png"), is("images/food/bread.png"), is("images/food/candy.png"), is("images/food/cherry.png"), is("images/food/chocolate.png"), is("images/food/cookie.png"), is("images/food/corn.png"), is("images/food/donut.png"), is("images/food/drumstick.png"), is("images/food/flan.png"), is("images/food/frenchFries.png"), is("images/food/friedEgg.png"), is("images/food/fruitShiskabob.png"), is("images/food/grapes.png"), is("images/food/greenApple.png"), is("images/food/greenSoup.png"), is("images/food/hamburger.png"), is("images/food/honey.png"), is("images/food/icecreamBowl.png"), is("images/food/icecreamCone.png"), is("images/food/lemon.png"), is("images/food/lollypop.png"), is("images/food/meatOnBones.png"), is("images/food/meatShishkabob.png"), is("images/food/melon.png"), is("images/food/orange.png"), is("images/food/orangeJuice.png"), is("images/food/peach.png"), is("images/food/pear.png"), is("images/food/pineapple.png"), is("images/food/pizzaSlice.png"), is("images/food/redApple.png"), is("images/food/rice.png"), is("images/food/spaghetti.png"), is("images/food/strawberry.png"), is("images/food/strawberryIcecream.png"), is("images/food/strawberryShortCake.png"), is("images/food/tomato.png"), is("images/food/watermelonSlice.png"), is("images/food/yams.png")));
	}

}
