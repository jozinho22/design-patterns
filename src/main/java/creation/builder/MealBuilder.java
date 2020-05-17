package creation.builder;

import creation.builder.item.Cidre;
import creation.builder.item.Coca;
import creation.builder.item.FromentGalette;
import creation.builder.item.SarrasinGalette;

public class MealBuilder {

	   public Meal preparePlatDeResistance() {
	      Meal meal = new Meal();
	      meal.addItem(new SarrasinGalette());
	      meal.addItem(new Cidre());
	      return meal;
	   }   

	   public Meal prepareDessert() {
	      Meal meal = new Meal();
	      meal.addItem(new FromentGalette());
	      meal.addItem(new Coca());
	      return meal;
	   }
	}