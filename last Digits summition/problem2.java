import java.util.Scanner;
public class Problem1 {
	public static int lastDigitSum(String a, String b) {
    int aLastDigit = Integer.parseInt(a.substring(a.length() - 1));
    int bLastDigit = Integer.parseInt(b.substring(b.length() - 1));
    return (aLastDigit% 10) + (bLastDigit%10);
}
 
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String a = input.next();
	String b = input.next();
    System.out.println(lastDigitSum(a, b));
}}