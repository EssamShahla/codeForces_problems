import java.util.Scanner;
public class Proble {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	char myChar = input.next().charAt(0);
	if(myChar>=48 && myChar<=57) {
		System.out.println("IS DIGIT");
	}
	else if(myChar>=65 && myChar<=90) {
		System.out.println("ALPHA");
		System.out.println("IS CAPITAL");
	}
	else if(myChar>=97 && myChar<=122) {
		System.out.println("ALPHA");
		System.out.println("IS SMALL");
	}
  }
}
