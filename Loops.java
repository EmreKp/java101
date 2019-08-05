public class Loops {
	public static void main(String[] args) {
		int t = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
			t += i;
			System.out.println("t = " + t);
			System.out.println("------------------------");
		}

		int[] numbers = {10, 20, 30, 40, 50};

		for (int number : numbers) {
			System.out.println("number: " + number);
		}
	}
}