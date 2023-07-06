//Exercise 33
package pack1;
import java.util.Scanner;
public class SumOfDigits2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value");
		int a=sc.nextInt();
		int sum=0,ld;
		while(a>0) {
			ld=a%10;
			sum=sum+ld;
			a=a/10;
		}
		System.out.println("The Sum of digits is: "+sum);
	}

}
