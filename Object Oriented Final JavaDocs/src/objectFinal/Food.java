package objectFinal;

import java.io.File;
import java.util.Random;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

//--------------------------------FOOD Class-------------------------------------------------
public class Food extends Pane {
	public ImageView food;
	public Food() {
			String foodImg = foodPicker();
			this.food = new ImageView(new File(foodImg).toURI().toString());
			int randFoodX = (int)(Math.random() * 300 + 50);
			int randFoodY = (int)(Math.random() * 370 + 50);
			if((randFoodX % 10.0 != 0) || (randFoodY % 10 != 0)){
				if(randFoodX % 10 != 0){
					while(randFoodX % 10 != 0){
						randFoodX--;
					}						
				}
				if(randFoodY % 10 != 0){
					while(randFoodY % 10 != 0){
						randFoodY--;
					}
				}
			}
			this.food.setX(randFoodX);
			this.food.setY(randFoodY);
			this.food.setFitHeight(50);
			this.food.setFitWidth(50);
			getChildren().add(this.food);
	}
	//method for setting the location of food
	public void start() {
		String foodImg = foodPicker();
		this.food = new ImageView(new File(foodImg).toURI().toString());
		int randFoodX = (int)(Math.random() * 300 + 50);
		int randFoodY = (int)(Math.random() * 300 + 50);
		if((randFoodX % 10.0 != 0) || (randFoodY % 10 != 0)){
			if(randFoodX % 10 != 0){
				while(randFoodX % 10 != 0){
					randFoodX--;
				}
			}
			if(randFoodY % 10 != 0){
				while(randFoodY % 10 != 0){
					randFoodY--;
				}
			}
		}
		this.food.setX(randFoodX);
		this.food.setY(randFoodY);
		this.food.setFitHeight(50);
		this.food.setFitWidth(50);
		getChildren().add(this.food);
	}
	//method for restarting and calling start
	public void restart(){
		getChildren().remove(this.food);
		start();
	}
	//method for when face eats food
	public void die(){
		getChildren().remove(this.food);
		start();
	}
	//method for choosing what food image is shown when called
	public static String foodPicker() {
			Random random = new Random();	
			String[] food  = {"banana", "birthdayCake", "bread", "candy", "cherry", "chocolate", "cookie", "corn", "donut", "drumstick", "flan", "frenchFries", "friedEgg", "fruitShiskabob", "grapes", "greenApple", "greenSoup", "hamburger", "honey", "icecreamBowl", "icecreamCone", "lemon", "lollypop", "meatOnBones", "meatShishkabob", "melon", "orange", "orangeJuice", "peach", "pear", "pineapple", "pizzaSlice", "redApple", "rice", "spaghetti","strawberry", "strawberryIcecream", "strawberryShortCake", "tomato", "watermelonSlice", "yams" };
			int rand = random.nextInt(food.length);
			String result = new String("images/food/" + food[rand] + ".png");
			return result;
		}	
}
