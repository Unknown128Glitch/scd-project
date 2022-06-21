package UI;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class productListTesting {

	@Test
	void test() {
		ProductList obj = new ProductList("Pencil");

		assertTrue(obj.getProductName() == "Pencil");
	}

}
