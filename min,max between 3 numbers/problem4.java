import java.util.Scanner;
public class Proble {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("enter");
	long num1 = input.nextLong();
	long num2 = input.nextLong();
	long num3 = input.nextLong();
	
	long max = 0 ;
	long min = 0 ;
	
	if (num1 > num2) {
	      if (num1 > num3) {
	        max = num1;
	      } else {
	        max = num3;
	      }
	    } else {
	      if (num2 > num3) {
	        max = num2;
	      } else {
	        max = num3;
	      }}
	
	if (num1 < num2) {
	      if (num1 < num3) {
	        min = num1;
	      } else {
	        min = num3;
	      }
	    } else {
	      if (num2 < num3) {
	        min = num2;
	      } else {
	        min = num3;
	      }
	    }
	System.out.println(min + " " + max);
			}
	}
