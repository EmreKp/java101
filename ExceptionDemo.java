public class ExceptionDemo {
	public static void main(String[] args) {
		int[] numbers = {3, 4, 5, 6, 7};

		try {
			System.out.println(numbers[10]);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Finally
		try {
			System.out.println(numbers[12]); // Change index
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally is always printed!");
		}


	}
}