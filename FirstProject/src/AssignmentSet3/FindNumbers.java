package AssignmentSet3;

import java.util.Arrays;

public class FindNumbers {
	public static int[] findNumbers(int num1, int num2) {
		int[] numbers = new int[6];
		int counter = 0;
		if (num2 > num1) {
			for (int i = num1; i <= num2; i++) {
				int digit1 = i % 10;
				int digit2 = i / 10;
				if (i >= 10 && ((digit1 + digit2) % 3 == 0 || i % 5 == 0)) {
					if (counter == numbers.length) {
						numbers = Arrays.copyOf(numbers, numbers.length + 1);
					}
					System.out.println(i);
					numbers[counter] = i;
					counter++;
				}
			}
		}

		return numbers;
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;

		int[] numbers = findNumbers(num1, num2);
		if (numbers[0] == 0) {
			System.out.println("There is no such number!");
		} else {
			for (int index = 0; index <= numbers.length - 1; index++) {
				if (numbers[index] == 0) {
					break;
				}
				System.out.println(numbers[index]);
			}
		}

	}
}
