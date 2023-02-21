import java.text.DecimalFormat;
import java.util.Scanner;
public class Proble {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter expression");
        int num1 = input.nextInt();
        char compareOperator =input.next().charAt(0) ;
        int num2 = input.nextInt();
        	boolean result = true;
            switch (compareOperator) {
                case '>':
                    result = num1 > num2;
                    break;
                case '<':
                    result = num1 < num2;
                    break;
                case '=':
                    result = num1 == num2;
                    break;
            }

            System.out.println(result ? "Right" : "Wrong");
	}
}
