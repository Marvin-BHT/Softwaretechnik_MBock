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
		cart.addItem("ZweiItem", 2);
		System.out.println(cart.warenkorb);
		
		assertEquals(3, cart.getTotal());
	}
	
}
