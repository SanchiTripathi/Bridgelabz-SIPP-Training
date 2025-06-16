package Level2;
import java.util.*;

public class practice_program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
	    int n = sc.nextInt();
	    if(n<=0) {
	    	System.out.println("Invalid number");
	    }
	    int counter = 1;
	     while(counter<=n){
	    	if(n % counter == 0) {
	    		System.out.println(counter);
	    	}
	    	counter++;
	    }
	}
}

