import java.util.Scanner;
public class quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String input = sc.next();
	    while(input.length() != 1){
	    	System.out.print(input+" ");
		    int sum = 0;
			for (int i = 0; i < input.length(); i++) {
				sum += Integer.parseInt(input.substring(i, i+1));
			}
			input = Integer.toString(sum);
	    }
	    System.out.print(input+" ");
	}
}
