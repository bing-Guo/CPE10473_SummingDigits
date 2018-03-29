import java.util.Scanner;
public class quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int input = sc.nextInt();
	    System.out.print(input+" ");
	    
	    while(input > 10){
	    	int sum = 0;
		    while(input != 0) {
				sum += input%10;
				input /= 10;
			}
		    input = sum;
		    System.out.print(input+" ");
	    }
	}
}
