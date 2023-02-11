import java.util.Scanner;
public class Proble {
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double num1 = input.nextDouble();
	double num2 = input.nextDouble();
	double dev = num1/num2;
	long floor = (long)Math.floor(dev);
	long ceil =(long) Math.ceil(dev);
	long round = (long)Math.round(dev);
	System.out.println("floor " + (long)num1 + " / "+ (long)num2 + " = " + floor);
	System.out.println("ceil " + (long)num1 + " / "+ (long)num2 + " = " + ceil);
	System.out.println("round " +(long) num1 + " / "+ (long)num2 + " = " + round);
		}
			}