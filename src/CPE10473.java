import java.util.Scanner;

public class CPE10473 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int input;
		while(sc.hasNext()){
			input = sc.nextInt();
			if(input == 0) break;
			System.out.println(f(input));
		}		
	}
	public static int f(int input){
		int sum = 0;
		if(input < 10) return input;
	    while(input != 0) {
			sum += input%10;
			input /= 10;
		}
	    return f(sum);
	}
}
