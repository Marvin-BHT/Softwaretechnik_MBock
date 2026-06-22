package shoppingcart;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ShoppingCart_Test {
	
	@Test
	void test_empty_cart_has_zero_total() {
		ShoppingCart cart = new ShoppingCart();
		
		assertEquals(0, cart.getTotal());
	}

	@Test
	void test_add_item_increases_total() {
		ShoppingCart cart = new ShoppingCart();
		cart.addItem("EinItem", 1);
		System.out.println(cart.warenkorb);
		
		assertEquals(1, cart.getTotal());
	}
	
	@Test
	void test_add_multiple_items_sums_total() {
		ShoppingCart cart = new ShoppingCart();
		cart.addItem("EinItem", 1);
		cart.addItem("EinItem", 1);
		cart.addItem("DreiItem", 3);
		cart.addItem("VierItem", 4);
		System.out.println(cart.warenkorb);
		System.out.println(cart.warenmenge);
		
		assertEquals(9, cart.getTotal());
	}
	
	@Test
	void test_get_quantity_of_item() {
		ShoppingCart cart = new ShoppingCart();
		assertEquals(0, cart.get_quantity("EinItem"));
	}
}
