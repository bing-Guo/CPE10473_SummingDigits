import java.util.Scanner;
public class quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int input = sc.nextInt();
	    int sum = 0;
	    while(input != 0) {
			sum += input%10;
			input /= 10;
		}
	}
}
