package de.kla.junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedTest {

	@Test
	@DisplayName("True is true")
	private void isTrue() {
		assertTrue(true);
	}

	@Nested
	@DisplayName("Nested Group 1")
	class NestedGroup {
		
		@Test
		@DisplayName("True is true")
		private void isTrue() {
			assertTrue(true);
		}
		
		@Test
		@DisplayName("False is false")
		private void isFalse() {
			assertFalse(false);
		}
	}
	
}
