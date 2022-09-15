package Array_Assignments;

public class Pythagoras {

	public static void main(String[] args) {
		int a[] = { 3, 4, 5, 6, 8, 10 };

		for (int i = 0; i < a.length - 2; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] * a[i]) + (a[j] * a[j]) == (a[i + 2] * a[i + 2])) {
					System.out.println(a[i] + " " + a[i + 1] + " " + a[i + 2] + " satisfies pythgoras theorem");
				}
			}
		}
	}

}
