package taschenrechner;

class Taschenrechner {

	public int div(int a, int b) {
		
		 if (b == 0) {
			throw new IllegalArgumentException("Division durch 0 nicht erlaubt.");
		 	}

		return a/b;
	}
}
