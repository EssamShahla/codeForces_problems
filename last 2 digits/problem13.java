import java.text.DecimalFormat;
import java.util.Scanner;
public class Proble {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//       input 4 numbers and multiply them together, then print the last 2 digits of the result //
		System.out.println("Enter 4 numbers =>");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
//       we need to find the last 2 digits of all numbers individually by the operation ( %100 ) //
        int last2DigitsOfNum1 = num1 % 100;
        int last2DigitsOfNum2 = num2 % 100;
        int last2DigitsOfNum3 = num3 % 100;
        int last2DigitsOfNum4 = num4 % 100;

//       
        int multiplicationResult = last2DigitsOfNum1*last2DigitsOfNum2*last2DigitsOfNum3*last2DigitsOfNum4;
        if(multiplicationResult%100 < 10) {
        	System.out.println(0 + "" + multiplicationResult%100);
        }else {
            System.out.println(multiplicationResult%100);
        }
        
	}
}
