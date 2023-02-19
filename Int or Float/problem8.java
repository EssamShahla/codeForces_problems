import java.text.DecimalFormat;
import java.util.Scanner;
public class Proble {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter 3 numbers to be sorted Acs =>");
        Double num = input.nextDouble();
        if (Math.floor(num) == num) {
            // N is an integer
        	int numInt =num.intValue();
            System.out.println("int " + numInt);
        } else {
            // N is a float
            int intPart = num.intValue();
            double decimalPart = num- intPart;
            DecimalFormat decimalFormat = new DecimalFormat("#.#####");
            String formattedDecimalPart = decimalFormat.format(decimalPart);
            System.out.println("float " + intPart + " " + formattedDecimalPart);
        }
	}
}
