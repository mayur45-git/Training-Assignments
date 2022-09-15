package Array_Assignments;

public class EvenoddPrimePerfect {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 10, 11, 17, 19, 21, 28 };

		int count = 0;
		int count1 = 0;
		int count2 = 0;
		int perfect = 0;
		int prime = 1;

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				count++;
			}
			if (a[i] % 2 != 0) {
				count1++;
			}

			for (int j = 2; j <= a.length - 1; j++) {

				if (a[i] % j == 0) {
					prime++;
				}

			}

			if (prime == 1) {

				count2++;

			}

			int sum = 0;
			int no = a[i];
			for (int m = 1; m < no; m++) {

				if (no % m == 0) {

					sum = sum + m;

				}

			}

			if (sum == no) {

				perfect++;

			}

		}

		System.out.println("even no :-" + count);
		System.out.println("odd no :-" + count1);
		System.out.println("prime no :-" + count2);
		System.out.println("perfect no :-" + perfect);

	}

}
