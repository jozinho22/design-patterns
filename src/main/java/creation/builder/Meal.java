package creation.builder;

import java.util.ArrayList;
import java.util.List;

import creation.builder.item.Item;

public class Meal {
	
	private List<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0.0f;

		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}

	public void showItems() {

		for (Item item : items) {
			System.out.print("Choix : " + item.name());
			System.out.print(", Servi " + item.service().getService());
			System.out.println(", Prix : " + item.price());
		}
	}
}
