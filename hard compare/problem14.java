import java.util.Scanner;
public class Proble {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//       Given 4 numbers A,B,C and D . If A powerB > C powerD print "YES" otherwise, print "NO".//
		System.out.println("Enter 4 numbers =>");
		double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double D = input.nextDouble();
   

/*       We take the log on both sides to reduce the space of the resulting number and give it to a variable
        type that accepts it */ 
        // example : 10^1000000 < (1000000)log(10) so now we can fix the problem of size
        double result1 = B*(Math.log(A));
        double result2 = D*(Math.log(C));

        if(result1 > result2)
        	System.out.println("YES");
        else
        	System.out.println("NO");
        
	}
}
