package BasicPrograms;
import java.util.*;
public class PrimeNumber {
	static boolean PrimeMethod1(int n){
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i == 0)
			 count++;
		}
		if(count == 2) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=in.nextInt();
	    boolean res=PrimeMethod1(n);
	    System.out.print(res);
		
		
	}
	

}
