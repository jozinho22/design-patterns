package creation.builder.main;

import creation.builder.Meal;
import creation.builder.MealBuilder;

public class Main {

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal platDeResistance = mealBuilder.preparePlatDeResistance();
		System.out.println("Plat de r�sistance");
		platDeResistance.showItems();
		System.out.println("Note totale : " + platDeResistance.getCost());

		Meal dessert = mealBuilder.prepareDessert();
		System.out.println("\nDessert");
		dessert.showItems();
		System.out.println("Note totale : " + dessert.getCost());

	}

}
