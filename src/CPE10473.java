import java.util.Scanner;

public class CPE10473 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int input;
		while(sc.hasNext()){
			input = sc.nextInt();
			if(input == 0){
				break;
			}
			System.out.println(f(input));
		}		
	}
	public static int f(int number){
		String input = Integer.toString(number);
		int sum;
		if(input.length() != 1){
			sum = 0;
			for (int i = 0; i < input.length(); i++) {
				sum += Integer.parseInt(input.substring(i, i+1));
			}
	    }else{
	    	return number;
	    }
		return f(sum);
	}
}
