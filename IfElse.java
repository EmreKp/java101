public class IfElse {
	public static void main(String[] args) {
		int x = 2;
		if (x > 10) {
			System.out.println("x 10'dan büyük");
		} else if (x >= 5 && x <= 10) {
			System.out.println("x 5 ile 10 arasında");
		} else {
			System.out.println("x 5'ten küçük");
		}
	}
}