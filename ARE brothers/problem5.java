import java.util.Scanner;
public class Proble {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("enter");
	String P1firstName = input.next();
	String P1secondName = input.next();
	String P2firstName = input.next();
	String P2secondName = input.next();
	if(P1secondName.equals(P2secondName))
		System.out.println("ARE Brothers");
	else 
		System.out.println("NOT");
	}
}