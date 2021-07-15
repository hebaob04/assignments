import java.util.Arrays;
import java.util.Scanner;

public class Lanterns {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int l = in.nextInt();
		int[] arr = new int[n];
		int num = 0, value = 0, edge = 0;
		for (int i = 0; i < n; i++) {
			num = in.nextInt();
			arr[i] = num;
			if (num == 0) {
				value = 1;
			}

			if (num == l) {
				edge = 1;
			}
		}
		Arrays.sort(arr);
		int[] array = new int[n];

		if (n == 1) {

			array[0] = arr[0];
		} else {
			for (int i = 0; i < (n - 1); i++) {
				array[i] = arr[i + 1] - arr[i];
			}
		}

		int max = Arrays.stream(array).max().getAsInt();
		double output1 = 0.0;
		output1 = max / 2.0;

		if (value == 0 && output1 < arr[0]) {
			output1 = arr[0];
		}

		if (edge == 0 && output1 < (l - arr[n - 1])) {
			output1 = l - arr[n - 1];
		}

		System.out.println("   ");
		String.format("%.10f\n", output1);
		System.out.println(String.format("%.10f\n", output1));

	}

}
