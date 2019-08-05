public class BreakContinue {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);

			if (i == 5) {
				break;
			}
		}

		System.out.println("-----------------------");

		for (int j = 0; j < 10; j++) {
			if (j <= 2 || j >= 7) {
				continue;
			}

			System.out.println(j);
		}
	}
}