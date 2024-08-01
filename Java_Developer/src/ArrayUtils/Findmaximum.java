package ArrayUtils;
import java.util.Scanner;

public class Findmaximum {

	public static int findMax(int[] arr) {
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Array must not be null or empty");
		}
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int max = findMax(a);
		System.out.println("Maximum element = " + max);
	}

}
