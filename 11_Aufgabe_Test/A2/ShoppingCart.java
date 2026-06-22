package shoppingcart;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

	public Map<String, Integer> warenkorb = new HashMap<>();
	public Map<String, Integer> warenmenge = new HashMap<>();
	
	public int getTotal() {
		int gesamt = 0;
		for (int preis: warenkorb.values()) {
			gesamt += preis;
		}
		return gesamt;
	}
	
	public void addItem(String name, int preis) {
		warenkorb.put(name, preis);
		
		if (warenmenge.containsKey(name)) {
			warenmenge.put(name, warenmenge.get(name)+ 1);
		} else {
			warenmenge.put(name, 1);
		}
	}
	
	public int get_quantity(String name) {
		return warenmenge.getOrDefault(name, 0);
	}
}
