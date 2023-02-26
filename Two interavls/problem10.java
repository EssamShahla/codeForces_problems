import java.text.DecimalFormat;
import java.util.Scanner;
public class Proble {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//        first 2 numbers will be the first interval and the other 2 numbers will be the second interval //
		System.out.println("Enter 2 intervals => (1 interval = 2 number2)");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int start = 0,end = 0 ;
        if((num1>num3 && num1>num4) || (num3>num2 && num4>num2)) {
        	System.out.println(-1);
        }else {
        	if(num1>num3)
        		start = num1 ;
        	else
        		start = num3;
        	if(num2<num4)
        		end = num2;
        	else
        		end = num4 ;
            System.out.println(start + " " + end);
        }
	}
}
