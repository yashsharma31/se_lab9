package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnitFunction junitStrings = new jUnitFunction();
		String result = junitStrings.addStrings("HI GUYS"," THIS IS CRAZY YR");
		assertEquals("HI GUYS THIS IS CRAZY YR", result);
	}

}
