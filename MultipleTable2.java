//Exercise 7
package pack1;

import java.util.Scanner;

public class MultipleTable2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int i = 1;
		while (i <= 10) {
			System.out.println(n + "*" + i + "=" + n * i);
			i++;
		}
	}

}
