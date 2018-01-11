package de.kla.logging;

import java.util.function.Supplier;

public class LambdaWrapper {

	private Supplier<?> supplier;

	public LambdaWrapper(Supplier<?> supplier) {
		this.supplier = supplier;
	}
	
	public static Object[] from(Supplier<?>[] suppliers) {
		LambdaWrapper[] wrapper = new LambdaWrapper[suppliers.length];

		for (int i = 0; i < suppliers.length; i++) {
			wrapper[i] = new LambdaWrapper(suppliers[i]);
		}

		return wrapper;
	}
	
	@Override
	public String toString() {
		return supplier.get().toString();
	}
}
